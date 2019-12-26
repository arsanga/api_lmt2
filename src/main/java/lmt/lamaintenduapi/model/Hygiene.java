package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Hygiene extends BesoinEvenement implements Serializable {
    String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userBesoinsHygiene")
    protected User userBesoinsHygiene;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "destinateurBesoinsHygiene")
    protected Destinateur destinateurBesoinsHygiene;

    public Hygiene(){
        this.description = super.description;
        this.userBesoinsHygiene = super.userBesoinEvenements;
        this.destinateurBesoinsHygiene = super.destinateurBesoinEvenement;
    }
}
