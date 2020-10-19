package basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean helloWorldBean(){
//        throw new RuntimeException("Some Error has happened! Contact Support at ***-***");
        return new AuthenticationBean("You are authenticated");
    }

}
