package com.icdatofcusgmail.lucidsnacks;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.TreeMap;

/**
 * Created by DAVID OGUNDEPO on 07/12/2017.
 *
 */

public class LucidApplication extends Application {

    public  String[] Diamond;
    public Bundle sellerOruko;
    public TextView Idtext;
    public TextView Nametext;
    private static LucidApplication instance;
    public JSONArray selectedsnacks;
    public JSONObject prices;

    public JSONObject stack;

    public int allinsnackcounter = 0;


    public TreeMap<String,String> prev;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        selectedsnacks = new JSONArray();
        prices = new JSONObject();
        prev = new TreeMap<>();

        stack = new JSONObject();

        //  JSONArray
        JSONArray chelsea = new JSONArray();
        chelsea.add("60 naira C. Bread");
        chelsea.add("120 naira C. Bread(2)");
        chelsea.add("180 naira C. Bread(3)");
        chelsea.add("240 naira C. Bread(4)");
        chelsea.add("300 naira C. Bread(5)");
        chelsea.add("360 naira C. Bread(6)");
        prices.put("Chelsea Bread", chelsea);

        JSONArray doughnut = new JSONArray();
        doughnut.add("60 naira Doughnut");
        doughnut.add("120 naira Doughnut(2)");
        doughnut.add("180 naira Doughnut(3)");
        doughnut.add("240 naira Doughnut(4)");
        doughnut.add("300 naira Doughnut(5)");
        doughnut.add("360 naira Doughnut(6)");
        prices.put("Doughnut", doughnut);

        JSONArray meatpie = new JSONArray();
        meatpie.add("120 naira Meatpie");
        meatpie.add("240 naira Meatpie(2)");
        meatpie.add("360 naira Meatpie(3)");
        meatpie.add("480 naira Meatpie(4)");
        meatpie.add("600 naira Meatpie(5)");
        meatpie.add("720 naira Meatpie(6)");
        prices.put("Meat Pie", meatpie);

        JSONArray sausage = new JSONArray();
        sausage.add("100 naira Sausage");
        sausage.add("200 naira Sausage(2)");
        sausage.add("300 naira Sausage(3)");
        sausage.add("400 naira Sausage(4)");
        sausage.add("500 naira Sausage(5)");
        sausage.add("600 naira Sausage(6)");
        prices.put("Sausage Roll", sausage);

    }

    public static LucidApplication getInstance(){
        return instance;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

}
