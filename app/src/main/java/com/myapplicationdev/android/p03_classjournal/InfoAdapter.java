package com.myapplicationdev.android.p03_classjournal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter {

    private ArrayList<Info> alInfo;
    private Context context;
    private TextView tvWeek;
    private TextView tvGrade;

    public InfoAdapter(Context context, int resource, ArrayList<Info> objects) {
        super(context, resource, objects);
        alInfo = objects;
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.activity2_main, parent, false);

        tvWeek = rowView.findViewById(R.id.textViewWeek);
        tvGrade = rowView.findViewById(R.id.textViewGrade);

        Info current = alInfo.get(position);

        tvWeek.setText(current.getWeek());
        tvGrade.setText(current.getGrade());

        return rowView;
    }
}
