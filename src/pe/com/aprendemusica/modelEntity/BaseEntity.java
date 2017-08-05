package pe.com.aprendemusica.modelEntity;

import java.sql.Connection;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
abstract class BaseEntity {
    private Connection connection;
    protected static final String DEFAULT_SQL="SELECT * FROM ";

    protected BaseEntity(Connection connection){
        this.connection=connection;
    }

    protected Connection getConnection() {
        return connection;
    }

}
