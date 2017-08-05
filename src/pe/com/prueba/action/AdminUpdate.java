package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.prueba.dao.AdminEntity;

import java.sql.ResultSet;

/**
 * Created by mchavez on 27/07/2017.
 */
public class AdminUpdate extends ActionSupport {
    private int id;
    private String email="", password="", name="";
    private int idhidden;
    private String msg="";
    ResultSet rs = null;
    AdminEntity adminEntity = new AdminEntity();
    String submitType;
    public String execute()throws Exception{
        try{
            if(submitType.equals("updatedata")){
                rs = adminEntity.fetchUserDetails(id);
                if(rs != null){
                    while (rs.next()){
                        email = rs.getString("email");
                        password = rs.getString("password");
                        name = rs.getString("name");
                        }
                    }
                } else{
                    int i=adminEntity.updateUserDetails(email,password,name,idhidden);
                    if(i > 0){
                        msg = "Record Updated Successfully";
                    }else{
                        msg = "Error";
                    }
                }
            }catch (Exception e){
            e.printStackTrace();;
        }
        return "Update";
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getIdhidden() { return idhidden;  }

    public void setIdhidden(int idhidden) {  this.idhidden = idhidden; }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

}


