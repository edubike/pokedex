package servicio;

import interfaceServicio.IPokemonServicio;
import interfaces.IPokemon;
import modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PersonaServicio implements IPokemonServicio {

    @Autowired
    private IPokemon data;

    @Override
    public List<Pokemon> Listar() {

        return (List<Pokemon>)data.findAll();
    }

    @Override
    public Optional<Pokemon> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Pokemon p) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }
}
