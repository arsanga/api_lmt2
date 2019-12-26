package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin(maxAge = 3600)
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
