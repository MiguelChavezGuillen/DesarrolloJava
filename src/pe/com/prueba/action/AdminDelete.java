package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.prueba.dao.AdminEntity;

/**
 * Created by mchavez on 27/07/2017.
 */
public class AdminDelete extends ActionSupport {
    int id;
    String msg;
    AdminEntity dao = new AdminEntity();

    public String execute() throws Exception{
        try{
            int isDeleted = dao.deleteUserDetails(id);
            if(isDeleted>0){
                msg="Record deleted Successfully";
            }else{msg = "Some Error";}
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Delete";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}

