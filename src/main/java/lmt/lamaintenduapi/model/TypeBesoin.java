package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class TypeBesoin extends BaseEntity implements Serializable {

    String type;
    String description;
}
