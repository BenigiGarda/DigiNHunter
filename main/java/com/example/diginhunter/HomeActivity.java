package com.example.diginhunter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button home = (Button) findViewById(R.id.Home);
        Button digimon = (Button) findViewById(R.id.Digimon);
        Button aboutus = (Button) findViewById(R.id.AboutUs);
        Button logout = (Button) findViewById(R.id.Logout);


        home.setOnClickListener(this);
        digimon.setOnClickListener(this);
        aboutus.setOnClickListener(this);
        logout.setOnClickListener(this);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.Pager);
        pagerAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
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

