package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class Instrument {
    private int id;
    private String name;
    private String description;
    private String photo;
    private InstrumentType instrumentType;

    public Instrument() {
    }

    public Instrument(int id, String name, String description, String photo, InstrumentType instrumentType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.photo = photo;
        this.instrumentType = instrumentType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
