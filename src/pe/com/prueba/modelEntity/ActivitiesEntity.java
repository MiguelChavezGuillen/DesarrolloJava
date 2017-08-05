package pe.com.prueba.modelEntity;

import org.omg.PortableInterceptor.ACTIVE;
import pe.com.prueba.model.Activity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class ActivitiesEntity extends BaseEntity {
    private static final String TABLE = "Activities";
    private TutorsEntity tutorsEntity;
    private InstrumentsEntity instrumentsEntity;
    protected ActivitiesEntity(Connection connection) {
        super(connection);
    }
    private List<Activity> findByCriteria(final String criteria) {
        List<Activity> tutors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                tutors.add( new Activity(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        tutorsEntity.findById(rs.getInt(5)),
                        instrumentsEntity.findById(rs.getInt(6))
                ));
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return tutors;

    }
    public Activity findById(int id){
        List<Activity> activities = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return activities.get(0);
    }
    public boolean updatebyCriteria(String sql){
        try {
            return getConnection().createStatement().executeUpdate(sql)>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean create(Activity activity){
        return updatebyCriteria("INSERT INTO activities(title,description,datetime,tutor,instrument)" +
        "VALUES('" + String.valueOf(activity.getTitle()) +"','" +
        String.valueOf(activity.getDescription())+"','"+
        String.valueOf(activity.getDateTime())+"',"+
        String.valueOf(activity.getTutor().getId())+
        String.valueOf(activity.getInstrument().getId()));
    }

}
