package pe.com.prueba.model;

/**
 * Created by Fjorsvartnir on 25/06/2017.
 */
public class Tutor extends People{
    private byte [] photo;
    private int experience;

    public Tutor() {
        super();
    }

    public Tutor(int id, String email, String firstName, String lastName, String password, String address, String description, byte[] photo, int experience) {
        super(id, email, firstName, lastName, password, address, description);
        this.photo = photo;
        this.experience = experience;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
