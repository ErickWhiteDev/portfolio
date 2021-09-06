package projects.java.thank_you.thank_you_fred.src;

import javax.swing.*;

import projects.java.thank_you.thank_you_fred.src.gui.Message;

import java.awt.*;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        printShuffle("Thank you Fred! -Erick :)");
        System.out.print("\nPress any key to continue...");
        sc.nextLine();
        SwingUtilities.invokeLater(Main::thankYou);
    }

    private static void thankYou() {
        JFrame f = new JFrame("Thank you Fred!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Message m = new Message();
        m.setBackground(Color.WHITE);
        f.add(m);
        f.getContentPane().setBackground(Color.YELLOW);
        URL url = Main.class.getResource("/projects/java/thank_you/thank_you_fred/src/gui/LetterLogo.jpg");
        f.setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        f.pack();
        f.setVisible(true);
    }

    private static void printShuffle(String s) throws InterruptedException {
        String result = "";
        while(!(result.equals(s))){
            String charToAdd = getRandomCharacter();
            String temp = result;
            result = result.concat(charToAdd);
            System.out.println(result);
            if (!(s.substring(result.length() - 1, result.length()).equals(charToAdd))){
                result = temp;
            }
            Thread.sleep(1);
        }
    }

    private static String getRandomCharacter() {
        Random r = new Random();
        return String.valueOf((char)(r.nextInt(95)+32));
    }
}