package lmt.lamaintenduapi.Repository;

import lmt.lamaintenduapi.model.Maraude;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(maxAge = 3600)
public interface MaraudeRepository extends CrudRepository<Maraude, Integer> {
}
