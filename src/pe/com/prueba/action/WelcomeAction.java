package pe.com.prueba.action;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {

    @Override
    public String execute() throws Exception {
        return "SUCCESS";
    }

}
