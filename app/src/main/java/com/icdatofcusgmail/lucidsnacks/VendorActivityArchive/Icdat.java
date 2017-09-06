package com.icdatofcusgmail.lucidsnacks.VendorActivityArchive;

/**
 * Created by DAVID OGUNDEPO on 07/11/2017.

 */

public class Icdat {

    private String snackname;
    private int snackimage;
    private boolean selected;
    private SmoothCheckBox smooth;

    Icdat(String foodname, int foodimage, SmoothCheckBox smoothe) {
        super();
        this.snackimage = foodimage;
        this.snackname = foodname;
        this.smooth = smoothe;
    }

    public String getSnackname() {
        return snackname;
    }

    public void setSnackname(String snackname) {
        this.snackname = snackname;
    }

    public int getSnackimage() {
        return snackimage;
    }

    public void setSnackimage(int snackimage) {
        this.snackimage = snackimage;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public SmoothCheckBox getSmooth() {
        return smooth;
    }

    public void setSmooth(SmoothCheckBox smooth) {
        this.smooth = smooth;
    }
}
