//general class for all zombies

package Source.Zombies;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ParentZombie {
    int health;
    double speed;
    private static final int diameter = 36;
    int damage;
    int xCoordinate;
    int yCoordinate;
    double centerX;
    double centerY;
    Color color;
    private Image image;

    public ParentZombie(int health, double speed, int damage, int xCoordinate, int yCoordinate) {
        this.health = health;
        this.speed = speed;
        this.damage = damage;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        centerX = xCoordinate + (diameter / 2);
        centerY = yCoordinate + (diameter / 2);
        try {
            image = ImageIO.read(new File(
                    "C:\\Users\\osman\\OneDrive\\Desktop\\OsmanKuru_241101005_Bil211_Ödev\\Source\\images\\NormalZombie.png"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void draw(Graphics g) {
        g.drawImage(image, xCoordinate, yCoordinate, new JPanel());
    }

    public void repaint(Graphics g) {
        draw(g);
    }

}
