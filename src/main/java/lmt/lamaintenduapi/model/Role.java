package lmt.lamaintenduapi.model;

import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Role extends BaseEntity implements Serializable {

    String roleName;

    @OneToMany(mappedBy = "userRole", cascade = CascadeType.REMOVE)
    List<Role> userRole = new ArrayList<>();
}
