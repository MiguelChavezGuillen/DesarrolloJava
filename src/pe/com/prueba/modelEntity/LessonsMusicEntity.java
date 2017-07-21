package pe.com.prueba.modelEntity;

import pe.com.prueba.model.LessonMusic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class LessonsMusicEntity extends BaseEntity{
    private static final String TABLE = "lessons_music";
    private TutorsEntity tutorsEntity;
    private InstrumentsEntity instrumentsEntity;
    public LessonsMusicEntity(Connection connection) {
        super(connection);
    }
    private List<LessonMusic> findByCriteria(final String criteria) {
        List<LessonMusic> lessonMusics = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                lessonMusics.add( new LessonMusic(
                        rs.getInt(1),
                        rs.getInt(2),
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

        return lessonMusics;

    }
    public LessonMusic findById(int id){
        List<LessonMusic> lessonMusics = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return lessonMusics.get(0);
    }

    public void setTutorsEntity(TutorsEntity tutorsEntity) {
        this.tutorsEntity = tutorsEntity;
    }

    public void setInstrumentsEntity(InstrumentsEntity instrumentsEntity) {
        this.instrumentsEntity = instrumentsEntity;
    }
    
}
