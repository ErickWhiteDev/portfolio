package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui;

import java.awt.Font;
import javax.swing.JLabel;

public class GameLabel extends JLabel {

    public GameLabel(String text, String font, int fontSize){
        super(text);

        setFont(new Font(font, Font.PLAIN, fontSize));
    }
    
}
