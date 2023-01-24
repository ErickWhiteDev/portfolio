package day2.puzzle2;

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
                    switch(line.charAt(0)) {
                        case 'A':
                            count += 3;
                            break;
                        case 'B':
                            count += 1;
                            break;
                        case 'C':
                            count += 2;
                            break;
                    }
                    break;
                case 'Y':
                    count += 3;
                    switch(line.charAt(0)) {
                        case 'A':
                            count += 1;
                            break;
                        case 'B':
                            count += 2;
                            break;
                        case 'C':
                            count += 3;
                            break;
                    }
                    break;
                case 'Z':
                    count += 6;
                    switch(line.charAt(0)) {
                        case 'A':
                            count += 2;
                            break;
                        case 'B':
                            count += 3;
                            break;
                        case 'C':
                            count += 1;
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