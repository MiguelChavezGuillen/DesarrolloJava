package pe.com.prueba.model;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class Tutor extends People{
    private String photo;
    private String experience;

    public Tutor() {
        super();
    }

    public Tutor(String photo, String experience) {
        this.photo = photo;
        this.experience = experience;
    }

    public Tutor(int id, String email, String firstName, String lastName, String password, String address, String description, String photo, String experience) {
        super(id, email, firstName, lastName, password, address, description);
        this.photo = photo;
        this.experience = experience;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


}
