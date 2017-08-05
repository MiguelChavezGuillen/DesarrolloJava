package pe.com.aprendemusica.action;

import pe.com.aprendemusica.model.InstrumentTypes;
import pe.com.aprendemusica.dao.InstrumentTypesEntity;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by User on 01/08/2017.
 */
public class InstrumentTypesReport {
    ResultSet rs = null;
    InstrumentTypes instrumentTypes = null;
    List<InstrumentTypes> instrumentTypesList = null;
    InstrumentTypesEntity insEntity = new InstrumentTypesEntity();
    private boolean noData = false;

    public String execute() throws Exception {
        try {
            instrumentTypesList = new ArrayList<InstrumentTypes>();
            rs = insEntity.reportInsType();
            int i = 0;
            if (rs != null) {
                while (rs.next()) {
                    i++;
                    instrumentTypes = new InstrumentTypes();
                    instrumentTypes.setId(rs.getInt("id"));
                    instrumentTypes.setName(rs.getString("name"));
                    instrumentTypes.setDescription(rs.getString("description"));
                    instrumentTypesList.add(instrumentTypes);
                }
            }
            if (i == 0) {
                noData = false;
            } else {
                noData = true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Report";
    }
    public boolean isNoData(){
        return noData;
    }
    public void setNoData(boolean noData){
        this.noData=noData;
    }
    public List<InstrumentTypes> getInstrumentTypesList(){
        return instrumentTypesList;
    }

    public void setInstrumentTypesList(List<InstrumentTypes>instrumentTypesList){
        this.instrumentTypesList = instrumentTypesList;
    }
}
