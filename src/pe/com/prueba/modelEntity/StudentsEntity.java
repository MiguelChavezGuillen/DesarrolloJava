package pe.com.prueba.modelEntity;

import pe.com.prueba.model.Administrator;
import pe.com.prueba.model.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class StudentsEntity extends BaseEntity {
    private static final String TABLE = "students";
    protected StudentsEntity(Connection connection) {
        super(connection);
    }

    private List<Student> findByCriteria(String criteria) {
        List<Student> students = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                students.add( new Student(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(4),
                        rs.getString(4),
                        rs.getString(1)
                ));
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            return students;
        }
    }
    public List<Student> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }
    public Student findById(int id){
        List<Student> students = findByCriteria(DEFAULT_SQL+TABLE+" as it WHERE it.id="+id+";");
        return students.isEmpty() ? new Student(id,"DESCONOCIDO","No se encontro tipo de instrument","","","","") : students.get(0) ;
    }
    public boolean updatebyCriteria(String sql){
        try {
            return getConnection().createStatement().executeUpdate(sql)>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

}
