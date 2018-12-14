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


    public static String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString;

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
        chelsea.add("80 NAIRA C. BREAD");
        chelsea.add("160 NAIRA C. BREAD(2)");
        chelsea.add("240 NAIRA C. BREAD(3)");
        chelsea.add("320 NAIRA C. BREAD(4)");
        chelsea.add("400 NAIRA C. BREAD(5)");
        chelsea.add("480 NAIRA C. BREAD(6)");
        prices.put("Chelsea Bread", chelsea);

        JSONArray doughnut = new JSONArray();
        doughnut.add("80 NAIRA DOUGHNUT");
        doughnut.add("160 NAIRA DOUGHNUT(2)");
        doughnut.add("240 NAIRA DOUGHNUT(3)");
        doughnut.add("320 NAIRA DOUGHNUT(4)");
        doughnut.add("400 NAIRA DOUGHNUT(5)");
        doughnut.add("480 NAIRA DOUGHNUT(6)");
        prices.put("Doughnut", doughnut);

        JSONArray meatpie = new JSONArray();
        meatpie.add("120 NAIRA MEATPIE");
        meatpie.add("240 NAIRA MEATPIE(2)");
        meatpie.add("360 NAIRA MEATPIE(3)");
        meatpie.add("480 NAIRA MEATPIE(4)");
        meatpie.add("600 NAIRA MEATPIE(5)");
        meatpie.add("720 NAIRA MEATPIE(6)");
        prices.put("Meat Pie", meatpie);

        JSONArray sausage = new JSONArray();
        sausage.add("100 NAIRA SAUSAGE");
        sausage.add("200 NAIRA SAUSAGE(2)");
        sausage.add("300 NAIRA SAUSAGE(3)");
        sausage.add("400 NAIRA SAUSAGE(4)");
        sausage.add("500 NAIRA SAUSAGE(5)");
        sausage.add("600 NAIRA SAUSAGE(6)");
        prices.put("Sausage Roll", sausage);

        JSONArray eggroll = new JSONArray();
        eggroll.add("80 NAIRA EGG ROLL");
        eggroll.add("160 NAIRA EGG ROLL(2)");
        eggroll.add("240 NAIRA EGG ROLL(3)");
        eggroll.add("320 NAIRA EGG ROLL(4)");
        eggroll.add("400 NAIRA EGG ROLL(5)");
        eggroll.add("480 NAIRA EGG ROLL(6)");
        prices.put("Egg Roll", eggroll);

        JSONArray fishroll = new JSONArray();
        fishroll.add("150 NAIRA FISH ROLL");
        fishroll.add("300 NAIRA FISH ROLL(2)");
        fishroll.add("450 NAIRA FISH ROLL(3)");
        fishroll.add("600 NAIRA FISH ROLL(4)");
        fishroll.add("750 NAIRA FISH ROLL(5)");
        fishroll.add("900 NAIRA FISH ROLL(6)");
        prices.put("Fish Roll", fishroll);



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
