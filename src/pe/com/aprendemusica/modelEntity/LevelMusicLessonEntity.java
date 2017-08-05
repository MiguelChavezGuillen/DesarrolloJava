package pe.com.aprendemusica.modelEntity;

import pe.com.aprendemusica.model.LevelMusicLesson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class LevelMusicLessonEntity extends BaseEntity {
    private static final String TABLE = "level_music_lessons";
    private LessonsMusicEntity lessonsMusicEntity;
    private LessonLevelEntity lessonLevelEntity;
    protected LevelMusicLessonEntity(Connection connection) {
        super(connection);
    }
    private List<LevelMusicLesson> findByCriteria(final String criteria) {
        List<LevelMusicLesson> tutors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                tutors.add( new LevelMusicLesson(
                                rs.getInt(1),
                                lessonLevelEntity.findById(rs.getInt(2)),
                                lessonsMusicEntity.findById(rs.getInt(3))
                        )
                );
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return tutors;

    }
    public LevelMusicLesson findById(int id){
        List<LevelMusicLesson> lessonLevels = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return lessonLevels.get(0);
    }
}
