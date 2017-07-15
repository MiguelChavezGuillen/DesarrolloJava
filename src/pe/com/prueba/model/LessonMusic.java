package pe.com.prueba.model;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class LessonMusic {
    private int id;
    private int sessionNumber;
    private String description;
    private String name;
    private Tutor tutor;
    private Instrument instrument;

    public LessonMusic(int id, int sessionNumber, String description, String name, Tutor tutor, Instrument instrument) {
        this.id = id;
        this.sessionNumber = sessionNumber;
        this.description = description;
        this.name = name;
        this.tutor = tutor;
        this.instrument = instrument;
    }

    public LessonMusic() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
