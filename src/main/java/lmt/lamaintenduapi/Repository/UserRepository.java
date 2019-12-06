package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(@Param("email") String email);
    User findByUserId(@Param("userId") String userId);
}
