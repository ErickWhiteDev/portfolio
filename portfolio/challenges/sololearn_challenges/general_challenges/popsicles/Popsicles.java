/*
    The program calculates whether the number of popsicles is evenly distributed among the siblings and outputs accordingly

    Finished 8/18/21
*/

package challenges.sololearn_challenges.general_challenges.popsicles;

import java.util.Scanner;

public class Popsicles{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int siblings = sc.nextInt();
        int popsicles = sc.nextInt();
        
        String result = (siblings % popsicles) == 0 ? "give away" : "eat them yourself";
        System.out.println(result);
        sc.close();
    }
}