package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.Model.Post;
import technicalblog.Model.User;
import technicalblog.service.PostService;
import technicalblog.service.userservice;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {

    @Autowired
    private PostService postService;

    @Autowired
    userservice userService;

    @RequestMapping("users/login")
    public String users(){
        return "users/login";
    }


    @RequestMapping("users/registration")
    public String registration(){
        return "users/registration";
    }

    @RequestMapping(value="users/registration",method = RequestMethod.POST)
    public String registeruser(User user){

        return "users/login";
    }

    @RequestMapping(value="users/login", method = RequestMethod.POST)
    public String loginUser(User user){
        if(userService.login(user)) {
            return "redirect:/posts";

        }
        else {
            return "users/login";

            }

    }


    @RequestMapping(value="users/logout", method = RequestMethod.POST)
    public String logout(Model model){

        List<Post> posts = postService.getAllpost();

        model.addAttribute("posts", posts);

        return "index";

    }
}
