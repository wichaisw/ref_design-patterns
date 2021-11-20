package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class WordProcessor {
    private List<Letter> letters = new ArrayList<Letter>();

    public void addLetter(Letter letter){
        this.letters.add(letter);
    }

    public void printLetters(){
        for (Letter letter : letters) {
            System.out.print(letter.getValue());
        }
    }
}
