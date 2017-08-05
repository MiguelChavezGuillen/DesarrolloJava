package pe.com.aprendemusica.model;

/**
 * Created by Fjorsvartnir on 8/07/2017.
 */
public class Event {
    private int id;
    private String photo;
    private String url;
    private String title;
    private String description;
    private String date;
    private Administrator administrator;

    public Event(int id, String photo, String url, String title, String description, String date, Administrator administrator) {
        this.id = id;
        this.photo = photo;
        this.url = url;
        this.title = title;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
