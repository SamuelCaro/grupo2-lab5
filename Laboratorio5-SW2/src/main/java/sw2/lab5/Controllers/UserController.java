package sw2.lab5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sw2.lab5.repository.UserRepository;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;


    @GetMapping("listaUser")
    public String listaUser (Model model){
        model.addAttribute("listaUser", userRepository.findAll());
        return "Gestor/G-ListaComunidad";
    }

    @GetMapping(value = {"/posts"})
    public String listarPosts(Model model) {
        model.addAttribute("listaPosts", employeeRepository.findAll());
        return "listarPost";
    }

}
