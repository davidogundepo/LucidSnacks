package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;

import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FifthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FirstString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.FourthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.SecondString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.SixthString;
import static com.icdatofcusgmail.lucidsnacks.LucidApplication.ThirdString;

/**
 * Created by DAVID OGUNDEPO on 07/11/2017.
 *
 */

public class ChosenplateCounter extends Fragment {

    public static int balance_exceeded_checker, items_been_selected;
    public static TextView feetag;

    Spinner spinner;
    TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th;
    Button button, button2, button3, button4, button5, button6;

    public static int parseOne, parseTwo, parseThree, parseFour, parseFive, parseSix, parseSeven, parseEight, parseNine, parseTen;
    public static String FirstSubString, SecondSubString, ThirdSubString, FourthSubString, FifthSubString, SixthSubString, SeventhSubString, EightSubString, NineSubString, TenSubString;

    LucidApplication app;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.snackmenufragment5_chosenplate_counter, container, false);

        app = LucidApplication.getInstance();

        textView = (Button) view.findViewById(R.id.Istchosenbutton);
        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
        return view;
    }

    public void updatePrice(String deductPrice) {

        int cve = Integer.parseInt(deductPrice.substring(0, deductPrice.indexOf(" N")));
        app.allinsnackcounter = app.allinsnackcounter - cve;
        feetag.setText("" + app.allinsnackcounter + "");

      //  SnacksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }

    public void updateInfo(String price) {

        button = getActivity().findViewById(R.id.Istpricebutton);
        button2 = getActivity().findViewById(R.id.Secondpricebutton);
        button3 = getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = getActivity().findViewById(R.id.Fifthpricebutton);
      //  button6 = (Button) getActivity().findViewById(R.id.Sixthpricebutton);

        feetag = getActivity().findViewById(R.id.counter);

        feetag.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int feetag, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int feetag) {

            }

            @Override
            public void afterTextChanged(Editable s) {



                /* <!-- Please note the below strictly requires HighSea for for crashesAdmiNes --!> */ //i.e light

                try {
                    Bundle bundle = getActivity().getIntent().getExtras();
                    items_been_selected = Integer.parseInt(String.valueOf(s));
                    balance_exceeded_checker = Integer.parseInt(String.valueOf(bundle.getString("accountbalance")));

                    if (items_been_selected > balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#B71C1C"));
                    } else if (items_been_selected < balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#000000"));
                    } else if (items_been_selected == balance_exceeded_checker) {
                        feetag.setTextColor(Color.parseColor("#303F9F"));
                    }
                } catch (Exception ignored) {

                }
            }
        });

      //  String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SevenString, EightString, NineString, TenString;

        
        chelseaBread(price);
        doughnut(price);
        meatPie(price);
        sausageRoll(price);
        eggRoll(price);
        fishRoll(price);


    }


    public void chelseaBread(String price) {

        button = getActivity().findViewById(R.id.Istpricebutton);
        button2 = getActivity().findViewById(R.id.Secondpricebutton);
        button3 = getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = getActivity().findViewById(R.id.Fifthpricebutton);

        if (price.contentEquals("80 NAIRA C. BREAD")) {
            FirstString = button.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "80 NAIRA C. BREAD");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "80 NAIRA C. BREAD");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("160 NAIRA C. BREAD(2)")) {
            FirstString = button2.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "160 NAIRA C. BREAD(2)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "160 NAIRA C. BREAD(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 NAIRA C. BREAD(3)")) {
            FirstString = button3.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "240 NAIRA C. BREAD(3)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "240 NAIRA C. BREAD(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("320 NAIRA C. BREAD(4)")) {
            FirstString = button4.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "320 NAIRA C. BREAD(4)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "320 NAIRA C. BREAD(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA C. BREAD(5)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "400 NAIRA C. BREAD(5)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "400 NAIRA C. BREAD(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("480 NAIRA C. BREAD(6)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "480 NAIRA C. BREAD(6)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "480 NAIRA C. BREAD(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("560 NAIRA C. BREAD(7)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "560 NAIRA C. BREAD(7)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "560 NAIRA C. BREAD(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("640 NAIRA C. BREAD(8)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "640 NAIRA C. BREAD(8)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "640 NAIRA C. BREAD(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("720 NAIRA C. BREAD(9)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "720 NAIRA C. BREAD(9)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "720 NAIRA C. BREAD(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("800 NAIRA C. BREAD(10)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "800 NAIRA C. BREAD(10)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "800 NAIRA C. BREAD(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("880 NAIRA C. BREAD(11)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "880 NAIRA C. BREAD(11)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "880 NAIRA C. BREAD(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("960 NAIRA C. BREAD(12)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "960 NAIRA C. BREAD(12)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "960 NAIRA C. BREAD(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1040 NAIRA C. BREAD(13)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1040 NAIRA C. BREAD(13)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1040 NAIRA C. BREAD(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1120 NAIRA C. BREAD(14)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1120 NAIRA C. BREAD(14)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1120 NAIRA C. BREAD(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1200 NAIRA C. BREAD(15)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1200 NAIRA C. BREAD(15)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1200 NAIRA C. BREAD(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1280 NAIRA C. BREAD(16)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1280 NAIRA C. BREAD(16)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1280 NAIRA C. BREAD(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1360 NAIRA C. BREAD(17)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1360 NAIRA C. BREAD(17)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1360 NAIRA C. BREAD(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1440 NAIRA C. BREAD(18)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1440 NAIRA C. BREAD(18)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1440 NAIRA C. BREAD(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1520 NAIRA C. BREAD(19)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1520 NAIRA C. BREAD(19)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1520 NAIRA C. BREAD(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1600 NAIRA C. BREAD(20)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" "));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "1600 NAIRA C. BREAD(20)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "1600 NAIRA C. BREAD(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
    }
    
    public void doughnut(String price) {

        button = getActivity().findViewById(R.id.Istpricebutton);
        button2 = getActivity().findViewById(R.id.Secondpricebutton);
        button3 = getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = getActivity().findViewById(R.id.Fifthpricebutton);

        if (price.contentEquals("80 NAIRA DOUGHNUT")) {
            SecondString = button.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "80 NAIRA DOUGHNUT");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "80 NAIRA DOUGHNUT");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("160 NAIRA DOUGHNUT(2)")) {
            SecondString = button2.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "160 NAIRA DOUGHNUT(2)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "160 NAIRA DOUGHNUT(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 NAIRA DOUGHNUT(3)")) {
            SecondString = button3.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "240 NAIRA DOUGHNUT(3)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "240 NAIRA DOUGHNUT(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("320 NAIRA DOUGHNUT(4)")) {
            SecondString = button4.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "320 NAIRA DOUGHNUT(4)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "320 NAIRA DOUGHNUT(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA DOUGHNUT(5)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "400 NAIRA DOUGHNUT(5)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "400 NAIRA DOUGHNUT(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("480 NAIRA DOUGHNUT(6)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "480 NAIRA DOUGHNUT(6)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "480 NAIRA DOUGHNUT(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("560 NAIRA DOUGHNUT(7)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "560 NAIRA DOUGHNUT(7)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "560 NAIRA DOUGHNUT(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("640 NAIRA DOUGHNUT(8)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "640 NAIRA DOUGHNUT(8)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "640 NAIRA DOUGHNUT(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("720 NAIRA DOUGHNUT(9)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "720 NAIRA DOUGHNUT(9)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "720 NAIRA DOUGHNUT(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("800 NAIRA DOUGHNUT(10)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "800 NAIRA DOUGHNUT(10)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "800 NAIRA DOUGHNUT(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("880 NAIRA DOUGHNUT(11)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "880 NAIRA DOUGHNUT(11)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "880 NAIRA DOUGHNUT(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("960 NAIRA DOUGHNUT(12)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "960 NAIRA DOUGHNUT(12)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "960 NAIRA DOUGHNUT(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1040 NAIRA DOUGHNUT(13)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1040 NAIRA DOUGHNUT(13)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1040 NAIRA DOUGHNUT(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1120 NAIRA DOUGHNUT(14)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1120 NAIRA DOUGHNUT(14)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1120 NAIRA DOUGHNUT(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1200 NAIRA DOUGHNUT(15)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1200 NAIRA DOUGHNUT(15)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1200 NAIRA DOUGHNUT(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1280 NAIRA DOUGHNUT(16)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1280 NAIRA DOUGHNUT(16)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1280 NAIRA DOUGHNUT(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1360 NAIRA DOUGHNUT(17)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1360 NAIRA DOUGHNUT(17)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1360 NAIRA DOUGHNUT(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1440 NAIRA DOUGHNUT(18)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1440 NAIRA DOUGHNUT(18)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1440 NAIRA DOUGHNUT(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1520 NAIRA DOUGHNUT(19)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1520 NAIRA DOUGHNUT(19)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1520 NAIRA DOUGHNUT(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        else if (price.contentEquals("1600 NAIRA DOUGHNUT(20)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" "));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "1600 NAIRA DOUGHNUT(20)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "1600 NAIRA DOUGHNUT(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        
    }
    
    public void meatPie(String price) {

        if (price.contentEquals("120 NAIRA MEATPIE")) {
            ThirdString = button.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "120 NAIRA MEATPIE");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "120 NAIRA MEATPIE");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 NAIRA MEATPIE(2)")) {
            ThirdString = button2.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "240 NAIRA MEATPIE(2)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "240 NAIRA MEATPIE(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }


        } else if (price.contentEquals("360 NAIRA MEATPIE(3)")) {
            ThirdString = button3.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "360 NAIRA MEATPIE(3)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "360 NAIRA MEATPIE(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("480 NAIRA MEATPIE(4)")) {
            ThirdString = button4.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "480 NAIRA MEATPIE(4)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "480 NAIRA MEATPIE(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("600 NAIRA MEATPIE(5)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "600 NAIRA MEATPIE(5)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "600 NAIRA MEATPIE(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("720 NAIRA MEATPIE(6)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "720 NAIRA MEATPIE(6)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "720 NAIRA MEATPIE(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("840 NAIRA MEATPIE(7)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "840 NAIRA MEATPIE(7)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "840 NAIRA MEATPIE(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("960 NAIRA MEATPIE(8)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "960 NAIRA MEATPIE(8)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "960 NAIRA MEATPIE(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1080 NAIRA MEATPIE(9)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1080 NAIRA MEATPIE(9)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1080 NAIRA MEATPIE(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1200 NAIRA MEATPIE(10)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1200 NAIRA MEATPIE(10)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1200 NAIRA MEATPIE(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1320 NAIRA MEATPIE(11)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1320 NAIRA MEATPIE(11)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1320 NAIRA MEATPIE(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1440 NAIRA MEATPIE(12)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1440 NAIRA MEATPIE(12)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1440 NAIRA MEATPIE(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1560 NAIRA MEATPIE(13)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1560 NAIRA MEATPIE(13)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1560 NAIRA MEATPIE(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1680 NAIRA MEATPIE(14)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1680 NAIRA MEATPIE(14)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1680 NAIRA MEATPIE(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1800 NAIRA MEATPIE(15)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1800 NAIRA MEATPIE(15)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1800 NAIRA MEATPIE(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1920 NAIRA MEATPIE(16)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "1920 NAIRA MEATPIE(16)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "1920 NAIRA MEATPIE(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2040 NAIRA MEATPIE(17)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "2040 NAIRA MEATPIE(17)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "2040 NAIRA MEATPIE(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2160 NAIRA MEATPIE(18)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "2160 NAIRA MEATPIE(18)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "2160 NAIRA MEATPIE(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2280 NAIRA MEATPIE(19)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "2280 NAIRA MEATPIE(19)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "2280 NAIRA MEATPIE(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2400 NAIRA MEATPIE(20)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" "));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "2400 NAIRA MEATPIE(20)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "2400 NAIRA MEATPIE(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        
    }
    
    public void sausageRoll(String price) {

        if (price.contentEquals("100 NAIRA SAUSAGE")) {
            FourthString = button.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "100 NAIRA SAUSAGE");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "100 NAIRA SAUSAGE");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("200 NAIRA SAUSAGE(2)")) {
            FourthString = button2.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "200 NAIRA SAUSAGE(2)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "200 NAIRA SAUSAGE(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("300 NAIRA SAUSAGE(3)")) {
            FourthString = button3.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "300 NAIRA SAUSAGE(3)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "300 NAIRA SAUSAGE(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("400 NAIRA SAUSAGE(4)")) {
            FourthString = button4.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "400 NAIRA SAUSAGE(4)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "400 NAIRA SAUSAGE(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("500 NAIRA SAUSAGE(5)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "500 NAIRA SAUSAGE(5)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("N")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "500 NAIRA SAUSAGE(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("600 NAIRA SAUSAGE(6)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "600 NAIRA SAUSAGE(6)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "600 NAIRA SAUSAGE(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("700 NAIRA SAUSAGE(7)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "700 NAIRA SAUSAGE(7)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "700 NAIRA SAUSAGE(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("800 NAIRA SAUSAGE(8)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "800 NAIRA SAUSAGE(8)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "800 NAIRA SAUSAGE(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("900 NAIRA SAUSAGE(9)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "900 NAIRA SAUSAGE(9)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "900 NAIRA SAUSAGE(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1000 NAIRA SAUSAGE(10)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1000 NAIRA SAUSAGE(10)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1000 NAIRA SAUSAGE(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1100 NAIRA SAUSAGE(11)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1100 NAIRA SAUSAGE(11)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1100 NAIRA SAUSAGE(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1200 NAIRA SAUSAGE(12)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1200 NAIRA SAUSAGE(12)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1200 NAIRA SAUSAGE(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1300 NAIRA SAUSAGE(13)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1300 NAIRA SAUSAGE(13)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1300 NAIRA SAUSAGE(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1400 NAIRA SAUSAGE(14)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1400 NAIRA SAUSAGE(14)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1400 NAIRA SAUSAGE(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1500 NAIRA SAUSAGE(15)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1500 NAIRA SAUSAGE(15)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1500 NAIRA SAUSAGE(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1600 NAIRA SAUSAGE(16)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1600 NAIRA SAUSAGE(16)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1600 NAIRA SAUSAGE(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1700 NAIRA SAUSAGE(17)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1700 NAIRA SAUSAGE(17)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1700 NAIRA SAUSAGE(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1800 NAIRA SAUSAGE(18)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1800 NAIRA SAUSAGE(18)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1800 NAIRA SAUSAGE(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1900 NAIRA SAUSAGE(19)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "1900 NAIRA SAUSAGE(19)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "1900 NAIRA SAUSAGE(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2000 NAIRA SAUSAGE(20)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" "));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "2000 NAIRA SAUSAGE(20)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "2000 NAIRA SAUSAGE(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
        
    }
    
    public void eggRoll(String price) {

        if (price.contentEquals("80 NAIRA EGG ROLL")) {
            FifthString = button.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "80 NAIRA EGG ROLL");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "80 NAIRA EGG ROLL");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("160 NAIRA EGG ROLL(2)")) {
            FifthString = button2.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "160 NAIRA EGG ROLL(2)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "160 NAIRA EGG ROLL(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("240 NAIRA EGG ROLL(3)")) {
            FifthString = button3.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "240 NAIRA EGG ROLL(3)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "240 NAIRA EGG ROLL(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("320 NAIRA EGG ROLL(4)")) {
            FifthString = button4.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "320 NAIRA EGG ROLL(4)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "320 NAIRA EGG ROLL(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("400 NAIRA EGG ROLL(5)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "400 NAIRA EGG ROLL(5)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "400 NAIRA EGG ROLL(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("480 NAIRA EGG ROLL(6)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "480 NAIRA EGG ROLL(6)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "480 NAIRA EGG ROLL(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("560 NAIRA EGG ROLL(7)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "560 NAIRA EGG ROLL(7)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "560 NAIRA EGG ROLL(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("640 NAIRA EGG ROLL(8)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "640 NAIRA EGG ROLL(8)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "640 NAIRA EGG ROLL(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("720 NAIRA EGG ROLL(9)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "720 NAIRA EGG ROLL(9)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "720 NAIRA EGG ROLL(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("800 NAIRA EGG ROLL(10)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "800 NAIRA EGG ROLL(10)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "800 NAIRA EGG ROLL(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("880 NAIRA EGG ROLL(11)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "880 NAIRA EGG ROLL(11)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "880 NAIRA EGG ROLL(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("960 NAIRA EGG ROLL(12)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "960 NAIRA EGG ROLL(12)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "960 NAIRA EGG ROLL(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1040 NAIRA EGG ROLL(13)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1040 NAIRA EGG ROLL(13)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1040 NAIRA EGG ROLL(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1220 NAIRA EGG ROLL(14)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1220 NAIRA EGG ROLL(14)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1220 NAIRA EGG ROLL(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1200 NAIRA EGG ROLL(15)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1200 NAIRA EGG ROLL(15)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1200 NAIRA EGG ROLL(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1280 NAIRA EGG ROLL(16)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1280 NAIRA EGG ROLL(16)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1280 NAIRA EGG ROLL(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1360 NAIRA EGG ROLL(17)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1360 NAIRA EGG ROLL(17)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1360 NAIRA EGG ROLL(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1440 NAIRA EGG ROLL(18)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1440 NAIRA EGG ROLL(18)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1440 NAIRA EGG ROLL(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1520 NAIRA EGG ROLL(19)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1520 NAIRA EGG ROLL(19)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1520 NAIRA EGG ROLL(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1600 NAIRA EGG ROLL(20)")) {
            FifthString = button5.getText().toString();
            FifthSubString = FifthString.substring(FifthString.indexOf(""), FifthString.indexOf(" "));
            parseFive = Integer.parseInt(FifthSubString);
            if (!app.prev.containsKey("4")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFive;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("4", "1600 NAIRA EGG ROLL(20)");
            } else {
                String val = app.prev.get("4");
                FifthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(FifthSubString) != parseFive) {
                    app.prev.remove("4");
                    app.prev.put("4", "1600 NAIRA EGG ROLL(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FifthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFive;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
    }
    
    public void fishRoll(String price) {

        if (price.contentEquals("150 NAIRA FISH ROLL")) {
            SixthString = button.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "150 NAIRA FISH ROLL");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "150 NAIRA FISH ROLL");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("300 NAIRA FISH ROLL(2)")) {
            SixthString = button2.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "300 NAIRA FISH ROLL(2)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "300 NAIRA FISH ROLL(2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("450 NAIRA FISH ROLL(3)")) {
            SixthString = button3.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "450 NAIRA FISH ROLL(3)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "450 NAIRA FISH ROLL(3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("600 NAIRA FISH ROLL(4)")) {
            SixthString = button4.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "600 NAIRA FISH ROLL(4)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "600 NAIRA FISH ROLL(4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("750 NAIRA FISH ROLL(5)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "750 NAIRA FISH ROLL(5)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "750 NAIRA FISH ROLL(5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("900 NAIRA FISH ROLL(6)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "900 NAIRA FISH ROLL(6)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "900 NAIRA FISH ROLL(6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1050 NAIRA FISH ROLL(7)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1050 NAIRA FISH ROLL(7)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1050 NAIRA FISH ROLL(7)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1200 NAIRA FISH ROLL(8)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1200 NAIRA FISH ROLL(8)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1200 NAIRA FISH ROLL(8)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1350 NAIRA FISH ROLL(9)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1350 NAIRA FISH ROLL(9)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1350 NAIRA FISH ROLL(9)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1500 NAIRA FISH ROLL(10)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1500 NAIRA FISH ROLL(10)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1500 NAIRA FISH ROLL(10)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1650 NAIRA FISH ROLL(11)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1650 NAIRA FISH ROLL(11)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1650 NAIRA FISH ROLL(11)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1800 NAIRA FISH ROLL(12)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1800 NAIRA FISH ROLL(12)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1800 NAIRA FISH ROLL(12)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("1950 NAIRA FISH ROLL(13)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "1950 NAIRA FISH ROLL(13)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "1950 NAIRA FISH ROLL(13)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2100 NAIRA FISH ROLL(14)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2100 NAIRA FISH ROLL(14)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2100 NAIRA FISH ROLL(14)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2250 NAIRA FISH ROLL(15)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2250 NAIRA FISH ROLL(15)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2250 NAIRA FISH ROLL(15)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2400 NAIRA FISH ROLL(16)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2400 NAIRA FISH ROLL(16)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2400 NAIRA FISH ROLL(16)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2550 NAIRA FISH ROLL(17)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2550 NAIRA FISH ROLL(17)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2550 NAIRA FISH ROLL(17)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2700 NAIRA FISH ROLL(18)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2700 NAIRA FISH ROLL(18)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2700 NAIRA FISH ROLL(18)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("2850 NAIRA FISH ROLL(19)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "2850 NAIRA FISH ROLL(19)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "2850 NAIRA FISH ROLL(19)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        } else if (price.contentEquals("3000 NAIRA FISH ROLL(20)")) {
            SixthString = button5.getText().toString();
            SixthSubString = SixthString.substring(SixthString.indexOf(""), SixthString.indexOf(" "));
            parseSix = Integer.parseInt(SixthSubString);
            if (!app.prev.containsKey("5")) {
                app.allinsnackcounter = app.allinsnackcounter + parseSix;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("5", "3000 NAIRA FISH ROLL(20)");
            } else {
                String val = app.prev.get("5");
                SixthSubString = val.substring(val.indexOf(""), val.indexOf(" "));

                if (Integer.parseInt(SixthSubString) != parseSix) {
                    app.prev.remove("5");
                    app.prev.put("5", "3000 NAIRA FISH ROLL(20)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SixthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseSix;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
    }

}
