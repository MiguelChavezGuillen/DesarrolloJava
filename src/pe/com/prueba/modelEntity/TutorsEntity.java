package pe.com.prueba.modelEntity;

import pe.com.prueba.model.Tutor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class TutorsEntity extends BaseEntity {
    private static final String TABLE = "tutors";
    public TutorsEntity(Connection connection) {
        super(connection);
    }

    private List<Tutor> findByCriteria(final String criteria) {
        List<Tutor> tutors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                tutors.add( new Tutor(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9)
                ));
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return tutors;

    }
    public Tutor findById(int id){
        List<Tutor> tutors = this.findByCriteria("SELECT p.id, p.mail, p.first_name, p.last_name, p.PASSWORD, p.address, p.description, t.photo, t.experience FROM "+TABLE+" AS t INNER JOIN people AS p ON t.people_id = p.id WHERE t.people_id="+id+" ;");
        return  tutors.get(0);
    }
}
