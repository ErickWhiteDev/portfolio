package challenges.programming_challenges.java.v_1_3;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NameGenerator00 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nasals = new ArrayList<>(Arrays.asList("m", "n"));

        ArrayList<String> bilabialPlosives = new ArrayList<>(Arrays.asList("p", "b"));
        ArrayList<String> alveolarPlosives = new ArrayList<>(Arrays.asList("t", "d"));
        ArrayList<String> velarPlosives = new ArrayList<>(Arrays.asList("k", "g"));

        ArrayList<String> liquids = new ArrayList<>(Arrays.asList("l", "r"));

        ArrayList<String> labiodentalFricatives = new ArrayList<>(Arrays.asList("f", "v"));
        ArrayList<String> dentalFricative = new ArrayList<>(Arrays.asList("th"));
        ArrayList<String> alveolarFricatives = new ArrayList<>(Arrays.asList("s", "z"));
        ArrayList<String> palatoalveolarFricative = new ArrayList<>(Arrays.asList("sh"));
        ArrayList<String> glottalFricative = new ArrayList<>(Arrays.asList("h"));

        ArrayList<String> affricates = new ArrayList<>(Arrays.asList("ch", "j"));

        ArrayList<String> labiovelarApproximant = new ArrayList<>(Arrays.asList("w"));
        ArrayList<String> palatalApproximant = new ArrayList<>(Arrays.asList("y"));

        ArrayList<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        ArrayList<String> diphthongs = new ArrayList<>(Arrays.asList("ai", "au", "ea", "ee", "ei", "ia", "ie", "io",
                "iu", "oe", "oi", "oo", "ou", "ua", "ue", "ui", "uo"));

        ArrayList<String> specialLetters = new ArrayList<>(Arrays.asList("qu", "c", "x"));

        ArrayList<ArrayList<String>> letters = new ArrayList<>(
                Arrays.asList(nasals, bilabialPlosives, alveolarPlosives, velarPlosives, liquids, labiodentalFricatives,
                        dentalFricative, alveolarFricatives, palatoalveolarFricative, glottalFricative, affricates,
                        labiovelarApproximant, palatalApproximant, vowels, diphthongs, specialLetters));

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> articulation = new ArrayList<>(Arrays.asList("q"));

        boolean validLength = false;
        int length = 7;
        while (!validLength){
            try{
                System.out.println("Please enter a name length:");
                length = sc.nextInt();
                if (length > 1){
                    validLength = true;
                } else{
                    System.out.println("Please enter a valid length (greater than 1)!");
                }
            } catch (Exception e){
                System.out.println("Please enter a valid length (greater than 1)!");
            }
        }

        for (int i = 0; i <= length - 1; i++) {
            
            String temp = "";
            boolean validLetter = false;

            ArrayList<String> inclusion = new ArrayList<>();

            if (articulation.get(articulation.size() - 1).equals("q")) {
                String[] inclusionList = {"m", "p", "t", "k", "l", "f", "th", "s", "sh", "h", "ch", "w", "y", "a", "ai", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("m")) {
                String[] inclusionList = {"p", "t", "k", "th", "ch", "s", "y", "a", "ai", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("p")) {
                String[] inclusionList = {"l", "s", "h", "y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("t")) {
                String[] inclusionList = {"l", "s", "sh", "ch", "y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("k")) {
                String[] inclusionList = {"l", "s", "y", "a", "ai", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("l")) {
                String[] inclusionList = {"m", "p", "t", "k", "f", "th", "s", "sh", "ch", "y", "a", "ai", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("f")) {
                String[] inclusionList = {"l", "s", "y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("th")) {
                String[] inclusionList = {"t", "l", "y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("s")) {
                String[] inclusionList = {"p", "t", "k", "y", "a", "ai", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("sh")) {
                String[] inclusionList = {"p", "t", "k", "y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("h")) {
                String[] inclusionList = {"y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("ch")) {
                String[] inclusionList = {"a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("w")) {
                String[] inclusionList = {"y", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("y")) {
                String[] inclusionList = {"m", "p", "t", "k", "l", "f", "th", "s", "sh", "ch", "a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("a")) {
                String[] inclusionList = {"m", "p", "t", "k", "l", "f", "th", "s", "sh", "h", "ch", "w", "y", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("ai")) {
                String[] inclusionList = {"m", "p", "t", "k", "l", "f", "th", "s", "sh", "h", "ch", "w", "y", "qu"};
                inclusion.addAll(Arrays.asList(inclusionList));
            } else if (articulation.get(articulation.size() - 1).equals("qu")) {
                String[] inclusionList = {"a", "ai"};
                inclusion.addAll(Arrays.asList(inclusionList));
            }
            
            while (!validLetter) {
                int randInt = rand.nextInt(letters.size());
                for (int j = 0; j < letters.get(randInt).size(); j++){
                    if (inclusion.contains(letters.get(randInt).get(j))) {
                        validLetter = true;
                        temp = letters.get(randInt).get(rand.nextInt(letters.get(randInt).size()));
                        name.add(temp);
                        articulation.add(letters.get(randInt).get(0));
                    }
                }
            }
        }

        String gender = "";
        int genderSelect = rand.nextInt(1001);
        if (genderSelect < 499){
            gender = "Boy";
        } else if (genderSelect < 998){
            gender = "Girl";
        } else{
            gender = "Apache attack helicopter";
        }

        name.set(0, name.get(0).substring(0, 1).toUpperCase());
        String finalName = "";
        for (int i = 0; i < name.size(); i++){
            finalName = finalName.concat(name.get(i));
        }
        System.out.printf("Your baby:%nName: %s%nGender: %s", finalName, gender);

        sc.close();
    }
}