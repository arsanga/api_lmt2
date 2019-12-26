package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Vetements extends BesoinEvenement implements Serializable {
    String type;
    String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userBesoinsVetements")
    protected User userBesoinsVetements;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "destinateurBesoinsHygiene")
    protected Destinateur destinateurBesoinsVetements;

    public Vetements(){
        this.type = "";
        this.description = super.description;
        this.userBesoinsVetements = super.userBesoinEvenements;
        this.destinateurBesoinsVetements = super.destinateurBesoinEvenement;
    }
}
