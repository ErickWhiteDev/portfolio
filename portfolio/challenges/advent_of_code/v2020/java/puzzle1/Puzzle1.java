/*
 * The first Advent of Code puzzle for 2020.
 * Given the inputs, I had to find the multiple of the two numbers that add to 2020.
 * 
 * Solution: 1020036
 */

package challenges.advent_of_code.v2020.java.puzzle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Puzzle1{
    static ArrayList<Integer> values = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("https://github.com/ErickWhiteDev/portfolio/blob/main/portfolio/challenges/advent_of_code/v2020/java/puzzle1/input.txt"); // Temporary URl until I get local file to work correctly
        Scanner sc = new Scanner(input);

        while (sc.hasNextLine()){
            values.add(Integer.parseInt(sc.nextLine()));
        }

        sc.close();

        System.out.println(solvePuzzle());
    }

    public static Integer solvePuzzle(){
        for (Integer i: values){
            for (Integer j: values){
                if (i + j == 2020){
                    return i * j;
                }
            }
        }
        return 0;
    }
}