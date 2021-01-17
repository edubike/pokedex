package interfaceServicio;

import modelo.Pokemon;

import java.util.List;
import java.util.Optional;

public interface IPokemonServicio {
    public List<Pokemon> Listar();
    public Optional<Pokemon> listarId(int id);
    public int save(Pokemon p);
    public void delete(int id);

}
