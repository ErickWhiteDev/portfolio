package assignments.java.phrase_solver_experimental.src.game.setup;

import java.util.ArrayList;
import java.util.Arrays;

public class Phrase {
    
    private String phrase = "";
    private static ArrayList<Character> phraseChars = new ArrayList<>();
    private static final ArrayList<Character> SPECIALCHARS = new ArrayList<>(Arrays.asList(' ', '.', ',', '!', '?', '-', ':', ';', '"', '\'', '\'')); //Defines characters to be excluded from guesses
    private static ArrayList<Character> guessedChars = new ArrayList<>();

    public Phrase(String input){

        this.phrase = input;

        for (int i = 0; i < input.length(); i++){ //Handles capital/lowercase letter differences in phrase

            char capitalLetter = Character.toUpperCase(input.charAt(i));
            char lowercaseLetter = Character.toLowerCase(input.charAt(i));

            if (!SPECIALCHARS.contains(capitalLetter) && !phraseChars.contains(capitalLetter)){
                phraseChars.add(capitalLetter);
                phraseChars.add(lowercaseLetter);
            }
        }
    }

    public void addToGuessed(char letter){ //Handles capital/lowercase letter differences in guess

        char lowercaseLetter = Character.toLowerCase(letter);
        char capitalLetter = Character.toUpperCase(letter);

        if (!SPECIALCHARS.contains(letter)){
            guessedChars.add(lowercaseLetter);
            guessedChars.add(capitalLetter);
        }
    }

    private String encodeString(String input){ //Returns phrase structure, as well as any special characters defined in specialChars

        String encodedPhrase = "";

        for(int i = 0; i < input.length(); i++){
            if (guessedChars.contains(input.charAt(i))){
                encodedPhrase = encodedPhrase.concat(String.valueOf(input.charAt(i)));
            } else if (SPECIALCHARS.contains(input.charAt(i))){
                encodedPhrase = encodedPhrase.concat(String.valueOf(input.charAt(i)));
            } else{
                encodedPhrase = encodedPhrase.concat("_");
            }
        }

        return encodedPhrase;
    }

    public String getPhrase(){
        return phrase;
    }

    public String getEncodedPhrase(){
        return encodeString(phrase);
    }

    public ArrayList<Character> getPhraseChars(){
        return phraseChars;
    }

    public ArrayList<Character> getGuessedChars(){
        return guessedChars;
    }
}
