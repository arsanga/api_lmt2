package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Vetements extends BesoinEvenement implements Serializable {
    String type;
    String description;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    User user;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
//    @JoinColumn(name = "destinateurBesoinsHygiene")
//    protected Destinateur destinateurBesoinsVetements;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Destinateur destinateur;


}
