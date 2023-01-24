package day1.puzzle2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));

        String line = input.readLine();

        ArrayList<Integer> elves = new ArrayList<>();

        int count = 0;

        while (line != null) {
            if (line.isEmpty()) { // Add calorie count to array at empty line
                elves.add(count);
                count = 0;
            }
            else {
                count += Integer.parseInt(line); // Increase calorie count
            }

            line = input.readLine();
        }

        input.close();

        elves.sort(Collections.reverseOrder()); // Put greatest count first

        count = 0;

        for (int i = 0; i < 3; i++) {
            count += elves.get(i);
        }

        System.out.println(count);
    }
}