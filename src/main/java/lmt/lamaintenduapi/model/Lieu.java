package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;
@Data
@Entity
public class Lieu extends BaseEntity implements Serializable {

    String lieuName;
//
//    @ManyToMany
//    List<Evenement> evenements = new ArrayList<>();
}
