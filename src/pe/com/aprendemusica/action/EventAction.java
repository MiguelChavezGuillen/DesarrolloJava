package pe.com.aprendemusica.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.aprendemusica.model.Event;
import pe.com.aprendemusica.service.DataService;

import java.util.List;

public class EventAction extends ActionSupport {
    private List<Event> events;



    @Override
    public String execute() throws Exception {
        DataService service = new DataService();
        setEvents(service.getAllEvents());
        return SUCCESS;
    }


    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
