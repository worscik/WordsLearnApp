package words.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class AddWordsFromFile {

    File polishWords = new File("polish.txt");
    File englishWords = new File("english.txt");

    public void addWords(HashMap<String,String> hashMap) throws FileNotFoundException {

        Scanner sc1 = new Scanner(englishWords);
        Scanner sc2 = new Scanner(polishWords);

        while (sc1.hasNext() && sc2.hasNext()){
            hashMap.put(sc1.nextLine(),sc2.nextLine());
        }
        System.out.println("Uzytkownik dodal wlasnie zestaw slowek - " + hashMap.size());

    }


}
