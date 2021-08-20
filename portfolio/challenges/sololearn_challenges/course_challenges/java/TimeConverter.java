/* 
The program converts a time in days into seconds

Finished 8/18/21
*/

package challenges.sololearn_challenges.course_challenges.java;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		System.out.println(days * 24 * 60 * 60);
		scanner.close();
	}
}