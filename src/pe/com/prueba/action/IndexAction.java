package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.prueba.model.Instrument;


import java.util.List;
import java.util.Map;
import pe.com.prueba.model.Video;
import pe.com.prueba.service.DataService;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class IndexAction extends ActionSupport  {
    private Map<String,Object> session;
    private List<Instrument> instruments;
    private List<Video> videos;

    @Override
    public String execute() throws Exception {
        DataService service = new DataService();
        setVideos(service.getVideos());
        return SUCCESS;
    }




    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
