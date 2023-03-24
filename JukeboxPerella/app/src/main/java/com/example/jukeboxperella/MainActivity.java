package com.example.jukeboxperella;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button GeneraNumero;
    TextView Numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button GeneraNumero = (Button) findViewById(R.id.GeneraNumero);
        TextView Numero = (TextView) findViewById(R.id.Numero);


}
}