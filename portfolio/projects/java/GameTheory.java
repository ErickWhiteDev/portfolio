/*
    A basic project simulating Game Theory in economics.
    A group's choice is compared to a player's choice and points are given according to their relation.
    
    Payout matrix:

                        Majority
                        Compete     Collude
    Player  Compete     +10         +40
            Collude     +0          +20
*/

import java.util.Random;

public class GameTheory{
    public static void main(String[] args){
        
        int collusionCount, groupSelection, selection, groups = 5, iterations = 5, points = 0;

        String[] choices = {"Collude", "Compete"};

        Random r = new Random();

        System.out.println(" Group  |   You   | Points");

        for (int i = 0; i < iterations; i++){

            collusionCount = r.nextInt(groups + 1); // Select how many groups choose to collude
            selection = r.nextInt(2); // Make a personal decision

            if (collusionCount > (groups / 2)){

                groupSelection = 0;

                if (selection == 0){
                    points += 20; // Assign 20 points if the majority of groups (inlcuding the player) choose to collude
                }

                else {
                    points += 40; // Assign 40 points if the majority of groups choose to collude, but the player chooses to compete
                }
            }

            else {

                groupSelection = 1;

                if (selection == 1){
                    points += 10; // Assign 10 points if the majority of teams (including the player) choose to compete
                }
            }

            System.out.printf("%s | %s | %d%n", choices[groupSelection], choices[selection], points);
        }

        System.out.printf("%nTotal points gained: %d", points);
    }
}