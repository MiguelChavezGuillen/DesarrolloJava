package pe.com.prueba.service;

import com.sun.media.jfxmedia.logging.Logger;
import pe.com.prueba.modelEntity.CourseLevelsEntity;
import pe.com.prueba.modelEntity.InstrumentTypesEntity;
import pe.com.prueba.modelEntity.InstrumentsEntity;
import sun.rmi.runtime.Log;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
abstract class BaseService {
    private Connection connection;
    private CourseLevelsEntity courseLevelsEntity;
    private InstrumentTypesEntity instrumentTypesEntity;
    private InstrumentsEntity instrumentsEntity;



    private Connection getConnection() {
        try{
            if (connection == null){
                  InitialContext ctx = new InitialContext();
                  connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSourcebdmusica")).getConnection();
            }
        }catch (NamingException e) {
            System.err.println("Error  naming exception");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error  SQLException");
            e.printStackTrace();
        }catch (Exception e){
            System.err.println("Error"+e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    protected CourseLevelsEntity getSessionLevelsEntity() {
        if(courseLevelsEntity ==null){
            courseLevelsEntity = new CourseLevelsEntity(getConnection());
        }

        return courseLevelsEntity;
    }

    protected InstrumentTypesEntity getInstrumentTypesEntity() {
        if (instrumentTypesEntity == null){
            instrumentTypesEntity = new InstrumentTypesEntity(getConnection());
        }
        return instrumentTypesEntity;
    }

    protected InstrumentsEntity getInstrumentsEntity() {
        if(instrumentsEntity == null){
            instrumentsEntity= new InstrumentsEntity(getConnection());
            instrumentsEntity.setInstrumentTypesEntity(getInstrumentTypesEntity());
        }
        return instrumentsEntity;
    }
}
