package com.example.diginhunter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView user = (TextView) findViewById(R.id.userGlobal);
        user.setText(text);

        Button cancel = (Button) findViewById(R.id.cancelBtn);
        Button go = (Button) findViewById(R.id.exploreBtn);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explore();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
    }
    private void back(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void explore(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
