/* 
    The program calculates the probability of a house giving away a dollar bill given that
        a.) All but three houses give away candy
        b.) One house gives out toothbrushes
        c.) Two houses give out dollar bills

    Finished 8/18/21 
*/

package challenges.sololearn_challenges.general_challenges.halloween_candy;

import java.util.Scanner;

public class HalloweenCandy {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int houses = sc.nextInt();
        System.out.println((int) Math.ceil((2.0 / houses) * 100));
        sc.close();
    }
    
}
