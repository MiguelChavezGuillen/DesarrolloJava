package pe.com.prueba.service;

import pe.com.prueba.model.LessonLevel;

import java.util.List;


/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class ListLevelService extends BaseService {

    public List<LessonLevel> getLevels(){
        return this.getSessionLevelsEntity().findAll();
    }
}
