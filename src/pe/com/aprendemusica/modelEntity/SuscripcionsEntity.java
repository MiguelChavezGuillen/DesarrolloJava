package pe.com.aprendemusica.modelEntity;

import pe.com.aprendemusica.model.Suscription;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class SuscripcionsEntity extends BaseEntity {
    private static final String TABLE="suscripcion";
    private LessonsMusicEntity lessonsMusicEntity;
    private StudentsEntity studentsEntity;

    protected SuscripcionsEntity(Connection connection) {
        super(connection);
    }
    private List<Suscription> findByCriteria(String criteria) {
        List<Suscription> typesInstrument = new ArrayList<>();
        try {

            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                //System.err.println(rs.getString(1)+rs.getString(2));
                typesInstrument.add( new Suscription(
                        rs.getInt("id"),
                        getLessonsMusicEntity().findById(rs.getInt(2)),
                        getStudentsEntity().findById(rs.getInt(3))
                ));
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            return typesInstrument;
        }
    }
    public List<Suscription> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }
    public Suscription findById(int id){
        List<Suscription> suscriptions = findByCriteria(DEFAULT_SQL+TABLE+" as it WHERE it.id="+id+";");
        return suscriptions.isEmpty() ? new Suscription() : suscriptions.get(0) ;
    }

    public LessonsMusicEntity getLessonsMusicEntity() {
        return lessonsMusicEntity;
    }

    public void setLessonsMusicEntity(LessonsMusicEntity lessonsMusicEntity) {
        this.lessonsMusicEntity = lessonsMusicEntity;
    }

    public StudentsEntity getStudentsEntity() {
        return studentsEntity;
    }

    public void setStudentsEntity(StudentsEntity studentsEntity) {
        this.studentsEntity = studentsEntity;
    }
}
