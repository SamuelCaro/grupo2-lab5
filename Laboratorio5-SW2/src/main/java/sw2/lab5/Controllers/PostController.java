package sw2.lab5.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sw2.lab5.entity.Post;
import sw2.lab5.repository.PostRepository;

import java.util.Optional;


@Controller
@RequestMapping("/post")

public class PostController {

    @Autowired
    PostRepository postRepository;


    @GetMapping("listaPost")
    public String listaPost(Model model) {
        model.addAttribute("listaPost", postRepository.findAll());
        return "post/ListarPost";
    }


    @GetMapping("editarpost")
    public String editarpost(@ModelAttribute("post") Post post, Model model,
                             @RequestParam("idpost") int idpost) {

        Optional<Post> optPost = postRepository.findById(idpost);
        if (optPost.isPresent()) {
            post = optPost.get();
            model.addAttribute("post", post);
            return "post/nuevopost";
        } else {
            return "redirect:/post/ListarPost";
        }
    }


}
