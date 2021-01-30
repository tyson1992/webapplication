package technicalblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technicalblog.Model.Post;
import technicalblog.repository.Postrepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PostService {


   @Autowired
   private Postrepository repository;


    public PostService() {

        System.out.println("**********Post Service***********");
    }

    //DBMS Connection Built Method

    public List<Post> getAllpost() {
        ArrayList<Post> posts = new ArrayList<>();
        repository.getAllpost();
        return repository.getAllpost();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------------------------

        public Post GetOnePost(){

           ArrayList<Post>posts = new ArrayList<>();

           repository.GetOnePost();
            return repository.GetOnePost();
    }
    public void createPost (Post newPost){
        newPost.setDate(new Date());
        repository.creatPost(newPost);
        System.out.println("New Post"+newPost);
    }
    }



