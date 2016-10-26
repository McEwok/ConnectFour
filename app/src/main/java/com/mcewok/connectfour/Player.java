package com.mcewok.connectfour;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Joshua on 10/20/2016.
 */
public class Player extends MainActivity{
    private ArrayList<String> _PlayerName;
    private ArrayList<String> _PlayerColor;
    private int _NumberOfPlayers;
    private int[] _Wins;
    private int[] _Losses;
    private boolean _PlayerTurn;
    private int _GoFirst;
    Context context;

    Player(Context context) {
        _PlayerName = new ArrayList<>();
        _PlayerColor = new ArrayList<>();
        _NumberOfPlayers = 0;
        _Wins = null;
        _Losses = null;
        _PlayerTurn = false;
        _GoFirst = 0;
        this.context = context;
    }

    public void addPlayer(String mName) {
        _PlayerName.add(mName);
    }

    public int getNumberOfPlayers() {
        return _NumberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        _NumberOfPlayers = numberOfPlayers;
    }

    public boolean getPlayerTurn() {
        return _PlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        _PlayerTurn = playerTurn;
    }

    public int getGoFirst() {
        Random random = new Random();
        int myRandom = random.nextInt(2 - 1 ) + 1;
        return myRandom;
    }
}