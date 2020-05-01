package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Hygiene extends BaseEntity implements Serializable {

    String typeNom;

    String description;
}
