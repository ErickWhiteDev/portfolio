package challenges.programming_challenges.java.v_1_3;

import java.util.Scanner;

public class TemperatureConverter03v1 {
    public static void main(String[] args){

        int sel = 3;

        double[] addToCelsius = {-273.15, 0, -32};
        double[] multToCelsius = {1, 1, .5556};

        double[] multConversion = {1, 1, 1.8};
        double[] addConversion = {273.15, 0, 32};

        String[] scales = {"Kelvin", "Celsius", "Fahrenheit"};
        
        Scanner sc = new Scanner(System.in);

        while (sel == 3){
            System.out.print("Input unit: ");
            sel = getScale(sc.nextLine().toLowerCase());
        }
        int inputUnit = sel;

        sel = 3;
        while (sel == 3){
            System.out.print("Output unit: ");
            sel = getScale(sc.nextLine().toLowerCase());
        }
        int outputUnit = sel;

        double temp = getTemp();
        double output = ((temp + addToCelsius[inputUnit]) * multToCelsius[inputUnit]) * multConversion[outputUnit] + addConversion[outputUnit];

        System.out.printf("%.2f degrees in %s is %.2f degrees in %s.", temp, scales[inputUnit], output, scales[outputUnit]);

        sc.close();
    }

    private static double getTemp(){

        boolean validInput = false;
        Scanner sc = new Scanner(System.in);

        while (!validInput){
            try {
                System.out.print("Enter a temperature: ");
                double temp = Double.parseDouble(sc.nextLine());
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

    private static int getScale(String input){
        if (input.contains("kelvin") || (input.charAt(0) == 'k')) {
            return 0;
        }
        else if (input.contains("celsius") ||(input.charAt(0) == 'c')) {
            return 1;
        }
        else if (input.contains("fahrenheit") || (input.charAt(0) == 'f')) {
            return 2;
        }
        else {
            return 3;
        }
    }
}
