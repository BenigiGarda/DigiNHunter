package com.example.diginhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class aboutus extends AppCompatActivity implements View.OnClickListener{

    ViewFlipper viewFlipper;
    Button home,digimon,aboutus,logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        viewFlipper = (ViewFlipper)findViewById(R.id.flipper);
        home = (Button) findViewById(R.id.Home);
        digimon = (Button) findViewById(R.id.Digimon);
        aboutus = (Button) findViewById(R.id.AboutUs);
        logout = (Button) findViewById(R.id.Logout);

        home.setOnClickListener(this);
        digimon.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        logout.setOnClickListener(this);

        int images[] = {R.drawable.twitteredit, R.drawable.youtubeedit, R.drawable.facebookedit, R.drawable.instagramedit, R.drawable.whatsappedit};

        for(int image: images){
            flipperimage(image);
        }
    }

    public void flipperimage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
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
        }
    }
}
