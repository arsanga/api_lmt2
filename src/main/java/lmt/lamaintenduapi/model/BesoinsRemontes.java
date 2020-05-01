package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Data
@Entity
public class BesoinsRemontes extends BaseEntity implements Serializable {

    int quantite;

    String dateCreation;

    String description;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    TypeBesoin typeBesoin;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Alimentaire alimentaire;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Vetements vetement;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Service service;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Hygiene hygiene;

}
