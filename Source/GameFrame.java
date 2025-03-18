package Source;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;

    GameFrame() {
        super("Oyun");
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(new GamePanel(), BorderLayout.CENTER);
        this.setVisible(true);

    }
}
