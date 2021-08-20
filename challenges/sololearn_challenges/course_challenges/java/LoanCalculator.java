/* 
The program calculates the amount owed on a loan given a fixed pay rate

Finished 8/18/21 
*/

package sololearn_challenges.course_challenges.java;

import java.util.Scanner;

public class LoanCalculator
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for (int i = 0; i < 3; i++)
    {
        amount -= amount / 10;
    }
    System.out.println(amount);
    scanner.close();
	}
}
