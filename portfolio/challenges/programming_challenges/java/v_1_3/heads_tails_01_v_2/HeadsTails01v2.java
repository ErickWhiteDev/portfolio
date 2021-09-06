package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2;

import challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui.*;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeadsTails01v2 {
    public static void main(String[] args) throws IOException{
        JFrame frame = new GameFrame("Coin Tosser", "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png");
        JPanel coinField = new GamePanel(300, 300, "/challenges/programming_challenges/java/v_1_3/heads_tails_01_v_2/assets/heads.png", 10, 10, 10, 10);
        JPanel layout = new GamePanel(500, 500, 10, 10, 10, 10);
        JLabel result = new GameLabel("Test", "Times New Roman", 50);

        layout.add(coinField);
        layout.add(result);
        frame.getContentPane().add(layout);
        frame.pack();
    }
}