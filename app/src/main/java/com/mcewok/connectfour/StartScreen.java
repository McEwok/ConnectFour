package com.mcewok.connectfour;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Joshua on 10/19/2016.
 */
public class StartScreen extends MainActivity {
    private MainActivity context;
    private ImageView _StartLogo;
    private TextView _TagAnytime;
    private TextView _TagAnyplace;
    private TextView _CreatedBy;
    private TextView _McEwokGames;
    private TextView _LogoStart;
    private TextView _PressContinue;


    public StartScreen(MainActivity context) {
        this.context = context;
        this._StartLogo = (ImageView) context.findViewById(R.id.startLogo);
        this._TagAnytime = (TextView) context.findViewById(R.id.tagAnytime);
        this._TagAnyplace = (TextView) context.findViewById(R.id.tagAnyplace);
        this._CreatedBy = (TextView) context.findViewById(R.id.createdBy);
        this._McEwokGames = (TextView) context.findViewById(R.id.mcewokGames);
        this._LogoStart = (TextView) context.findViewById(R.id.logoStart);
        this._PressContinue = (TextView) context.findViewById(R.id.pressContinue);
        handleOnClick();
        handleOnClickCreated();
    }

    public void createdByShow(View view) {
        _CreatedBy.setVisibility(View.VISIBLE);
        _McEwokGames.setVisibility(View.VISIBLE);
        _PressContinue.setVisibility(View.VISIBLE);
    }

    public void createdByHide(View view) {
        PlayerInformation _PlayerInformation = new PlayerInformation(context);
        _CreatedBy.setVisibility(View.INVISIBLE);
        _McEwokGames.setVisibility(View.INVISIBLE);
        _PressContinue.setVisibility(View.INVISIBLE);
        _PlayerInformation.showOneBoth();
    }

    public void startScreenHide(View view) {
        _StartLogo.setVisibility(View.INVISIBLE);
        _TagAnytime.setVisibility(View.INVISIBLE);
        _TagAnyplace.setVisibility(View.INVISIBLE);
        _LogoStart.setVisibility(View.INVISIBLE);

    }

    public void startScreenShow() {
        _StartLogo.setVisibility(View.VISIBLE);
        _TagAnytime.setVisibility(View.VISIBLE);
        _TagAnyplace.setVisibility(View.VISIBLE);
        _LogoStart.setVisibility(View.VISIBLE);
    }

    public void handleOnClick() {
        this._StartLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startScreenHide(v);
                createdByShow(v);
            }
        });
    }

    public void handleOnClickCreated() {
        this._PressContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createdByHide(v);
            }
        });
    }
}
