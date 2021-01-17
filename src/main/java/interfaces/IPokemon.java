package interfaces;

import modelo.Pokemon;
import org.springframework.data.repository.CrudRepository;

public interface IPokemon extends CrudRepository<Pokemon, Integer> {

}
