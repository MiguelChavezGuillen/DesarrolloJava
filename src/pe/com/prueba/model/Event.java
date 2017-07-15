package pe.com.prueba.model;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class Event {
    private int id;
    private String photo;
    private String url;
    private String title;
    private String descripcion;
    private String date;
    private Administrator administrator;

    public Event(int id, String photo, String url, String title, String descripcion, String date, Administrator administrator) {
        this.id = id;
        this.photo = photo;
        this.url = url;
        this.title = title;
        this.descripcion = descripcion;
        this.date = date;
        this.administrator = administrator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}
