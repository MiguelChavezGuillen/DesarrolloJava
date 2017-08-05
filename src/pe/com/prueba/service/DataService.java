package pe.com.prueba.service;

import pe.com.prueba.model.Event;
import pe.com.prueba.model.Instrument;

import java.util.List;

import pe.com.prueba.model.Student;
import pe.com.prueba.model.Video;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class DataService extends BaseService {

    public List<Instrument> getInstruments(){
        return this.getInstrumentsEntity().findAll();
    }

    public List<Video> getVideos(){
        return this.getVideosEntity().findAll();
    }

    public List<Event> getAllEvents(){
        return this.getEventsEntity().findAll();
    }

    public Student getStudentByCriteria(){
        return this.getStudentByCriteria();
    }
}