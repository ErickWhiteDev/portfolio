package day1.puzzle1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));

        String line = input.readLine();

        int max = 0;
        int count = 0;

        while (line != null) {
            if (line.isEmpty()) { // Compare calorie count at empty line
                max = Math.max(count, max);
                count = 0;
            }
            else {
                count += Integer.parseInt(line); // Increase calorie count
            }

            line = input.readLine();
        }

        input.close();

        System.out.println(max);
    }
}