package pam.tp3.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pam.tp3.dataManagementServices.UserService;
import pam.tp3.model.User;
import pam.tp3.repositories.UserRepository;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("users/getUsers")
    public String getUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("users/adduser")
    public String viewUser(){

        return "userView";
    }
    @PostMapping("users/adduser")
    public String addUser(@RequestBody String user){
        userService.addUser(user);
        return "greeting";
    }

}
