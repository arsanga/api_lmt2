package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.EvenExceptionnel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(maxAge = 3600)
public interface EvenExceptionnelRepository extends CrudRepository<EvenExceptionnel, Integer> {
}
