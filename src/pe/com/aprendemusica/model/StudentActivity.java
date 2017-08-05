package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class StudentActivity {
    private int id;
    private Activity activity;
    private Student student;

    public StudentActivity(int id, Activity activity, Student student) {
        this.id = id;
        this.activity = activity;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
