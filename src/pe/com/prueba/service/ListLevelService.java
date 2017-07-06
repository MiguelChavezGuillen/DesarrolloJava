package pe.com.prueba.service;

import pe.com.prueba.model.CourseLevel;

import java.util.List;


/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class ListLevelService extends BaseService {

    public List<CourseLevel> getLevels(){
        return this.getSessionLevelsEntity().findAll();
    }
}
