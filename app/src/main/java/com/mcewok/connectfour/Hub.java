package com.mcewok.connectfour;

import android.location.GpsStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Joshua on 10/26/2016.
 */
public class Hub implements I_Hub{
    HashMap<CommunicatorEvents,List<I_MessageHandler>> Listeners;

    public Hub() {
        Listeners = new HashMap<>();}

    @Override
    public void RegisterMsgr(I_MessageHandler msgr, CommunicatorEvents eventType) {
        if(!Listeners.containsKey(eventType)) {
            Listeners.put(eventType, new ArrayList<I_MessageHandler>());
        }
        Listeners.get(eventType).add(msgr);
    }

    @Override
    public void RegisterMsgr(I_MessageHandler msgr, List<CommunicatorEvents> eventType) {
        for (int i = 0; i < eventType.size(); i++) {
            RegisterMsgr(msgr, eventType.get(i));
        }
    }

    @Override
    public void SendMessage(CommunicatorEvents messageType, String message) {
        List<I_MessageHandler> handlers = Listeners.get(messageType);
        if(null == handlers || handlers.size() <= 0) {
            System.out.println("ERROR: No one is listening for " + messageType.toString());
        }
        else
        {
            for (int i = 0; i < handlers.size(); i++) {
                handlers.get(i).handleMessage(messageType, message);
            }
        }
    }
}
