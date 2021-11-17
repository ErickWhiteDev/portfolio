package challenges.programming_challenges.java.v_1_3;

import java.util.Scanner;

public class TemperatureConverter03v1 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input unit: ");
        String inputUnit = sc.nextLine().toLowerCase();
        System.out.print("Output unit: ");
        String outputUnit = sc.nextLine().toLowerCase();
        int temp = getTemp();
    }

    private static int getTemp(){

        boolean validInput = false;
        Scanner sc = new Scanner(System.in);

        while (!validInput){
            try {
                System.out.print("Enter a temperature: ");
                int temp = Integer.parseInt(sc.nextLine());
                validInput = true;
                sc.close();
                return temp;
            }
            catch (NumberFormatException n) { 
                System.out.println("Enter a valid number!");
            }
        }
        return 0;
    }
}
