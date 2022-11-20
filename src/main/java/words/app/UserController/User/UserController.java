package words.app.UserController.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RestController
public class UserController {

    GlobalUsersMap globalUsersMap = new GlobalUsersMap();

    //DODAJE UŻYTKOWNIKA, W JSONIE MUSI BYC name, password
    @PostMapping("/registerUser")
    public String addUser(@RequestBody  User user){
        if (user.getName() == null || user.getPassword() == null){
            return "Bad fields";
        }
        try{
            System.out.println(user.getName() + " " + user.getPassword());
            User newUser = new User(user.getName(),user.getPassword());
            globalUsersMap.addUserToGlobalMap(newUser);
            return "User added";
        } catch (Exception e){
            e.printStackTrace();
            return "Can not add user. Try again";
        }
    }

    //ZWRACA MAPE UZYTKOWNIKOW
    @GetMapping("/showMap")
    public HashMap<String, String> showMap(){
        return globalUsersMap.showMap();
    }

}
