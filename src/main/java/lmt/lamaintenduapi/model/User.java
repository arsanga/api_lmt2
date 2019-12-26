package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User extends BaseEntity implements Serializable {

    String name;
    String email;
    String password;
    String urlPhoto;
    String userId;
    String prenom;
    String tel;
    Boolean isAdmin;

    @OneToMany(mappedBy = "userDon", cascade = CascadeType.REMOVE)
    List<Don> dons = new ArrayList<>();

    @OneToMany(mappedBy = "userBesoinsVetements", cascade = CascadeType.REMOVE)
    List<Vetements> besoinsVetements = new ArrayList<>();

    @OneToMany(mappedBy = "userBesoinsHygiene", cascade = CascadeType.REMOVE)
    List<Hygiene> besoinsHygiene = new ArrayList<>();

    @OneToMany(mappedBy = "userBesoinsLogistique", cascade = CascadeType.REMOVE)
    List<Logistique> besoinsLogistique = new ArrayList<>();

    @OneToMany(mappedBy = "userBesoinsService", cascade = CascadeType.REMOVE)
    List<Service> besoinsService = new ArrayList<>();

    @OneToMany(mappedBy = "userBesoinsAlimentaire", cascade = CascadeType.REMOVE)
    List<Alimentaire> besoinsAlimentaire = new ArrayList<>();

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
