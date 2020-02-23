package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity

public class Destinateur extends BaseEntity implements Serializable {
    String nom;
    String description;

//    @OneToMany(mappedBy = "destinateurBesoinsVetements", cascade = CascadeType.REMOVE)
//    List<Vetements> besoinsVetements = new ArrayList<>();
//
//    @OneToMany(mappedBy = "destinateurBesoinsHygiene", cascade = CascadeType.REMOVE)
//    List<Hygiene> besoinsHygiene = new ArrayList<>();
//
//    @OneToMany(mappedBy = "destinateurBesoinsLogistique", cascade = CascadeType.REMOVE)
//    List<Logistique> besoinsLogistique = new ArrayList<>();
//
//    @OneToMany(mappedBy = "destinateurBesoinsService", cascade = CascadeType.REMOVE)
//    List<Service> besoinsService= new ArrayList<>();
//
//    @OneToMany(mappedBy = "destinateurBesoinsAlimentaire", cascade = CascadeType.REMOVE)
//    List<Alimentaire> besoinsAlimentaire = new ArrayList<>();

}
