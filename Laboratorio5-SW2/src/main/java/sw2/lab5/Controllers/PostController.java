package sw2.lab5.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/post")

public class PostController {






    @GetMapping("listaPost")
    public String listaPost (Model model){
        model.addAttribute("listaPost", comunidadRepository.findAll());
        return "Gestor/G-ListaComunidad";
    }
}
