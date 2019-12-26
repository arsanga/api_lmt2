package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.Vetements;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(maxAge = 3600)
public interface VetementsRepository extends CrudRepository<Vetements, Integer> {
}
