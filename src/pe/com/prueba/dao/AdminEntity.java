package pe.com.prueba.dao;

import pe.com.prueba.model.MusicDb;

import java.sql.*;

/**
 * Created by mchavez on 26/07/2017.
 */
public class AdminEntity extends Entity {
    public int registerAdmin(String email, String password, String name) throws Exception {
        int i=0;
        try{
            String sql="insert into administrators(email,password,name) values (?,?,?)";
            PreparedStatement ps=getconnection().prepareStatement(sql);
            //ps.setInt(1,id);
            ps.setString(1,email);
            ps.setString(2,password);
            ps.setString(3,name);
            i=ps.executeUpdate();
            return i;
        }
        catch (Exception e){
            e.printStackTrace();
            return i;
        }finally {
            if(getconnection()!=null){
                getconnection().close();
            }
        }
    }
    public ResultSet report() throws SQLException, Exception{
        ResultSet rs = null;
        try{
            String sql="select * from bd_app_music.administrators";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            rs=ps.executeQuery();
            return rs;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        } finally {
            if (getconnection()!=null){
                getconnection().close();
            }
        }
    }

    public ResultSet fetchUserDetails (int id) throws SQLException, Exception{
        ResultSet rs= null;
        try{
            String sql ="select email,password,name from administrators where id=?";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            return rs;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally {
            if(getconnection()!= null){
                getconnection().close();
            }
        }
    }

    public int updateUserDetails(String email, String password, String name, int idhidden) throws SQLException,Exception{
        getconnection().setAutoCommit(false);
        int i=0;
        try{
            String sql="update administrators set email=?, password=?,name=? where id=?";
            PreparedStatement ps = getconnection().prepareStatement(sql);
            ps.setString(1,email);
            ps.setString(2,password);
            ps.setString(3,name);
            ps.setInt(4,idhidden);
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

    public int deleteUserDetails(int id) throws SQLException,Exception{
        int i=0;
        try{
            String sql="delete from administrators where id=?";
            PreparedStatement ps=getconnection().prepareStatement(sql);
            ps.setInt(1,id);
            i=ps.executeUpdate();
            return i;
        }catch (Exception e){
            e.printStackTrace();
            getconnection().rollback();
            return 0;
        }finally {
            if(getconnection()!= null){
                getconnection().close();
            }
        }

    }

}
