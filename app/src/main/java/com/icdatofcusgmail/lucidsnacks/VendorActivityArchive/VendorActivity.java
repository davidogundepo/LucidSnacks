package com.icdatofcusgmail.lucidsnacks.VendorActivityArchive;

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.icdatofcusgmail.lucidsnacks.LoginActivityArchive.LoginActivity;
import com.icdatofcusgmail.lucidsnacks.LucidApplication;
import com.icdatofcusgmail.lucidsnacks.R;
import com.icdatofcusgmail.lucidsnacks.Vendors_LoginActivityArchive.Vendor_LoginActivity;
import com.muddzdev.styleabletoastlibrary.StyleableToast;

import java.util.ArrayList;

public class VendorActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, RadioGroup.OnCheckedChangeListener {

    SmoothCheckBox smoothy;
    public static RadioGroup radioGroup;
    public static RadioButton oneissmalljoor, twook, threeok, fourok, fiveok, sixok, sevenok, eightok, nineok, tenok, elevenok, twelveok, thirteenok, fourteenok, fifteenok, sixteenok, seventeenok, eighteenok, nineteenok, twentyok, twentyoneok, twentytwook, twentythreeok, twentyfourok, twentyfiveok, twentysixok, twentysevenok, twentyeightok, twentynineok, thirtyisenoughjoor;
    PowerManager.WakeLock wakeLock;
    Toolbar toolbar_vendor;
    VendorAdapter vendorAdapter;
    public static GridView ShowInThis;
    public static TextView itemsState, pleaseWork, itemsBeenSelected;
    Button PassDataAlso;
    final String[] snacksnames = new String[]{"Chelsea Bread", "Doughnut", "Meat Pie", "Sausage Roll", "Egg Roll", "Fish Roll"};
    int[] snacksimages = {R.drawable.c_chelsea, R.drawable.c_doughnut, R.drawable.c_meatpie, R.drawable.c_sausage, R.drawable.c_egg_roll, R.drawable.c_fish_roll};

    TextView sellerId;

    LucidApplication app;

    SharedPreferences MyOkPlatesPrefences;
    SharedPreferences.Editor MyOkPlatesEditor;

    private static final String PREF_NICK_NAME = "VendorsCall";
    private static final String ONE_KITCHEN_KEY_RECALL = "unforgettable1";
    private static final String TWO_SITTINGROOM_KEY_RECALL = "unforgettable2";
    private static final String THREE_VISITORROOM_KEY_RECALL = "unforgettable3";
    private static final String FOUR_LAUNDRYROOM_KEY_RECALL = "unforgettable4";
    private static final String FIVE_CLASSROOM_KEY_RECALL = "unforgettable5";
    private static final String SIX_BOARDROOM_KEY_RECALL = "unforgettable6";
    private static final String SEVEN_CONFERENCEROOM_KEY_RECALL = "unforgettable7";
    private static final String EIGHT_MASTERBEDROOM_KEY_RECALL = "unforgettable8";
    private static final String NINE_CHILDRENROOM_KEY_RECALL = "unforgettable9";
    private static final String TEN_GARAGEROOM_KEY_RECALL = "unforgettable10";
    private static final String ELEVEN_LECTUREROOM_KEY_RECALL = "unforgettable11";
    private static final String TWELVE_GENTROOM_KEY_RECALL = "unforgettable12";
    private static final String THIRTEEN_LADIESROOM_KEY_RECALL = "unforgettable13";
    private static final String FOURTEEN_BARROOM_KEY_RECALL = "unforgettable14";
    private static final String FIFTEEN_RICESPOT_KEY_RECALL = "unforgettable15";
    private static final String SIXTEEN_SNACKSSPOT_KEY_RECALL = "unforgettable16";
    private static final String SEVENTEEN_DRINKSPOT_KEY_RECALL = "unforgettable17";
    private static final String EIGHTEEN_POTARITOSPOT_KEY_RECALL = "unforgettable18";
    private static final String NINETEEN_TUBABASPOT_KEY_RECALL = "unforgettable19";
    private static final String TWENTY_CHINESERICESPOT_KEY_RECALL = "unforgettable20";
    private static final String TWENTYONE_AMALASPOT_KEY_RECALL = "unforgettable21";
    private static final String TWENTYTWO_FRUITSPOT_KEY_RECALL = "unforgettable22";
    private static final String TWENTYTHREE_CHAPMANSPOT_KEY_RECALL = "unforgettable23";
    private static final String TWENTYFOUR_SHOPPINGMALL_KEY_RECALL = "unforgettable24";
    private static final String TWENTYFIVE_MEDICALCENTRE_KEY_RECALL = "unforgettable25";
    private static final String TWENTYSIX_ABRAHAMHALL_KEY_RECALL = "unforgettable26";
    private static final String TWENTYSEVEN_SARAHHALL_KEY_RECALL = "unforgettable27";
    private static final String TWENTYEIGHT_JOSEPHHALL_KEY_RECALL = "unforgettable28";
    private static final String TWENTYNINE_DEBORAHHALL_KEY_RECALL = "unforgettable29";
    private static final String THIRTY_SENATEBUILDING_KEY_RECALL = "unforgettable30";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);

        Log.d("VendorActivity", "onCreate invoked");

        app = LucidApplication.getInstance();

        sellerId = findViewById(R.id.textViewId);

        try {

            sellerId.setText("Id No : " + app.Idtext.getText().toString() + "");
        } catch (Exception ignored) {

        }

        MyOkPlatesPrefences = getSharedPreferences(PREF_NICK_NAME, Context.MODE_PRIVATE);
        MyOkPlatesEditor = MyOkPlatesPrefences.edit();

        PassDataAlso = findViewById(R.id.getMeNextActivity);

        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "deprecatedmyfoot");
        wakeLock.acquire();
        WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifi.setWifiEnabled(true);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        }

        toolbar_vendor = findViewById(R.id.ToolbarVendorActivity);
        setSupportActionBar(toolbar_vendor);

        getSupportActionBar().setTitle("");

        itemsState = findViewById(R.id.itemsState);
        itemsState.setVisibility(View.INVISIBLE);

        pleaseWork = findViewById(R.id.selectedYet);
        pleaseWork.setVisibility(View.INVISIBLE);

        itemsBeenSelected = findViewById(R.id.itemsBeenSelected);
        itemsBeenSelected.setVisibility(View.INVISIBLE);

        ShowInThis = findViewById(R.id.showInThis);
        ShowInThis.setOnItemClickListener(this);

        ShowInThis.setVisibility(View.GONE);
        ShowInThis.setChoiceMode(GridView.CHOICE_MODE_MULTIPLE);
        vendorAdapter = new VendorAdapter(getApplicationContext(), getIcdats());
        ShowInThis.setAdapter(vendorAdapter);


        smoothy = findViewById(R.id.smoothie);
    }

    private ArrayList<Icdat> getIcdats() {
        ArrayList<Icdat> icdats = new ArrayList<>();
        icdats.add(new Icdat(snacksnames[0], snacksimages[0], smoothy)); // Chelsea Bread
        icdats.add(new Icdat(snacksnames[1], snacksimages[1], smoothy)); // Doughnut
        icdats.add(new Icdat(snacksnames[2], snacksimages[2], smoothy)); // Meat Pie
        icdats.add(new Icdat(snacksnames[3], snacksimages[3], smoothy)); // Sausage Roll
        icdats.add(new Icdat(snacksnames[4], snacksimages[4], smoothy)); // Egg Roll
        icdats.add(new Icdat(snacksnames[5], snacksimages[5], smoothy)); // Fish Roll
        return icdats;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Icdat icdat = getIcdats().get(position);

        if (view.getTag() instanceof VendorAdapter.ViewHolder) {
            VendorAdapter.ViewHolder holder = (VendorAdapter.ViewHolder) view.getTag();
            holder.smooth.toggle();
        }


        SmoothCheckBox checkBox = (SmoothCheckBox) view.getTag(R.id.smoothie);

        int pos = compareIndex(icdat);
        if (pos == -1){
            app.selectedsnacks.add(icdat);
        } else {
            app.selectedsnacks.remove(pos);
        }

        StyleableToast JustFooddiamonds = new StyleableToast(view.getContext(), snacksnames[position] + " " + isCheckedOrNot(checkBox), Toast.LENGTH_SHORT);
        JustFooddiamonds.setBackgroundColor(Color.parseColor("#607D8B"));
        JustFooddiamonds.setTextColor(Color.YELLOW);
        JustFooddiamonds.show();



//        String mealSelected = "Selected Snacks are:  ";
//
//        for (int me = 0; me < ShowInThis.getCount(); me++) {
//            if (ShowInThis.isItemChecked(me)) {
//                mealSelected += icdat.getSnackname() + ", ";
//            }
//
//        }
//     //   itemsBeenSelected.setVisibility(View.VISIBLE);
//        itemsBeenSelected.setText(mealSelected);
//
//        final int checkedCount = ShowInThis.getCheckedItemCount();
//
//        if (checkedCount < 2) {
//            pleaseWork.setText(checkedCount + " item Selected" + "");
//            vendorAdapter.toggleSelection(position);
//        } else if (checkedCount > 1) {
//            pleaseWork.setText(checkedCount + " items Selected" + "");
//            vendorAdapter.toggleSelection(position);
//        }
//        vendorAdapter.notifyDataSetChanged();
    }

    private int compareIndex(Icdat icdat){
        int ounje = -1;
        for(int snack = 0; snack < app.selectedsnacks.size(); snack++){
            Icdat dweezy = (Icdat) app.selectedsnacks.get(snack);
            if(dweezy.getSnackname().equals(icdat.getSnackname())){
                ounje = snack;
            }
        }
        return ounje;
    }

    private String isCheckedOrNot(SmoothCheckBox checkbox) {
        if(checkbox.isChecked())
            return "is selected";
        else
            return "is not selected";
    }

    public void OCAddorRemove(View view) {
        FragmentManager AorRmanager = getFragmentManager();
        UpdateItems reveal = new UpdateItems();
        reveal.show(AorRmanager, "UpdateItems");
    }

    public void OCDynamicPlateCount(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(VendorActivity.this);
        builder.setTitle("Choose the slightest volume of items available");
        LayoutInflater inflater = VendorActivity.this.getLayoutInflater();
        final View view = inflater.inflate(R.layout.va_dynamic_platecount, null);
        builder.setView(view);

        radioGroup = view.findViewById(R.id.radiohead);
        radioGroup.setOnCheckedChangeListener(this);

        oneissmalljoor = view.findViewById(R.id.one);
        twook = view.findViewById(R.id.two);
        threeok = view.findViewById(R.id.three);
        fourok = view.findViewById(R.id.four);
        fiveok = view.findViewById(R.id.five);
        sixok = view.findViewById(R.id.six);
        sevenok = view.findViewById(R.id.seven);
        eightok = view.findViewById(R.id.eight);
        nineok = view.findViewById(R.id.nine);
        tenok = view.findViewById(R.id.ten);
        elevenok = view.findViewById(R.id.eleven);
        twelveok = view.findViewById(R.id.twelve);
        thirteenok = view.findViewById(R.id.thirteen);
        fourteenok = view.findViewById(R.id.fourteen);
        fifteenok = view.findViewById(R.id.fifteen);
        sixteenok = view.findViewById(R.id.sixteen);
        seventeenok = view.findViewById(R.id.seventeen);
        eighteenok = view.findViewById(R.id.eighteen);
        nineteenok = view.findViewById(R.id.nineteen);
        twentyok = view.findViewById(R.id.twenty);
        twentyoneok = view.findViewById(R.id.twentyone);
        twentytwook = view.findViewById(R.id.twentytwo);
        twentythreeok = view.findViewById(R.id.twentythree);
        twentyfourok = view.findViewById(R.id.twentyfour);
        twentyfiveok = view.findViewById(R.id.twentyfive);
        twentysixok = view.findViewById(R.id.twentysix);
        twentysevenok = view.findViewById(R.id.twentyseven);
        twentyeightok = view.findViewById(R.id.twentyeight);
        twentynineok = view.findViewById(R.id.twentynine);
        thirtyisenoughjoor = view.findViewById(R.id.thirty);

        if (MyOkPlatesPrefences.getBoolean(ONE_KITCHEN_KEY_RECALL, false))
            oneissmalljoor.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWO_SITTINGROOM_KEY_RECALL, false))
            twook.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THREE_VISITORROOM_KEY_RECALL, false))
            threeok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, false))
            fourok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FIVE_CLASSROOM_KEY_RECALL, false))
            fiveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SIX_BOARDROOM_KEY_RECALL, false))
            sixok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, false))
            sevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, false))
            eightok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(NINE_CHILDRENROOM_KEY_RECALL, false))
            nineok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TEN_GARAGEROOM_KEY_RECALL, false))
            tenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, false))
            elevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWELVE_GENTROOM_KEY_RECALL, false))
            twelveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, false))
            thirteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FOURTEEN_BARROOM_KEY_RECALL, false))
            fourteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(FIFTEEN_RICESPOT_KEY_RECALL, false))
            fifteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SIXTEEN_SNACKSSPOT_KEY_RECALL, false))
            sixteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, false))
            seventeenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, false))
            eighteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, false))
            nineteenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, false))
            twentyok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, false))
            twentyoneok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, false))
            twentytwook.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, false))
            twentythreeok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, false))
            twentyfourok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, false))
            twentyfiveok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, false))
            twentysixok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, false))
            twentysevenok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, false))
            twentyeightok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, false))
            twentynineok.setChecked(true);
        else if (MyOkPlatesPrefences.getBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, false))
            thirtyisenoughjoor.setChecked(true);

        builder.setPositiveButton(R.string.okay, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                if (oneissmalljoor.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.OnePlatenumber);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    //  Engr. Adeleke contributed to the purchase of the prototype device I work on
                    StyleableToast EngrAdeleke = new StyleableToast(getApplicationContext(), "One Plate per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    EngrAdeleke.setBackgroundColor(Color.parseColor("#607D8B"));
                    EngrAdeleke.setTextColor(Color.YELLOW);
                    EngrAdeleke.show();
                }
                else if (twook.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwoPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Dr. Agbede, contributed to the purchase of my device
                    StyleableToast SamuelAgbede = new StyleableToast(getApplicationContext(), "Two plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    SamuelAgbede.setBackgroundColor(Color.parseColor("#607D8B"));
                    SamuelAgbede.setTextColor(Color.YELLOW);
                    SamuelAgbede.show();
                }
                else if (threeok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThreePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Joshua Akinola contributed to the purchase of my screen
                    StyleableToast ControlT = new StyleableToast(getApplicationContext(), "Three plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    ControlT.setBackgroundColor(Color.parseColor("#607D8B"));
                    ControlT.setTextColor(Color.YELLOW);
                    ControlT.show();
                }
                else if (fourok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FourPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Tobi contributed to the purchase of my screen
                    StyleableToast OlamijuloTobi = new StyleableToast(getApplicationContext(), "Four plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    OlamijuloTobi.setBackgroundColor(Color.parseColor("#607D8B"));
                    OlamijuloTobi.setTextColor(Color.YELLOW);
                    OlamijuloTobi.show();
                }
                else if (fiveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FivePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Bayo contributed to the purchase of my screen
                    StyleableToast BasorunBayo = new StyleableToast(getApplicationContext(), "Five plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    BasorunBayo.setBackgroundColor(Color.parseColor("#607D8B"));
                    BasorunBayo.setTextColor(Color.YELLOW);
                    BasorunBayo.show();
                }
                else if (sixok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SixPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Engr. Korede contributed to the purchase of my screen
                    StyleableToast KoredeAkintayo = new StyleableToast(getApplicationContext(), "Six plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    KoredeAkintayo.setBackgroundColor(Color.parseColor("#607D8B"));
                    KoredeAkintayo.setTextColor(Color.YELLOW);
                    KoredeAkintayo.show();
                }
                else if (sevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SevenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Keziah contributed to the purchase of my screen
                    StyleableToast OlaniyiKeziah = new StyleableToast(getApplicationContext(), "Seven plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    OlaniyiKeziah.setBackgroundColor(Color.parseColor("#607D8B"));
                    OlaniyiKeziah.setTextColor(Color.YELLOW);
                    OlaniyiKeziah.show();
                }
                else if (eightok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.EightPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Falaju Emmanuel contributed to the purchase of my screen
                    StyleableToast FalajuHilex = new StyleableToast(getApplicationContext(), "Eight plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    FalajuHilex.setBackgroundColor(Color.parseColor("#607D8B"));
                    FalajuHilex.setTextColor(Color.YELLOW);
                    FalajuHilex.show();
                }
                else if (nineok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.NinePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Aunty Mercy contributed to the purchase of my screen
                    StyleableToast AuntyMercy = new StyleableToast(getApplicationContext(), "Nine plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    AuntyMercy.setBackgroundColor(Color.parseColor("#607D8B"));
                    AuntyMercy.setTextColor(Color.YELLOW);
                    AuntyMercy.show();
                }
                else if (tenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Bro. Tolu contributed to the purchase of my screen
                    StyleableToast AdemisoyeTolu = new StyleableToast(getApplicationContext(), "Ten plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    AdemisoyeTolu.setBackgroundColor(Color.parseColor("#607D8B"));
                    AdemisoyeTolu.setTextColor(Color.YELLOW);
                    AdemisoyeTolu.show();
                }
                else if (elevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ElevenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Joseph contributed to the purchase of my screen
                    StyleableToast JosephUshie = new StyleableToast(getApplicationContext(), "Eleven plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    JosephUshie.setBackgroundColor(Color.parseColor("#607D8B"));
                    JosephUshie.setTextColor(Color.YELLOW);
                    JosephUshie.show();
                }
                else if (twelveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwelvePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Bishop contributed to the purchase of my screen
                    StyleableToast ZebulonBishop = new StyleableToast(getApplicationContext(), "Twelve plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    ZebulonBishop.setBackgroundColor(Color.parseColor("#607D8B"));
                    ZebulonBishop.setTextColor(Color.YELLOW);
                    ZebulonBishop.show();
                }
                else if (thirteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThirteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Demi contributed to the purchase of my screen
                    StyleableToast OniretiDemi = new StyleableToast(getApplicationContext(), "Thirteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    OniretiDemi.setBackgroundColor(Color.parseColor("#607D8B"));
                    OniretiDemi.setTextColor(Color.YELLOW);
                    OniretiDemi.show();
                }
                else if (fourteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FourteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
//                    Ifiok contributed to the purchase of my device
                    StyleableToast EssienIfiok = new StyleableToast(getApplicationContext(), "Fourteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    EssienIfiok.setBackgroundColor(Color.parseColor("#607D8B"));
                    EssienIfiok.setTextColor(Color.YELLOW);
                    EssienIfiok.show();
                }
                else if (fifteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.FifteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Victor contributed to the purchase of my screen
                    StyleableToast AkhamereVictor = new StyleableToast(getApplicationContext(), "Fifteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    AkhamereVictor.setBackgroundColor(Color.parseColor("#607D8B"));
                    AkhamereVictor.setTextColor(Color.YELLOW);
                    AkhamereVictor.show();
                }
                else if (sixteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SixteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Chukwunanchi contributed to the purchase of my screen
                    StyleableToast ChukwunanchiEjioba = new StyleableToast(getApplicationContext(), "Sixteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    ChukwunanchiEjioba.setBackgroundColor(Color.parseColor("#607D8B"));
                    ChukwunanchiEjioba.setTextColor(Color.YELLOW);
                    ChukwunanchiEjioba.show();
                }
                else if (seventeenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.SeventeenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Adamu contributed to the purchase of my device
                    StyleableToast MattewAuta = new StyleableToast(getApplicationContext(), "Seventeen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    MattewAuta.setBackgroundColor(Color.parseColor("#607D8B"));
                    MattewAuta.setTextColor(Color.YELLOW);
                    MattewAuta.show();
                }
                else if (eighteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.EighteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Engr. Kenny contributed to the purchase of my device
                    StyleableToast EngrKenny = new StyleableToast(getApplicationContext(), "Eighteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    EngrKenny.setBackgroundColor(Color.parseColor("#607D8B"));
                    EngrKenny.setTextColor(Color.YELLOW);
                    EngrKenny.show();
                }
                else if (nineteenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.NineteenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Pipe contributed to the purchase of my device
                    StyleableToast AjibadePipe = new StyleableToast(getApplicationContext(), "Nineteen plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    AjibadePipe.setBackgroundColor(Color.parseColor("#607D8B"));
                    AjibadePipe.setTextColor(Color.YELLOW);
                    AjibadePipe.show();
                }
                else if (twentyok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Engr. Ayideji contributed to the purchase of my screen
                    StyleableToast EngrAyideji = new StyleableToast(getApplicationContext(), "Twenty plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    EngrAyideji.setBackgroundColor(Color.parseColor("#607D8B"));
                    EngrAyideji.setTextColor(Color.YELLOW);
                    EngrAyideji.show();
                }
                else if (twentyoneok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyOnePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Tobi contributed to the purchase of my screen
                    StyleableToast OgunjemilusiTobi = new StyleableToast(getApplicationContext(), "Twentyone plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    OgunjemilusiTobi.setBackgroundColor(Color.parseColor("#607D8B"));
                    OgunjemilusiTobi.setTextColor(Color.YELLOW);
                    OgunjemilusiTobi.show();
                }
                else if (twentytwook.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyTwoPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Funk contributed to the purchase of my screen
                    StyleableToast SanusiFunke = new StyleableToast(getApplicationContext(), "Twentytwo plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    SanusiFunke.setBackgroundColor(Color.parseColor("#607D8B"));
                    SanusiFunke.setTextColor(Color.YELLOW);
                    SanusiFunke.show();
                }
                else if (twentythreeok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyThreePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Engr. Samson contributed to the purchase of my screen
                    StyleableToast SalawuSamson = new StyleableToast(getApplicationContext(), "Twentythree plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    SalawuSamson.setBackgroundColor(Color.parseColor("#607D8B"));
                    SalawuSamson.setTextColor(Color.YELLOW);
                    SalawuSamson.show();
                }
                else if (twentyfourok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyFourPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Segun contributed to the purchase of my screen
                    StyleableToast SegunOlaiya = new StyleableToast(getApplicationContext(), "Twentyfour plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    SegunOlaiya.setBackgroundColor(Color.parseColor("#607D8B"));
                    SegunOlaiya.setTextColor(Color.YELLOW);
                    SegunOlaiya.show();
                }
                else if (twentyfiveok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyFivePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Joshua contributed to the purchase of my screen
                    StyleableToast Hermans = new StyleableToast(getApplicationContext(), "Twentyfive plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    Hermans.setBackgroundColor(Color.parseColor("#607D8B"));
                    Hermans.setTextColor(Color.YELLOW);
                    Hermans.show();
                }
                else if (twentysixok.isChecked()) {

                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentySixPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Dr. Yomade contributed to the purchase of my screen
                    StyleableToast OwolabiYomade = new StyleableToast(getApplicationContext(), "Twentysix plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    OwolabiYomade.setBackgroundColor(Color.parseColor("#607D8B"));
                    OwolabiYomade.setTextColor(Color.YELLOW);
                    OwolabiYomade.show();
                }
                else if (twentysevenok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentySevenPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
//                    Engr. Oshodi contributed to the purchase of my screen
                    StyleableToast EngrOshodi = new StyleableToast(getApplicationContext(), "Twentyseven plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    EngrOshodi.setBackgroundColor(Color.parseColor("#607D8B"));
                    EngrOshodi.setTextColor(Color.YELLOW);
                    EngrOshodi.show();
                }
                else if (twentyeightok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyEightPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Godwin contributed to the purchase of my screen
                    StyleableToast IgbosuahGodwin = new StyleableToast(getApplicationContext(), "Twentyeight plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    IgbosuahGodwin.setBackgroundColor(Color.parseColor("#607D8B"));
                    IgbosuahGodwin.setTextColor(Color.YELLOW);
                    IgbosuahGodwin.show();
                }
                else if (twentynineok.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.TwentyNinePlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
//                    Mr. Ola contributed to the purchase of my screen
                    StyleableToast RidwanOla = new StyleableToast(getApplicationContext(), "Twentynine plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    RidwanOla.setBackgroundColor(Color.parseColor("#607D8B"));
                    RidwanOla.setTextColor(Color.YELLOW);
                    RidwanOla.show();
                }
                else if (thirtyisenoughjoor.isChecked()) {
                    PassDataAlso.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                            Bundle bundle = new Bundle();
                            app.Diamond = getResources().getStringArray(R.array.ThirtyPlatenumbers);
                            intent.putExtras(bundle);
                            startActivity(intent);
                        }
                    });
                    // Prof. TF contributed to the purchase of my screen
                    StyleableToast AdepojuTF = new StyleableToast(getApplicationContext(), "Thirty plates per deal picked", Toast.LENGTH_SHORT).spinIcon();
                    AdepojuTF.setBackgroundColor(Color.parseColor("#607D8B"));
                    AdepojuTF.setTextColor(Color.YELLOW);
                    AdepojuTF.show();
                }
            }
        });
        Dialog dialog = builder.create();
        dialog.show();

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        TakeCareOfPlateSelection();

        switch (checkedId) {
            case R.id.one:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] OneString = getResources().getStringArray(R.array.OnePlatenumber);
                        bundle.putStringArray("diamond", OneString);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#FF8A65"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));


                break;

            case R.id.two:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwoStrings = getResources().getStringArray(R.array.TwoPlatenumbers);
                        bundle.putStringArray("diamond", TwoStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#FF8A65"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.three:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThreeStrings = getResources().getStringArray(R.array.ThreePlatenumbers);
                        bundle.putStringArray("diamond", ThreeStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#FF8A65"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.four:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FourStrings = getResources().getStringArray(R.array.FourPlatenumbers);
                        bundle.putStringArray("diamond", FourStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#FF8A65"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.five:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FiveStrings = getResources().getStringArray(R.array.FivePlatenumbers);
                        bundle.putStringArray("diamond", FiveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#FF8A65"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.six:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SixStrings = getResources().getStringArray(R.array.SixPlatenumbers);
                        bundle.putStringArray("diamond", SixStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#FF8A65"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.seven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SevenStrings = getResources().getStringArray(R.array.SevenPlatenumbers);
                        bundle.putStringArray("diamond", SevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#FF8A65"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.eight:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] EightStrings = getResources().getStringArray(R.array.EightPlatenumbers);
                        bundle.putStringArray("diamond", EightStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#FF8A65"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.nine:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] NineStrings = getResources().getStringArray(R.array.NinePlatenumbers);
                        bundle.putStringArray("diamond", NineStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#FF8A65"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.ten:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TenStrings = getResources().getStringArray(R.array.TenPlatenumbers);
                        bundle.putStringArray("diamond", TenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#FF8A65"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.eleven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ElevenStrings = getResources().getStringArray(R.array.ElevenPlatenumbers);
                        bundle.putStringArray("diamond", ElevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#FF8A65"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twelve:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwelveStrings = getResources().getStringArray(R.array.TwelvePlatenumbers);
                        bundle.putStringArray("diamond", TwelveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#FF8A65"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.thirteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThirteenStrings = getResources().getStringArray(R.array.ThirteenPlatenumbers);
                        bundle.putStringArray("diamond", ThirteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#FF8A65"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.fourteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FourteenStrings = getResources().getStringArray(R.array.FourteenPlatenumbers);
                        bundle.putStringArray("diamond", FourteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#FF8A65"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.fifteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] FifteenStrings = getResources().getStringArray(R.array.FifteenPlatenumbers);
                        bundle.putStringArray("diamond", FifteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#FF8A65"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.sixteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SixteenStrings = getResources().getStringArray(R.array.SixteenPlatenumbers);
                        bundle.putStringArray("diamond", SixteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#FF8A65"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.seventeen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] SeventeenStrings = getResources().getStringArray(R.array.SeventeenPlatenumbers);
                        bundle.putStringArray("diamond", SeventeenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#FF8A65"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.eighteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] EighteenStrings = getResources().getStringArray(R.array.EighteenPlatenumbers);
                        bundle.putStringArray("diamond", EighteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#FF8A65"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.nineteen:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] NineteenStrings = getResources().getStringArray(R.array.NineteenPlatenumbers);
                        bundle.putStringArray("diamond", NineteenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#FF8A65"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twenty:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyStrings = getResources().getStringArray(R.array.TwentyPlatenumbers);
                        bundle.putStringArray("diamond", TwentyStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#FF8A65"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentyone:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyOneStrings = getResources().getStringArray(R.array.TwentyOnePlatenumbers);
                        bundle.putStringArray("diamond", TwentyOneStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#FF8A65"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentytwo:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyDiamond = getResources().getStringArray(R.array.TwentyTwoPlatenumbers);
                        bundle.putStringArray("diamond", TwentyDiamond);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#FF8A65"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentythree:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyThreeStrings = getResources().getStringArray(R.array.TwentyThreePlatenumbers);
                        bundle.putStringArray("diamond", TwentyThreeStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#FF8A65"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentyfour:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyFourStrings = getResources().getStringArray(R.array.TwentyFourPlatenumbers);
                        bundle.putStringArray("diamond", TwentyFourStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#FF8A65"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentyfive:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyFiveStrings = getResources().getStringArray(R.array.TwentyFivePlatenumbers);
                        bundle.putStringArray("diamond", TwentyFiveStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#FF8A65"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentysix:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentySixStrings = getResources().getStringArray(R.array.TwentySixPlatenumbers);
                        bundle.putStringArray("diamond", TwentySixStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#FF8A65"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentyseven:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentySevenStrings = getResources().getStringArray(R.array.TwentySevenPlatenumbers);
                        bundle.putStringArray("diamond", TwentySevenStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#FF8A65"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentyeight:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyEightStrings = getResources().getStringArray(R.array.TwentyEightPlatenumbers);
                        bundle.putStringArray("diamond", TwentyEightStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#FF8A65"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.twentynine:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] TwentyNineStrings = getResources().getStringArray(R.array.TwentyNinePlatenumbers);
                        bundle.putStringArray("diamond", TwentyNineStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#FF8A65"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#00897B"));
                break;

            case R.id.thirty:
                PassDataAlso.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                        Bundle bundle = new Bundle();
                        String[] ThirtyStrings = getResources().getStringArray(R.array.ThirtyPlatenumbers);
                        bundle.putStringArray("diamond", ThirtyStrings);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                });
                oneissmalljoor.setTextColor(Color.parseColor("#00897B"));
                twook.setTextColor(Color.parseColor("#00897B"));
                threeok.setTextColor(Color.parseColor("#00897B"));
                fourok.setTextColor(Color.parseColor("#00897B"));
                fiveok.setTextColor(Color.parseColor("#00897B"));
                sixok.setTextColor(Color.parseColor("#00897B"));
                sevenok.setTextColor(Color.parseColor("#00897B"));
                eightok.setTextColor(Color.parseColor("#00897B"));
                nineok.setTextColor(Color.parseColor("#00897B"));
                tenok.setTextColor(Color.parseColor("#00897B"));
                elevenok.setTextColor(Color.parseColor("#00897B"));
                twelveok.setTextColor(Color.parseColor("#00897B"));
                thirteenok.setTextColor(Color.parseColor("#00897B"));
                fourteenok.setTextColor(Color.parseColor("#00897B"));
                fifteenok.setTextColor(Color.parseColor("#00897B"));
                sixteenok.setTextColor(Color.parseColor("#00897B"));
                seventeenok.setTextColor(Color.parseColor("#00897B"));
                eighteenok.setTextColor(Color.parseColor("#00897B"));
                nineteenok.setTextColor(Color.parseColor("#00897B"));
                twentyok.setTextColor(Color.parseColor("#00897B"));
                twentyoneok.setTextColor(Color.parseColor("#00897B"));
                twentytwook.setTextColor(Color.parseColor("#00897B"));
                twentythreeok.setTextColor(Color.parseColor("#00897B"));
                twentyfourok.setTextColor(Color.parseColor("#00897B"));
                twentyfiveok.setTextColor(Color.parseColor("#00897B"));
                twentysixok.setTextColor(Color.parseColor("#00897B"));
                twentysevenok.setTextColor(Color.parseColor("#00897B"));
                twentyeightok.setTextColor(Color.parseColor("#00897B"));
                twentynineok.setTextColor(Color.parseColor("#00897B"));
                thirtyisenoughjoor.setTextColor(Color.parseColor("#FF8A65"));
                break;
        }
    }

    private void TakeCareOfPlateSelection() {
        if (oneissmalljoor.isChecked()) {
            MyOkPlatesEditor.putBoolean(ONE_KITCHEN_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(ONE_KITCHEN_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twook.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWO_SITTINGROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWO_SITTINGROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (threeok.isChecked()) {
            MyOkPlatesEditor.putBoolean(THREE_VISITORROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THREE_VISITORROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fourok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fiveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FIVE_CLASSROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FIVE_CLASSROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sixok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SIX_BOARDROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SIX_BOARDROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (eightok.isChecked()) {
            MyOkPlatesEditor.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (nineok.isChecked()) {
            MyOkPlatesEditor.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (tenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TEN_GARAGEROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TEN_GARAGEROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (elevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twelveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWELVE_GENTROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWELVE_GENTROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (thirteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fourteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (fifteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (sixteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SIXTEEN_SNACKSSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SIXTEEN_SNACKSSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (seventeenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (eighteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (nineteenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyoneok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentytwook.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentythreeok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyfourok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyfiveok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentysixok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYSIX_ABRAHAMHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentysevenok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentyeightok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (twentynineok.isChecked()) {
            MyOkPlatesEditor.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
        if (thirtyisenoughjoor.isChecked()) {
            MyOkPlatesEditor.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, true);
            MyOkPlatesEditor.apply();
        }
        else {
            MyOkPlatesEditor.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, false);
            MyOkPlatesEditor.apply();
        }
    }

    public void GetMeNextActivity(View view) {

        Intent obsolete = new Intent(getApplicationContext(), LoginActivity.class);

        Bundle oldbutstill = new Bundle();
        String[] Default = getResources().getStringArray(R.array.DefaultPlatenumber);
        oldbutstill.putStringArray("diamond", Default);
        obsolete.putExtras(oldbutstill);
        oldbutstill.putBoolean(ONE_KITCHEN_KEY_RECALL, true);
        oldbutstill.putBoolean(TWO_SITTINGROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(THREE_VISITORROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FOUR_LAUNDRYROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FIVE_CLASSROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(SIX_BOARDROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(SEVEN_CONFERENCEROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(EIGHT_MASTERBEDROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(NINE_CHILDRENROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(TEN_GARAGEROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(ELEVEN_LECTUREROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(TWELVE_GENTROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(THIRTEEN_LADIESROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FOURTEEN_BARROOM_KEY_RECALL, true);
        oldbutstill.putBoolean(FIFTEEN_RICESPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(SIXTEEN_SNACKSSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(SEVENTEEN_DRINKSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(EIGHTEEN_POTARITOSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(NINETEEN_TUBABASPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTY_CHINESERICESPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYONE_AMALASPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYTWO_FRUITSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYTHREE_CHAPMANSPOT_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYFOUR_SHOPPINGMALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYFIVE_MEDICALCENTRE_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYSEVEN_SARAHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYEIGHT_JOSEPHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(TWENTYNINE_DEBORAHHALL_KEY_RECALL, true);
        oldbutstill.putBoolean(THIRTY_SENATEBUILDING_KEY_RECALL, true);

        startActivity(obsolete);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("VendorActivity","onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("VendorActivity","onResume invoked");
        wakeLock.acquire();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("VendorActivity","onPause invoked");
        wakeLock.release();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("VendorActivity","onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("VendorActivity","onDestroy invoked");

    }

    @Override
    public void onBackPressed() {
        logOut();
    }

    public void logOut() {
        AlertDialog.Builder destroyer = new AlertDialog.Builder(this);
        destroyer.setTitle("Log out");
        destroyer.setMessage("This should only be done if your section is over. Are you sure?");
        destroyer.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Intent intent = new Intent(VendorActivity.this, Vendor_LoginActivity.class);
                startActivity(intent);
            }
        });
        destroyer.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        destroyer.create().show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.vendor_activityappbarmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.log_out:
                break;
        }
        return true;
    }

    public void mySectionIsOver(MenuItem item) {
        AlertDialog.Builder destroyer = new AlertDialog.Builder(this);
        destroyer.setTitle("Log out");
        destroyer.setMessage("This should only be done if your section is over. Are you sure?");
        destroyer.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(VendorActivity.this, Vendor_LoginActivity.class);
                startActivity(intent);
            }
        });
        destroyer.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        destroyer.create().show();

    }

}