package com.mcewok.connectfour;

/**
 * Created by Joshua on 9/22/2016.
 */
public class Dots {
    private int redDotImage ;
    private int yellowDotImage;

    public Dots(){
        redDotImage = R.drawable.reddot;
        yellowDotImage = R.drawable.yellowdot;
    }

    public int getRedDotImage(){
        return redDotImage;
    }

    public int getYellowDotImage(){
        return yellowDotImage;
    }
}
