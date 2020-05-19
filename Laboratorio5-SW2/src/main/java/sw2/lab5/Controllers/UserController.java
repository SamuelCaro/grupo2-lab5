package sw2.lab5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sw2.lab5.entity.User;
=======
import sw2.lab5.repository.PostRepository;
>>>>>>> 7a9265f6d5a53e3321abfbaf20e1047b7ecd4c7d
import sw2.lab5.repository.UserRepository;

import java.util.Optional;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PostRepository postRepository;


    @GetMapping("/listaUser")
    public String listaUser (Model model){
<<<<<<< HEAD
        model.addAttribute("listaUser", userRepository.findAll();
        return "user/list";
    }

    @GetMapping("editarUser")
    public String EditUser(@ModelAttribute("user") User user, Model model,
                                @RequestParam("iduser") int iduser){

        Optional<User> optUser = userRepository.findById(iduser);

        if (optUser.isPresent()) {
            user = optUser.get();
            model.addAttribute("user", user);
            return "user/G-RegistroComunidad";
        } else {
            return "redirect:/user/listaUser";
        }
    }


    @GetMapping("borrarUser")
    public String borrarusuario(Model model,
                                  @RequestParam("id") int iduser,
                                  RedirectAttributes attr){
        Optional<User> optUser = userRepository.findById(iduser);
        if (optUser.isPresent()) {
            userRepository.deleteById(iduser);
            attr.addFlashAttribute("msg","Usuario borrado exitosamente");
        }
        return "redirect:/user/listaUser";
    }

=======
        model.addAttribute("listaUser", userRepository.findAll());
        return "Gestor/G-ListaComunidad";
    }


>>>>>>> 7a9265f6d5a53e3321abfbaf20e1047b7ecd4c7d

}
