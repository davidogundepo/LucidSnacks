package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.VendorActivityArchive.Icdat;

import java.util.ArrayList;

/**
 * Created by DAVID OGUNDEPO on 07/11/2017.
 *
 */

public class SnacksavailableFragment extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    MissPublicRelation moe;
    SnacksmenuAdapter snacksmenuAdapter;
    LucidApplication MainApp;
    ArrayList<Icdat> Always = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.snackmenufragment_snackavailable, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        MainApp = LucidApplication.getInstance();
        moe = (MissPublicRelation) getActivity();
        listView = getActivity().findViewById(R.id.listView);

        for( int i = 0; i < MainApp.selectedsnacks.size(); i++ ) {
            Icdat d = (Icdat) MainApp.selectedsnacks.get(i);
            Always.add(i,d);
        }

        snacksmenuAdapter = new SnacksmenuAdapter(getActivity(), Always);
        listView.setAdapter(snacksmenuAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        moe.respond(position);
    }

}
