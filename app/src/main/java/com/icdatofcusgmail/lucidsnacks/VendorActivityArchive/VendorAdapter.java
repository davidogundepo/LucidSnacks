package com.icdatofcusgmail.lucidsnacks.VendorActivityArchive;

import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by DAVID OGUNDEPO on 07/12/2017.
 *
 */

class VendorAdapter extends BaseAdapter {

    private Context c;
    private ArrayList<Icdat> icdats;
    private Map<Integer, Boolean> isCheckMap = new HashMap<>();
    private List<Map<String, String>> data;
    private SparseBooleanArray mSelectedItemsIds;
    private LucidApplication app;

    VendorAdapter(Context c, ArrayList<Icdat> icdats) {
        super();
        mSelectedItemsIds = new SparseBooleanArray();
        this.c = c;
        this.icdats = icdats;

        app = LucidApplication.getInstance();
        configCheckMap(false);
    }

    private void configCheckMap(boolean bool) {
        for (int i = 0; i < icdats.size(); i++) {
            isCheckMap.put(i, bool);
        }
    }


    @Override
    public int getCount() {
        return icdats == null ? 0 : icdats.size();
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

        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.va_imagemodel, parent, false);
            holder = new ViewHolder();
            holder.textView = (TextView) convertView.findViewById(R.id.textmodel);
            holder.imageView = (ImageView) convertView.findViewById(R.id.imagemodel);
            holder.smooth = (SmoothCheckBox) convertView.findViewById(R.id.smoothie);

            convertView.setTag(holder);
            convertView.setTag(R.id.textmodel, holder.textView);
            convertView.setTag(R.id.imagemodel, holder.imageView);
            convertView.setTag(R.id.smoothie, holder.smooth);

        } else {
            holder = (ViewHolder) convertView.getTag();
            holder.smooth.setTag(position);

        }
        final Icdat icdat = icdats.get(position);
        holder.getSmoothnNicelokingBOX().setTag(position);
        holder.getSmoothnNicelokingBOX().setChecked(icdat.isSelected());
        holder.getSnackName().setText(icdat.getSnackname());
        holder.getImageName().setImageResource(icdat.getSnackimage());


        if (compareIndex(icdat) == -1){
            holder.smooth.setChecked(false);
        } else {
            holder.smooth.setChecked(true);
        }
        //Set Data
        holder.imageView.setImageResource(icdats.get(position).getSnackimage());
        holder.textView.setText(icdats.get(position).getSnackname());

        holder.smooth.setTag(icdat);
        return convertView;
    }


    private int compareIndex(Icdat icdat){
        int olonje = -1;
        for(int daveed = 0; daveed < app.selectedsnacks.size(); daveed++){
            Icdat PhilFvsEithin= (Icdat) app.selectedsnacks.get(daveed);
            if(PhilFvsEithin.getSnackname().equals(icdat.getSnackname())){
                olonje = daveed;
            }
        }
        return olonje;
    }

    public void setData(List<Map<String, String>> data) {
        this.data = data;
    }


    static class ViewHolder {
        SmoothCheckBox smooth;
        TextView textView;
        ImageView imageView;

        SmoothCheckBox getSmoothnNicelokingBOX() {
            return smooth;
        }

        TextView getSnackName() {
            return textView;
        }

        ImageView getImageName() {
            return imageView;
        }

    }

    void toggleSelection(int position) {
        selectView(position, !mSelectedItemsIds.get(position));
    }

    private void selectView(int position, boolean value) {
        if (value) {
            mSelectedItemsIds.put(position, true);
        } else {
            mSelectedItemsIds.delete(position);
        }
        notifyDataSetChanged();
    }

}
