package pe.com.prueba.service;


import pe.com.prueba.modelEntity.*;

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
    private VideosEntity videosEntity;
    private LessonsMusicEntity lessonsMusicEntity;
    private TutorsEntity tutorsEntity;
    private EventsEntity eventsEntity;
    private AdministratorsEntity administratorsEntity;



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

    protected CourseLevelsEntity getCourseLevelsEntity() {
        if(courseLevelsEntity == null ){
            courseLevelsEntity = new CourseLevelsEntity(getConnection());
        }
        return courseLevelsEntity;
    }

    protected VideosEntity getVideosEntity() {
        if(videosEntity == null){
            videosEntity = new VideosEntity(getConnection());
            videosEntity.setLessonsMusicEntity(getLessonsMusicEntity());
        }
        return videosEntity;
    }

    protected LessonsMusicEntity getLessonsMusicEntity() {
        if(lessonsMusicEntity == null){
            lessonsMusicEntity = new LessonsMusicEntity(getConnection());
            lessonsMusicEntity.setInstrumentsEntity(getInstrumentsEntity());
            lessonsMusicEntity.setTutorsEntity(getTutorsEntity());
        }
        return lessonsMusicEntity;
    }

    protected TutorsEntity getTutorsEntity() {
        if(tutorsEntity == null){
            tutorsEntity = new TutorsEntity(getConnection());
        }
        return tutorsEntity;
    }

    public AdministratorsEntity getAdministratorsEntity() {
        if(administratorsEntity == null){
            administratorsEntity = new AdministratorsEntity(getConnection());
        }
        return administratorsEntity;
    }

    protected EventsEntity getEventsEntity() {
        if (eventsEntity == null){
            eventsEntity = new EventsEntity(getConnection());
            eventsEntity.setAdministratorsEntity(getAdministratorsEntity());
        }
        return eventsEntity;
    }
}
