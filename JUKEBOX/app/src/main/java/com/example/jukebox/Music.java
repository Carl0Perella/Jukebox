package com.example.jukebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    Button youtube;
    Button Indietro;
    Button Avanti;
    Button Notifica;
    int Randomnum;
    TextView musicasual;
    int clicks;
    MediaPlayer player=null;
    Handler handler = new Handler();
    double startTime = 0;
    SeekBar musicbar=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Button youtube= findViewById(R.id.Youtube);
        Button Indietro= findViewById(R.id.Indietro);
        Button Artista= findViewById(R.id.Artisti);
        Button Notifica= findViewById(R.id.Notifica);
        musicbar =(SeekBar) findViewById(R.id.bar);
        MediaPlayer player = MediaPlayer.create(this, Audio[Randomnum]);
        Button Pause= findViewById(R.id.Pause);
        Button Stop= findViewById(R.id.Stop);
        Button Play= findViewById(R.id.Play);
        clicks = getIntent().getExtras().getInt("click");
        Randomnum = getIntent().getExtras().getInt("NumeroRandom");
        musicasual = findViewById(R.id.Canzone);
        musicasual.setText(Musica[Randomnum]);
        if ( clicks >= 7){
            Notifica.setVisibility(View.VISIBLE);
        };
    }
    private Runnable updateBar = new Runnable() {
        public void run()
        {
            startTime = player.getCurrentPosition();
            musicbar.setProgress((int)startTime);
            handler.postDelayed(this, 100);
        }
    };
    public void play(View v)
    {
        player.start();
        musicbar.setMax((int) player.getDuration());
        handler.postDelayed(updateBar,100);
    }
    public void pause(View v)
    {
        player.pause();
    }
    public void stop(View v)
    {
        player.stop();
    }





    String[] Musica = {
            "My heart is cold",
            "Livin’on a player",
            "Eye of the tiger",
            "Car’s outside",
            "La cumbia de free fire",
            "Paranoid",
            "Black in black",
            "Out of my league",
            "Fearless",
            "Gipsy woman",
            "Snap",
            "Hero",
            "Get lucky",
            "As it was",
            "Safe and sound",
            "Tous le memes"
    };
    String[] Audio = {
            "My heart is cold",
            "Livin’on a player",
            "Eye of the tiger",
            "Car’s outside",
            "La cumbia de free fire",
            "Paranoid",
            "Black in black",
            "Out of my league",
            "Fearless",
            "Gipsy woman",
            "Snap",
            "Hero",
            "Get lucky",
            "As it was",
            "Safe and sound",
            "Tous le memes"
    };

    String[] link = {
            "https://youtu.be/OvkOOxklAKE",
            "https://youtu.be/ohFtQIPqGSo",
            "https://youtu.be/_qDML_BCju8",
            "https://youtu.be/BxPaGW55PUo",
            "https://youtu.be/WoYQDX2a14o",
            "https://youtu.be/0qanF-91aJo",
            "https://youtu.be/pAgnJDJN4VA",
            "https://youtu.be/I-QmZpLWjHc",
            "https://youtu.be/S19UcWdOA-I",
            "https://youtu.be/_KztNIg4cvE",
            "https://youtu.be/--eH76tgoNw",
            "https://youtu.be/ONJ2Cr8h6A8",
            "https://youtu.be/4D7u5KF7SP8",
            "https://youtu.be/Qfm6nfz1QNQ",
            "https://youtu.be/jR-OsKMD80c",
            "https://youtu.be/P5yUiK2qNdg"
    };

    String[] Artista= {
            "8",
            "4",
            "7",
            "5",
            "6",
            "4",
            "8",
            "8",
            "3",
            "10"
    };
    public void indietro(View view) {
        Intent Activityindietro = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(Activityindietro);

    }

    public void Youtube(View view){
        Intent youTube = new Intent(Intent.ACTION_VIEW, Uri.parse(link[Randomnum]));
        startActivity(youTube);
    }
    public void Nomeartista(View view){
        Toast Messaggio = Toast.makeText(this, Artista[Randomnum],
                Toast.LENGTH_SHORT);
        Messaggio.show();
    }




}