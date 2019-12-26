package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Logistique extends BesoinEvenement implements Serializable {
    String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userBesoinsLogistique")
    protected User userBesoinsLogistique;


    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "destinateurBesoinsLogistique")
    protected Destinateur destinateurBesoinsLogistique;

    public Logistique(){
        this.description = super.description;
        this.userBesoinsLogistique = super.userBesoinEvenements;
        this.destinateurBesoinsLogistique = super.destinateurBesoinEvenement;
    }
}
