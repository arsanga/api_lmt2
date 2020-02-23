package lmt.lamaintenduapi.model;
import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Don extends BaseEntity implements Serializable {
    String date;
    String description;

    @ManyToOne(fetch= FetchType.EAGER)
    @RestResource(exported = false)
    protected User user;
}
