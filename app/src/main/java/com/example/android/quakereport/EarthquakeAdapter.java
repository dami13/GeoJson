package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dami on 09.10.2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthquakeData> {

    public EarthquakeAdapter(Activity context, ArrayList<EarthquakeData> EarthquakeData) {
        super(context, 0, EarthquakeData);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }
        EarthquakeData currentEarthquakeData = getItem(position);

        TextView magTextView = (TextView) listItemView.findViewById(R.id.mag_text_view);
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_text_view);

        magTextView.setText(currentEarthquakeData.getMag());
        locationTextView.setText(currentEarthquakeData.getLocation());
        timeTextView.setText(currentEarthquakeData.getTime());

        return listItemView;
    }

}
