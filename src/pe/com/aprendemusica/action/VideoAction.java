package pe.com.aprendemusica.action;

import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;
import pe.com.aprendemusica.model.MusicDb;
import pe.com.aprendemusica.model.Video;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VideoAction implements Action {

    private MusicDb db;
    private String title;
    private String description;
    private String url;

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

    @Override
    public String execute() throws Exception {
        HttpServletRequest request = ServletActionContext.getRequest();
        db = new MusicDb();
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
                    url = vm.getUrl();
                    title = vm.getTittle();
                    description = vm.getDescription();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return "ERROR";
        } finally {
            db.disconnect();
        }
        return "SUCCESS";
    }

}

