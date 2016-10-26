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
    private TextView _LogoStart;

    public StartScreen(MainActivity context) {
        this.context = context;
        this._StartLogo = (ImageView) context.findViewById(R.id.startLogo);
        this._TagAnytime = (TextView) context.findViewById(R.id.tagAnytime);
        this._TagAnyplace = (TextView) context.findViewById(R.id.tagAnyplace);
        this._LogoStart = (TextView) context.findViewById(R.id.logoStart);
        handleOnClick();
    }

    public void startScreenHide(View view) {
        _StartLogo.setVisibility(View.GONE);
        _TagAnytime.setVisibility(View.GONE);
        _TagAnyplace.setVisibility(View.GONE);
        _LogoStart.setVisibility(View.GONE);

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
            }
        });
    }
}
