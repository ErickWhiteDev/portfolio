package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2;

import challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui.*;

import java.awt.Dimension;
import java.io.IOException;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeadsTails01v2 {
    public static void main(String[] args) throws IOException{
        JFrame frame = new GameFrame("Coin Tosser", "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png");
        JPanel layout = new GamePanel(500, 500, 10);
        JPanel coinField = new GamePanel(300, 300, "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png");
        JLabel result = new GameLabel("Test", "Times New Roman", 50);

        layout.add(coinField);
        layout.add(Box.createRigidArea(new Dimension(5, 5)));
        layout.add(result);
        frame.getContentPane().add(layout);
        frame.pack();
    }
}