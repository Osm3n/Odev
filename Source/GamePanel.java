package Source;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import Source.Zombies.ParentZombie;

public class GamePanel extends JPanel implements Runnable {
    private Image backgroundImage;
    public boolean keyPressed = false;
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    Thread thread;

    ArrayList<ParentZombie> zombies = new ArrayList<>();
    Player player;

    public GamePanel() {
        this.setSize(GamePanel.WIDTH, GamePanel.HEIGHT);
        setFocusable(true);
        this.requestFocusInWindow();
        // loop = new GameLoop(this);

        player = new Player("Player1", 100, GameFrame.WIDTH / 2, GameFrame.HEIGHT / 2);

        System.out.println(GameFrame.WIDTH);
        try {
            backgroundImage = ImageIO.read(new File("Source/images/backgroundImage.jpg")); // Use relative path
        } catch (Exception e) {
            System.out.println("unable to find file");
        }
        this.addKeyListener(new key());
        // zombies = loop.addZombies();
        this.repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
        player.paint(g);
        for (ParentZombie zombie : zombies) {
            zombie.draw(g);
        }

    }

    class key implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_W) {
                player.playerY -= player.speed;
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                player.playerY += player.speed;
            }
            if (e.getKeyCode() == KeyEvent.VK_D) {
                player.playerX += player.speed;
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                player.playerX -= player.speed;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        void move(KeyEvent e) {

        }

    }

    public void startThread() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (thread != null) {

        }
    }
}
