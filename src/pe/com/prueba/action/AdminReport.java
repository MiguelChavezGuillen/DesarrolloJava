package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.prueba.model.Administrators;
import pe.com.prueba.dao.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by mchavez on 27/07/2017.
 */
public class AdminReport extends ActionSupport {
    ResultSet rs=null;
    Administrators administrators=null;
    List<Administrators> administratorsList = null;
    AdminEntity adminEntity = new AdminEntity();
    private boolean noData = false ;

    public String execute() throws Exception{
        try{
            administratorsList = new ArrayList<Administrators>();
            rs = adminEntity.report();
            int i = 0;
            if(rs != null){
                while (rs.next()){
                    i++;
                    administrators = new Administrators();
                    //administrators.setSrNo(i);
                    administrators.setId(rs.getInt("id"));
                    administrators.setEmail(rs.getString("email"));
                    administrators.setPassword(rs.getString("password"));
                    administrators.setName(rs.getString("name"));
                    administratorsList.add(administrators);
                }
            }
            if(i==0){
                noData=false;
            }else{
                noData=true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Report";
    }
    public boolean isNoData(){
        return noData;
    }

    public void setNoData(boolean noData){
        this.noData=noData;
    }

    public List<Administrators> getAdministratorsList(){
        return administratorsList;
    }

    public void setAdministratorsList(List<Administrators>administratorsList){
        this.administratorsList = administratorsList;
    }

}
