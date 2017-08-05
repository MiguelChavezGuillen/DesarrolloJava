package pe.com.prueba.modelEntity;

import pe.com.prueba.model.StudentActivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class StudentActivitiesEntity extends BaseEntity {
    private static final String TABLE = "students_activities";
    private ActivitiesEntity activitiesEntity;
    private StudentsEntity studentsEntity;
    protected StudentActivitiesEntity(Connection connection) {
        super(connection);
    }
    private List<StudentActivity> findByCriteria(String criteria) {
        List<StudentActivity> students = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                students.add( new StudentActivity(
                        rs.getInt(1),
                        activitiesEntity.findById(rs.getInt(3)),
                        studentsEntity.findById(rs.getInt(4))
                    )
                );
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            return students;
        }
    }
}
