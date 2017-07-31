/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.prueba.action;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.LOGIN;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import pe.com.prueba.model.Administrator;
import pe.com.prueba.service.DataService;

/**
 *
 * @author Fjorsvartnir
 */
public class AdministratorAction extends ActionSupport implements SessionAware{
    private Map<String,Object> session;
    private String id;
    private String user;
    private String pass;
    private String name;
    private List<Administrator> administrators;
    @Override
    public String execute(){
                return SUCCESS;
    }
    public String create() {
        DataService service = new DataService();
        boolean creation = service.createAdministrator(getName(), getPass(), getName());
        if (creation){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }
    public String show(){
        DataService service = new DataService();
        setAdministrators(service.getAllAdministrator());
        return SUCCESS;
    }

    public String update() {
        
        return SUCCESS;
    }

    public String delete() {
        DataService service = new DataService();
        boolean creation = service.deleteAdministrator(Integer.parseInt(getId()));
        if (creation){
            return SUCCESS;
        }else {
            return ERROR;
        }
    }

    



    public String getId() { return id; }
    public String getUser() { return user; }
    public String getPass() { return pass; }
    public String getName() { return name; }
    public List<Administrator> getAdministrators() { return administrators; }

    public void setId(String id) { this.id = id; }
    public void setUser(String user) { this.user = user; }
    public void setPass(String pass) { this.pass = pass; }
    public void setName(String name) { this.name = name; }
    public void setAdministrators(List<Administrator> administrators) { this.administrators = administrators; }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
