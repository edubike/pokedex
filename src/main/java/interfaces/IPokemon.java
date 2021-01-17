package interfaces;

import modelo.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemon extends CrudRepository<Pokemon, Integer> {

}
