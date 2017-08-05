package pe.com.prueba.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;
import pe.com.prueba.model.MusicDb;
import pe.com.prueba.model.Video;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CRUDAction implements Action {

    private MusicDb db;
    private boolean isAdd;
    private boolean isEdit;
    private boolean isDelete;
    private String actionName;
    private String title;
    private String description;
    private String url;
    private int instrumentoId;
    private Map<Integer, String> instrumentos;

    public int getInstrumentoId() {
        return instrumentoId;
    }

    public void setInstrumentoId(int instrumentoId) {
        this.instrumentoId = instrumentoId;
    }

    public Map<Integer, String> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Map<Integer, String> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }

    public boolean isEdit() {
        return isEdit;
    }

    public void setEdit(boolean edit) {
        isEdit = edit;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public String add()
    {
        loadDropdowns();
        HttpServletRequest request = ServletActionContext.getRequest();
        actionName = request.getRequestURI().substring(1);
        if(actionName.indexOf('?') != -1)
            actionName = actionName.substring(actionName.indexOf('?'));
        actionName = actionName.replace(".action", "");
        String method = request.getMethod();
        isAdd = true;
        isEdit = false;
        isDelete = false;

        db = new MusicDb();
        String result;
        if (method.equals("GET")) {
            return "INPUT";
        } else {
            try {
                String sql = "INSERT INTO `videos` (`title`, `description`, `url`, `instrumento`, `instrumento_id`) VALUES (?, ?, ?, ?, ?);";
                PreparedStatement ps = db.connect().prepareStatement(sql);
                ps.setString(1, title);
                ps.setString(2, description);
                ps.setString(3, url);
                ps.setString(4, instrumentos.get(instrumentoId));
                ps.setInt(5, instrumentoId);
                if(db.updateQuery(ps) > 0)
                    return "SUCCESS";
                else
                    return "ERROR";
            } catch (Exception e) {
                e.printStackTrace();
                return "ERROR";
            } finally {
                db.disconnect();
            }
        }
    }

    public String edit()
    {
        loadDropdowns();
        HttpServletRequest request = ServletActionContext.getRequest();
        actionName = request.getRequestURI().substring(1);
        if(actionName.indexOf('?') != -1)
            actionName = actionName.substring(actionName.indexOf('?'));
        actionName = actionName.replace(".action", "");
        String method = request.getMethod();
        isAdd = false;
        isEdit = true;
        isDelete = false;

        db = new MusicDb();
        if (method.equals("GET")) {
            try {
                String sql = "SELECT * FROM videos WHERE `id`= ?;";
                PreparedStatement ps = db.connect().prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                ResultSet rs = db.selectQuery(ps);
                if (rs != null) {
                    while (rs.next()) {
                        Video vm = new Video();
                        vm.setUrl(rs.getString("url"));
                        vm.setTittle(rs.getString("title"));
                        vm.setDescription(rs.getString("description"));
                        vm.setInstrumentoId(rs.getInt("instrumento_id"));
                        url = vm.getUrl();
                        title = vm.getTittle();
                        description = vm.getDescription();
                        instrumentoId = vm.getInstrumentoId();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return "ERROR";
            } finally {
                db.disconnect();
            }
            return "INPUT";
        } else {
            try {
                String sql = "UPDATE `videos` SET `title`= ?, `description`= ?, `url` = ?, `instrumento` = ?, `instrumento_id` = ? WHERE `id`= ?;";
                PreparedStatement ps = db.connect().prepareStatement(sql);
                ps.setString(1, title);
                ps.setString(2, description);
                ps.setString(3, url);
                ps.setString(4, instrumentos.get(instrumentoId));
                ps.setInt(5, instrumentoId);
                ps.setInt(6, Integer.parseInt(request.getParameter("id")));
                if(db.updateQuery(ps) > 0)
                    return "SUCCESS";
                else
                    return "ERROR";
            } catch (Exception e) {
                e.printStackTrace();
                return "ERROR";
            } finally {
                db.disconnect();
            }
        }
    }

    public String delete()
    {
        loadDropdowns();
        HttpServletRequest request = ServletActionContext.getRequest();
        actionName = request.getRequestURI().substring(1);
        if(actionName.indexOf('?') != -1)
            actionName = actionName.substring(actionName.indexOf('?'));
        actionName = actionName.replace(".action", "");
        String method = request.getMethod();
        isAdd = false;
        isEdit = false;
        isDelete = true;

        db = new MusicDb();
        if (method.equals("GET")) {
            return "INPUT";
        } else {
            try {
                String sql = "DELETE FROM `videos` WHERE `id`= ?;";
                PreparedStatement ps = db.connect().prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(request.getParameter("id")));
                if(db.updateQuery(ps) > 0)
                    return "SUCCESS";
                else
                    return "ERROR";
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
                return "ERROR";
            } finally {
                db.disconnect();
            }
        }
    }

    private void loadDropdowns()
    {
        instrumentos = new HashMap<>();
        db = new MusicDb();
        try {
            String sql = "SELECT * FROM instruments;";
            PreparedStatement ps = db.connect().prepareStatement(sql);
            ResultSet rs = db.selectQuery(ps);
            if (rs != null) {
                while (rs.next()) {
                    instrumentos.put(rs.getInt("id"), rs.getString("name"));
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            db.disconnect();
        }
    }

    @Override
    public String execute() throws Exception {
        return null;
    }
}
