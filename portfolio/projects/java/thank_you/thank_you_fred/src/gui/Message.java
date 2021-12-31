package projects.java.thank_you.thank_you_fred.src.gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Map;

public class Message extends JPanel {

    private static final Dimension SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int FRAME_WIDTH = SIZE.width;
    private static final int FRAME_HEIGHT = SIZE.height;
    private static final String MESSAGE = "CSA 2020-2021";
    private static final Font F = new Font("Times New Roman", Font.BOLD,75);
    private static final URL url = Message.class.getResource("/projects/java/thank_you/thank_you_fred/src/gui/DohertyLogo.jpg");
    private static final Image i = Toolkit.getDefaultToolkit().getImage(url);

    public Message() {

        setBorder(BorderFactory.createLineBorder(new Color(17, 106, 184)));

    }

    @Override
    public Dimension getPreferredSize() {

        return new Dimension(FRAME_WIDTH, FRAME_HEIGHT);
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        FontMetrics fm = g2d.getFontMetrics(F);

        Map<?, ?> desktopHints =
                (Map<?, ?>) Toolkit.getDefaultToolkit().getDesktopProperty("awt.font.desktophints");

        if (desktopHints != null) {
            g2d.setRenderingHints(desktopHints);
        } else{
            System.out.println("%n Graphics display failed! Sorry :( (desktopHints was null for making text look good)");
        }

        g.setFont(F);
        g.setColor(new Color(17, 106, 184));
        g.drawString(MESSAGE, (FRAME_WIDTH / 2) - (fm.stringWidth(MESSAGE) / 2), FRAME_HEIGHT - i.getHeight(this) - 150); // Displays a text message onscreen
        g.drawImage(i, (FRAME_WIDTH / 2) - (i.getWidth(this) / 2), FRAME_HEIGHT - i.getHeight(this) - 100, this); // Displays an image onscreen
    }
}