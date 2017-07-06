package pe.com.prueba.action;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.prueba.model.Instrument;
import pe.com.prueba.service.PruebaService;


import java.util.List;
import java.util.Map;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class IndexAction extends ActionSupport {
    private Map<String,Object> session;
    private List<Instrument> instruments;

    @Override
    public String execute() throws Exception {
        PruebaService service = new PruebaService();
        setInstruments(service.getInstruments());
        return SUCCESS;
    }




    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }
}
