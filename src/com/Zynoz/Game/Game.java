package com.Zynoz.Game;

/**
 * Created by Zynoz on 28.02.2017.
 */
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Game extends JPanel {
    int x = 300;
    int y = 400;
    private void moveBall() {
        x = x + 1;
        y = y + 1;

        if (x == getWidth() || y == getHeight()) {
            x = 300;
            y = 400;
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 15, 15);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("2D Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}