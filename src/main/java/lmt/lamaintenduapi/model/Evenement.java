package lmt.lamaintenduapi.model;

import lombok.Data;

import java.io.Serializable;

@Data
//@Entity
public class Evenement extends BaseEntity implements Serializable {
    String date;
    int participantMax;
    public Evenement(){
        this.date = "";
        this.participantMax = 0;
    }

//    @OneToMany
//    List<User> users= new ArrayList<>();
//
//    @ManyToMany
//    List<Lieu> lieus = new ArrayList<>();

}
