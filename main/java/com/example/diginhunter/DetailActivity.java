package com.example.diginhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Bundle bundle;
    ImageView arrow;
    ImageView Image;
    Intent intent;
    TextView numberglobal,nameglobal,priceglobal;
    Button button;
    EditText detailqty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        bundle = getIntent().getExtras();
        detailqty = (EditText) findViewById(R.id.detailQty);
        Image = (ImageView) findViewById(R.id.imageglobal);

        numberglobal = (TextView) findViewById(R.id.numberglobal);
        nameglobal = (TextView) findViewById(R.id.nameglobal);
        priceglobal = (TextView) findViewById(R.id.priceglobal);

        if(bundle!=null){
            int resid= bundle.getInt("resId");
            Image.setImageResource(resid);
        }

        intent = getIntent();
        String nutext = intent.getStringExtra(digimon.EXTRA_TEXT1);
        String natext = intent.getStringExtra(digimon.EXTRA_TEXT2);
        String prtext = intent.getStringExtra(digimon.EXTRA_TEXT3);
        numberglobal.setText(nutext);
        nameglobal.setText(natext);
        priceglobal.setText(prtext);

        button = (Button) findViewById(R.id.orderBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                complete();
            }
        });

        //backarrow
        arrow = (ImageView) findViewById(R.id.Arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backdigimon();
            }
        });
    }
    private void backdigimon(){
        Intent intent1 = new Intent(this, digimon.class);
        startActivity(intent1);
    }
    private void complete(){
        ErrorQuantity errorQuantity = new ErrorQuantity();
        String value = detailqty.getText().toString();
        int qty = Integer.parseInt(value);

        if(qty < 1 || qty > 20 ){
            errorQuantity.show(getSupportFragmentManager(), "ErrorQuantity");
        }
        else{
            Intent intent2 = new Intent(this, HomeActivity.class);
            startActivity(intent2);
        }
    }
}
