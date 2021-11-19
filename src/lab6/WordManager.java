package lab6;
import java.text.Normalizer;

public class WordManager {
    private String secretWord = "";
    public String userWord = "";

    void askSecretWord(){
        //System.out.print("Enter your secret word: ");
        //String s = Input.readString();
        secretWord = Dialogs.getHiddenString("Enter your secret word: ");
        secretWord = stripAccents(secretWord);
        secretWord = secretWord.toLowerCase();
        userWord = "";

        for (int i = 0; i < secretWord.length(); i++) {
            userWord += '*';
        }
    }

    boolean checkLetter(char c){
        boolean letterPresent = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if(c == secretWord.charAt(i)){
                letterPresent = true;
                userWord = userWord.substring(0, i) + c + userWord.substring(i+1);
            }
        }
        return letterPresent;
    }

    boolean isWordComplete(){
        boolean complete = false;
        if (secretWord.equals(userWord)) {
            complete = true;
            //System.out.println("Victory !!");
            Dialogs.displayMessage("Victory !!");
        }
        return complete;


    }

    public static String stripAccents(String s){
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }
}
