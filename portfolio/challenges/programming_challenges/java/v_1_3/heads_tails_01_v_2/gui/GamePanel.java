package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GamePanel extends JPanel  {
    private Dimension size;
    private BufferedImage image;
    private int frame = 0;

    public GamePanel(int width, int height, String imagePath) throws IOException {
        size = new Dimension(width, height);
        image = ImageIO.read(getClass().getResource(imagePath));
    }

    public GamePanel(int width, int height, int borderWidth) {
        size = new Dimension(width, height);

        setBorder(new EmptyBorder(borderWidth, borderWidth, borderWidth, borderWidth));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }

    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(size.width, size.height);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, frame, 0, (size.width - 2 * frame), size.height, this);
        repaint();
    }
    
}
