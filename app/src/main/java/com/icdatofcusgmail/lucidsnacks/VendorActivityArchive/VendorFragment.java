package com.icdatofcusgmail.lucidsnacks.VendorActivityArchive;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icdatofcusgmail.lucidsnacks.R;


public class VendorFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_vendor, container, false);
    }
}
