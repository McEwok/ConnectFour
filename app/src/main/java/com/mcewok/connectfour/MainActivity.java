package com.mcewok.connectfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class MainActivity extends AppCompatActivity {//implements AdapterView.OnItemClickListener {
    public ArrayList<Integer> _Items = new ArrayList<>();
    GridView playingBoard;
    ImageView _PickedDot;
    ImageView _StartLogo;
    TextView _TagAnytime;
    TextView _TagAnyplace;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartScreen _StartScreen = new StartScreen(this);
        PlayerInformation _PlayerInformation = new PlayerInformation(this);
        playingBoard = (GridView) findViewById(R.id.playingGrid);
        playingBoard.setAdapter(new DotAdapter(this));
        for(int i = 0; i < 42; i++) {
            _Items.add(R.drawable.reddot);
        }
    }
}
