package com.example.adminpanel;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class BusAdapter extends ArrayAdapter<Bus>{

    private Activity context;
    private List<Bus> busList;

    public BusAdapter(Activity context, List<Bus> busList) {
        super(context, R.layout.sample_layout, busList);
        this.context = context;
        this.busList = busList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = context.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.sample_layout, null, true);

        Bus bus = busList.get(position);

        TextView name = view.findViewById(R.id.busNameTextViewId);
        TextView from = view.findViewById(R.id.locationFromTextViewId);
        TextView to = view.findViewById(R.id.locationToTextViewId);
        TextView time = view.findViewById(R.id.setTimeTextViewId);

        name.setText(bus.getName());
        from.setText("From: "+bus.getFrom());
        to.setText("To: "+bus.getTo());
        time.setText("Time: "+bus.getTime());

        return view;
    }
}
