package technicalblog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.Model.Post;
import technicalblog.service.PostService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class postController {

    @Autowired
   private PostService postService;

    @RequestMapping("posts")
    public String getUserPosts(Model model){
    List<Post>posts = postService.getAllpost();

        model.addAttribute("posts",posts);
        return "posts";

    }



    @RequestMapping("/posts/newpost")
    public String newPost() {
        return "/posts/create";
    }

    @RequestMapping(value = "posts/create", method = RequestMethod.POST)
    public String createPost(Post newPost) {
        postService.createPost(newPost);
        return "redirect:/posts";
    }
}
