package com.mcewok.connectfour;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Joshua on 9/23/2016.
 */
public class DotsAdapter extends BaseAdapter{
    private Context c;
    private ArrayList<ImageView> _imageView;
    private int turn;

    public DotsAdapter(Context c, ArrayList<ImageView> _imageView, int turn) {
        this.c = c;
        this._imageView = _imageView;
        this.turn = turn;
    }

    @Override
    public int getCount() {
        return _imageView.size();
    }

    @Override
    public Object getItem(int pos) {
        return _imageView.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return 0;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        _imageView.get(pos).setLayoutParams(new GridView.LayoutParams(40,40));

        return _imageView.get(pos);
    }
}
