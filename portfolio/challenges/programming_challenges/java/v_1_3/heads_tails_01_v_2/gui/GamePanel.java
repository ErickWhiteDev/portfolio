package challenges.programming_challenges.java.v_1_3.heads_tails_01_v_2.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class GamePanel extends JPanel  {
    private Dimension size;
    private BufferedImage image;
    private int frame = 0;

    public GamePanel(int width, int height, String imagePath, int borderTop, int borderLeft, int borderBottom, int borderRight, int posX, int posY) throws IOException {
        size = new Dimension(width, height);
        image = ImageIO.read(getClass().getResource(imagePath));

        setBorder(BorderFactory.createEmptyBorder(borderTop, borderLeft, borderBottom, borderRight));
        setBounds(posX, posY, posX + width, posY + height);
    }

    public GamePanel(int width, int height,  int borderTop, int borderLeft, int borderBottom, int borderRight, int posX, int posY) {
        size = new Dimension(width, height);

        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(BorderFactory.createEmptyBorder(borderTop, borderLeft, borderBottom, borderRight));
        setBounds(posX, posY, posX + width, posY + height);
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
