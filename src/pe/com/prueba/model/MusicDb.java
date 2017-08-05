package pe.com.prueba.model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MusicDb {

    public java.sql.Connection getConnection() {
        return Connection;
    }

    public void setConnection(java.sql.Connection connection) {
        Connection = connection;
    }

    public java.sql.Connection Connection;

    public java.sql.Connection connect() {
        try {
            String URL = "jdbc:mysql://:3306/app_music";
            Class.forName("com.mysql.jdbc.Driver");
            Connection = DriverManager.getConnection(URL, "root", "admin");
            return Connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ResultSet selectQuery(PreparedStatement ps) throws SQLException, ClassNotFoundException {
        try {
            return ps.executeQuery();
        } catch (Exception e) {
            disconnect();
            throw e;
        }
    }

    public int updateQuery(PreparedStatement ps) throws SQLException, ClassNotFoundException {
        try {
            return ps.executeUpdate();
        } catch (Exception e) {
            disconnect();
            throw e;
        }
    }

    public void disconnect()
    {
        if (Connection != null) {
            try {
                Connection.close();
            } catch (Exception e) {
            }
        }
    }

}
