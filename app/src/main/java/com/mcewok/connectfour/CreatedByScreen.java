package com.mcewok.connectfour;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Joshua on 10/26/2016.
 */
public class CreatedByScreen extends MainActivity implements I_MessageHandler{
    private MainActivity context;
    private Hub hub;
    private TextView _CreatedBy;
    private TextView _McEwokGames;
    private TextView _PressContinue;

    public CreatedByScreen(MainActivity context, Hub communicationHub) {
        this.context = context;
        this.hub = communicationHub;
        this._CreatedBy = (TextView) context.findViewById(R.id.createdBy);
        this._McEwokGames = (TextView) context.findViewById(R.id.mcewokGames);
        this._PressContinue = (TextView) context.findViewById(R.id.pressContinue);
    }

    public void showCreatedBy() {
        _CreatedBy.setVisibility(View.VISIBLE);
        _McEwokGames.setVisibility(View.VISIBLE);
        _PressContinue.setVisibility(View.VISIBLE);
    }

    public void hideCreatedBy() {
        _CreatedBy.setVisibility(View.GONE);
        _McEwokGames.setVisibility(View.GONE);
        _PressContinue.setVisibility(View.GONE);
    }
}
