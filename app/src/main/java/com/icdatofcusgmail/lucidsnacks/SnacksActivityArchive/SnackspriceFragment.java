package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.VendorActivityArchive.Icdat;

import org.json.simple.JSONArray;

import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FifthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FirstString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FourthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.SecondString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.SixthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.ThirdString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.FifthSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.FirstSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.FourthSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.SecondSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.SixthSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.ThirdSubString;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.feetag;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseFive;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseFour;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseOne;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseSix;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseThree;
import static com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.ChosenplateCounter.parseTwo;

/**
 * Created by DAVID OGUNDEPO on 07/11/2017.
 *
 */

public class SnackspriceFragment extends Fragment {

    Button button, button2, button3, button4, button5;//, button6;
    OnNameSetListener onNameSetListener;
    LucidApplication MainApp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.snackmenufragment2_snackprice, container, false);

        button = view.findViewById(R.id.Istpricebutton);
        button2 = view.findViewById(R.id.Secondpricebutton);
        button3 = view.findViewById(R.id.Thirdpricebutton);
        button4 = view.findViewById(R.id.Fourthpricebutton);
        button5 = view.findViewById(R.id.Fifthpricebutton);
    //    button6 = (Button) view.findViewById(R.id.Sixthpricebutton);

        button.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);
        button5.setVisibility(View.GONE);
    //    button6.setVisibility(View.GONE);

        MainApp = LucidApplication.getInstance();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = button.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = button2.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = button3.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = button4.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.getText().toString().equals("160 NAIRA C. BREAD(2)")) {
                    final PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.chelsea_bread_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

//                            View C_BREAD = (View) popupMenu.getMenu();
//                            C_BREAD.setBackgroundColor(ContextCompat.getColor(getActivity().getApplicationContext(), R.color.ConfirmIDColor));

                            popChelseaBread(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }

                else if (button2.getText().toString().equals("160 NAIRA DOUGHNUT(2)")) {

                    PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.doughnut_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            popDoughnut(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }

                else if (button2.getText().toString().equals("240 NAIRA MEATPIE(2)")) {

                    PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.meat_pie_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            popMeatPie(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }

                else if (button2.getText().toString().equals("200 NAIRA SAUSAGE(2)")) {

                    PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.sausage_roll_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            popSausageRoll(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }

                else if (button2.getText().toString().equals("160 NAIRA EGG ROLL(2)")) {

                    PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.egg_roll_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            popEggRoll(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }

                else if (button2.getText().toString().equals("300 NAIRA FISH ROLL(2)")) {

                    PopupMenu popupMenu = new PopupMenu(getActivity().getApplicationContext(),button5);
                    popupMenu.getMenuInflater().inflate(R.menu.fish_roll_main,popupMenu.getMenu());
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            popFishRoll(item);

                            return true;
                        }
                    });
                    popupMenu.show();
                }




                String Name = button5.getText().toString();
                onNameSetListener.setName(Name);
            }
        });
//        button6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String Name = button6.getText().toString();
//                onNameSetListener.setName(Name);
//            }
//        });
        return view;
    }



    public void popChelseaBread(MenuItem item) {

        if (item.getTitle().equals("400 NAIRA C. BREAD(5)")) {
            button5.setText("" + "400 NAIRA C. BREAD(5)" + "");
            ChosensnacksFragment.textView.setText("" + "400 NAIRA C. BREAD(5)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "400 NAIRA C. BREAD(5)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "400 NAIRA C. BREAD(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("480 NAIRA C. BREAD(6)")) {
            button5.setText("" + "480 NAIRA C. BREAD(6)" + "");
            ChosensnacksFragment.textView.setText("" + "480 NAIRA C. BREAD(6)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "480 NAIRA C. BREAD(6)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "480 NAIRA C. BREAD(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("560 NAIRA C. BREAD(7)")) {
            button5.setText("" + "560 NAIRA C. BREAD(7)" + "");
            ChosensnacksFragment.textView.setText("" + "560 NAIRA C. BREAD(7)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "560 NAIRA C. BREAD(7)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "560 NAIRA C. BREAD(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("640 NAIRA C. BREAD(8)")) {
            button5.setText("" + "640 NAIRA C. BREAD(8)" + "");
            ChosensnacksFragment.textView.setText("" + "640 NAIRA C. BREAD(8)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "640 NAIRA C. BREAD(8)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "640 NAIRA C. BREAD(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("720 NAIRA C. BREAD(9)")) {
            button5.setText("" + "720 NAIRA C. BREAD(9)" + "");
            ChosensnacksFragment.textView.setText("" + "720 NAIRA C. BREAD(9)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "720 NAIRA C. BREAD(9)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "720 NAIRA C. BREAD(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("800 NAIRA C. BREAD(10)")) {
            button5.setText("" + "800 NAIRA C. BREAD(10)" + "");
            ChosensnacksFragment.textView.setText("" + "800 NAIRA C. BREAD(10)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "800 NAIRA C. BREAD(10)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "800 NAIRA C. BREAD(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("880 NAIRA C. BREAD(11)")) {
            button5.setText("" + "880 NAIRA C. BREAD(11)" + "");
            ChosensnacksFragment.textView.setText("" + "880 NAIRA C. BREAD(11)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "880 NAIRA C. BREAD(11)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "880 NAIRA C. BREAD(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("960 NAIRA C. BREAD(12)")) {
            button5.setText("" + "960 NAIRA C. BREAD(12)" + "");
            ChosensnacksFragment.textView.setText("" + "960 NAIRA C. BREAD(12)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "960 NAIRA C. BREAD(12)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "960 NAIRA C. BREAD(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1040 NAIRA C. BREAD(13)")) {
            button5.setText("" + "1040 NAIRA C. BREAD(13)" + "");
            ChosensnacksFragment.textView.setText("" + "1040 NAIRA C. BREAD(13)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1040 NAIRA C. BREAD(13)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1040 NAIRA C. BREAD(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1120 NAIRA C. BREAD(14)")) {
            button5.setText("" + "1120 NAIRA C. BREAD(14)" + "");
            ChosensnacksFragment.textView.setText("" + "1120 NAIRA C. BREAD(14)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1120 NAIRA C. BREAD(14)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1120 NAIRA C. BREAD(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1200 NAIRA C. BREAD(15)")) {
            button5.setText("" + "1200 NAIRA C. BREAD(15)" + "");
            ChosensnacksFragment.textView.setText("" + "1200 NAIRA C. BREAD(15)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1200 NAIRA C. BREAD(15)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1200 NAIRA C. BREAD(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1280 NAIRA C. BREAD(16)")) {
            button5.setText("" + "1280 NAIRA C. BREAD(16)" + "");
            ChosensnacksFragment.textView.setText("" + "1280 NAIRA C. BREAD(16)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1280 NAIRA C. BREAD(16)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1280 NAIRA C. BREAD(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1360 NAIRA C. BREAD(17)")) {
            button5.setText("" + "1360 NAIRA C. BREAD(17)" + "");
            ChosensnacksFragment.textView.setText("" + "1360 NAIRA C. BREAD(17)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1360 NAIRA C. BREAD(17)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1360 NAIRA C. BREAD(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1440 NAIRA C. BREAD(18)")) {
            button5.setText("" + "1440 NAIRA C. BREAD(18)" + "");
            ChosensnacksFragment.textView.setText("" + "1440 NAIRA C. BREAD(18)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1440 NAIRA C. BREAD(18)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1440 NAIRA C. BREAD(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1520 NAIRA C. BREAD(19)")) {
            button5.setText("" + "1520 NAIRA C. BREAD(19)" + "");
            ChosensnacksFragment.textView.setText("" + "1520 NAIRA C. BREAD(19)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1520 NAIRA C. BREAD(19)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1520 NAIRA C. BREAD(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1600 NAIRA C. BREAD(20)")) {
            button5.setText("" + "1600 NAIRA C. BREAD(20)" + "");
            ChosensnacksFragment.textView.setText("" + "1600 NAIRA C. BREAD(20)" + "");
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!MainApp.prev.containsKey("0")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("0", "1600 NAIRA C. BREAD(20)");
            } else {
                String val = MainApp.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    MainApp.prev.remove("0");
                    MainApp.prev.put("0", "1600 NAIRA C. BREAD(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FirstSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseOne;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }

    public void popDoughnut(MenuItem item) {

        if (item.getTitle().equals("400 NAIRA DOUGHNUT(5)")) {
            button5.setText("" + "400 NAIRA DOUGHNUT(5)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "400 NAIRA DOUGHNUT(5)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "400 NAIRA DOUGHNUT(5)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "400 NAIRA DOUGHNUT(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("480 NAIRA DOUGHNUT(6)")) {
            button5.setText("" + "480 NAIRA DOUGHNUT(6)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "480 NAIRA DOUGHNUT(6)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "480 NAIRA DOUGHNUT(6)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "480 NAIRA DOUGHNUT(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("560 NAIRA DOUGHNUT(7)")) {
            button5.setText("" + "560 NAIRA DOUGHNUT(7)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "560 NAIRA DOUGHNUT(7)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "560 NAIRA DOUGHNUT(7)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "560 NAIRA DOUGHNUT(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("640 NAIRA DOUGHNUT(8)")) {
            button5.setText("" + "640 NAIRA DOUGHNUT(8)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "640 NAIRA DOUGHNUT(8)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "640 NAIRA DOUGHNUT(8)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "640 NAIRA DOUGHNUT(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("720 NAIRA DOUGHNUT(9)")) {
            button5.setText("" + "720 NAIRA DOUGHNUT(9)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "720 NAIRA DOUGHNUT(9)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "720 NAIRA DOUGHNUT(9)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "720 NAIRA DOUGHNUT(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("800 NAIRA DOUGHNUT(10)")) {
            button5.setText("" + "800 NAIRA DOUGHNUT(10)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "800 NAIRA DOUGHNUT(10)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "800 NAIRA DOUGHNUT(10)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "800 NAIRA DOUGHNUT(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("880 NAIRA DOUGHNUT(11)")) {
            button5.setText("" + "880 NAIRA DOUGHNUT(11)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "880 NAIRA DOUGHNUT(11)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "880 NAIRA DOUGHNUT(11)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "880 NAIRA DOUGHNUT(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("960 NAIRA DOUGHNUT(12)")) {
            button5.setText("" + "960 NAIRA DOUGHNUT(12)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "960 NAIRA DOUGHNUT(12)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "960 NAIRA DOUGHNUT(12)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "960 NAIRA DOUGHNUT(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1040 NAIRA DOUGHNUT(13)")) {
            button5.setText("" + "1040 NAIRA DOUGHNUT(13)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1040 NAIRA DOUGHNUT(13)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1040 NAIRA DOUGHNUT(13)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1040 NAIRA DOUGHNUT(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1120 NAIRA DOUGHNUT(14)")) {
            button5.setText("" + "1120 NAIRA DOUGHNUT(14)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1120 NAIRA DOUGHNUT(14)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1120 NAIRA DOUGHNUT(14)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1120 NAIRA DOUGHNUT(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1200 NAIRA DOUGHNUT(15)")) {
            button5.setText("" + "1200 NAIRA DOUGHNUT(15)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1200 NAIRA DOUGHNUT(15)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1200 NAIRA DOUGHNUT(15)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1200 NAIRA DOUGHNUT(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1280 NAIRA DOUGHNUT(16)")) {
            button5.setText("" + "1280 NAIRA DOUGHNUT(16)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1280 NAIRA DOUGHNUT(16)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1280 NAIRA DOUGHNUT(16)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1280 NAIRA DOUGHNUT(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1360 NAIRA DOUGHNUT(17)")) {
            button5.setText("" + "1360 NAIRA DOUGHNUT(17)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1360 NAIRA DOUGHNUT(17)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1360 NAIRA DOUGHNUT(17)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1360 NAIRA DOUGHNUT(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1440 NAIRA DOUGHNUT(18)")) {
            button5.setText("" + "1440 NAIRA DOUGHNUT(18)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1440 NAIRA DOUGHNUT(18)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1440 NAIRA DOUGHNUT(18)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1440 NAIRA DOUGHNUT(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1520 NAIRA DOUGHNUT(19)")) {
            button5.setText("" + "1520 NAIRA DOUGHNUT(19)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1520 NAIRA DOUGHNUT(19)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1520 NAIRA DOUGHNUT(19)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1520 NAIRA DOUGHNUT(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }
        else if (item.getTitle().equals("1600 NAIRA DOUGHNUT(20)")) {
            button5.setText("" + "1600 NAIRA DOUGHNUT(20)" + "");
            ChosensnacksFragment.textView2nd.setText("" + "1600 NAIRA DOUGHNUT(20)" + "");
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!MainApp.prev.containsKey("1")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("1", "1600 NAIRA DOUGHNUT(20)");
            } else {
                String val = MainApp.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    MainApp.prev.remove("1");
                    MainApp.prev.put("1", "1600 NAIRA DOUGHNUT(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SecondSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseTwo;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }

    public void popMeatPie(MenuItem item) {

        if (item.getTitle().equals("600 NAIRA MEATPIE(5)")) {
            button5.setText("" + "600 NAIRA MEATPIE(5)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "600 NAIRA MEATPIE(5)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "600 NAIRA MEATPIE(5)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "600 NAIRA MEATPIE(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("720 NAIRA MEATPIE(6)")) {
            button5.setText("" + "720 NAIRA MEATPIE(6)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "720 NAIRA MEATPIE(6)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "720 NAIRA MEATPIE(6)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "720 NAIRA MEATPIE(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("840 NAIRA MEATPIE(7)")) {
            button5.setText("" + "840 NAIRA MEATPIE(7)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "840 NAIRA MEATPIE(7)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "840 NAIRA MEATPIE(7)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "840 NAIRA MEATPIE(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("960 NAIRA MEATPIE(8)")) {
            button5.setText("" + "960 NAIRA MEATPIE(8)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "960 NAIRA MEATPIE(8)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "960 NAIRA MEATPIE(8)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "960 NAIRA MEATPIE(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1080 NAIRA MEATPIE(9)")) {
            button5.setText("" + "1080 NAIRA MEATPIE(9)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1080 NAIRA MEATPIE(9)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1080 NAIRA MEATPIE(9)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1080 NAIRA MEATPIE(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1200 NAIRA MEATPIE(10)")) {
            button5.setText("" + "1200 NAIRA MEATPIE(10)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1200 NAIRA MEATPIE(10)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1200 NAIRA MEATPIE(10)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1200 NAIRA MEATPIE(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1320 NAIRA MEATPIE(11)")) {
            button5.setText("" + "1320 NAIRA MEATPIE(11)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1320 NAIRA MEATPIE(11)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1320 NAIRA MEATPIE(11)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1320 NAIRA MEATPIE(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1440 NAIRA MEATPIE(12)")) {
            button5.setText("" + "1440 NAIRA MEATPIE(12)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1440 NAIRA MEATPIE(12)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1440 NAIRA MEATPIE(12)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1440 NAIRA MEATPIE(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1560 NAIRA MEATPIE(13)")) {
            button5.setText("" + "1560 NAIRA MEATPIE(13)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1560 NAIRA MEATPIE(13)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1560 NAIRA MEATPIE(13)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1560 NAIRA MEATPIE(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1680 NAIRA MEATPIE(14)")) {
            button5.setText("" + "1680 NAIRA MEATPIE(14)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1680 NAIRA MEATPIE(14)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1680 NAIRA MEATPIE(14)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1680 NAIRA MEATPIE(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1800 NAIRA MEATPIE(15)")) {
            button5.setText("" + "1800 NAIRA MEATPIE(15)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1800 NAIRA MEATPIE(15)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1800 NAIRA MEATPIE(15)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1800 NAIRA MEATPIE(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1920 NAIRA MEATPIE(16)")) {
            button5.setText("" + "1920 NAIRA MEATPIE(16)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "1920 NAIRA MEATPIE(16)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "1920 NAIRA MEATPIE(16)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "1920 NAIRA MEATPIE(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2040 NAIRA MEATPIE(17)")) {
            button5.setText("" + "2040 NAIRA MEATPIE(17)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "2040 NAIRA MEATPIE(17)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "2040 NAIRA MEATPIE(17)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "2040 NAIRA MEATPIE(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2160 NAIRA MEATPIE(18)")) {
            button5.setText("" + "2160 NAIRA MEATPIE(18)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "2160 NAIRA MEATPIE(18)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "2160 NAIRA MEATPIE(18)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "2160 NAIRA MEATPIE(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2280 NAIRA MEATPIE(19)")) {
            button5.setText("" + "2280 NAIRA MEATPIE(19)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "2280 NAIRA MEATPIE(19)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "2280 NAIRA MEATPIE(19)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "2280 NAIRA MEATPIE(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2400 NAIRA MEATPIE(20)")) {
            button5.setText("" + "2400 NAIRA MEATPIE(20)" + "");
            ChosensnacksFragment.textView3rd.setText("" + "2400 NAIRA MEATPIE(20)" + "");
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!MainApp.prev.containsKey("2")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("2", "2400 NAIRA MEATPIE(20)");
            } else {
                String val = MainApp.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    MainApp.prev.remove("2");
                    MainApp.prev.put("2", "2400 NAIRA MEATPIE(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseThree;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }

    public void popSausageRoll(MenuItem item) {


        if (item.getTitle().equals("500 NAIRA SAUSAGE(5)")) {
            button5.setText("" + "500 NAIRA SAUSAGE(5)" + "");
            ChosensnacksFragment.textView4th.setText("" + "500 NAIRA SAUSAGE(5)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "500 NAIRA SAUSAGE(5)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "500 NAIRA SAUSAGE(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("600 NAIRA SAUSAGE(6)")) {
            button5.setText("" + "600 NAIRA SAUSAGE(6)" + "");
            ChosensnacksFragment.textView4th.setText("" + "600 NAIRA SAUSAGE(6)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "600 NAIRA SAUSAGE(6)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "600 NAIRA SAUSAGE(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("700 NAIRA SAUSAGE(7)")) {
            button5.setText("" + "700 NAIRA SAUSAGE(7)" + "");
            ChosensnacksFragment.textView4th.setText("" + "700 NAIRA SAUSAGE(7)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "700 NAIRA SAUSAGE(7)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "700 NAIRA SAUSAGE(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("800 NAIRA SAUSAGE(8)")) {
            button5.setText("" + "800 NAIRA SAUSAGE(8)" + "");
            ChosensnacksFragment.textView4th.setText("" + "800 NAIRA SAUSAGE(8)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "800 NAIRA SAUSAGE(8)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "800 NAIRA SAUSAGE(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("900 NAIRA SAUSAGE(9)")) {
            button5.setText("" + "900 NAIRA SAUSAGE(9)" + "");
            ChosensnacksFragment.textView4th.setText("" + "900 NAIRA SAUSAGE(9)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "900 NAIRA SAUSAGE(9)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "900 NAIRA SAUSAGE(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1000 NAIRA SAUSAGE(10)")) {
            button5.setText("" + "1000 NAIRA SAUSAGE(10)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1000 NAIRA SAUSAGE(10)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1000 NAIRA SAUSAGE(10)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1000 NAIRA SAUSAGE(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1100 NAIRA SAUSAGE(11)")) {
            button5.setText("" + "1100 NAIRA SAUSAGE(11)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1100 NAIRA SAUSAGE(11)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1100 NAIRA SAUSAGE(11)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1100 NAIRA SAUSAGE(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1200 NAIRA SAUSAGE(12)")) {
            button5.setText("" + "1200 NAIRA SAUSAGE(12)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1200 NAIRA SAUSAGE(12)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1200 NAIRA SAUSAGE(12)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1200 NAIRA SAUSAGE(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1300 NAIRA SAUSAGE(13)")) {
            button5.setText("" + "1300 NAIRA SAUSAGE(13)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1300 NAIRA SAUSAGE(13)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1300 NAIRA SAUSAGE(13)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1300 NAIRA SAUSAGE(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1400 NAIRA SAUSAGE(14)")) {
            button5.setText("" + "1400 NAIRA SAUSAGE(14)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1400 NAIRA SAUSAGE(14)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1400 NAIRA SAUSAGE(14)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1400 NAIRA SAUSAGE(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1500 NAIRA SAUSAGE(15)")) {
            button5.setText("" + "1500 NAIRA SAUSAGE(15)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1500 NAIRA SAUSAGE(15)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1500 NAIRA SAUSAGE(15)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1500 NAIRA SAUSAGE(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1600 NAIRA SAUSAGE(16)")) {
            button5.setText("" + "1600 NAIRA SAUSAGE(16)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1600 NAIRA SAUSAGE(16)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1600 NAIRA SAUSAGE(16)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1600 NAIRA SAUSAGE(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1700 NAIRA SAUSAGE(17)")) {
            button5.setText("" + "1700 NAIRA SAUSAGE(17)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1700 NAIRA SAUSAGE(17)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1700 NAIRA SAUSAGE(17)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1700 NAIRA SAUSAGE(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1800 NAIRA SAUSAGE(18)")) {
            button5.setText("" + "1800 NAIRA SAUSAGE(18)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1800 NAIRA SAUSAGE(18)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1800 NAIRA SAUSAGE(18)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1800 NAIRA SAUSAGE(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1900 NAIRA SAUSAGE(19)")) {
            button5.setText("" + "1900 NAIRA SAUSAGE(19)" + "");
            ChosensnacksFragment.textView4th.setText("" + "1900 NAIRA SAUSAGE(19)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "1900 NAIRA SAUSAGE(19)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "1900 NAIRA SAUSAGE(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2000 NAIRA SAUSAGE(20)")) {
            button5.setText("" + "2000 NAIRA SAUSAGE(20)" + "");
            ChosensnacksFragment.textView4th.setText("" + "2000 NAIRA SAUSAGE(20)" + "");
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!MainApp.prev.containsKey("3")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("3", "2000 NAIRA SAUSAGE(20)");
            } else {
                String val = MainApp.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    MainApp.prev.remove("3");
                    MainApp.prev.put("3", "2000 NAIRA SAUSAGE(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FourthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFour;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }

    public void popEggRoll(MenuItem item) {

        if (item.getTitle().equals("400 NAIRA EGG ROLL(5)")) {
            button5.setText("" + "400 NAIRA EGG ROLL(5)" + "");
            ChosensnacksFragment.textView5th.setText("" + "400 NAIRA EGG ROLL(5)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "400 NAIRA EGG ROLL(5)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "400 NAIRA EGG ROLL(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("480 NAIRA EGG ROLL(6)")) {
            button5.setText("" + "480 NAIRA EGG ROLL(6)" + "");
            ChosensnacksFragment.textView5th.setText("" + "480 NAIRA EGG ROLL(6)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "480 NAIRA EGG ROLL(6)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "480 NAIRA EGG ROLL(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("560 NAIRA EGG ROLL(7)")) {
            button5.setText("" + "560 NAIRA EGG ROLL(7)" + "");
            ChosensnacksFragment.textView5th.setText("" + "560 NAIRA EGG ROLL(7)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "560 NAIRA EGG ROLL(7)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "560 NAIRA EGG ROLL(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("640 NAIRA EGG ROLL(8)")) {
            button5.setText("" + "640 NAIRA EGG ROLL(8)" + "");
            ChosensnacksFragment.textView5th.setText("" + "640 NAIRA EGG ROLL(8)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "640 NAIRA EGG ROLL(8)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "640 NAIRA EGG ROLL(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("720 NAIRA EGG ROLL(9)")) {
            button5.setText("" + "720 NAIRA EGG ROLL(9)" + "");
            ChosensnacksFragment.textView5th.setText("" + "720 NAIRA EGG ROLL(9)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "720 NAIRA EGG ROLL(9)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "720 NAIRA EGG ROLL(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("800 NAIRA EGG ROLL(10)")) {
            button5.setText("" + "800 NAIRA EGG ROLL(10)" + "");
            ChosensnacksFragment.textView5th.setText("" + "800 NAIRA EGG ROLL(10)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "800 NAIRA EGG ROLL(10)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "800 NAIRA EGG ROLL(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("880 NAIRA EGG ROLL(11)")) {
            button5.setText("" + "880 NAIRA EGG ROLL(11)" + "");
            ChosensnacksFragment.textView5th.setText("" + "880 NAIRA EGG ROLL(11)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "880 NAIRA EGG ROLL(11)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "880 NAIRA EGG ROLL(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("960 NAIRA EGG ROLL(12)")) {
            button5.setText("" + "960 NAIRA EGG ROLL(12)" + "");
            ChosensnacksFragment.textView5th.setText("" + "960 NAIRA EGG ROLL(12)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "960 NAIRA EGG ROLL(12)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "960 NAIRA EGG ROLL(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1040 NAIRA EGG ROLL(13)")) {
            button5.setText("" + "1040 NAIRA EGG ROLL(13)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1040 NAIRA EGG ROLL(13)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1040 NAIRA EGG ROLL(13)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1040 NAIRA EGG ROLL(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1220 NAIRA EGG ROLL(14)")) {
            button5.setText("" + "1220 NAIRA EGG ROLL(14)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1220 NAIRA EGG ROLL(14)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1220 NAIRA EGG ROLL(14)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1220 NAIRA EGG ROLL(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1200 NAIRA EGG ROLL(15)")) {
            button5.setText("" + "1200 NAIRA EGG ROLL(15)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1200 NAIRA EGG ROLL(15)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1200 NAIRA EGG ROLL(15)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1200 NAIRA EGG ROLL(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1280 NAIRA EGG ROLL(16)")) {
            button5.setText("" + "1280 NAIRA EGG ROLL(16)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1280 NAIRA EGG ROLL(16)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1280 NAIRA EGG ROLL(16)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1280 NAIRA EGG ROLL(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1360 NAIRA EGG ROLL(17)")) {
            button5.setText("" + "1360 NAIRA EGG ROLL(17)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1360 NAIRA EGG ROLL(17)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1360 NAIRA EGG ROLL(17)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1360 NAIRA EGG ROLL(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1440 NAIRA EGG ROLL(18)")) {
            button5.setText("" + "1440 NAIRA EGG ROLL(18)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1440 NAIRA EGG ROLL(18)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1440 NAIRA EGG ROLL(18)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1440 NAIRA EGG ROLL(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1520 NAIRA EGG ROLL(19)")) {
            button5.setText("" + "1520 NAIRA EGG ROLL(19)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1520 NAIRA EGG ROLL(19)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1520 NAIRA EGG ROLL(19)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1520 NAIRA EGG ROLL(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1600 NAIRA EGG ROLL(20)")) {
            button5.setText("" + "1600 NAIRA EGG ROLL(20)" + "");
            ChosensnacksFragment.textView5th.setText("" + "1600 NAIRA EGG ROLL(20)" + "");
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!MainApp.prev.containsKey("4")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("4", "1600 NAIRA EGG ROLL(20)");
            } else {
                String val = MainApp.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    MainApp.prev.remove("4");
                    MainApp.prev.put("4", "1600 NAIRA EGG ROLL(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(FifthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseFive;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }

    public void popFishRoll(MenuItem item) {

        if (item.getTitle().equals("750 NAIRA FISH ROLL(5)")) {
            button5.setText("" + "750 NAIRA FISH ROLL(5)" + "");
            ChosensnacksFragment.textView6th.setText("" + "750 NAIRA FISH ROLL(5)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "750 NAIRA FISH ROLL(5)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "750 NAIRA FISH ROLL(5)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("900 NAIRA FISH ROLL(6)")) {
            button5.setText("" + "900 NAIRA FISH ROLL(6)" + "");
            ChosensnacksFragment.textView6th.setText("" + "900 NAIRA FISH ROLL(6)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "900 NAIRA FISH ROLL(6)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "900 NAIRA FISH ROLL(6)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1050 NAIRA FISH ROLL(7)")) {
            button5.setText("" + "1050 NAIRA FISH ROLL(7)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1050 NAIRA FISH ROLL(7)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1050 NAIRA FISH ROLL(7)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1050 NAIRA FISH ROLL(7)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1200 NAIRA FISH ROLL(8)")) {
            button5.setText("" + "1200 NAIRA FISH ROLL(8)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1200 NAIRA FISH ROLL(8)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1200 NAIRA FISH ROLL(8)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1200 NAIRA FISH ROLL(8)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1350 NAIRA FISH ROLL(9)")) {
            button5.setText("" + "1350 NAIRA FISH ROLL(9)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1350 NAIRA FISH ROLL(9)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1350 NAIRA FISH ROLL(9)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1350 NAIRA FISH ROLL(9)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1500 NAIRA FISH ROLL(10)")) {
            button5.setText("" + "1500 NAIRA FISH ROLL(10)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1500 NAIRA FISH ROLL(10)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1500 NAIRA FISH ROLL(10)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1500 NAIRA FISH ROLL(10)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1650 NAIRA FISH ROLL(11)")) {
            button5.setText("" + "1650 NAIRA FISH ROLL(11)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1650 NAIRA FISH ROLL(11)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1650 NAIRA FISH ROLL(11)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1650 NAIRA FISH ROLL(11)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1800 NAIRA FISH ROLL(12)")) {
            button5.setText("" + "1800 NAIRA FISH ROLL(12)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1800 NAIRA FISH ROLL(12)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1800 NAIRA FISH ROLL(12)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1800 NAIRA FISH ROLL(12)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("1950 NAIRA FISH ROLL(13)")) {
            button5.setText("" + "1950 NAIRA FISH ROLL(13)" + "");
            ChosensnacksFragment.textView6th.setText("" + "1950 NAIRA FISH ROLL(13)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "1950 NAIRA FISH ROLL(13)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "1950 NAIRA FISH ROLL(13)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2100 NAIRA FISH ROLL(14)")) {
            button5.setText("" + "2100 NAIRA FISH ROLL(14)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2100 NAIRA FISH ROLL(14)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2100 NAIRA FISH ROLL(14)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2100 NAIRA FISH ROLL(14)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2250 NAIRA FISH ROLL(15)")) {
            button5.setText("" + "2250 NAIRA FISH ROLL(15)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2250 NAIRA FISH ROLL(15)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2250 NAIRA FISH ROLL(15)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2250 NAIRA FISH ROLL(15)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2400 NAIRA FISH ROLL(16)")) {
            button5.setText("" + "2400 NAIRA FISH ROLL(16)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2400 NAIRA FISH ROLL(16)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2400 NAIRA FISH ROLL(16)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2400 NAIRA FISH ROLL(16)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2550 NAIRA FISH ROLL(17)")) {
            button5.setText("" + "2550 NAIRA FISH ROLL(17)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2550 NAIRA FISH ROLL(17)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2550 NAIRA FISH ROLL(17)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2550 NAIRA FISH ROLL(17)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2700 NAIRA FISH ROLL(18)")) {
            button5.setText("" + "2700 NAIRA FISH ROLL(18)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2700 NAIRA FISH ROLL(18)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2700 NAIRA FISH ROLL(18)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2700 NAIRA FISH ROLL(18)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("2850 NAIRA FISH ROLL(19)")) {
            button5.setText("" + "2850 NAIRA FISH ROLL(19)" + "");
            ChosensnacksFragment.textView6th.setText("" + "2850 NAIRA FISH ROLL(19)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "2850 NAIRA FISH ROLL(19)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "2850 NAIRA FISH ROLL(19)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        } else if (item.getTitle().equals("3000 NAIRA FISH ROLL(20)")) {
            button5.setText("" + "3000 NAIRA FISH ROLL(20)" + "");
            ChosensnacksFragment.textView6th.setText("" + "3000 NAIRA FISH ROLL(20)" + "");
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!MainApp.prev.containsKey("5")) {
                MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                feetag.setText("" + MainApp.allinsnackcounter + "");
                MainApp.prev.put("5", "3000 NAIRA FISH ROLL(20)");
            } else {
                String val = MainApp.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    MainApp.prev.remove("5");
                    MainApp.prev.put("5", "3000 NAIRA FISH ROLL(20)");
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter - Integer.parseInt(SixthSubString);
                    MainApp.allinsnackcounter = MainApp.allinsnackcounter + parseSix;
                    feetag.setText("" + MainApp.allinsnackcounter + "");
                }
            }
        }

    }




    interface OnNameSetListener {
        void setName(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onNameSetListener = (OnNameSetListener) activity;
        } catch (Exception ignored) {
        }
    }

    public void Datachange(int i) {
        JSONArray prices = new JSONArray();
        for(int j = 0; j< MainApp.selectedsnacks.size(); j++){
            Icdat icdat = (Icdat)MainApp.selectedsnacks.get(j);
            if(i == j){
                prices = (JSONArray)MainApp.prices.get(icdat.getSnackname());
                break;
            }
        }

        button.setText(prices.get(0).toString());
        button.setVisibility(View.VISIBLE);

        button2.setText(prices.get(1).toString());
        button2.setVisibility(View.VISIBLE);

        button3.setText(prices.get(2).toString());
        button3.setVisibility(View.VISIBLE);

        button4.setText(prices.get(3).toString());
        button4.setVisibility(View.VISIBLE);

        button5.setText(prices.get(4).toString());
        button5.setVisibility(View.VISIBLE);

//        button6.setText(prices.get(5).toString());
//        button6.setVisibility(View.VISIBLE);

    }

}
