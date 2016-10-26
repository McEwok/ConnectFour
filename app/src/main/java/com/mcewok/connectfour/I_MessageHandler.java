package com.mcewok.connectfour;

/**
 * Created by Joshua on 10/26/2016.
 */
public interface I_MessageHandler {
    public void handleMessage(CommunicatorEvents events, String messsage);
}
