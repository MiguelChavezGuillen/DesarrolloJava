package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class Student extends People {



    public Student(int id, String email, String firstName, String lastName, String password, String address, String description) {
        super(id, email, firstName, lastName, password, address, description);
    }
    public Student(){
        super();
    }
}
