package com.example.jukebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import java.util.Scanner;



public class MainActivity extends AppCompatActivity {
    Button GeneraNumero;
    TextView Numero;
    int numrand;
    TextView text1;
    Button cambiaActivity;
    int n; //numero random

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.showButton);
        cambiaActivity = findViewById(R.id.cambiaActivity);
    }

    public void Estrazionenumero(View view){

        Random rand = new Random();
        numrand = rand.nextInt(10);
        Numero.setText(Integer.toString(numrand+1));
    }


    public void Musicactivity(View view){
        Intent ActivityMusic = new Intent(getApplicationContext(), Music.class);
        ActivityMusic.putExtra("NumeroRandom", numrand);
        startActivity(ActivityMusic);

    }
}