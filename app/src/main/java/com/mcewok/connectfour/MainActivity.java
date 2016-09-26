package com.mcewok.connectfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ImageView> dotsList = new ArrayList<ImageView>();
    GridView _playingGrid;
    int turn = 0;
    Dots _dots = new Dots();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _playingGrid = (GridView) findViewById(R.id.playingGrid);

        for(int x = 0; x < 6; x++) {
            for(int y = 0; y < 7; y++) {
                dotsList.add(new ImageView(this));
            }
        }

        turn = 1;

        DotsAdapter _dotsAdapter = new DotsAdapter(this, dotsList, turn);
        _playingGrid.setAdapter(_dotsAdapter);

        _playingGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
                dotsList.get(pos).setImageResource(_dots.getRedDotImage());
                Toast.makeText(getApplicationContext(), "Square: " + pos, Toast.LENGTH_LONG).show();
            }
        });
    }
}
