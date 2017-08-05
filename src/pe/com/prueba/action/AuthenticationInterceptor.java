package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class AuthenticationInterceptor implements Interceptor {

    @Override
    public void destroy() {
    }

    @Override
    public void init() {
    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
        boolean loggedIn = sessionAttributes.get("logged") != null;
        String actionName = actionInvocation.getAction().getClass().getSimpleName();
        if(!loggedIn && !actionName.toLowerCase().equals("loginaction") && !actionName.toLowerCase().equals("welcomeaction") && !actionName.toLowerCase().equals("registeraction"))
            return "LOGIN";
        else if (loggedIn && actionName.toLowerCase().equals("welcomeaction"))
            return "HOME";
        else
            return actionInvocation.invoke();
    }
}