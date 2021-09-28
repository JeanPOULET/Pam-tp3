package pam.tp3.dataManagementServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pam.tp3.model.User;
import pam.tp3.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;


    public String findAllUsers(){
        StringBuilder bebou = new StringBuilder();

        userRepository.findAll().forEach(u ->
                bebou.append(u.getNom()).append(u.getPrenom()).append("\n"));

        return bebou.toString();
    }

    public void addUser(String us){
        String [] uss = parseBody(us);

        User user = new User(uss[0],uss[1]);
        userRepository.save(user);
    }

    public String[] parseBody(String s){
        String[] response = s.split("&");

        response[0] = response[0].replaceAll("nom=", "");
        response[1] = response[1].replaceAll("prenom=", "");
        System.out.println(response[0]);
        System.out.println(response[1]);
        return  response;
    }


}
