package com.mcewok.connectfour;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua on 10/14/2016.
 */
public class GetDotResponsePane extends ListActivity {
    private Context ctx;
    private GridView _GetPlayingGrid;
    private ImageView _PickDotList;
    private ArrayList<ImageView> _Items;
    private DotAdapter _DotAdapter;

    public GetDotResponsePane(Context ctx) {
        /*this.ctx = ctx;
        this._GetPlayingGrid = (GridView) ctx.findViewById(R.id.playingGrid);
        this._PickDotList = (ImageView) ctx.findViewById(R.id.dot_template);
        _Items = new ArrayList<ImageView>();
        _DotAdapter = new DotAdapter(ctx, _Items);
        _GetPlayingGrid.setAdapter(_DotAdapter);
        populatePlayingGrid(_Items,_DotAdapter);
        handleOnClick();*/
    }

    /*public void populatePlayingGrid(ArrayList<ImageView> _Items, DotAdapter _DotAdapter) {
        ArrayList<ImageView> _ImageArray = new ArrayList<>();
        for(int i = 0; i <42; i++) {
            _ImageArray.add(_PickDotList);
        }
        _Items.clear();
        _DotAdapter.notifyDataSetChanged();
        _Items.addAll(_ImageArray);*/
        /*List<ImageView> _ItemsList =
        //_DotAdapter.notifyDataSetChanged();

            _Items.add(_PickDotList);
            _Items.add(_PickDotList);*/
            //_DotAdapter.notifyDataSetChanged();

    //}

    private void handleOnClick() {
        _GetPlayingGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                _PickDotList = (ImageView) _GetPlayingGrid.getItemAtPosition(position);
                _PickDotList.setImageResource(R.drawable.reddot);
                _PickDotList.setVisibility(View.VISIBLE);
                _GetPlayingGrid.addView(_PickDotList,position);
            }
        });
    }

}
