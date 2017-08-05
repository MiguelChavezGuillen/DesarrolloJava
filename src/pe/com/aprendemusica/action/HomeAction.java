package pe.com.aprendemusica.action;

import com.opensymphony.xwork2.Action;
import pe.com.aprendemusica.model.MusicDb;
import pe.com.aprendemusica.model.Video;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HomeAction implements Action {

    private MusicDb db;
    private ArrayList<Video> data;

    public ArrayList<Video> getData() {
        return data;
    }

    public void setData(ArrayList<Video> data) {
        this.data = data;
    }

    public String execute() {
        db = new MusicDb();
        data = new ArrayList<>();
        try {
            String sql = "SELECT * FROM videos;";
            PreparedStatement ps = db.connect().prepareStatement(sql);
            ResultSet rs = db.selectQuery(ps);
            if (rs != null) {
                while (rs.next()) {
                    Video vm = new Video();
                    vm.setUrl(rs.getString("url"));
                    vm.setId(rs.getInt("id"));
                    vm.setTittle(rs.getString("title"));
                    vm.setDescription(rs.getString("description"));
                    vm.setInstrumento(rs.getString("instrumento"));
                    data.add(vm);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return "ERROR";
        } finally {
            db.disconnect();
        }
        return "SUCCESS";
    }

}
