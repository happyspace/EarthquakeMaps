package applet;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * A simple PApplet that uses the sun color as
 * an indication of the time of day.
 */
public class ClockApplet extends PApplet {
    private PImage backgroundImg;
    //private int width = 200;
    //private int height = 200;


    @Override
    public void setup() {


        size(200, 200);

        backgroundImg = this.loadImage("palmTrees.jpg");
    }

    @Override
    public void draw() {
        backgroundImg.resize(0, height);
        background(0);
        image(backgroundImg, 0, 0);
        fill(255, 209, 0);
        ellipse(width / 5, height / 5, width / 5, height / 5);
    }
}
