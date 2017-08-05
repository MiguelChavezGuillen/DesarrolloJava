package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class Administrator {
    private int id;
    private String email;
    private String name;

    public Administrator(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
