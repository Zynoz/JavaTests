package com.Zynoz.Game;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Zynoz on 01.03.2017.
 */
public class Screen {

    private GraphicsDevice vc;

    public Screen() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        vc = env.getDefaultScreenDevice();

    }

    public void setFullScreen(DisplayMode displayMode, JFrame window) {
        window.setUndecorated(true);
        window.setResizable(false);
        vc.setFullScreenWindow(window);

        if (displayMode != null && vc.isDisplayChangeSupported()) {
            try {
                vc.setDisplayMode(displayMode);
            } catch (Exception ex) {
                //ex.printStackTrace();
            }
        }
    }

    public Window getFullScreenWindow() {
        return vc.getFullScreenWindow();
    }

    public void restoreScreen() {
        Window window = vc.getFullScreenWindow();
        if (window != null) {
            window.dispose();
        }
        vc.setFullScreenWindow(null);
    }
}