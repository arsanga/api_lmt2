package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
public class Service extends BesoinEvenement implements Serializable {

    String description;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "userBesoinsService")
    protected User userBesoinsService;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "destinateurBesoinsService")
    protected Destinateur destinateurBesoinsService;

    public Service() {
        this.description = super.description;
        this.userBesoinsService = super.userBesoinEvenements;
        this.destinateurBesoinsService = super.destinateurBesoinEvenement;
    }
}
