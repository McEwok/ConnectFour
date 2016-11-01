package com.mcewok.connectfour;

import android.content.Context;
import android.view.Menu;

import java.util.ArrayList;

/**
 * Created by Joshua on 10/27/2016.
 */
public class ScreenChanger implements I_Communicator, I_MessageHandler {
    private I_Hub _messageHub;

    @Override
    public void Initialize(Context ctx, I_Hub messageHub) {
        _messageHub = messageHub;
        setUpListeners();
    }

    private void setUpListeners() {
        ArrayList<CommunicatorEvents> events = new ArrayList<CommunicatorEvents>();
        events.add(CommunicatorEvents.StartScreenEnter);
        events.add(CommunicatorEvents.StartScreenExit);
        events.add(CommunicatorEvents.CreatedScreenEnter);
        events.add(CommunicatorEvents.CreatedScreenExit);
        events.add(CommunicatorEvents.PlayerInfoEnter);
        events.add(CommunicatorEvents.PlayerInfoExit);
    }

    @Override
    public void handleMessage(CommunicatorEvents eventType, String messsage) {
        if(eventType == CommunicatorEvents.StartScreenExit) {
            _messageHub.SendMessage(CommunicatorEvents.CreatedScreenEnter,"Entered Created");
        }
    }

    @Override
    public void InitializeMenu(Menu menu, int media_route_menu_item) {

    }

    @Override
    public void OnResume() {

    }

    @Override
    public void OnPause() {

    }
}
