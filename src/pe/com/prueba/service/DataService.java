package pe.com.prueba.service;

import pe.com.prueba.model.Administrator;
import pe.com.prueba.model.Event;
import pe.com.prueba.model.Instrument;

import java.util.List;
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
    
    public boolean getLogin(String user, String pass){
        return getAdministratorsEntity().findCredentials(user, pass);
    }
    
    public boolean createAdministrator(String user, String password, String name){
        return this.getAdministratorsEntity().createAdministrator(user, password, name);
    }
    public List<Administrator> getAllAdministrator(){
        return this.getAdministratorsEntity().findAll();
    }
    public boolean deleteAdministrator(int id){
        return this.getAdministratorsEntity().deleteAdministrator(id);
    }
}
