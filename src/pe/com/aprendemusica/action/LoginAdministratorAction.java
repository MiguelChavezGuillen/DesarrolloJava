/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.aprendemusica.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Fjorsvartnir
 */
public class LoginAdministratorAction extends ActionSupport implements SessionAware{
    private Map<String,Object> session;
    private String user;
    private String pass;
    @Override
    public String execute(){
        return SUCCESS;
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
