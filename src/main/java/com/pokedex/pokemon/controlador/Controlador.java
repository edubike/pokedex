package com.pokedex.pokemon.controlador;

import com.pokedex.pokemon.interfaceServicio.IPokemonServicio;
import com.pokedex.pokemon.modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPokemonServicio service;

    @GetMapping("/")
    public String listar(Model model) {
        List<Pokemon> pokemons = service.Listar();
        model.addAttribute("pokemons", pokemons);
        return "index";
    }

    @GetMapping("/create")
    public String agregar(Model model) {
        model.addAttribute("pokemons", new Pokemon());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated Pokemon p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Pokemon> pokemon = service.listarId(id);
        model.addAttribute("pokemon", pokemon);
        return "edit";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }

}
