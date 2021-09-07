package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

    public GameFrame(String title, String iconPath) throws IOException{
        super(title);

        setIconImage(ImageIO.read(getClass().getResource(iconPath))); // Set icon bar image
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }


}

