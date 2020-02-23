package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
public class Service extends BesoinEvenement implements Serializable {

    String description;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    User user;


    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Destinateur destinateur;

}
