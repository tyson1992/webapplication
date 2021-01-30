package technicalblog.service;

import org.springframework.stereotype.Service;
import technicalblog.Model.User;

@Service
public class  userservice {
    public boolean login(User user){

        if(User.getUsername().equals("validuser") && User.getPassword().equals("123")) {
            return true;
        }

        else {

                return false;
            }
        }
    }

