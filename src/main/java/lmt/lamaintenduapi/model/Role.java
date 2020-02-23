package lmt.lamaintenduapi.model;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Role extends BaseEntity implements Serializable {

    String roleName;
}
