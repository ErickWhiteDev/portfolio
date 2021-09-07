package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class GameLabel extends JLabel {

    public GameLabel( String text, String font, int fontSize){
        super(text, SwingConstants.CENTER);

        setFont(new Font(font, Font.PLAIN, fontSize));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }
    
}