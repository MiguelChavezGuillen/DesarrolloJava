package pe.com.prueba.modelEntity;

import pe.com.prueba.model.InstrumentType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class InstrumentTypesEntity extends BaseEntity {
    private static final String TABLE="instrument_types";

    public InstrumentTypesEntity(Connection connection) {
        super(connection);
    }

    private List<InstrumentType> findByCriteria(String criteria) {
        List<InstrumentType> typesInstrument = new ArrayList<>();
        try {

            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                System.err.println(rs.getString(1)+rs.getString(2));
                typesInstrument.add( new InstrumentType(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description")
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
    public List<InstrumentType> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE);
    }
    public InstrumentType findById(int id){
        List<InstrumentType> instrumentTypes = findByCriteria(DEFAULT_SQL+TABLE+" as it WHERE it.id="+id+";");
        return instrumentTypes.isEmpty() ? new InstrumentType(id,"DESCONOCIDO","No se encontro tipo de instrument") : instrumentTypes.get(0) ;
    }
}
