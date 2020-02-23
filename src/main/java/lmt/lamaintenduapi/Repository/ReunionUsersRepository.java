package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.ReunionUsers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(maxAge = 3600)
public interface ReunionUsersRepository extends CrudRepository<ReunionUsers, Integer> {
}
