package controlador;

import interfaceServicio.IPokemonServicio;
import modelo.Pokemon;
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

    @GetMapping("/listar")
    public String listar(Model model) {

        List<Pokemon> pokemons = service.Listar();
        model.addAttribute("pokemons", pokemons);
        return "index";
    }

    @GetMapping("/nuevo")
    public String agregar(Model model) {
        model.addAttribute("pokemons", new Pokemon());
        return "create";
    }

    @PostMapping("/save")
    public String save(@Validated Pokemon p, Model model) {
        service.save(p);
        return "redirect:/listar";
    }

    @GetMapping("/editar/{pokemons.id}")
    public String editar(@PathVariable int id, Model model) {
        Optional<Pokemon> pokemon = service.listarId(id);
        model.addAttribute("pokemon", pokemon);
        return "form";
    }
    @GetMapping("/eliminar/{id}")
    public String delete(Model model,@PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }

}
