package com.pokedex.pokemon.servicio;

import com.pokedex.pokemon.interfaceServicio.IPokemonServicio;
import com.pokedex.pokemon.interfaces.IPokemon;
import com.pokedex.pokemon.modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonServicio implements IPokemonServicio {

    @Autowired
    private IPokemon data;

    @Override
    public List<Pokemon> Listar() {
        return (List<Pokemon>)data.findAll();
    }

    @Override
    public Optional<Pokemon> listarId(int id) {
        return data.findById(id);
    }

    @Override
    public int save(Pokemon p) {
        int res=0;
        Pokemon pokemon=data.save(p);
        if(!pokemon.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {

        data.deleteById(id);

    }
}
