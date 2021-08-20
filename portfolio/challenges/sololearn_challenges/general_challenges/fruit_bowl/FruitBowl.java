/* 
The program calculates the number of apple pies that can be made from a bowl of fruit given that
a.) Half the bowl is apples
b.) It takes three apples to make one apple pie

Finished 8/18/21 
*/

package sololearn_challenges.general_challenges.fruit_bowl;

import java.util.Scanner;

public class FruitBowl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fruit = sc.nextInt();
        System.out.println(fruit / 6);
        sc.close();
    }
}
