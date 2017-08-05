package pe.com.aprendemusica.modelEntity;

import pe.com.aprendemusica.model.LessonLevel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class LessonLevelEntity extends BaseEntity{
    private static final String TABLE = "lesson_levels";

    protected LessonLevelEntity(Connection connection) {
        super(connection);
    }

    private List<LessonLevel> findByCriteria(final String criteria) {
        List<LessonLevel> tutors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                tutors.add( new LessonLevel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                        )
                );
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return tutors;

    }
    public LessonLevel findById(int id){
        List<LessonLevel> lessonLevels = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return lessonLevels.get(0);
    }
}
