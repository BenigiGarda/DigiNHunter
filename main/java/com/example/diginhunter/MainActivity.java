package com.example.diginhunter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.diginhunter.EXTRA_TEXT";
    private Button button;
    private TextView textView1 , textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.Username);
        textView2 = (TextView) findViewById(R.id.Password);
        button = (Button) findViewById(R.id.LoginBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openHome();
            }
        });
    }

    public void openHome(){
        ErrorUsername errorUsername = new ErrorUsername();
        ErrorUsername2 errorUsername2 = new ErrorUsername2();
        ErrorPassword errorPassword = new ErrorPassword();

        if (textView1.length() == 0){
            errorUsername2.show(getSupportFragmentManager(), "Error Username");
        }
        else if(textView1.length() < 5 || textView1.length() > 20){
            errorUsername.show(getSupportFragmentManager(), "Error Username");
        }
        else if (textView2.length() == 0){
            errorPassword.show(getSupportFragmentManager(), "Error Password");
        }
        else {
            String text = textView1.getText().toString();
            Intent intent = new Intent(this, Greeting.class);
            intent.putExtra(EXTRA_TEXT, text);
            startActivity(intent);
        }
    }
}
