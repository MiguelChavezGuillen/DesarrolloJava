package pe.com.prueba.modelEntity;

import pe.com.prueba.model.Administrator;
import pe.com.prueba.model.InstrumentType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class AdministratorsEntity extends BaseEntity {
    private static final String TABLE="administrators";

    protected AdministratorsEntity(Connection connection) {
        super(connection);
    }

    private List<Administrator> findByCriteria(String criteria) {
        List<Administrator> administrators = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                administrators.add( new Administrator(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                ));
            }
            rs.close();
            getConnection().close();
        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            return administrators;
        }
    }
    public Administrator findById(int id){
        List<Administrator> administrators = findByCriteria(DEFAULT_SQL+TABLE+" as it WHERE it.id="+id+";");
        return administrators.isEmpty() ? new Administrator(id,"DESCONOCIDO","No se encontro tipo de instrument") : administrators.get(0) ;
    }
    public List<Administrator> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }


}
