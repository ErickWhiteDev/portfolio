package assignments.java.phrase_solver_experimental.src.game;

import assignments.java.phrase_solver_experimental.src.game.setup.*; //Phrase and Player classes

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PhraseSolver {

    private static final String VERSION_NUMBER = "1.4";

    private static Scanner sc = new Scanner(System.in); //Used for all input
    private static Random rand = new Random(); //Used for random phrase and point value selection

    private static int playing = 0; //Tracks current player for turns
    private static boolean solved = false;
    private static int highScore = 0;
    private static String winner = "";
    private static int playerPosition = 0; //Increments as players are added, stores total number of players minus one
    private int lives = 10;

    private static final String[] PHRASES = {"This is a test-phrase!", "Hello world", "AP CSA", "bruh", "This phrase is sponsored by Raid: Shadow Legends", "Buy \"Phrases\" DLC to unlock this phrase!", "This phrase is not available in your country"};
    private static ArrayList<Player> players = new ArrayList<Player>(); //Holds all player data
    private static Phrase gamePhrase = new Phrase(PHRASES[rand.nextInt(PHRASES.length)]); //Generates random phrase

    public PhraseSolver(){
        System.out.printf("%nWelcome to Erick White's Phrase Solver, version %s!%n", VERSION_NUMBER);
    }
    
    private static String playerName(){
        
        boolean validInput = false;
        String name = "";
       
        System.out.printf("%nEnter a name: %n");
        
        while (!validInput){
            name = sc.nextLine();
            if (name.length() > 0){
                validInput = true;
            } else {
                System.out.println("Please enter a name!");
            }
        }

        return name;
    }

    public void init(){

        boolean started = false; //Set to true once all players have been selected

        while (!started){
            
            System.out.printf("%nPress \"n\" to add a new player, or press \"s\" to start:%n");
            
            String input = sc.nextLine().toLowerCase();
            
            if (input.equals("n")){ //Setup
                players.add(new Player(playerName()));
                System.out.printf("Welcome, %s!%n", players.get(playerPosition).getName());
                playerPosition++;
            } else if (input.equals("s")){
                if (playerPosition > 0){
                    started = true;
                } else{
                    System.out.println("Please create at least one player!");
                }
            } else{
                System.out.println("This is not a valid input!");
            }
        }
    }

    public int takeTurn(String keyPhrase){ //Dictates what happens every turn

        int pointValue = rand.nextInt(5) + 1; 
        String guess = "";
        boolean validGuess = false; //Checks for empty inputs
        
        System.out.printf("%n%s, it's your turn!%n", players.get(playing).getName());

        System.out.print("Lives remaining: ");
        for (int i = 0; i < lives; i++){
            System.out.print("♥ ");
        }
        
        if (pointValue == 1){
            System.out.printf("%nThis round is worth 1 point!");
        } else{
            System.out.printf("%nThis round is worth %d points!", pointValue);
        }
        
        System.out.printf("%nSo far, you have: %s%n", gamePhrase.getEncodedPhrase());
        
        while (!validGuess){
            String input = sc.nextLine();
            if (input.length() > 0){
                guess = input;
                validGuess = true;
            }
        }

        System.out.println();

        if (guess.length() > 1){ //Checks for solving of entire phrase
            if (guess.toLowerCase().equals(keyPhrase.toLowerCase())){
                solved = true;
            }
        } else if (gamePhrase.getPhraseChars().contains(guess.charAt(0)) && !gamePhrase.getGuessedChars().contains(guess.charAt(0))){ 
                gamePhrase.addToGuessed(guess.charAt(0));
                gamePhrase.getEncodedPhrase();
        } else{
            pointValue = 0;
            lives--;
        }
        if (gamePhrase.getGuessedChars().size() == gamePhrase.getPhraseChars().size()){
            solved = true;
        }

        if (lives == 0){
            solved = true;
        }

        return pointValue;
    }

    public void endGame(){
        for (int i = 0; i < players.size(); i++){ //Ending
            if (players.get(i).getScore() > highScore){
                highScore = players.get(i).getScore();
                winner = players.get(i).getName();
            }
        }

        System.out.printf("The phrase was: %s", gamePhrase.getPhrase());
        System.out.printf("%n%s won with %d points!%n%n", winner, highScore);
        for (int i = 0; i < players.size(); i++){
            System.out.printf("%s finished with %d points!%n", players.get(i).getName(), players.get(i).getScore());
        }
        System.out.println();
    }

    public boolean getSolved(){
        return solved;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public int getPlaying(){
        return playing;
    }

    public void setPlaying(int set){
        playing = set;
    }

    public void incPlaying(int amount){
        playing += amount;
    }


    public Phrase getGamePhrase(){
        return gamePhrase;
    }

    public int getPlayerPosition(){
        return playerPosition;
    }
}
