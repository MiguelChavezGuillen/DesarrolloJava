package pe.com.prueba.model;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class Suscription {
    private int id;
    private LessonMusic lessonMusic;
    private Student student;

    public Suscription(int id, LessonMusic lessonMusic, Student student) {
        this.id = id;
        this.lessonMusic = lessonMusic;
        this.student = student;
    }
    public Suscription(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LessonMusic getLessonMusic() {
        return lessonMusic;
    }

    public void setLessonMusic(LessonMusic lessonMusic) {
        this.lessonMusic = lessonMusic;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
