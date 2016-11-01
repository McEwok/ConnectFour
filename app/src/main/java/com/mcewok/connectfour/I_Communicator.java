package com.mcewok.connectfour;

import android.content.Context;
import android.view.Menu;

/**
 * Created by Joshua on 10/27/2016.
 */
public interface I_Communicator {
    void Initialize(Context ctx, I_Hub messageHub);
    void InitializeMenu(Menu menu, int media_route_menu_item);
    void OnResume();
    void OnPause();
}
