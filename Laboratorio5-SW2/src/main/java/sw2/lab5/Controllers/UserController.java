package sw2.lab5.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {


    @GetMapping("gestorListaComunidad")
    public String listaComunidad (Model model){
        model.addAttribute("listaComunidad", comunidadRepository.findAll());
        return "Gestor/G-ListaComunidad";
    }

    @GetMapping(value = {"/posts"})
    public String listarPosts(Model model) {
        model.addAttribute("listaPosts", employeeRepository.findAll());
        return "listarPost";
    }

}
