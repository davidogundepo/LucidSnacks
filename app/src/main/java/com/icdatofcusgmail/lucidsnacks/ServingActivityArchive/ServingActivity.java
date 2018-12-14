package com.icdatofcusgmail.lucidsnacks.ServingActivityArchive;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive.SnacksmenuActivity;
import com.icdatofcusgmail.lucidsnacks.VendorActivityArchive.VendorActivity;

public class ServingActivity extends AppCompatActivity {

    PowerManager.WakeLock wakeLock;
    TextView textViewun, textViewdo, textViewtrois, textViewquartz, textViewfive, textViewsix, textViewsept, textVieweight, textViewnous, textViewten, textViewPlateorPark;
    TextView pleaseServeMe;
    LucidApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serving);

        app = LucidApplication.getInstance();

        Log.d("ServingActivity", "onCreate invoked");
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }

        pleaseServeMe = findViewById(R.id.serveMePlease);

//        whichName = app.Nametext.getText().toString();
//        firstName = whichName.substring(whichName.indexOf(""), whichName.indexOf(" "));
//
//
//        Bundle SecondParcel = getIntent().getExtras();
//        pleaseServeMe.setText(firstName +", please serve " + SecondParcel.getString("prince") + " the following:" );



        Intent SecondParcel = getIntent();
        String registrar = SecondParcel.getStringExtra("prince");

        String azubike = registrar.replace("Welcome, ","").trim();

        String Azubike = azubike.substring(0,1).toUpperCase() + azubike.substring(1).toLowerCase();

        String maero_delta = app.Nametext.getText().toString();
        String maero = maero_delta.substring(maero_delta.indexOf(""), maero_delta.indexOf(" "));
        String Maero = maero.substring(0,1).toUpperCase() + maero.substring(1).toLowerCase();

        pleaseServeMe.setText(Maero + " please serve " + Azubike + " the following:" );


        textViewun = findViewById(R.id.plate1);
        textViewun.setVisibility(View.GONE);
        textViewdo = findViewById(R.id.plate2);
        textViewdo.setVisibility(View.GONE);
        textViewtrois = findViewById(R.id.plate3);
        textViewtrois.setVisibility(View.GONE);
        textViewquartz = findViewById(R.id.plate4);
        textViewquartz.setVisibility(View.GONE);
        textViewfive = findViewById(R.id.plate5);
        textViewfive.setVisibility(View.GONE);
        textViewsix = findViewById(R.id.plate6);
        textViewsix.setVisibility(View.GONE);
        textViewsept = findViewById(R.id.plate7);
        textViewsept.setVisibility(View.GONE);
        textVieweight = findViewById(R.id.plate8);
        textVieweight.setVisibility(View.GONE);
        textViewnous = findViewById(R.id.plate9);
        textViewnous.setVisibility(View.GONE);
        textViewten = findViewById(R.id.plate10);
        textViewten.setVisibility(View.GONE);

        textViewPlateorPark = findViewById(R.id.PackorPlate);
        textViewPlateorPark.setVisibility(View.INVISIBLE);



        Intent PorP = getIntent();
        String receivedvalue = PorP.getStringExtra("Roman");

        if (receivedvalue.contentEquals("Buying all in a plate"))
            textViewPlateorPark.setText("" + "All in one Plate" + "");


        else if (receivedvalue.contentEquals("Buying all in two plates")) 
            textViewPlateorPark.setText("" + "All in Two different Plates" + "");


        else if (receivedvalue.contentEquals("Buying all in three plates")) 
            textViewPlateorPark.setText("" + "All in Three different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in four plates")) 
            textViewPlateorPark.setText("" + "All in Four different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in five plates")) 
            textViewPlateorPark.setText("" + "All in Five different Plates" + "");
        

        else if (receivedvalue.contentEquals("Buying all in six plates")) 
            textViewPlateorPark.setText("" + "All in Six different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in seven plates")) 
            textViewPlateorPark.setText("" + "All in Seven different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in eight plates")) 
            textViewPlateorPark.setText("" + "All in Eight different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in nine plates")) 
            textViewPlateorPark.setText("" + "All in Nine different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in ten plates")) 
            textViewPlateorPark.setText("" + "All in Ten different Plates" + "");
       

        else if (receivedvalue.contentEquals("Buying all in oneone plates")) 
            textViewPlateorPark.setText("" + "All in Eleven different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onetwo plates")) 
            textViewPlateorPark.setText("" + "All in Twelve different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in onethree plates")) 
            textViewPlateorPark.setText("" + "All in Thirteen different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in onefour plates")) 
            textViewPlateorPark.setText("" + "All in Fourteen different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onefive plates")) 
            textViewPlateorPark.setText("" + "All in Fifteen different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in onesix plates")) 
            textViewPlateorPark.setText("" + "All in Sixteen different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in oneseven plates")) 
            textViewPlateorPark.setText("" + "All in Seventeen Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in oneeight plates")) 
            textViewPlateorPark.setText("" + "All in Eighteen different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in onenine plates")) 
            textViewPlateorPark.setText("" + "All in Nineteen different Plates" + "");


        else if (receivedvalue.contentEquals("Buying all in oneten plates")) 
            textViewPlateorPark.setText("" + "All in Twenty different Plates" + "");
      

        else if (receivedvalue.contentEquals("Buying all in twoone plates")) 
            textViewPlateorPark.setText("" + "All in TwentyOne Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twotwo plates")) 
            textViewPlateorPark.setText("" + "All in TwentyTwo different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twothree plates")) 
            textViewPlateorPark.setText("" + "All in TwentyThree different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twofour plates")) 
            textViewPlateorPark.setText("" + "All in TwentyFour different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twofive plates")) 
            textViewPlateorPark.setText("" + "All in TwentyFive different Plates" + "");
     

        else if (receivedvalue.contentEquals("Buying all in twosix plates")) 
            textViewPlateorPark.setText("" + "All in TwentySix different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in twoseven plates")) 
            textViewPlateorPark.setText("" + "All in TwentySeven different Plates" + "");
   

        else if (receivedvalue.contentEquals("Buying all in twoeight plates")) 
            textViewPlateorPark.setText("" + "All in TwentyEight different Plates" + "");
   

        else if (receivedvalue.contentEquals("Buying all in twonine plates")) 
            textViewPlateorPark.setText("" + "All in TwentyNine different Plates" + "");
    

        else if (receivedvalue.contentEquals("Buying all in twoten plates")) 
            textViewPlateorPark.setText("" + "All in Thirty different Plates" + "");
     

        else
            textViewPlateorPark.setText("" + "All in a Plate" + "");



        Intent favouritism = getIntent();
        String dweezy = favouritism.getStringExtra("favouritism");
        if (SnacksmenuActivity.textView.getVisibility() == View.VISIBLE) {
            textViewun.setText(dweezy);
            textViewun.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView.getVisibility() == View.GONE) {
            textViewun.setVisibility(View.GONE);
        }

        Intent genius = getIntent();
        String tobi = genius.getStringExtra("genius");
        if (SnacksmenuActivity.textView2nd.getVisibility() == View.VISIBLE) {
            textViewdo.setText(tobi);
            textViewdo.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView2nd.getVisibility() == View.GONE) {
            textViewdo.setVisibility(View.GONE);
        }

        Intent generous = getIntent();
        String emmanuel = generous.getStringExtra("generous");
        if (SnacksmenuActivity.textView3rd.getVisibility() == View.VISIBLE) {
            textViewtrois.setText(emmanuel);
            textViewtrois.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView3rd.getVisibility() == View.GONE) {
            textViewtrois.setVisibility(View.GONE);
        }

        Intent focused = getIntent();
        String joseph = focused.getStringExtra("focused");
        if (SnacksmenuActivity.textView4th.getVisibility() == View.VISIBLE) {
            textViewquartz.setText(joseph);
            textViewquartz.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView4th.getVisibility() == View.GONE) {
            textViewquartz.setVisibility(View.GONE);
        }

        Intent creativebeast = getIntent();
        String godwin = creativebeast.getStringExtra("creativebeast");
        if (SnacksmenuActivity.textView5th.getVisibility() == View.VISIBLE) {
            textViewfive.setText(godwin);
            textViewfive.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView5th.getVisibility() == View.GONE) {
            textViewfive.setVisibility(View.GONE);
        }

        Intent bestmom = getIntent();
        String funmilayo = bestmom.getStringExtra("bestmom");
        if (SnacksmenuActivity.textView6th.getVisibility() == View.VISIBLE) {
            textViewsix.setText(funmilayo);
            textViewsix.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView6th.getVisibility() == View.GONE) {
            textViewsix.setVisibility(View.GONE);
        }

        Intent bestdad = getIntent();
        String james = bestdad.getStringExtra("bestdad");
        if (SnacksmenuActivity.textView7th.getVisibility() == View.VISIBLE) {
            textViewsept.setText(james);
            textViewsept.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView7th.getVisibility() == View.GONE) {
            textViewsept.setVisibility(View.GONE);
        }

        Intent biggersis = getIntent();
        String tomilola = biggersis.getStringExtra("biggersis");
        if (SnacksmenuActivity.textView8th.getVisibility() == View.VISIBLE) {
            textVieweight.setText(tomilola);
            textVieweight.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView8th.getVisibility() == View.GONE) {
            textVieweight.setVisibility(View.GONE);
        }

        Intent biggestsis = getIntent();
        String opeyemi = biggestsis.getStringExtra("biggestsis");
        if (SnacksmenuActivity.textView9th.getVisibility() == View.VISIBLE) {
            textViewnous.setText(opeyemi);
            textViewnous.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView9th.getVisibility() == View.GONE) {
            textViewnous.setVisibility(View.GONE);
        }

        Intent dhalson = getIntent();
        String david = dhalson.getStringExtra("dhalson");
        if (SnacksmenuActivity.textView10th.getVisibility() == View.VISIBLE) {
            textViewten.setText(david);
            textViewten.setVisibility(View.VISIBLE);
        } else if (SnacksmenuActivity.textView10th.getVisibility() == View.GONE) {
            textViewten.setVisibility(View.GONE);
        }

    }

    public void NextTransactionPlease (View view) {

        Intent lucid = new Intent(this, VendorActivity.class);
        startActivity(lucid);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Unnecessary Move");
        alertDialog.setMessage("This action is prevented and unnecessary");
        alertDialog.setIcon(R.drawable.a_alert);
        alertDialog.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ServingActivity","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ServingActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ServingActivity","onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ServingActivity","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ServingActivity","onDestroy invoked");
    }
}
