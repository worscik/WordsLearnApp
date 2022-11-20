package words.app.UserController.WebController;

import words.app.UserController.WordsAddFromFile.AddWordsFromFile;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class CreateSetForUser {

    private HashMap<String,String> wordsMap;

    public CreateSetForUser(HashMap<String, String> wordsMap) {
        this.wordsMap = wordsMap;
    }

    public HashMap<String, String> getWordsMap() {
        return wordsMap;
    }

    public void setWordsMap(HashMap<String, String> wordsMap) {
        this.wordsMap = wordsMap;
    }

    public void addToMap() throws FileNotFoundException {
        AddWordsFromFile addWordsFromFile = new AddWordsFromFile();
        addWordsFromFile.addWords(wordsMap);
    }

    public void remove(){
    }

    public void show(){
        System.out.println(wordsMap);
    }

    public boolean findWord(String word){
        boolean result = wordsMap.containsKey(word);
        System.out.println("Wyslane slowo do znalezienia - " + word);
        System.out.println("Czy znaleziono? " + result);
        return result;

    }

}
