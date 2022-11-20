package words.app.UserController.AnswerController;

import org.springframework.web.bind.annotation.*;
import words.app.UserController.WebController.CreateSetForUser;

import java.io.FileNotFoundException;
import java.util.HashMap;

@RestController
public class Answer {


    public CreateSetForUser checkAnswer(CreateSetForUser createSetForUser){
        AnswerService answerService = new AnswerService(createSetForUser);
        answerService.checkAnswer("able");
        return createSetForUser;
    }

    //TESTOWY ENDPOINT DO TESTU ODPOWIEDZI, ZWRACA TRUE LUB FALSE
    // DODAJE NOWĄ MAPĘ SŁÓWEK ZA KAŻDYM RAZEM
    // test metoda POST - localhost:8080/checkAnswer?answer=able
    // ZA ABLE PODSTAWIAMY SLOWO Z PLIKU ENGLISH.TXT
    @PostMapping("/checkAnswer")
    public boolean checkAnswer(@RequestParam String answer) throws FileNotFoundException {
        HashMap<String,String> wordsMap = new HashMap<>();
        CreateSetForUser createSetForUser = new CreateSetForUser(wordsMap);
        createSetForUser.addToMap();
        return createSetForUser.findWord(answer);
    }
}
