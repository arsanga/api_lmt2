package lmt.lamaintenduapi.model;

import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
public class RGPD extends BaseEntity implements Serializable {
    User user;
    boolean aConfirme;
    boolean aRefuse;
}
