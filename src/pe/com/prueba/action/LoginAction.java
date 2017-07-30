/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import pe.com.prueba.service.DataService;

/**
 *
 * @author Fjorsvartnir
 */
public class LoginAction extends ActionSupport implements SessionAware{
    private Map<String,Object> session;
    
    private String status;
    private String user;
    private String pass;
    @Override
    public String execute(){
        System.out.println(ServletActionContext.getRequest().getMethod().toUpperCase());
        switch(ServletActionContext.getRequest().getMethod().toUpperCase()){
            case "POST":
                return postLogin();
            case "GET":
                return getLogin();
            default:
                return ERROR;
        }
    }

    public String postLogin(){
        boolean permiso=true;
        DataService service = new DataService();
        if(service.getLogin(user,pass)){
            session.put("user",getUser());
            return LOGIN;
        }else{
            session.put("user", null);
            return ERROR;
        }
    }
    
    
    public String getLogin() {
        if(!session.get("user").equals(null)){
            return SUCCESS;
        }else{
            return LOGIN;    
        }
        
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser() { return user; }
    public String getPass() { return pass; }

    public void setUser(String user) { this.user = user; }
    public void setPass(String pass) { this.pass = pass; }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
    
    
    
    
    
}
