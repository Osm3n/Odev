package Source;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Player {
    private String name;
    private int maxHealth;
    private int currentHealth;
    private int points;
    private int currentWave;
    private int speed;
    private static final int diameter = 40;
    public int playerX;
    public int playerY;
    public double centerX;
    public double centerY;
    private Image image;

    public Player(String name, int maxHealth, int startingPointX, int startingPointY) {
        this.name = name;
        this.maxHealth = maxHealth;
        points = 0;
        currentWave = 0;
        currentHealth = maxHealth;
        this.playerX = startingPointX;
        this.playerY = startingPointY;
        System.out.println(startingPointX);
        centerX = playerX + (diameter / 2);
        centerY = playerY + (diameter / 2);
        try {
            image = ImageIO.read(new File(
                    "C:\\Users\\osman\\OneDrive\\Desktop\\OsmanKuru_241101005_Bil211_Ödev\\Source\\images\\player.jpg"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void paint(Graphics g) {

        g.drawImage(image, playerX, playerY, new JPanel());

    }

    public void repaint(Graphics g) {
        paint(g);
    }

    void move(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            centerY -= speed;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            centerY += speed;
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            centerX += speed;
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            centerY = speed;
        }
    }
}
