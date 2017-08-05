package pe.com.aprendemusica.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mchavez on 01/08/2017.
 */
public class InstrumentTypesEntity extends Entity {
    public int registerInsType(String name, String description) throws Exception{
        int i=0;
        try{
            String sql="insert into instrument_types(name,description) values(?,?)";
            PreparedStatement ps=getconnection().prepareStatement(sql);
                    ps.setString(1,name);
                    ps.setString(2,description);
            i = ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
            return i;
        }finally {
            if(getconnection() != null){
                getconnection().close();
            }
        }
    }
    public ResultSet reportInsType() throws SQLException, Exception{
        ResultSet rs = null;
        try{
            String sql = "select * from bd_app_music.instrument_types";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            rs = ps.executeQuery();
            return rs;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if(getconnection() != null){
                getconnection().close();
            }
        }
    }

    public ResultSet InsTypeDetails (int id) throws SQLException,Exception{
        ResultSet rs = null;
        try{
            String sql = "Select id,name,description from instrument_types where id=?";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            return rs;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }finally {
            if(getconnection() != null){
                getconnection().close();
            }
        }
    }

    public int updateInsType (String name, String description, int idhidden)throws SQLException,Exception{
        getconnection().setAutoCommit(false);
        int i=0;
        try{
            String sql = "update instrument_types set name=?, description=? where id=?";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,description);
            ps.setInt(3,idhidden);
            i = ps.executeUpdate();
            return i;
        }catch (SQLException e){
            e.printStackTrace();
            getconnection().rollback();
            return 0;
        }finally {
            if(getconnection()!=null){
                getconnection().close();}
        }
    }

    public int deleteInstype(int id) throws SQLException, Exception{
        int i=0;
        try{
            String sql = "Delete from instrument_types where id=?";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setInt(1,id);
            i=ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
            getconnection().rollback();
            return 0;
        }finally {
            if(getconnection()!=null){
                getconnection().close();}
        }
    }
}
