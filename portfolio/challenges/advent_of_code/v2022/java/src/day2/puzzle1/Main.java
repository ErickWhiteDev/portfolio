package day2.puzzle1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("input.txt"));

        String line = input.readLine();

        int count = 0;

        while (line != null) {
            // Handle rock-paper-scissors cases
            switch(line.charAt(2)) {
                case 'X':
                    count += 1;
                    switch(line.charAt(0)) {
                        case 'A':
                            count += 3;
                            break;
                        case 'B':
                            break;
                        case 'C':
                            count += 6;
                            break;
                    }
                    break;
                case 'Y':
                    count += 2;
                    switch(line.charAt(0)) {
                        case 'A':
                            count += 6;
                            break;
                        case 'B':
                            count += 3;
                            break;
                        case 'C':
                            break;
                    }
                    break;
                case 'Z':
                    count += 3;
                    switch(line.charAt(0)) {
                        case 'A':
                            break;
                        case 'B':
                            count += 6;
                            break;
                        case 'C':
                            count += 3;
                            break;
                    }
                    break;
            }

            line = input.readLine();
        }

        input.close();

        System.out.println(count);
    }
}