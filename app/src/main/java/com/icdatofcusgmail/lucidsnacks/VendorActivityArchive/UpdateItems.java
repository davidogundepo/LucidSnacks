package com.icdatofcusgmail.lucidsnacks.VendorActivityArchive;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import com.icdatofcusgmail.lucidsnacks.R;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

/**
 * Created by DAVID OGUNDEPO on 07/12/2017.
 *
 */

public class UpdateItems extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setItems(R.array.AorR, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which == 0) {
                    StyleableToast AddItems = new StyleableToast(getActivity(), "Update Items Available", Toast.LENGTH_SHORT).spinIcon();
                    AddItems.setBackgroundColor(Color.parseColor("#FFF176"));
                    AddItems.setTextColor(Color.WHITE);
                    AddItems.show();
                    VendorActivity.itemsState.setVisibility(View.VISIBLE);
                    VendorActivity.itemsState.setText("" + "Updating Items Available" + "");
                    VendorActivity.ShowInThis.setVisibility(View.VISIBLE);
                }
            }
        });
        setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.dismiss();
        return builder.create();
    }
}
