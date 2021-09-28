package pam.tp3.controlers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pam.tp2.web.Frontend;
import pam.tp3.dataManagementServices.UserService;
import pam.tp3.model.User;
import pam.tp3.repositories.UserRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    public UserService userService;

    @GetMapping("users/adduser")
    public String addUser(@RequestParam(required = false, value = "firstname") String firstname,
                          @RequestParam(required = false, value = "lastname") String lastname,
                          Model model) {
        logger.info(firstname + lastname);
        if (firstname != null && !firstname.replaceAll(" ", "").equals(""))
            userService.addUser(firstname, lastname);

        model.addAttribute("users", userService.findAllUsers());
        return "userView";
    }

}
