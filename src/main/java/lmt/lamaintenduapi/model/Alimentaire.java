package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
public class Alimentaire extends BesoinEvenement implements Serializable {

    String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userBesoinsAlimentaire")
    protected User userBesoinsAlimentaire;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "destinateurBesoinsAlimentaire")
    protected Destinateur destinateurBesoinsAlimentaire;

    public Alimentaire(){
        this.description = super.description;
        this.userBesoinsAlimentaire = super.userBesoinEvenements;
        this.destinateurBesoinsAlimentaire = super.destinateurBesoinEvenement;
    }
}
