package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
public class BesoinEvenement extends BaseEntity implements Serializable {
    String description;
    protected User userBesoinEvenements;
    protected Destinateur destinateurBesoinEvenement;


    public BesoinEvenement(){
        this.description = "";
        this.userBesoinEvenements = new User();
        this.destinateurBesoinEvenement = new Destinateur();
    }
}
