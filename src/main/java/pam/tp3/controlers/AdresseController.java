package pam.tp3.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdresseController {



    @GetMapping("users/addaddress")
    public String viewAddress(@RequestParam(value = "numero")){


        return "addressView";
    }
}
