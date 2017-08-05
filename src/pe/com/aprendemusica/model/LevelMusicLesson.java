package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 9/07/2017.
 */
public class LevelMusicLesson {
    private int id;
    private LessonLevel lessonLevel;
    private LessonMusic lessonMusic;

    public LevelMusicLesson(int id, LessonLevel lessonLevel, LessonMusic lessonMusic) {
        this.id = id;
        this.lessonLevel = lessonLevel;
        this.lessonMusic = lessonMusic;
    }

    public LevelMusicLesson() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LessonLevel getLessonLevel() {
        return lessonLevel;
    }

    public void setLessonLevel(LessonLevel lessonLevel) {
        this.lessonLevel = lessonLevel;
    }

    public LessonMusic getLessonMusic() {
        return lessonMusic;
    }

    public void setLessonMusic(LessonMusic lessonMusic) {
        this.lessonMusic = lessonMusic;
    }
}
