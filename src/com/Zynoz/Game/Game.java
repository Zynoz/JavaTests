package com.Zynoz.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zynoz on 28.02.2017.
 */
public class Game extends JFrame {
    public static void main(String[] args) {
        DisplayMode displayMode = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
        Game game = new Game();
        game.run(displayMode);
    }

    private Screen screen;
    private Image bg;
    private Image pic;
    private boolean loaded;



    private void run(DisplayMode displayMode) {

        setFont(new Font("Arial", Font.PLAIN, 24));

        screen = new Screen();
        try {
            screen.setFullScreen(displayMode, this);
            loadPics();
            try {
                Thread.sleep(5000);
            } catch (Exception ex) {
                //ex.printStackTrace();
            }
        } finally {
            screen.restoreScreen();
        }
    }

    private void loadPics() {
        bg = new ImageIcon("F:\\Java-Projects\\MyBestMenu\\Graphics\\bg.jpg").getImage();
        pic = new ImageIcon("E:\\Grafiken\\steam_pb.png").getImage();
        loaded = true;
        repaint();

    }

    public void paint(Graphics g) {
        if (g instanceof Graphics2D) {
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        }
        if (loaded) {
            g.drawImage(bg, 0, 0, null);
            g.drawImage(pic, 400, 150, null);
        }
    }
}