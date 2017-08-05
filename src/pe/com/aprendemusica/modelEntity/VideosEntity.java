package pe.com.aprendemusica.modelEntity;

import pe.com.aprendemusica.model.Video;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class VideosEntity extends BaseEntity {
    private static final String TABLE = "videos";
    private LessonsMusicEntity lessonsMusicEntity;
    public VideosEntity(Connection connection) {
        super(connection);
    }
    private List<Video> findByCriteria(final String criteria) {
        List<Video> tutors = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                tutors.add( new Video(
                                rs.getInt(1),
                                rs.getInt(2),
                                rs.getString(3),
                                rs.getString(4),
                                rs.getString(5),
                                lessonsMusicEntity.findById(rs.getInt(6))
                        )
                );
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return tutors;

    }
    public List<Video> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }
    public Video findById(int id){
        List<Video> lessonLevels = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return lessonLevels.get(0);
    }

    public void setLessonsMusicEntity(LessonsMusicEntity lessonsMusicEntity) {
        this.lessonsMusicEntity = lessonsMusicEntity;
    }
    
}
