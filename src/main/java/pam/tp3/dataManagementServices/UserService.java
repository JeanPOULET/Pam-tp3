package pam.tp3.dataManagementServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pam.tp3.model.User;
import pam.tp3.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;


    public List<User> findAllUsers(){
       /* StringBuilder bebou = new StringBuilder();

        userRepository.findAll().forEach(u ->
                bebou.append(u.getNom()).append(u.getPrenom()).append("\n"));*/
        List<User> ls = new ArrayList<>();
                userRepository.findAll().forEach(ls::add);

        return ls;
    }

    public void addUser(String nom, String prenom){
        User user = new User(nom,prenom);
        userRepository.save(user);
    }


}
