package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.VendorActivityArchive.Icdat;

import java.util.ArrayList;

/**
 * Created by DAVID OGUNDEPO on 07/12/2017.
 *
 */

class SnacksmenuAdapter extends BaseAdapter {

    private Context d;
    private ArrayList<Icdat> icdats;

    SnacksmenuAdapter(Context d, ArrayList<Icdat> icdats) {
        this.d = d;
        this.icdats = icdats;
    }

    @Override
    public int getCount() {
        return icdats.size();
    }

    @Override
    public Object getItem(int position) {
        return icdats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) d.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.sa_imagemodel, parent, false);
        }

        //Our Views
        ImageView imageView2 = (ImageView) convertView.findViewById(R.id.imagemodel2);
        TextView textView2 = (TextView) convertView.findViewById(R.id.textmodel2);


        //Set Data
        imageView2.setImageResource(icdats.get(position).getSnackimage());
        textView2.setText(icdats.get(position).getSnackname());

        return convertView;
    }
}
