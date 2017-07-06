package pe.com.prueba.model;

import java.util.List;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class TutorCourse {
    private int id;
    private int courseNumber;
    private String name;
    private String description;
    private List<Video> videos;
    private Tutor tutor;
    private List<CourseLevel> levels;

}
