package lmt.lamaintenduapi.model;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

