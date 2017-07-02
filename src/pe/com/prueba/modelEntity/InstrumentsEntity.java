package pe.com.prueba.modelEntity;

import pe.com.prueba.model.Instrument;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class InstrumentsEntity extends BaseEntity {

    private static final String TABLE="instruments";
    private InstrumentTypesEntity instrumentTypesEntity;

    public InstrumentsEntity(Connection connection) {
        super(connection);
    }

    private List<Instrument> findByCriteria(final String criteria) {
        List<Instrument> typesInstrument = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(criteria);
            while(rs.next()) {
                typesInstrument.add( new Instrument(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("description"),
                        instrumentTypesEntity.findById(rs.getInt("instrument_type_id"))
                ));
            }

        } catch (SQLException e) {
            System.err.println("ERROR: "+e.getSQLState()+"|"+e.getMessage());
            e.printStackTrace();
        }

        return typesInstrument;

    }
    public Instrument findById(int id){
        List<Instrument> instruments = this.findByCriteria(DEFAULT_SQL+TABLE+" as i WHERE i.id="+id+" ;");
        return instruments.get(0);
    }
    public List<Instrument> findAll(){
        return this.findByCriteria(DEFAULT_SQL+TABLE+";");
    }

    public void setInstrumentTypesEntity(InstrumentTypesEntity instrumentTypesEntity) {
        this.instrumentTypesEntity = instrumentTypesEntity;
    }
}
