package controlador;

import interfaceServicio.IPokemonServicio;
import modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPokemonServicio service;

    @GetMapping("/listar")
    public String listar(Model model){

        List<Pokemon> pokemons = service.Listar();
        model.addAttribute("pokemons",pokemons);
        return "index";
    }
public String agregar(Model model){
        model.addAttribute("pokemon",new Pokemon());
        return "create";
}
public String save(@Validated Pokemon p,Model model){
        service.save(p);
        return"redirect:/listar";
}
    @GetMapping("/editar/{pokemons.id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Pokemon> pokemon=service.listarId(id);
        model.addAttribute("pokemon",pokemon);
        return "form";
    }

}
