/* 
    The program converts a base-10 number to binary

    Finished 8/18/21 
*/

package challenges.sololearn_challenges.course_challenges.java;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x)); // Converts an input number directly to binary
        sc.close();
    }
}

class Converter {
    public static String toBinary(int input)
    {
        return Integer.toBinaryString(input);
    }
}
