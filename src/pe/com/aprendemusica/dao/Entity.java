package pe.com.aprendemusica.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by mchavez on 01/08/2017.
 */
public class Entity {

    public static Connection getconnection() throws Exception{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://:3306/app_music","root","admin");
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
