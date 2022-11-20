package words.app.UserController.WebController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import words.app.UserController.AnswerController.Answer;

import java.io.FileNotFoundException;
import java.util.HashMap;


@RestController
public class WebController {

    @GetMapping("/")
    public ModelAndView mainTheme(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }


    @GetMapping("/user1")
    public HashMap<String,String> startGame() throws FileNotFoundException {
        HashMap<String,String> map = new HashMap<>();
        CreateSetForUser createSetForUser = new CreateSetForUser(map);
        createSetForUser.addToMap();
        Answer answer = new Answer();
        answer.checkAnswer(createSetForUser);
        return map;
    }

    @GetMapping("/user2")
    public HashMap<String,String> startGame1() throws FileNotFoundException {
        HashMap<String,String> map = new HashMap<>();
        CreateSetForUser createSetForUser = new CreateSetForUser(map);
        createSetForUser.addToMap();
        Answer answer = new Answer();
        answer.checkAnswer(createSetForUser);
        return map;
    }

}
