package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class Activity {
    private int id;
    private String title;
    private String description;
    private String dateTime;
    private Tutor tutor;
    private Instrument instrument;

    public Activity(int id, String title, String description, String dateTime, Tutor tutor, Instrument instrument) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.tutor = tutor;
        this.instrument = instrument;
    }

    public Activity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
