package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class Video {
    private int id;
    private int lessonMusicVideoNumber;
    private String tittle;
    private String description;
    private String url;
    private LessonMusic lessonMusic;
    private String instrumento;
    private int instrumentoId;


    public Video() {
    }

    public Video(int id, int lessonMusicVideoNumber, String tittle, String description, String url, LessonMusic lessonMusic, String instrumento) {
        this.id = id;
        this.lessonMusicVideoNumber = lessonMusicVideoNumber;
        this.tittle = tittle;
        this.description = description;
        this.url = url;
        this.lessonMusic = lessonMusic;
        this.setInstrumento(instrumento);
    }
    public Video(int id, int lessonMusicVideoNumber, String tittle, String description, String url, LessonMusic lessonMusic) {
        this.id = id;
        this.lessonMusicVideoNumber = lessonMusicVideoNumber;
        this.tittle = tittle;
        this.description = description;
        this.url = url;
        this.lessonMusic = lessonMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLessonMusicVideoNumber() {
        return lessonMusicVideoNumber;
    }

    public void setLessonMusicVideoNumber(int lessonMusicVideoNumber) {
        this.lessonMusicVideoNumber = lessonMusicVideoNumber;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LessonMusic getLessonMusic() {
        return lessonMusic;
    }

    public void setLessonMusic(LessonMusic lessonMusic) {
        this.lessonMusic = lessonMusic;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getInstrumentoId() {
        return instrumentoId;
    }

    public void setInstrumentoId(int instrumentoId) {
        this.instrumentoId = instrumentoId;
    }
}
