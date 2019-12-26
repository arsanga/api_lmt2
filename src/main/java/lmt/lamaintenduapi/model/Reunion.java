package lmt.lamaintenduapi.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Reunion extends Evenement implements Serializable {

    String organisateur;
    String date;
    int participantMax;
    public Reunion(){
        this.organisateur = "";
        this.date =super.date;
        this.participantMax = super.participantMax;
    }
    @ManyToMany
    List<User> users = new ArrayList<>();

    @ManyToMany
    List<Lieu> lieus = new ArrayList<>();
}
