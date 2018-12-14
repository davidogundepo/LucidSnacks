package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;

/**
 * Created by DAVID OGUNDEPO on 07/11/2017.
 * 
 */

public class ChosensnacksFragment extends Fragment {

    static TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th;
    ImageButton imageButton, imageButton2nd, imageButton3rd, imageButton4th, imageButton5th, imageButton6th, imageButton7th, imageButton8th, imageButton9th, imageButton10th;
    OnPriceSetListener onPriceSetListener;

    LucidApplication app;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.snackmenufragment3_chosensnack, container, false);

        app = LucidApplication.getInstance();

        textView = (Button) view.findViewById(R.id.Istchosenbutton);
        textView.setVisibility(View.GONE);
        textView2nd = (Button) view.findViewById(R.id.Secondchosenbutton);
        textView2nd.setVisibility(View.GONE);
        textView3rd = (Button) view.findViewById(R.id.Thirdchosenbutton);
        textView3rd.setVisibility(View.GONE);
        textView4th = (Button) view.findViewById(R.id.Fourthchosenbutton);
        textView4th.setVisibility(View.GONE);
        textView5th = (Button) view.findViewById(R.id.Fifthchosenbutton);
        textView5th.setVisibility(View.GONE);
        textView6th = (Button) view.findViewById(R.id.Sixthchosenbutton);
        textView6th.setVisibility(View.GONE);
        textView7th = (Button) view.findViewById(R.id.Seventhchosenbutton);
        textView7th.setVisibility(View.GONE);
        textView8th = (Button) view.findViewById(R.id.Eightchosenbutton);
        textView8th.setVisibility(View.GONE);
        textView9th = (Button) view.findViewById(R.id.Ninthchosenbutton);
        textView9th.setVisibility(View.GONE);
        textView10th = (Button) view.findViewById(R.id.Tenthchosenbutton);
        textView10th.setVisibility(View.GONE);

        imageButton = (ImageButton) view.findViewById(R.id.Istchosendeletebutton);
        imageButton.setVisibility(View.GONE);
        imageButton2nd = (ImageButton) view.findViewById(R.id.Secondchosendeletebutton);
        imageButton2nd.setVisibility(View.GONE);
        imageButton3rd = (ImageButton) view.findViewById(R.id.Thirdchosendeletebutton);
        imageButton3rd.setVisibility(View.GONE);
        imageButton4th = (ImageButton) view.findViewById(R.id.Fourthchosendeletebutton);
        imageButton4th.setVisibility(View.GONE);
        imageButton5th = (ImageButton) view.findViewById(R.id.Fifthchosendeletebutton);
        imageButton5th.setVisibility(View.GONE);
        imageButton6th = (ImageButton) view.findViewById(R.id.Sixthchosendeletebutton);
        imageButton6th.setVisibility(View.GONE);
        imageButton7th = (ImageButton) view.findViewById(R.id.Seventhchosendeletebutton);
        imageButton7th.setVisibility(View.GONE);
        imageButton8th = (ImageButton) view.findViewById(R.id.Eightchosendeletebutton);
        imageButton8th.setVisibility(View.GONE);
        imageButton9th = (ImageButton) view.findViewById(R.id.Ninthchosendeleltebutton);
        imageButton9th.setVisibility(View.GONE);
        imageButton10th = (ImageButton) view.findViewById(R.id.Tenthchosendeletebutton);
        imageButton10th.setVisibility(View.GONE);

        return view;
    }

    interface OnPriceSetListener {
        void setPrice(String price);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            onPriceSetListener = (OnPriceSetListener) activity;
        } catch (Exception ignored) {
        }
    }

    public void updateInfo(String name) {

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
                imageButton.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("0");
                if (!imageButton.isShown() && imageButton2nd.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton2nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2nd.setVisibility(View.GONE);
                imageButton2nd.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView2nd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("1");
                if (!imageButton2nd.isShown() && imageButton.isShown() || imageButton3rd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView3rd.setVisibility(View.GONE);
                imageButton3rd.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView3rd.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("2");
                if (!imageButton3rd.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton4th.isShown() || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton4th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4th.setVisibility(View.GONE);
                imageButton4th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView4th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("3");
                if (!imageButton4th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton5th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton5th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5th.setVisibility(View.GONE);
                imageButton5th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView5th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("4");
                if (!imageButton5th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton6th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton6th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6th.setVisibility(View.GONE);
                imageButton6th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView6th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("5");
                if (!imageButton6th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton7th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton7th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView7th.setVisibility(View.GONE);
                imageButton7th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView7th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("6");
                if (!imageButton7th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton8th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton8th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView8th.setVisibility(View.GONE);
                imageButton8th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView8th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("7");
                if (!imageButton8th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton9th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });

        imageButton9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView9th.setVisibility(View.GONE);
                imageButton9th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView9th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("8");
                if (!imageButton9th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton10th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }

            }
        });

        imageButton10th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView10th.setVisibility(View.GONE);
                imageButton10th.setVisibility(View.GONE);
                // SnacksmenuActivity.Pcount.setEnabled(false);
                SnacksmenuActivity.Purchase.setEnabled(false);
                String Price = textView10th.getText().toString();
                onPriceSetListener.setPrice(Price);
                app.prev.remove("9");
                if (!imageButton10th.isShown() && imageButton.isShown() || imageButton2nd.isShown()
                        || imageButton3rd.isShown()   || imageButton4th.isShown() || imageButton5th.isShown()
                        || imageButton6th.isShown() || imageButton7th.isShown() || imageButton8th.isShown()
                        || imageButton9th.isShown()) {
                    SnacksmenuActivity.Pcount.setEnabled(true);
                    SnacksmenuActivity.Purchase.setEnabled(true);
                }
            }
        });


        contentChelseaBread(name);
        contentDoughnut(name);
        contentMeatPie(name);
        contentSausageRoll(name);
        contentEggRoll(name);
        contentFishRoll(name);


      //  SnacksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
    }

    public void contentChelseaBread(String name) {

        if (name.contentEquals("80 NAIRA C. BREAD")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA C. BREAD(2)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA C. BREAD(3)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA C. BREAD(4)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA C. BREAD(5)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA C. BREAD(6)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA C. BREAD(7)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA C. BREAD(8)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA C. BREAD(9)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA C. BREAD(10)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA C. BREAD(11)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA C. BREAD(12)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA C. BREAD(13)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA C. BREAD(14)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA C. BREAD(15)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA C. BREAD(16)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA C. BREAD(17)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA C. BREAD(18)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA C. BREAD(19)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA C. BREAD(20)")) {
            textView.setText(name);
            textView.setVisibility(View.VISIBLE);
            imageButton.setVisibility(View.VISIBLE);
        }

    }

    public void contentDoughnut(String name) {

        if (name.contentEquals("80 NAIRA DOUGHNUT")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA DOUGHNUT(2)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA DOUGHNUT(3)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA DOUGHNUT(4)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA DOUGHNUT(5)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA DOUGHNUT(6)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA DOUGHNUT(7)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA DOUGHNUT(8)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA DOUGHNUT(9)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA DOUGHNUT(10)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA DOUGHNUT(11)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA DOUGHNUT(12)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA DOUGHNUT(13)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA DOUGHNUT(14)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA DOUGHNUT(15)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA DOUGHNUT(16)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA DOUGHNUT(17)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA DOUGHNUT(18)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA DOUGHNUT(19)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA DOUGHNUT(20)")) {
            textView2nd.setText(name);
            textView2nd.setVisibility(View.VISIBLE);
            imageButton2nd.setVisibility(View.VISIBLE);
        }

    }

    public void contentMeatPie(String name) {

        if (name.contentEquals("120 NAIRA MEATPIE")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA MEATPIE(2)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("360 NAIRA MEATPIE(3)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA MEATPIE(4)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("600 NAIRA MEATPIE(5)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }  else if (name.contentEquals("720 NAIRA MEATPIE(6)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("840 NAIRA MEATPIE(7)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA MEATPIE(8)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1080 NAIRA MEATPIE(9)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA MEATPIE(10)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1320 NAIRA MEATPIE(11)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA MEATPIE(12)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1560 NAIRA MEATPIE(13)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1680 NAIRA MEATPIE(14)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA MEATPIE(15)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1920 NAIRA MEATPIE(16)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2040 NAIRA MEATPIE(17)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2160 NAIRA MEATPIE(18)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2280 NAIRA MEATPIE(19)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA MEATPIE(20)")) {
            textView3rd.setText(name);
            textView3rd.setVisibility(View.VISIBLE);
            imageButton3rd.setVisibility(View.VISIBLE);
        }

    }

    public void contentSausageRoll(String name) {

        if (name.contentEquals("100 NAIRA SAUSAGE")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("200 NAIRA SAUSAGE(2)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA SAUSAGE(3)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA SAUSAGE(4)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("500 NAIRA SAUSAGE(5)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA SAUSAGE(6)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("700 NAIRA SAUSAGE(7)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA SAUSAGE(8)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA SAUSAGE(9)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1000 NAIRA SAUSAGE(10)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1100 NAIRA SAUSAGE(11)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA SAUSAGE(12)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1300 NAIRA SAUSAGE(13)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1400 NAIRA SAUSAGE(14)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA SAUSAGE(15)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA SAUSAGE(16)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1700 NAIRA SAUSAGE(17)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA SAUSAGE(18)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1900 NAIRA SAUSAGE(19)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2000 NAIRA SAUSAGE(20)")) {
            textView4th.setText(name);
            textView4th.setVisibility(View.VISIBLE);
            imageButton4th.setVisibility(View.VISIBLE);
        }

    }

    public void contentEggRoll(String name) {

        if (name.contentEquals("80 NAIRA EGG ROLL")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("160 NAIRA EGG ROLL(2)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("240 NAIRA EGG ROLL(3)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("320 NAIRA EGG ROLL(4)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("400 NAIRA EGG ROLL(5)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("480 NAIRA EGG ROLL(6)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("560 NAIRA EGG ROLL(7)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("640 NAIRA EGG ROLL(8)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("720 NAIRA EGG ROLL(9)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("800 NAIRA EGG ROLL(10)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("880 NAIRA EGG ROLL(11)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("960 NAIRA EGG ROLL(12)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1040 NAIRA EGG ROLL(13)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1120 NAIRA EGG ROLL(14)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA EGG ROLL(15)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1280 NAIRA EGG ROLL(16)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1360 NAIRA EGG ROLL(17)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1440 NAIRA EGG ROLL(18)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1520 NAIRA EGG ROLL(19)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1600 NAIRA EGG ROLL(20)")) {
            textView5th.setText(name);
            textView5th.setVisibility(View.VISIBLE);
            imageButton5th.setVisibility(View.VISIBLE);
        }
        
    }

    public void contentFishRoll(String name) {

        if (name.contentEquals("150 NAIRA FISH ROLL")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("300 NAIRA FISH ROLL(2)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("450 NAIRA FISH ROLL(3)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("600 NAIRA FISH ROLL(4)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("750 NAIRA FISH ROLL(5)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("900 NAIRA FISH ROLL(6)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1050 NAIRA FISH ROLL(7)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1200 NAIRA FISH ROLL(8)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1350 NAIRA FISH ROLL(9)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1500 NAIRA FISH ROLL(10)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1650 NAIRA FISH ROLL(11)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1800 NAIRA FISH ROLL(12)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("1950 NAIRA FISH ROLL(13)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2100 NAIRA FISH ROLL(14)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2250 NAIRA FISH ROLL(15)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2400 NAIRA FISH ROLL(16)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2550 NAIRA FISH ROLL(17)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2700 NAIRA FISH ROLL(18)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("2850 NAIRA FISH ROLL(19)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        } else if (name.contentEquals("3000 NAIRA FISH ROLL(20)")) {
            textView6th.setText(name);
            textView6th.setVisibility(View.VISIBLE);
            imageButton6th.setVisibility(View.VISIBLE);
        }
    }




    
}
