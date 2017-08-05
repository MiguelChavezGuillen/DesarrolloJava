package pe.com.aprendemusica.action;

import pe.com.aprendemusica.model.MusicDb;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RegisterAction implements Action {

    private MusicDb db;
    private String type;
    private ArrayList<String> types;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String description;

    public ArrayList<String> getTypes() {
        return types;
    }
    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) { this.type = type; }
    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String execute() throws Exception {
        types = new ArrayList<String>();
        types.add("Tutor");
        types.add("Alumno");

        db = new MusicDb();
        HttpServletRequest request = ServletActionContext.getRequest();
        String method = request.getMethod();
        if (method.equals("GET")) {
            return "INPUT";
        } else {
            if (validate())
                return "SUCCESS";
            else
                return "ERROR";
        }
    }

    private boolean isDuplicated(String pEmail) {
        try {
            String sql = "select count(*) as cuenta from ( select mail, password from tutors where mail = ? union select mail, password from students where mail = ?) as x";
            PreparedStatement ps = db.connect().prepareStatement(sql);
            ps.setString(1, pEmail);
            ps.setString(2, pEmail);
            ResultSet rs = db.selectQuery(ps);
            if (rs != null) {
                while (rs.next()) {
                    return rs.getInt("cuenta") != 0;
                }
            }
            return false;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally {
            db.disconnect();
        }
    }

    private boolean validate()
    {
        String tableName;
        try {
            if(!isDuplicated(email)) {
                tableName = type.toLowerCase().startsWith("tutor") ? "tutors" : "students";
                String sql = String.format("INSERT INTO %s (`mail`, `first_name`, `last_name`, `password`, `address`, `description`) VALUES (?, ?, ?, ?, ?, ?);", tableName);
                PreparedStatement ps = db.connect().prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2, firstName);
                ps.setString(3, lastName);
                ps.setString(4, password);
                ps.setString(5, address);
                ps.setString(6, description);
                if(db.updateQuery(ps) == 0)
                    return false;
                return true;
            }
            return false;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        } finally {
            db.disconnect();
        }
    }

}
