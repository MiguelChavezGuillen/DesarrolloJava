package pe.com.aprendemusica.action;

import pe.com.aprendemusica.model.MusicDb;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class LoginAction implements Action, SessionAware {

    private MusicDb db;
    private String url;
    private String type;
    private String email;
    private String password;
    private SessionMap session;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        if(session == null)
            session = (SessionMap)map;
    }

    @Override
    public String execute() throws Exception {
        db = new MusicDb();
        HttpServletRequest request = ServletActionContext.getRequest();
        String method = request.getMethod();
        if (method.equals("GET")) {
            return "INPUT";
        } else {
            if (validateForm())
                return "SUCCESS";
            else
                return "ERROR";
        }
    }

    public String logout() {
        session.invalidate();
        return "SUCCESS";
    }

    private boolean validateForm()
    {
        try {
            String sql =
                    " select mail, password, 1 as admin, concat(first_name, ' ', last_name) as name from tutors where mail = ? and password = ?" +
                    " union " +
                    " select mail, password, 0 as admin, concat(first_name, ' ', last_name) as name from students where mail = ? and password = ?";
            PreparedStatement ps = db.connect().prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, password);
            ResultSet rs = db.selectQuery(ps);
            rs.next();
            session.put("logged", true);
            int isAdmin = rs.getInt("admin");
            if(isAdmin == 1)
                session.put("admin", true);
            session.put("username", rs.getString("name"));
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally {
            db.disconnect();
        }
    }
}