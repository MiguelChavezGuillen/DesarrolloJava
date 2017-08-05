package pe.com.aprendemusica.model;

/**
 * Created by mchavez on 26/07/2017.
 */
public class Administrators {
    //int srNo;
    private int id;
    private String email;
    private String password;
    private String name;


    /*public int getSrNo() {    return srNo;  }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }*/

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
