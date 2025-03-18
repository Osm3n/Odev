package Source;

import java.awt.Graphics;
import java.awt.Image;

import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    private Image backgroundImage;

    GamePanel() {
        try {
            backgroundImage = ImageIO.read(new File(
                    "C:\\Users\\osman\\OneDrive\\Desktop\\OsmanKuru_241101005_Bil211_Ödev\\Source\\images\\backgroundImage.jpg"));
        } catch (Exception e) {
            System.out.println("unable to find file");
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the background image.
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
