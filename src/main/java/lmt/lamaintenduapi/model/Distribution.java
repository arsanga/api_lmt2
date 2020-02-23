package lmt.lamaintenduapi.model;


import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Distribution extends Evenement implements Serializable{
    String date;
    int nbrRepas;
    int participantMax;
    public Distribution(){
        this.date =super.date;
        this.participantMax = super.participantMax;
        this.nbrRepas = 0;
    }

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    User user;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    Lieu lieu;

}

