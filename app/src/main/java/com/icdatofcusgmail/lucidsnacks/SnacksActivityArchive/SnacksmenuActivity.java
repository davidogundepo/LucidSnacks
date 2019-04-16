package com.icdatofcusgmail.lucidsnacks.SnacksActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.antonionicolaspina.revealtextview.RevealTextView;
import com.icdatofcusgmail.lucidsnacks.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.MyCountlesston;
import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.ServingActivityArchive.ServingActivity;
import com.luolc.emojirain.EmojiRainLayout;
import com.muddzdev.styleabletoastlibrary.StyleableToast;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import de.hdodenhof.circleimageview.CircleImageView;

public class SnacksmenuActivity extends AppCompatActivity implements MissPublicRelation, SnackspriceFragment.OnNameSetListener, ChosensnacksFragment.OnPriceSetListener, AdapterView.OnItemClickListener {

    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_foodmenu;
    private RelativeLayout relative;
    public static TextView textView, textView2nd, textView3rd, textView4th, textView5th, textView6th, textView7th, textView8th, textView9th, textView10th;
    Button button, button2, button3, button4, button5, button6;
    static Button Pcount, Purchase;
    ListView ShowForThis;
    TextView WelcomeSweet, fullUsername, Lucid, EmailAddress;
    TextView NoOfPlates;
    TextView Sex, UserProfileName, UserProfileAccountBalance, UserProfileStarLevel, Department, Level, LastSeen, UserProfileSex;
    ImageView UserProfileImage;
    TextView HiICalculate;
    private ImageView AnimatedImageView;
    CircleImageView circleImageView;
    public static int out = 0;

    public static String playtcount = "";
    public static String stringplayti = "Buying all in a plate";
    String stringplaytii = "Buying all in two plates";
    String stringplaytiii = "Buying all in three plates";
    String stringplaytiv = "Buying all in four plates";
    String stringplaytv = "Buying all in five plates";
    String stringplaytvi = "Buying all in six plates";
    String stringplaytvii = "Buying all in seven plates";
    String stringplaytviii = "Buying all in eight plates";
    String stringplaytix = "Buying all in nine plates";
    String stringplaytx = "Buying all in ten plates";
    String stringplaytxi = "Buying all in oneone plates";
    String stringplaytxii = "Buying all in onetwo plates";
    String stringplaytxiii = "Buying all in onethree plates";
    String stringplaytxiv = "Buying all in onefour plates";
    String stringplaytxv = "Buying all in onefive plates";
    String stringplaytxvi = "Buying all in onesix plates";
    String stringplaytxvii = "Buying all in oneseven plates";
    String stringplaytxviii = "Buying all in oneeight plates";
    String stringplaytxix = "Buying all in onenine plates";
    String stringplaytxx = "Buying all in oneten plates";
    String stringplaytxxi = "Buying all in twoone plates";
    String stringplaytxxii = "Buying all in twotwo plates";
    String stringplaytxxiii = "Buying all in twothree plates";
    String stringplaytxxiv = "Buying all in twofour plates";
    String stringplaytxxv = "Buying all in twofive plates";
    String stringplaytxxvi = "Buying all in twosix plates";
    String stringplaytxxvii = "Buying all in twoseven plates";
    String stringplaytxxviii = "Buying all in twoeight plates";
    String stringplaytxxix = "Buying all in twonine plates";
    String stringplaytxxx = "Buying all in twoten plates";

    String SnackAOneBeta, SnackAOne, SnackATwo, NoOfSnackA;
    String SnackBOneBeta, SnackBOne, SnackBTwo, NoOfSnackB;
    String SnackCOneBeta, SnackCOne, SnackCTwo, NoOfSnackC;
    String SnackDOneBeta, SnackDOne, SnackDTwo, NoOfSnackD;
    String SnackEOneBeta, SnackEOne, SnackETwo, NoOfSnackE;
    String SnackFOneBeta, SnackFOne, SnackFTwo, NoOfSnackF;
    String SnackGOneBeta, SnackGOne, SnackGTwo, NoOfSnackG;
    String SnackHOneBeta, SnackHOne, SnackHTwo, NoOfSnackH;
    String SnackIOneBeta, SnackIOne, SnackITwo, NoOfSnackI;
    String SnackJOneBeta, SnackJOne, SnackJTwo, NoOfSnackJ;


    LucidApplication app;

    String update_balance = "http://128.0.1.2/my_accountbalance_diff.php";
    String insert_bought_snacksitems = "http://128.0.1.2/my_lucidsnacks_transaction_success.php";
    String webmail_snackstranc_details = "http://128.0.1.2/my_lucidsnacks_webmail_transaction_details.php";

    AlertDialog.Builder Dweezy;

    AlertDialog.Builder Lenient;
    Dialog Adamu;

    EmojiRainLayout faith;


    private enum OperationAnimation {
        BEGIN, ADJOURN
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacksmenu);

        app = LucidApplication.getInstance();

        Dweezy = new AlertDialog.Builder(SnacksmenuActivity.this);

        playtcount = stringplayti;
        ShowForThis = findViewById(R.id.listView);
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        textView = (Button) findViewById(R.id.Istchosenbutton);
        textView2nd = (Button) findViewById(R.id.Secondchosenbutton);
        textView3rd = (Button) findViewById(R.id.Thirdchosenbutton);
        textView4th = (Button) findViewById(R.id.Fourthchosenbutton);
        textView5th = (Button) findViewById(R.id.Fifthchosenbutton);
        textView6th = (Button) findViewById(R.id.Sixthchosenbutton);
        textView7th = (Button) findViewById(R.id.Seventhchosenbutton);
        textView8th = (Button) findViewById(R.id.Eightchosenbutton);
        textView9th = (Button) findViewById(R.id.Ninthchosenbutton);
        textView10th = (Button) findViewById(R.id.Tenthchosenbutton);

        NoOfPlates = findViewById(R.id.CountMyPlate);

        Sex = findViewById(R.id.sex);

        WelcomeSweet = findViewById(R.id.UserWelcome);
        fullUsername = findViewById(R.id.fullUsername);
        EmailAddress = findViewById(R.id.emailAddress);
        Lucid = (RevealTextView) findViewById(R.id.AppName);
        Typeface blackface = Typeface.createFromAsset(getAssets(), "customfont/buttonfor.otf");
        Lucid.setTypeface(blackface);

        button = findViewById(R.id.Istpricebutton);
        button2 = findViewById(R.id.Secondpricebutton);
        button3 = findViewById(R.id.Thirdpricebutton);
        button4 = findViewById(R.id.Fourthpricebutton);
        button5 = findViewById(R.id.Fifthpricebutton);
      //  button6 = (Button) findViewById(R.id.Sixthpricebutton);

        Pcount = findViewById(R.id.button);

        Purchase = findViewById(R.id.button20000);

        AnimatedImageView = findViewById(R.id.animatedImages);

        circleImageView = findViewById(R.id.ServerImage);
        final Bundle bundle = getIntent().getExtras();
        getUserAppearance(bundle.getString("image"));

        if (!textView.isShown() && !textView2nd.isShown() && !textView3rd.isShown()
                && !textView4th.isShown() && !textView5th.isShown() && !textView6th.isShown()
                && !textView7th.isShown() && !textView8th.isShown() && !textView9th.isShown()
                && !textView10th.isShown()) {
            //Pcount.setEnabled(false);
            Purchase.setEnabled(false);
        }

        Bundle FirstParcel = getIntent().getExtras();
        try {
            WelcomeSweet.setText("Welcome,  " + FirstParcel.getString("king") + "");
        } catch (Exception ignored) {

        }

        Bundle SecondParcel = getIntent().getExtras();
        try {
            fullUsername.setText("" + SecondParcel.getString("kingDavid") + "");
        } catch (Exception ignored) {

        }

        Bundle ThirdParcel = getIntent().getExtras();
        try {
            EmailAddress.setText("" + ThirdParcel.getString("email") + "");
        } catch (Exception ignored) {

        }

        HiICalculate = findViewById(R.id.counter);
        HiICalculate.setText("Hey " + FirstParcel.getString("king") + "\nI Calculate");


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        relative = findViewById(R.id.activity_Snacksmenu);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }
        toolbar_foodmenu = findViewById(R.id.ToolbarsnacksmenuActivity);
        setSupportActionBar(toolbar_foodmenu);

        try {
            getSupportActionBar().setTitle("");
        }catch (NullPointerException ignored) {

        }

    }


    private void getUserAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("professor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mr")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("engineer")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mrs")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("miss")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(circleImageView, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

    }

    public void ConfirmMyPurchase(View v) {

        Bundle FirstParcel = getIntent().getExtras();

        if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#B71C1C")) {
            AlertDialog.Builder notExactly = new AlertDialog.Builder(SnacksmenuActivity.this);
            notExactly.setTitle("Ummmm....it seems you've kinda exceeded your accountbalance.");
            notExactly.setMessage("\nIt's alright " + FirstParcel.getString("king") +  ", we could do away with few stuffs.");
            notExactly.setPositiveButton("I'm Sorry Fam", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notExactly.create().show();
        } else if (ChosenplateCounter.feetag.getCurrentTextColor() == Color.parseColor("#303F9F")) {
            AlertDialog.Builder notBeyond = new AlertDialog.Builder(SnacksmenuActivity.this);
            notBeyond.setTitle("Ummmm....Your Purchase really can't be equal with your Balance");
            notBeyond.setMessage("\nLet's try do away with something aiit?");
            notBeyond.setPositiveButton("Aiit", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            notBeyond.create().show();
        } else {
            final AlertDialog.Builder builder = new AlertDialog.Builder(SnacksmenuActivity.this);

            Bundle IRTBD = getIntent().getExtras();
            builder.setTitle("Confirm Purchase " + IRTBD.getString("king") + "");

            builder.setMessage("The snack(s) you selected will be bought by clicking \n\n'Buy'");
            builder.setCancelable(false);

            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                    playtcount = stringplayti;
                    ChosenplateCounter.feetag.setText("" + app.allinsnackcounter + "");
                  //  SnacksmenuActivity.Pcount.setText("" + "PLATE COUNT" + "");
                    NoOfPlates.setText("1");

                    StyleableToast NotConfirmed = new StyleableToast(getApplicationContext(), "Transaction not Confirmed", Toast.LENGTH_SHORT).spinIcon();
                    NotConfirmed.setBackgroundColor(Color.parseColor("#FF5A5F"));
                    NotConfirmed.setTextColor(Color.WHITE);
                    NotConfirmed.show();
                }
            });
            builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    StringRequest fromJingSun = new StringRequest(Request.Method.POST, update_balance,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray jsonArray = new JSONArray(response);
                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
                                        String code = jsonObject.getString("code");

                                        Bundle FirstParcel = getIntent().getExtras();

                                        if (code.equals("Transaction Successful.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nAlright " + FirstParcel.getString("king") + " let's get you served.");
                                        }
                                        if (code.equals("Ummmm....it seems you've kinda exceeded your accountbalance.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nIt's alright " + FirstParcel.getString("king") + ", we could do away with few stuffs.");
                                            builder.setPositiveButton("Okay", null);
                                        }
                                        if (code.equals("It's crazy " + FirstParcel.getString("king") + " but you are not permitted to put exactly all your money.")) {
                                            Dweezy.setTitle(code);
                                            Dweezy.setMessage("\nLet's try do away with something aiit?");
                                            builder.setPositiveButton("Aiit", null);
                                        }

                                   //     Dweezy.setMessage(code);
                                        Dweezy.setCancelable(false);
                                        exhibitAnswer(code);
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }) {
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params = new HashMap<String, String>();
                            params.put("accountbalance_diff", ChosenplateCounter.feetag.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(fromJingSun);
                }

            }).setIcon(R.drawable.a_announcement);

            Dialog dialog = builder.create();
            try {
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.LTGRAY));
            } catch (NullPointerException ignored) {

            }
            dialog.show();

         //   myOwnPay = (TextView) view.findViewById(R.id.myPaynotYours);
        }
    }

    public void exhibitAnswer(final String code) {
        Dweezy.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (code.equals("Transaction Successful."))
                {
                    StyleableToast TranCompleted = new StyleableToast(getApplicationContext(), "Transaction Verified", Toast.LENGTH_SHORT).spinIcon();
                    TranCompleted.setBackgroundColor(Color.parseColor("#FF5A5F"));
                    TranCompleted.setTextColor(Color.WHITE);
                    TranCompleted.setIcon(R.drawable.sa_confirmpurchasetoasticon);
                    TranCompleted.show();

                    Intent intent = new Intent(getBaseContext(), ServingActivity.class);
                    intent.putExtra("Roman", playtcount);

                    Bundle dweezy = new Bundle();
                    dweezy.putString("favouritism", textView.getText().toString());
                    intent.putExtras(dweezy);

                    Bundle tobi = new Bundle();
                    tobi.putString("genius", textView2nd.getText().toString());
                    intent.putExtras(tobi);

                    Bundle emmanuel = new Bundle();
                    emmanuel.putString("generous", textView3rd.getText().toString());
                    intent.putExtras(emmanuel);

                    Bundle joseph = new Bundle();
                    joseph.putString("focused", textView4th.getText().toString());
                    intent.putExtras(joseph);

                    Bundle godwin = new Bundle();
                    godwin.putString("creativebeast", textView5th.getText().toString());
                    intent.putExtras(godwin);

                    Bundle funmilayo = new Bundle();
                    funmilayo.putString("bestmom", textView6th.getText().toString());
                    intent.putExtras(funmilayo);

                    Bundle james = new Bundle();
                    james.putString("bestdad", textView7th.getText().toString());
                    intent.putExtras(james);

                    Bundle tomilola = new Bundle();
                    tomilola.putString("biggersis", textView8th.getText().toString());
                    intent.putExtras(tomilola);

                    Bundle opeyemi = new Bundle();
                    opeyemi.putString("biggestsis", textView9th.getText().toString());
                    intent.putExtras(opeyemi);

                    Bundle david = new Bundle();
                    david.putString("dhalson", textView10th.getText().toString());
                    intent.putExtras(david);


                    Bundle PrincessFiancee = new Bundle();
                    PrincessFiancee.putString("prince", WelcomeSweet.getText().toString().substring(8));
                    intent.putExtras(PrincessFiancee);

                    if (textView.getVisibility() == View.VISIBLE) {
                        stringRequestOne();
                    }
                    if (textView2nd.getVisibility() == View.VISIBLE) {
                        stringRequestTwo();
                    }
                    if (textView3rd.getVisibility() == View.VISIBLE) {
                        stringRequestThree();
                    }
                    if (textView4th.getVisibility() == View.VISIBLE) {
                        stringRequestFour();
                    }
                    if (textView5th.getVisibility() == View.VISIBLE) {
                        stringRequestFive();
                    }
                    if (textView6th.getVisibility() == View.VISIBLE) {
                        stringRequestSix();
                    }
                    if (textView7th.getVisibility() == View.VISIBLE) {
                        stringRequestSeven();
                    }
                    if (textView8th.getVisibility() == View.VISIBLE) {
                        stringRequestEight();
                    }
                    if (textView9th.getVisibility() == View.VISIBLE) {
                        stringRequestNine();
                    }
                    if (textView10th.getVisibility() == View.VISIBLE) {
                        stringRequestTen();
                    }


//                    StringRequest stringRequest = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
//                            new Response.Listener<String>() {
//                                @Override
//                                public void onResponse(String response) {
//                                    try {
//                                        JSONArray jsonArray = new JSONArray(response);
//                                        JSONObject jsonObject = jsonArray.getJSONObject(0);
//
//                                        String code = jsonObject.getString("tranc_success");
//
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
//
//                                }
//                            }, new Response.ErrorListener() {
//                        @Override
//                        public void onErrorResponse(VolleyError error) {
//
//                        }
//                    }) {
//                        @Override
//                        protected Map<String, String> getParams() throws AuthFailureError
//                        {
//
//                            String[] snacksNames = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null
//
//                            };
//
//                            String[] snacksPrices = {
//                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
//                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
//                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
//                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
//                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
//                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
//                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
//                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
//                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
//                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null
//
//                            };
//
//                            Map<String, String> params = new HashMap<String, String>();
//                            for (String Names : snacksNames) {
//                                if (!(Names == null))
//                                    params.put("snacks_names", Arrays.toString(snacksNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            for (String Prices : snacksPrices) {
//                                if (!(Prices == null))
//                                    params.put("snacks_prices", Arrays.toString(snacksPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
//                            }
//                            params.put("buyer_name", fullUsername.getText().toString());
//                            params.put("no_plates", NoOfPlates.getText().toString());
//                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
//                            params.put("vendor_id", app.Idtext.getText().toString());
//
//                            return params;
//                        }
//                    };
//
//                    MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequest);


                    StringRequest LandMarkUniversity = new StringRequest(Request.Method.POST, webmail_snackstranc_details,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONArray johnson = new JSONArray(response);
                                        JSONObject james = johnson.getJSONObject(0);

                                        String code = james.getString("");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {

                            String[] webmail_SnacksNames = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6) : null

                            };

                            String[] webmail_SnacksPrices = {
                                    textView.isShown() ? textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" ")) : null,
                                    textView2nd.isShown() ? textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" ")) : null,
                                    textView3rd.isShown() ? textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" ")) : null,
                                    textView4th.isShown() ? textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" ")) : null,
                                    textView5th.isShown() ? textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" ")) : null,
                                    textView6th.isShown() ? textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" ")) : null,
                                    textView7th.isShown() ? textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" ")) : null,
                                    textView8th.isShown() ? textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" ")) : null,
                                    textView9th.isShown() ? textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" ")) : null,
                                    textView10th.isShown() ? textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" ")) : null

                            };

                            Map<String, String> params = new HashMap<String, String>();
                            for (String Names : webmail_SnacksNames) {
                                if (!(Names == null))
                                    params.put("snacks_names", Arrays.toString(webmail_SnacksNames).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            for (String Prices : webmail_SnacksPrices) {
                                if (!(Prices == null))
                                    params.put("snacks_prices", Arrays.toString(webmail_SnacksPrices).replace(" ","").replace("null,", "").replace("null", "").replace(",","\n").replace("[","").replace("]",""));
                            }
                            params.put("no_plates", NoOfPlates.getText().toString());
                            params.put("total_price", ChosenplateCounter.feetag.getText().toString());
                            params.put("vendor_name", app.Nametext.getText().toString());
                            params.put("email", EmailAddress.getText().toString());
                            params.put("sex", Sex.getText().toString());
                            params.put("accountbalance", ChosenplateCounter.feetag.getText().toString());

                            return params;
                        }
                    };
                    MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(LandMarkUniversity);
                    LandMarkUniversity.setRetryPolicy(new DefaultRetryPolicy(
                            DefaultRetryPolicy.DEFAULT_TIMEOUT_MS,
                            0, // maxNumRetries =0 means no retry
                            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                    ));


                    startActivity(intent);
                }
            }
        });
        AlertDialog alertDialog = Dweezy.create();
        alertDialog.show();
    }



    public void stringRequestOne() {


            StringRequest stringRequestOne = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView.getText().toString().equals("80 NAIRA C. BREAD")) {

                        paramsOne.put("snacks_names", "C.BREAD");
                        paramsOne.put("snacks_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackAOneBeta  = textView.getText().toString().substring(textView.getText().toString().indexOf("NAIRA")+6);
                        SnackAOne = SnackAOneBeta.substring(SnackAOneBeta.indexOf(""), SnackAOneBeta.indexOf("("));
                        SnackATwo = textView.getText().toString().substring(textView.getText().toString().indexOf(""), textView.getText().toString().indexOf(" "));

                        NoOfSnackA = SnackAOneBeta.substring(SnackAOneBeta.indexOf("(")+1,SnackAOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackAOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackATwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackA);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestOne);

    }

    public void stringRequestTwo() {


            StringRequest stringRequestTwo = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView2nd.getText().toString().equals("80 NAIRA DOUGHNUT")) {

                        paramsOne.put("snacks_names", "DOUGHNUT");
                        paramsOne.put("snacks_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackBOneBeta  = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf("NAIRA")+6);
                        SnackBOne = SnackBOneBeta.substring(SnackBOneBeta.indexOf(""), SnackBOneBeta.indexOf("("));
                        SnackBTwo = textView2nd.getText().toString().substring(textView2nd.getText().toString().indexOf(""), textView2nd.getText().toString().indexOf(" "));

                        NoOfSnackB = SnackBOneBeta.substring(SnackBOneBeta.indexOf("(")+1,SnackBOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackBOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackBTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackB);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestTwo);

    }

    public void stringRequestThree() {


            StringRequest stringRequestThree = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView3rd.getText().toString().equals("120 NAIRA MEATPIE")) {

                        paramsOne.put("snacks_names", "MEATPIE");
                        paramsOne.put("snacks_prices", "120");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackCOneBeta  = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf("NAIRA")+6);
                        SnackCOne = SnackCOneBeta.substring(SnackCOneBeta.indexOf(""), SnackCOneBeta.indexOf("("));
                        SnackCTwo = textView3rd.getText().toString().substring(textView3rd.getText().toString().indexOf(""), textView3rd.getText().toString().indexOf(" "));

                        NoOfSnackC = SnackCOneBeta.substring(SnackCOneBeta.indexOf("(")+1,SnackCOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackCOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackCTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackC);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestThree);

    }

    public void stringRequestFour() {


            StringRequest stringRequestFour = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView4th.getText().toString().equals("100 NAIRA SAUSAGE")) {

                        paramsOne.put("snacks_names", "SAUSAGE");
                        paramsOne.put("snacks_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackDOneBeta  = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf("NAIRA")+6);
                        SnackDOne = SnackDOneBeta.substring(SnackDOneBeta.indexOf(""), SnackDOneBeta.indexOf("("));
                        SnackDTwo = textView4th.getText().toString().substring(textView4th.getText().toString().indexOf(""), textView4th.getText().toString().indexOf(" "));

                        NoOfSnackD = SnackDOneBeta.substring(SnackDOneBeta.indexOf("(")+1,SnackDOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackDOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackDTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackD);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestFour);

    }

    public void stringRequestFive() {

            StringRequest stringRequestFive = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView5th.getText().toString().equals("80 NAIRA EGG ROLL")) {

                        paramsOne.put("snacks_names", "EGGROLL");
                        paramsOne.put("snacks_prices", "80");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackEOneBeta  = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf("NAIRA")+6);
                        SnackEOne = SnackEOneBeta.substring(SnackEOneBeta.indexOf(""), SnackEOneBeta.indexOf("("));
                        SnackETwo = textView5th.getText().toString().substring(textView5th.getText().toString().indexOf(""), textView5th.getText().toString().indexOf(" "));

                        NoOfSnackE = SnackEOneBeta.substring(SnackEOneBeta.indexOf("(")+1,SnackEOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackEOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackETwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackE);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestFive);

    }

    public void stringRequestSix() {


            StringRequest stringRequestSix = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView6th.getText().toString().equals("150 NAIRA FISH ROLL")) {

                        paramsOne.put("snacks_names", "FISHROLL");
                        paramsOne.put("snacks_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackFOneBeta  = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf("NAIRA")+6);
                        SnackFOne = SnackFOneBeta.substring(SnackFOneBeta.indexOf(""), SnackFOneBeta.indexOf("("));
                        SnackFTwo = textView6th.getText().toString().substring(textView6th.getText().toString().indexOf(""), textView6th.getText().toString().indexOf(" "));

                        NoOfSnackF = SnackFOneBeta.substring(SnackFOneBeta.indexOf("(")+1,SnackFOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackFOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackFTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackF);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestSix);

    }

    public void stringRequestSeven() {


            StringRequest stringRequestSeven = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView7th.getText().toString().equals("150 NAIRA C. SAVANNA")) {

                        paramsOne.put("snacks_names", "C.SAVANNA");
                        paramsOne.put("snacks_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackGOneBeta  = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf("NAIRA")+6);
                        SnackGOne = SnackGOneBeta.substring(SnackGOneBeta.indexOf(""), SnackGOneBeta.indexOf("("));
                        SnackGTwo = textView7th.getText().toString().substring(textView7th.getText().toString().indexOf(""), textView7th.getText().toString().indexOf(" "));

                        NoOfSnackG = SnackGOneBeta.substring(SnackGOneBeta.indexOf("(")+1,SnackGOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackGOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackGTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackG);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestSeven);

    }

    public void stringRequestEight() {

            StringRequest stringRequestEight = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView8th.getText().toString().equals("100 NAIRA P. SAVANNA")) {

                        paramsOne.put("snacks_names", "P.SAVANNA");
                        paramsOne.put("snacks_prices", "100");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackHOneBeta  = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf("NAIRA")+6);
                        SnackHOne = SnackHOneBeta.substring(SnackHOneBeta.indexOf(""), SnackHOneBeta.indexOf("("));
                        SnackHTwo = textView8th.getText().toString().substring(textView8th.getText().toString().indexOf(""), textView8th.getText().toString().indexOf(" "));

                        NoOfSnackH = SnackHOneBeta.substring(SnackHOneBeta.indexOf("(")+1,SnackHOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackHOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackHTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackH);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestEight);

    }

    public void stringRequestNine() {

            StringRequest stringRequestNine = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView9th.getText().toString().equals("150 NAIRA C. SEVENUP")) {

                        paramsOne.put("snacks_names", "C.SEVENUP");
                        paramsOne.put("snacks_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackIOneBeta  = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf("NAIRA")+6);
                        SnackIOne = SnackIOneBeta.substring(SnackIOneBeta.indexOf(""), SnackIOneBeta.indexOf("("));
                        SnackITwo = textView9th.getText().toString().substring(textView9th.getText().toString().indexOf(""), textView9th.getText().toString().indexOf(" "));

                        NoOfSnackI = SnackIOneBeta.substring(SnackIOneBeta.indexOf("(")+1,SnackIOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackIOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackITwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackI);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestNine);

    }

    public void stringRequestTen() {


            StringRequest stringRequestTen = new StringRequest(Request.Method.POST, insert_bought_snacksitems,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONArray jsonArray = new JSONArray(response);
                                JSONObject jsonObject = jsonArray.getJSONObject(0);

                                String code = jsonObject.getString("tranc_success");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> paramsOne = new HashMap<>();

                    if (textView10th.getText().toString().equals("150 NAIRA C. MIRINDA")) {

                        paramsOne.put("snacks_names", "C.MIRINDA");
                        paramsOne.put("snacks_prices", "150");
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfPlates.getText().toString());
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());
                    }
                    else {

                        SnackJOneBeta  = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf("NAIRA")+6);
                        SnackJOne = SnackJOneBeta.substring(SnackJOneBeta.indexOf(""), SnackJOneBeta.indexOf("("));
                        SnackJTwo = textView10th.getText().toString().substring(textView10th.getText().toString().indexOf(""), textView10th.getText().toString().indexOf(" "));

                        NoOfSnackJ = SnackJOneBeta.substring(SnackJOneBeta.indexOf("(")+1,SnackJOneBeta.indexOf(")"));

                        paramsOne.put("snacks_names", SnackJOne.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("snacks_prices", SnackJTwo.replace(" ", "").replace("null,", "").replace("null", "").replace(",", "\n").replace("[", "").replace("]", ""));
                        paramsOne.put("buyer_name", fullUsername.getText().toString());
                        paramsOne.put("no_plates", NoOfSnackJ);
                        paramsOne.put("total_price", ChosenplateCounter.feetag.getText().toString());
                        paramsOne.put("vendor_id", app.Idtext.getText().toString());

                    }
                    return paramsOne;
                }
            };
            MyCountlesston.getmInstance(SnacksmenuActivity.this).addToRequestQueue(stringRequestTen);

    }





    @Override
    public void respond(int ant) {
        FragmentManager manager = getFragmentManager();

        SnackspriceFragment fpf = (SnackspriceFragment) manager.findFragmentById(R.id.Fragmentsnackprice);
        fpf.Datachange(ant);
    }

    @Override
    public void setName(String name) {
        ChosensnacksFragment cff = (ChosensnacksFragment) getFragmentManager().findFragmentById(R.id.FragmentChosensnack);
        cff.updateInfo(name);

        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updateInfo(name);

        Pcount.setEnabled(true);
        Purchase.setEnabled(true);
    }

    @Override
    public void setPrice(String price) {
        ChosenplateCounter cpc = (ChosenplateCounter) getFragmentManager().findFragmentById(R.id.FragmentCounter);
        cpc.updatePrice(price);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.snacksactivityappbarmain, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.check_balance:
                break;

            case R.id.log_out:
                break;
        }
        return false;
    }

    public void checkMyBalance(MenuItem item) {
        Bundle myMoney = getIntent().getExtras();
        myMoney.getString("");
        Snackbar CheckMyMoney = Snackbar.make(relative, "Your balance is: " + myMoney.getString("accountbalance"), Snackbar.LENGTH_LONG);
        View ColourfulMoney = CheckMyMoney.getView();
        ColourfulMoney.setBackgroundColor(ContextCompat.getColor(this, R.color.colorSnqck));
        CheckMyMoney.setActionTextColor(Color.GREEN);
        CheckMyMoney.show();
    }

    public void AlrightImOff(MenuItem item) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Oyedepo = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    public void maxPlateCount(View view) {

        out = Integer.parseInt(String.valueOf(app.allinsnackcounter));

        final AlertDialog.Builder builder = new AlertDialog.Builder(SnacksmenuActivity.this);

        try { final String[] whiteRing = app.Diamond;
            builder.setItems(whiteRing, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (which == 0) {
                        Pcount.setText("" + "PLATE COUNT" + "");
                        NoOfPlates.setText("1");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in a plate", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(out) + "");
                        playtcount = stringplayti;
                    }
                    if (which == 1) {
                        Pcount.setText("PLATE COUNT\n(2)");
                        NoOfPlates.setText("2");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in two diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(2 * out ) + "");
                        playtcount = stringplaytii;
                    }
                    if (which == 2) {
                        Pcount.setText("PLATE COUNT\n(3)");
                        NoOfPlates.setText("3");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in three diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(3 * out ) + "");
                        playtcount = stringplaytiii;
                    }
                    if (which == 3) {
                        Pcount.setText("PLATE COUNT\n(4)");
                        NoOfPlates.setText("4");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in four diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(4 * out ) + "");
                        playtcount = stringplaytiv;
                    }
                    if (which == 4) {
                        Pcount.setText("PLATE COUNT\n(5)");
                        NoOfPlates.setText("5");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in five diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(5 * out ) + "");
                        playtcount = stringplaytv;
                    }
                    if (which == 5) {
                        Pcount.setText("PLATE COUNT\n(6)");
                        NoOfPlates.setText("6");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in six diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(6 * out ) + "");
                        playtcount = stringplaytvi;
                    }
                    if (which == 6) {
                        Pcount.setText("PLATE COUNT\n(7)");
                        NoOfPlates.setText("7");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(7 * out ) + "");
                        playtcount = stringplaytvii;
                    }
                    if (which == 7) {
                        Pcount.setText("PLATE COUNT\n(8)");
                        NoOfPlates.setText("8");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(8 * out ) + "");
                        playtcount = stringplaytviii;
                    }
                    if (which == 8) {
                        Pcount.setText("PLATE COUNT\n(9)");
                        NoOfPlates.setText("9");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(9 * out ) + "");
                        playtcount = stringplaytix;
                    }
                    if (which == 9) {
                        Pcount.setText("PLATE COUNT\n(10)");
                        NoOfPlates.setText("" + "10" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in ten diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(10 * out ) + "");
                        playtcount = stringplaytx;
                    }
                    if (which == 10) {
                        Pcount.setText("PLATE COUNT\n(11)");
                        NoOfPlates.setText("" + "11" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eleven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(11 * out ) + "");
                        playtcount = stringplaytxi;
                    }
                    if (which == 11) {
                        Pcount.setText("PLATE COUNT\n(12)");
                        NoOfPlates.setText("" + "12" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twelve diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(12 * out ) + "");
                        playtcount = stringplaytxii;
                    }
                    if (which == 12) {
                        Pcount.setText("PLATE COUNT\n(13)");
                        NoOfPlates.setText("" + "13" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(13 * out ) + "");
                        playtcount = stringplaytxiii;
                    }
                    if (which == 13) {
                        Pcount.setText("PLATE COUNT\n(14)");
                        NoOfPlates.setText("" + "14" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fourteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(14 * out ) + "");
                        playtcount = stringplaytxiv;
                    }
                    if (which == 14) {
                        Pcount.setText("PLATE COUNT\n(15)");
                        NoOfPlates.setText("" + "15" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in fifteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(15 * out ) + "");
                        playtcount = stringplaytxv;
                    }
                    if (which == 15) {
                        Pcount.setText("PLATE COUNT\n(16)");
                        NoOfPlates.setText("" + "16" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in sixteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(16 * out ) + "");
                        playtcount = stringplaytxvi;
                    }
                    if (which == 16) {
                        Pcount.setText("PLATE COUNT\n(17)");
                        NoOfPlates.setText("" + "17" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in seventeen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(17 * out ) + "");
                        playtcount = stringplaytxvii;
                    }
                    if (which == 17) {
                        Pcount.setText("PLATE COUNT\n(18)");
                        NoOfPlates.setText("" + "18" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in eighteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(18 * out ) + "");
                        playtcount = stringplaytxviii;
                    }
                    if (which == 18) {
                        Pcount.setText("PLATE COUNT\n(19)");
                        NoOfPlates.setText("" + "19" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in nineteen diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(19 * out ) + "");
                        playtcount = stringplaytxix;
                    }
                    if (which == 19) {
                        Pcount.setText("PLATE COUNT\n(20)");
                        NoOfPlates.setText("" + "20" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twenty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(20 * out ) + "");
                        playtcount = stringplaytxx;
                    }
                    if (which == 20) {
                        Pcount.setText("PLATE COUNT\n(21)");
                        NoOfPlates.setText("" + "21" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyone diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(21 * out ) + "");
                        playtcount = stringplaytxxi;
                    }
                    if (which == 21) {
                        Pcount.setText("PLATE COUNT\n(22)");
                        NoOfPlates.setText("" + "22" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentytwo diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(22 * out ) + "");
                        playtcount = stringplaytxxii;
                    }
                    if (which == 22) {
                        Pcount.setText("PLATE COUNT\n(23)");
                        NoOfPlates.setText("" + "23" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentythree diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(23 * out ) + "");
                        playtcount = stringplaytxxiii;
                    }
                    if (which == 23) {
                        Pcount.setText("PLATE COUNT\n(24)");
                        NoOfPlates.setText("" + "24" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfour diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(24 * out ) + "");
                        playtcount = stringplaytxxiv;
                    }
                    if (which == 24) {
                        Pcount.setText("PLATE COUNT\n(25)");
                        NoOfPlates.setText("" + "25" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyfive diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(25 * out ) + "");
                        playtcount = stringplaytxxv;
                    }
                    if (which == 25) {
                        Pcount.setText("PLATE COUNT\n(26)");
                        NoOfPlates.setText("" + "26" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentysix diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(26 * out ) + "");
                        playtcount = stringplaytxxvi;
                    }
                    if (which == 26) {
                        Pcount.setText("PLATE COUNT\n(27)");
                        NoOfPlates.setText("" + "27" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyseven diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(27 * out ) + "");
                        playtcount = stringplaytxxvii;
                    }
                    if (which == 27) {
                        Pcount.setText("PLATE COUNT\n(28)");
                        NoOfPlates.setText("" + "28" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentyeight diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(28 * out ) + "");
                        playtcount = stringplaytxxviii;
                    }
                    if (which == 28) {
                        Pcount.setText("PLATE COUNT\n(29)");
                        NoOfPlates.setText("" + "29" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in twentynine diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(29 * out ) + "");
                        playtcount = stringplaytxxix;
                    }
                    if (which == 29) {
                        Pcount.setText("PLATE COUNT\n(30)");
                        NoOfPlates.setText("" + "30" + "");
                        StyleableToast CheckMyMoney = new StyleableToast(getApplicationContext(), "You are buying all in thirty diff plates", Toast.LENGTH_SHORT).spinIcon();
                        CheckMyMoney.setBackgroundColor(Color.parseColor("#FF5A5F"));
                        CheckMyMoney.setTextColor(Color.WHITE);
                        CheckMyMoney.show();
                        ChosenplateCounter.feetag.setText("" + Integer.toString(30 * out ) + "");
                        playtcount = stringplaytxxx;
                    }
                }
            });
        }
        catch (NullPointerException ignored) {

        }
        builder.setCancelable(true);
        Dialog dialog = builder.create();
        dialog.show();
    }

    public void autoBio(View view) {


        LayoutInflater inflater = SnacksmenuActivity.this.getLayoutInflater();
        view = inflater.inflate(R.layout.sa_userprof_background, null);



        Lenient = new AlertDialog.Builder(SnacksmenuActivity.this);
        Lenient.setView(view);

        Department = view.findViewById(R.id.department);
        UserProfileAccountBalance = view.findViewById(R.id.userProfileAccountBalance);
        UserProfileName = view.findViewById(R.id.userProfileName);
        UserProfileStarLevel = view.findViewById(R.id.userProfileStarLevel);
        UserProfileSex = view.findViewById(R.id.userProfileSex);
        UserProfileImage = view.findViewById(R.id.userProfileImage);
        Level = view.findViewById(R.id.level);
        LastSeen = view.findViewById(R.id.lastSeen);

        final Bundle lenient = getIntent().getExtras();
        getUserProfileAppearance(lenient.getString("image"));


        Bundle ForthParcel = getIntent().getExtras();
        try {
            Department.setText("" + ForthParcel.getString("department") + "");
        } catch (Exception ignored) {

        }

        Bundle FifthParcel = getIntent().getExtras();
        try {
            Level.setText("" + FifthParcel.getString("level") + "");
        } catch (Exception ignored) {

        }

        Bundle SixthParcel = getIntent().getExtras();
        try {
            UserProfileAccountBalance.setText("" + SixthParcel.getString("accountbalance") + "");
        } catch (Exception ignored) {

        }

        Bundle SeventhParcel = getIntent().getExtras();
        try {
            UserProfileSex.setText("" + SeventhParcel.getString("sex") + "");
        } catch (Exception ignored) {

        }

        Bundle EightParcel = getIntent().getExtras();
        String myBirthtime = EightParcel.getString("time");
        final String justMonthNDate = myBirthtime;
        final String isToday = justMonthNDate != null ? justMonthNDate.substring(justMonthNDate.indexOf("- ") + 2) : null;


        Bundle NinthParcel = getIntent().getExtras();
        try {
            LastSeen.setText("" + NinthParcel.getString("last_seen_accept") + "");
        } catch (Exception ignored) {

        }

        Bundle TenthParcel = getIntent().getExtras();
        TenthParcel.getString("d_n_m");
        String myBirthday = TenthParcel.getString("d_n_m");

        Bundle EleventhParcel = getIntent().getExtras();
        if (Objects.equals(myBirthday, isToday)) {

            faith = (EmojiRainLayout) view;


            faith.addEmoji(R.drawable.c_happy_h);
            faith.addEmoji(R.drawable.c_happy_a);
            faith.addEmoji(R.drawable.c_happy_p);
            faith.addEmoji(R.drawable.c_happy_p_two);
            faith.addEmoji(R.drawable.c_happy_y);

            faith.addEmoji(R.drawable.c_happy_b);
            faith.addEmoji(R.drawable.c_happy_i);
            faith.addEmoji(R.drawable.c_happy_r);
            faith.addEmoji(R.drawable.c_happy_t);
            faith.addEmoji(R.drawable.c_happy_h_two);
            faith.addEmoji(R.drawable.c_happy_d);
            faith.addEmoji(R.drawable.c_happy_a_two);
            faith.addEmoji(R.drawable.c_happy_y_two);

            faith.stopDropping();
            faith.setPer(10);
            faith.setDuration(7200);
            faith.setDropDuration(4400);
            faith.setDropFrequency(500);

            faith.startDropping();

            UserProfileName.setText("Happy Birthday " + EightParcel.getString("name") + "");
            UserProfileName.setTextSize(30);

        }
        else {
            try {
                UserProfileName.setText("" + EleventhParcel.getString("name") + "");
            } catch (Exception ignored) {

            }
        }

        Adamu = Lenient.create();
        Adamu.show();
    }

    public void userProfileLayoutButton(View view) {

        Adamu.cancel();

    }

    private void getUserProfileAppearance(String url) {

        Bundle SexParcel = getIntent().getExtras();
        Sex.setText(SexParcel.getString("sex"));

        if (Sex.getText().toString().equals("female")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorgirl).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("male")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorboy).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("doctor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errordoctor).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("professor")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorprof).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mr")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("engineer")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errorengr).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("mrs")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormrs).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

        if (Sex.getText().toString().equals("miss")) {
            Picasso.with(this).load(url).placeholder(R.drawable.c_failed_userappearancesub).error(R.drawable.c_errormiss).into(UserProfileImage, new com.squareup.picasso.Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError() {

                }
            });
        }

    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        setTitle("");
        Bundle Oyedepo = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to cancel your transaction? ");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).setIcon(R.drawable.a_alert);

        Dialog dialog = alertDialog.create();
        dialog.show();
    }

    @Override
    public boolean onSupportNavigateUp() {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        Bundle Oyedepo = getIntent().getExtras();

        alertDialog.setTitle("Come on " + Oyedepo.getString("king") + "");
        alertDialog.setMessage("This action will cancel this current operation. Do you want to Cancel your transaction? ");
        alertDialog.setIcon(R.drawable.a_alert);
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.create().show();
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("FoodmenuActivity","onStart invoked");
        reverseAnime(OperationAnimation.BEGIN);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("FoodmenuActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("FoodmenuActivity", "onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("FoodmenuActivity","onStop invoked");
        reverseAnime(OperationAnimation.ADJOURN);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("FoodmenuActivity","onRestart invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("FoodmenuActivity","onDestroy invoked");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    private void reverseAnime(OperationAnimation bedCheck) {
        Drawable graphicsPad = AnimatedImageView.getDrawable();
        Animatable crazitivity = ((Animatable) graphicsPad);
        switch (bedCheck) {
            case BEGIN:
                crazitivity.start();
                break;
            case ADJOURN:
                crazitivity.stop();
                break;
        }
    }
}