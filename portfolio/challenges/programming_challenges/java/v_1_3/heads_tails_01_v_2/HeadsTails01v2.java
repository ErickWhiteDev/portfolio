/*
    A small clicker game that allows a user to flip a coin on a GUI.
*/

package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2;

import challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui.*;
 
import java.awt.Dimension;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HeadsTails01v2 {
    public static void main(String[] args) throws IOException {
        JFrame frame = new GameFrame("Coin Tosser", "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png");
        JPanel layout = new GamePanel(500, 500, 10);
        JPanel coinField = new GamePanel(300, 300, "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png");
        JLabel result = new GameLabel("Test", "Times New Roman", 50);

        layout.add(coinField);
        layout.add(Box.createRigidArea(new Dimension(5, 5)));
        layout.add(result);
        frame.getContentPane().add(layout);
        frame.pack();
        

        /*
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("One");
        JButton btn2 = new JButton("Two");
        JButton btn3 = new JButton("Three");
        JButton btn4 = new JButton("Four");
        JButton btn5 = new JButton("Five");
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.setPreferredSize(new Dimension(400, 100));
        panel.setMaximumSize(new Dimension(400, 100));
        panel.setBorder(BorderFactory.createTitledBorder("demo"));
        frame.getContentPane().add(panel);
        frame.setSize(550, 300);
        frame.setVisible(true);
        */
    }
}