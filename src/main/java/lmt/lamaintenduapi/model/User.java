package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;

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
    boolean vehicule;

    boolean isOnLine;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Role role;
//
//    @OneToMany(mappedBy = "userBesoinsVetements", cascade = CascadeType.REMOVE)
//    List<Vetements> besoinsVetements = new ArrayList<>();
//
//    @OneToMany(mappedBy = "userBesoinsHygiene", cascade = CascadeType.REMOVE)
//    List<Hygiene> besoinsHygiene = new ArrayList<>();
//
//    @OneToMany(mappedBy = "userBesoinsLogistique", cascade = CascadeType.REMOVE)
//    List<Logistique> besoinsLogistique = new ArrayList<>();
//
//    @OneToMany(mappedBy = "userBesoinsService", cascade = CascadeType.REMOVE)
//    List<Service> besoinsService = new ArrayList<>();
//
//    @OneToMany(mappedBy = "userBesoinsAlimentaire", cascade = CascadeType.REMOVE)
//    List<Alimentaire> besoinsAlimentaire = new ArrayList<>();

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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isVehicule() {
        return vehicule;
    }

    public void setVehicule(boolean vehicule) {
        this.vehicule = vehicule;
    }

    public boolean isOnLine() {
        return isOnLine;
    }

    public void setIsOnLine(boolean isOnLine) {
        this.isOnLine = isOnLine;
    }
}