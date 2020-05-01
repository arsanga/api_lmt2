package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(maxAge = 3600)
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(@Param("email") String email);
    User findByUserId(@Param("userId") String userId);
}
