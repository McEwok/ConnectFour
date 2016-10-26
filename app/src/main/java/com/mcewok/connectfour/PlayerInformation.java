package com.mcewok.connectfour;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Joshua on 10/20/2016.
 */
public class PlayerInformation extends MainActivity{
    private MainActivity context;
    private Player _Player = new Player(this);
    private EditText _PlayerOneEnterEdt;
    private TextView _PlayerOneEnterTxt;
    private Button _PlayerEnterBtn;
    private TextView _PlayerTwoEnterTxt;

    public PlayerInformation(MainActivity context) {
        this.context = context;
        this._PlayerOneEnterEdt = (EditText) context.findViewById(R.id.playerOneEnterEdt);
        this._PlayerOneEnterTxt = (TextView) context.findViewById(R.id.playerOneEnterTxt);
        this._PlayerTwoEnterTxt = (TextView) context.findViewById(R.id.playerTwoEnterTxt);
        this._PlayerEnterBtn = (Button) context.findViewById(R.id.playerEnterBtn);
        handleOnClick();
    }

    public void showOneBoth() {
        _PlayerOneEnterTxt.setVisibility(View.VISIBLE);
        _PlayerOneEnterEdt.setVisibility(View.VISIBLE);
        _PlayerEnterBtn.setVisibility(View.VISIBLE);
    }

    public void hideTwoBoth() {
        _PlayerTwoEnterTxt.setVisibility(View.INVISIBLE);
        _PlayerOneEnterEdt.setVisibility(View.INVISIBLE);
        _PlayerEnterBtn.setVisibility(View.INVISIBLE);
    }

    public void buttonClick() {
        String mPlayerOneEnterEdt = _PlayerOneEnterEdt.getText().toString();
        _Player.addPlayer(mPlayerOneEnterEdt);
        _PlayerOneEnterEdt.setText("");
        _PlayerOneEnterTxt.setVisibility(View.INVISIBLE);
        _PlayerTwoEnterTxt.setVisibility(View.VISIBLE);
        String mPlayerTwoEnterEdt = _PlayerOneEnterEdt.getText().toString();
        _Player.addPlayer(mPlayerTwoEnterEdt);
    }

    public void handleOnClick() {
        this._PlayerEnterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick();
            }
        });
    }
}
