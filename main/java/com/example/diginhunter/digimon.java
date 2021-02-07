package com.example.diginhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class digimon extends AppCompatActivity implements View.OnClickListener {
    public static final String EXTRA_TEXT1 = "com.example.diginhunter.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.example.diginhunter.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.diginhunter.EXTRA_TEXT3";
    Button home,digimon,aboutus,logout;
    TextView list1,list2,list3,list4,list5;
    TextView number1,number2,number3,number4,number5;
    TextView name1,name2,name3,name4,name5;
    TextView price1,price2,price3,price4,price5;
    String nutext1,nutext2,nutext3,nutext4,nutext5;
    String natext1,natext2,natext3,natext4,natext5;
    String prtext1,prtext2,prtext3,prtext4,prtext5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digimon);

         list1 = (TextView) findViewById(R.id.list1);
         list2 = (TextView) findViewById(R.id.list2);
         list3 = (TextView) findViewById(R.id.list3);
         list4 = (TextView) findViewById(R.id.list4);
         list5 = (TextView) findViewById(R.id.list5);

        list1.setOnClickListener(this);
        list2.setOnClickListener(this);
        list3.setOnClickListener(this);
        list4.setOnClickListener(this);
        list5.setOnClickListener(this);

        home = (Button) findViewById(R.id.Home);
        digimon = (Button) findViewById(R.id.Digimon);
        aboutus = (Button) findViewById(R.id.AboutUs);
        logout = (Button) findViewById(R.id.Logout);

        home.setOnClickListener(this);
        digimon.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Home:
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.Digimon:
                Intent intent1 = new Intent(this, digimon.class);
                startActivity(intent1);
                break;
            case R.id.AboutUs:
                Intent intent2 = new Intent(this, aboutus.class);
                startActivity(intent2);
                break;
            case R.id.Logout:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                break;
            case R.id.list1:
                number1 = (TextView) findViewById(R.id.no1);
                nutext1 = number1.getText().toString();
                name1 = (TextView)findViewById(R.id.name1);
                natext1 = name1.getText().toString();
                price1 = (TextView)findViewById(R.id.price1);
                prtext1 = price1.getText().toString();
                Intent intent4 = new Intent(this, DetailActivity.class);
                intent4.putExtra(EXTRA_TEXT1, nutext1);
                intent4.putExtra(EXTRA_TEXT2, natext1);
                intent4.putExtra(EXTRA_TEXT3, prtext1);
                intent4.putExtra("resId", R.drawable.veemon);
                startActivity(intent4);
                break;
            case R.id.list2:
                number2 = (TextView) findViewById(R.id.no2);
                nutext2 = number2.getText().toString();
                name2 = (TextView)findViewById(R.id.name2);
                natext2 = name2.getText().toString();
                price2 = (TextView)findViewById(R.id.price2);
                prtext2 = price2.getText().toString();
                Intent intent5 = new Intent(this, DetailActivity.class);
                intent5.putExtra(EXTRA_TEXT1, nutext2);
                intent5.putExtra(EXTRA_TEXT2, natext2);
                intent5.putExtra(EXTRA_TEXT3, prtext2);
                intent5.putExtra("resId", R.drawable.patamon);
                startActivity(intent5);
                break;
            case R.id.list3:
                number3 = (TextView) findViewById(R.id.no3);
                nutext3 = number3.getText().toString();
                name3 = (TextView)findViewById(R.id.name3);
                natext3 = name3.getText().toString();
                price3 = (TextView)findViewById(R.id.price3);
                prtext3 = price3.getText().toString();
                Intent intent6 = new Intent(this, DetailActivity.class);
                intent6.putExtra(EXTRA_TEXT1, nutext3);
                intent6.putExtra(EXTRA_TEXT2, natext3);
                intent6.putExtra(EXTRA_TEXT3, prtext3);
                intent6.putExtra("resId", R.drawable.impmon);
                startActivity(intent6);
                break;
            case R.id.list4:
                number4 = (TextView) findViewById(R.id.no4);
                nutext4 = number4.getText().toString();
                name4 = (TextView)findViewById(R.id.name4);
                natext4 = name4.getText().toString();
                price4 = (TextView)findViewById(R.id.price4);
                prtext4 = price4.getText().toString();
                Intent intent7 = new Intent(this, DetailActivity.class);
                intent7.putExtra(EXTRA_TEXT1, nutext4);
                intent7.putExtra(EXTRA_TEXT2, natext4);
                intent7.putExtra(EXTRA_TEXT3, prtext4);
                intent7.putExtra("resId", R.drawable.wargreymon);
                startActivity(intent7);
                break;
            case R.id.list5:
                number5 = (TextView) findViewById(R.id.no5);
                nutext5 = number5.getText().toString();
                name5 = (TextView)findViewById(R.id.name5);
                natext5 = name5.getText().toString();
                price5 = (TextView)findViewById(R.id.price5);
                prtext5 = price5.getText().toString();
                Intent intent8 = new Intent(this, DetailActivity.class);
                intent8.putExtra(EXTRA_TEXT1, nutext5);
                intent8.putExtra(EXTRA_TEXT2, natext5);
                intent8.putExtra(EXTRA_TEXT3, prtext5);
                intent8.putExtra("resId", R.drawable.guilmon);
                startActivity(intent8);
                break;
        }
    }
}
