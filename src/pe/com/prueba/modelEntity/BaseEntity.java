package pe.com.prueba.modelEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
    public abstract class BaseEntity {
    private Connection connection;
    protected static final String DEFAULT_SQL="SELECT * FROM ";

    //abstract protected List<?> findByCriteria(String criteria);
    
    protected boolean updateByCriteria(String sql) {
        try {
            return getConnection().createStatement().executeUpdate(sql) > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    protected BaseEntity(Connection connection){
        this.connection=connection;
    }

    protected Connection getConnection() {
        return connection;
    }

}
