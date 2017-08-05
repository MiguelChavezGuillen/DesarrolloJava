package pe.com.aprendemusica.action;


import com.opensymphony.xwork2.ActionSupport;
import pe.com.aprendemusica.dao.AdminEntity;

/**
 * Created by mchavez on 27/07/2017.
 */
public class AdminRegister extends ActionSupport {

    private String email,password,name;
    private String msg="";
    AdminEntity adminEntity = null;
    int ctr=0;

    public String execute() throws Exception{
        adminEntity = new AdminEntity();
        try{
            ctr=adminEntity.registerAdmin(email,password,name);
            if(ctr>0){
                msg="Register Successfull";
            }else{
                msg="Some Error";
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return "Register";
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

    public int getCtr() {
        return ctr;
    }

    public void setCtr(int ctr) {
        this.ctr = ctr;
    }


}
