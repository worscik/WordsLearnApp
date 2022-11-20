package words.app.UserController;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RestController
public class UserController {

    AllUsers allUsers = new AllUsers();

    @PostMapping("/registerUser")
    public String addUser(String name, String password){
        try{
            System.out.println(name + " " + password);
            User user = new User(name,password);
            allUsers.addUserToGlobalMap(user);
            return "Aded user";
        } catch (Exception e){
            e.printStackTrace();
            return "Bad request";
        }
    }

    @GetMapping("/showMap")
    public HashMap<String, String> showMap(){
        return allUsers.showMap();
    }

}
