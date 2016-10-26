package com.mcewok.connectfour;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua on 10/4/2016.
 */
public class DotAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater _LayoutInflater = null;
    private ArrayList<Integer> _List = new ArrayList<Integer>();

    DotAdapter(Context context) {
        this.context = context;
        for(int i = 0; i < 42; i++) {
            _List.add(R.drawable.reddot);
        }
        _LayoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return _List.size();
    }

    @Override
    public Object getItem(int position) {
        return _List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ViewHolder holder = null;

        if(row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.dot_layout, parent, false);
            holder = new ViewHolder(row);
            row.setTag(holder);
        } else {
            holder = (ViewHolder) row.getTag();
        }
        holder._MyDot.setImageResource(_List.get(position));

        return row;
    }
}

class ViewHolder {
    public ImageView _MyDot;
    public ViewHolder(View view) {
        _MyDot = (ImageView) view.findViewById(R.id.dot_template);
    }
}