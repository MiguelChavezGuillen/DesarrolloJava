package pe.com.prueba.modelEntity;

import pe.com.prueba.model.CourseLevel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class CourseLevelsEntity extends BaseEntity {
    private static final String TABLE="session_levels";

    public CourseLevelsEntity(Connection connection) {
        super(connection);
    }

    private List<CourseLevel> findByCriteria(String criteria) {
        List<CourseLevel> sessionLevels = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                sessionLevels.add( new CourseLevel(
                            rs.getInt(""),
                            rs.getString(""),
                            rs.getString("")
                        ));
            }
            rs.close();
            getConnection().close();
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            return sessionLevels;
        }
    }
    public List<CourseLevel> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }
}
