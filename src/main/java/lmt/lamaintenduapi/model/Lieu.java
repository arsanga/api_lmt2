package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Lieu extends BaseEntity implements Serializable {

    Boolean Pardieu;
    Boolean Gerland;
    Boolean Vileurbane;
    Boolean HotelDeVille;
    Boolean Bron;
    Boolean Parily;
//
//    @ManyToMany
//    List<Evenement> evenements = new ArrayList<>();
}
