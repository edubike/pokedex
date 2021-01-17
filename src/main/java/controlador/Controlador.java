package controlador;

import interfaceServicio.IPokemonServicio;
import modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPokemonServicio service;

    @GetMapping("/listar")
    public String listar(Model model){

        List<Pokemon> pokemons = service.Listar();
        model.addAttribute("persona",pokemons);
        return "index";
    }

}