package com.Zynoz.Game;

/**
 * Created by Zynoz on 28.02.2017.
 */
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Game extends JPanel {
    private int x = 0;
    private int y = 0;
    private int directionX = 1;
    private int directionY = 1;

    private void moveBall() {
        x = x + directionX;
        y = y + directionY;

        if (x == getWidth() - 15) {
            directionX = -1;
        } else if (x == 0) {
            directionX = 1;
        }
        if (y == getHeight() - 15) {
            directionY = -1;
        } else if (y == 0) {
            directionY = 1;
        }

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRect(x, y, 15, 15);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("2D Game");
        Game game = new Game();
        frame.add(game);
        frame.setSize(600, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}