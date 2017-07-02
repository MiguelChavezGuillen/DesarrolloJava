package pe.com.prueba.service;

import pe.com.prueba.model.Instrument;

import java.util.List;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class PruebaService extends BaseService {

    public List<Instrument> getInstruments(){
        return this.getInstrumentsEntity().findAll();
    }
}
