/* 
The program reverses a string using a char array

Finished 8/18/21 
*/

package sololearn_challenges.course_challenges.java;

import java.util.Scanner;

public class ReverseAString
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
        String result = "";
		char[] arr = text.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--)
        {
            result = result.concat(Character.toString(arr[i]));
        }
        System.out.println(result);
	    scanner.close();	
	}
}