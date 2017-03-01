package com.Zynoz.Game;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Zynoz on 01.03.2017.
 */
public class Animation {
    private ArrayList scenes;
    private int sceneIndex;
    private long movieTime;
    private long totalTime;

    public Animation() {
        scenes = new ArrayList();
        totalTime = 0;
        start();

    }

    private synchronized void start(Image image, long t) {
        totalTime += t;
        scenes.add(new oneScene(image, totalTime));

    }
}
