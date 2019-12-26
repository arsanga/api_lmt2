package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class BesoinsAsso extends BaseEntity implements Serializable {
    String date;
    String description;
    int participantMax;
}
