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
public class EvenExceptionnel extends Evenement implements Serializable {
    String date;
    int participantMax;
    public EvenExceptionnel(){
        this.date =super.getDate();
        this.participantMax = super.getParticipantMax();
    }
    @ManyToMany
    List<User> users = new ArrayList<>();

    @ManyToMany
    List<Lieu> lieus = new ArrayList<>();
}
