package com.example.jukeboxperella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Music extends AppCompatActivity {
    Button youtube;
    Button Indietro;
    Button Avanti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Button youtube=(Button) findViewById(R.id.Youtube);
        Button Indietro=(Button) findViewById(R.id.Indietro);
        Button Avanti=(Button) findViewById(R.id.Avanti);



    }
}