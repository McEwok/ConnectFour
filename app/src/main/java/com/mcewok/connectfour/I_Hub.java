package com.mcewok.connectfour;

import java.util.List;

/**
 * Created by Joshua on 10/26/2016.
 */
public interface I_Hub {
    void RegisterMsgr(I_MessageHandler msgr, CommunicatorEvents eventType);
    void RegisterMsgr(I_MessageHandler msgr, List<CommunicatorEvents> eventType);
    void SendMessage(CommunicatorEvents messageType, String message);
}
