package pe.com.aprendemusica.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.aprendemusica.dao.InstrumentTypesEntity;

/**
 * Created by User on 01/08/2017.
 */
public class InstrumentTypesRegister extends ActionSupport{

    private String name,description;
    private String msg="";
    InstrumentTypesEntity instEntity = null;
    int ctr=0;

    public String execute() throws Exception{
        instEntity = new InstrumentTypesEntity();
        try{
            ctr = instEntity.registerInsType(name,description);
            if (ctr > 0) {
                msg = "Register Successfull";
            }else{
                msg="Some Error";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Register";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
