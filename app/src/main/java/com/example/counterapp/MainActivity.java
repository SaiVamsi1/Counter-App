package com.example.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.Toast;

import static android.graphics.Color.MAGENTA;
import static android.graphics.Color.RED;
import static android.graphics.Color.WHITE;
import static android.graphics.Color.YELLOW;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button i, d,r;
    EditText scoreText;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = findViewById(R.id.inc);
        d = findViewById(R.id.dec);
        r = findViewById(R.id.rt);
        scoreText = (EditText) this.<View>findViewById(R.id.score);

        i.setOnClickListener(this);
        d.setOnClickListener(this);
        r.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == i) {
            counter++;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(Color.GREEN);
        }
        if (v == d) {
            counter--;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(RED);
        }
        if (v ==r){
            counter = 0;
            scoreText.setText(Integer.toString(counter));
            scoreText.setBackgroundColor(WHITE);
        }

        Toast.makeText(getApplicationContext(),"Hello Your Score Is "+counter,Toast.LENGTH_SHORT).show();
    }

}