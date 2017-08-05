package pe.com.aprendemusica.modelEntity;

import pe.com.aprendemusica.model.Event;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class EventsEntity extends BaseEntity {
    private AdministratorsEntity administratorsEntity;
    private static final String TABLE="events";
    public EventsEntity(Connection connection) {
        super(connection);
    }
    private List<Event> findByCriteria(String criteria) {
        List<Event> events = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                events.add( new Event(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        getAdministratorsEntity().findById(rs.getInt(7))

                ));
            }
            return events;
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
            return events;
        }

    }
    public List<Event> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }

    public AdministratorsEntity getAdministratorsEntity() {
        return administratorsEntity;
    }

    public void setAdministratorsEntity(AdministratorsEntity administratorsEntity) {
        this.administratorsEntity = administratorsEntity;
    }
}
