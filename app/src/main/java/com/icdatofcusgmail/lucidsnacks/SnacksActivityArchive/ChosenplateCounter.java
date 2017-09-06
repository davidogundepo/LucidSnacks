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

        int cve = Integer.parseInt(deductPrice.substring(0, deductPrice.indexOf(" n")));
        app.allinsnackcounter = app.allinsnackcounter - cve;
        feetag.setText("" + app.allinsnackcounter + "");

        SnacksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }

    public void updateInfo(String price) {

        button = (Button) getActivity().findViewById(R.id.Istpricebutton);
        button2 = (Button) getActivity().findViewById(R.id.Secondpricebutton);
        button3 = (Button) getActivity().findViewById(R.id.Thirdpricebutton);
        button4 = (Button) getActivity().findViewById(R.id.Fourthpricebutton);
        button5 = (Button) getActivity().findViewById(R.id.Fifthpricebutton);
        button6 = (Button) getActivity().findViewById(R.id.Sixthpricebutton);

        feetag = (TextView) getActivity().findViewById(R.id.counter);
        spinner = (Spinner) getActivity().findViewById(R.id.spinnerCurrency);
        
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

        String FirstString, SecondString, ThirdString, FourthString, FifthString, SixthString, SevenString, EightString, NineString, TenString;

        if (price.contentEquals("60 naira C. Bread")) {
            FirstString = button.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "60 naira C. Bread");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "60 naira C. Bread");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("120 naira C. Bread (2)")) {
            FirstString = button2.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "120 naira C. Bread (2)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "120 naira C. Bread (2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("180 naira C. Bread (3)")) {
            FirstString = button3.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "180 naira C. Bread (3)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "180 naira C. Bread (3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira C. Bread (4)")) {
            FirstString = button4.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "240 naira C. Bread (4)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "240 naira C. Bread (4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira C. Bread (5)")) {
            FirstString = button5.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "300 naira C. Bread (5)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "300 naira C. Bread (5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("360 naira C. Bread (6)")) {
            FirstString = button6.getText().toString();
            FirstSubString = FirstString.substring(FirstString.indexOf(""), FirstString.indexOf(" naira C. Bread"));
            parseOne = Integer.parseInt(FirstSubString);
            if (!app.prev.containsKey("0")) {
                app.allinsnackcounter = app.allinsnackcounter + parseOne;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("0", "360 naira C. Bread (6)");
            } else {
                String val = app.prev.get("0");
                FirstSubString = val.substring(val.indexOf(""), val.indexOf(" naira C. Bread"));

                if (Integer.parseInt(FirstSubString) != parseOne) {
                    app.prev.remove("0");
                    app.prev.put("0", "360 naira C. Bread (6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FirstSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseOne;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        }

        if (price.contentEquals("60 naira Doughnut")) {
            SecondString = button.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "60 naira Doughnut");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "60 naira Doughnut");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("120 naira Doughnut (2)")) {
            SecondString = button2.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "120 naira Doughnut (2)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "120 naira Doughnut (2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("180 naira Doughnut (3)")) {
            SecondString = button3.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "180 naira Doughnut (3)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "180 naira Doughnut (3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Doughnut (4)")) {
            SecondString = button4.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "240 naira Doughnut (4)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "240 naira Doughnut (4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Doughnut (5)")) {
            SecondString = button5.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "300 naira Doughnut (5)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "300 naira Doughnut (5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("360 naira Doughnut (6)")) {
            SecondString = button6.getText().toString();
            SecondSubString = SecondString.substring(SecondString.indexOf(""), SecondString.indexOf(" naira Doughnut"));
            parseTwo = Integer.parseInt(SecondSubString);
            if (!app.prev.containsKey("1")) {
                app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("1", "360 naira Doughnut (6)");
            } else {
                String val = app.prev.get("1");
                SecondSubString = val.substring(val.indexOf(""), val.indexOf(" naira Doughnut"));

                if (Integer.parseInt(SecondSubString) != parseTwo) {
                    app.prev.remove("1");
                    app.prev.put("1", "360 naira Doughnut (6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(SecondSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseTwo;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }

        if (price.contentEquals("120 naira Meatpie")) {
            ThirdString = button.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "120 naira Meatpie");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "120 naira Meatpie");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("240 naira Meatpie (2)")) {
            ThirdString = button2.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "240 naira Meatpie (2)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "240 naira Meatpie (2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }


        } else if (price.contentEquals("360 naira Meatpie (3)")) {
            ThirdString = button3.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "360 naira Meatpie (3)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "360 naira Meatpie (3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("480 naira Meatpie (4)")) {
            ThirdString = button4.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "480 naira Meatpie (4)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "480 naira Meatpie (4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Meatpie (5)")) {
            ThirdString = button5.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "600 naira Meatpie (5)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "600 naira Meatpie (5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("720 naira Meatpie (6)")) {
            ThirdString = button6.getText().toString();
            ThirdSubString = ThirdString.substring(ThirdString.indexOf(""), ThirdString.indexOf(" naira Meatpie"));
            parseThree = Integer.parseInt(ThirdSubString);
            if (!app.prev.containsKey("2")) {
                app.allinsnackcounter = app.allinsnackcounter + parseThree;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("2", "720 naira Meatpie (6)");
            } else {
                String val = app.prev.get("2");
                ThirdSubString = val.substring(val.indexOf(""), val.indexOf(" naira Meatpie"));

                if (Integer.parseInt(ThirdSubString) != parseThree) {
                    app.prev.remove("2");
                    app.prev.put("2", "720 naira Meatpie (6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(ThirdSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseThree;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }

        if (price.contentEquals("100 naira Sausage")) {
            FourthString = button.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "100 naira Sausage");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(val.indexOf(""), val.indexOf(" naira Sausage"));

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "100 naira Sausage");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("200 naira Sausage (2)")) {
            FourthString = button2.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage (2)"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "200 naira Sausage (2)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "200 naira Sausage (2)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("300 naira Sausage (3)")) {
            FourthString = button3.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage (3)"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "300 naira Sausage (3)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "300 naira Sausage (3)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("400 naira Sausage (4)")) {
            FourthString = button4.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage (4)"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "400 naira Sausage (4)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "400 naira Sausage (4)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("500 naira Sausage (5)")) {
            FourthString = button5.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage (5)"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "500 naira Sausage (5)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "500 naira Sausage (5)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }

        } else if (price.contentEquals("600 naira Sausage (6)")) {
            FourthString = button6.getText().toString();
            FourthSubString = FourthString.substring(FourthString.indexOf(""), FourthString.indexOf(" naira Sausage (6)"));
            parseFour = Integer.parseInt(FourthSubString);
            if (!app.prev.containsKey("3")) {
                app.allinsnackcounter = app.allinsnackcounter + parseFour;
                feetag.setText("" + app.allinsnackcounter + "");
                app.prev.put("3", "600 naira Sausage (6)");
            } else {
                String val = app.prev.get("3");
                FourthSubString = val.substring(0, val.indexOf("n")).trim();

                if (Integer.parseInt(FourthSubString) != parseFour) {
                    app.prev.remove("3");
                    app.prev.put("3", "600 naira Sausage (6)");
                    app.allinsnackcounter = app.allinsnackcounter - Integer.parseInt(FourthSubString);
                    app.allinsnackcounter = app.allinsnackcounter + parseFour;
                    feetag.setText("" + app.allinsnackcounter + "");
                }
            }
        }
    }
}
