package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import technicalblog.Model.Post;
import technicalblog.service.PostService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    public HomeController(){

        System.out.println("********Home Controller*******");
    }

    @Autowired
    private PostService postservice;

    @RequestMapping("/")

    public String getAllpost(Model model) {

        List<Post> posts = postservice.getAllpost();

        model.addAttribute("posts", posts);

        return ("index");

    }
}