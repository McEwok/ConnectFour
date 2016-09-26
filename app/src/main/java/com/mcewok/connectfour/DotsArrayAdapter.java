package com.mcewok.connectfour;

import java.util.ArrayList;

/**
 * Created by Joshua on 9/23/2016.
 */
public class DotsArrayAdapter {
    Dots _dots = new Dots();
    ArrayList<ArrayList<Integer>> _redDotsArray = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> _yellowDotsArray = new ArrayList<ArrayList<Integer>>();

    public DotsArrayAdapter(ArrayList<ArrayList<Integer>> _redDotsArray, ArrayList<ArrayList<Integer>> _yellowDotsArray) {
        this._redDotsArray = _redDotsArray;
        this._yellowDotsArray = _yellowDotsArray;
    }

    public int getRedSize() {
        return _redDotsArray.size();
    }

    public int getYellowSize() {
        return _yellowDotsArray.size();
    }

    public void addRedDot() {
        //_redDotsArray.add(_dots.getRedDotImage());
    }

    public void addYellowDot() {
        //_yellowDotsArray.add(_dots.getYellowDotImage());
    }


}
