package com.example.jukebox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    Button youtube;
    Button Indietro;
    Button Avanti;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        Button youtube= findViewById(R.id.Youtube);
        Button Indietro= findViewById(R.id.Indietro);
        Button Artista= findViewById(R.id.Artisti);
        Randomnum = getIntent().getExtras().getInt("NumeroRandom");
        musicasual = findViewById(R.id.Canzone);
        musicasual.setText(Musica[Randomnum]);
    }
    int Randomnum;
    TextView musicasual;

    String[] Musica = {
            "Metro Boomin, The Weeknd, 21 Savage - Creepin' (Visualizer)",
            "Drake, 21 Savage - Rich Flex (Audio)",
            "Taylor Swift - Anti-Hero (Official Music Video)",
            "Imagine Dragons - Bones (Official Music Video)",
            "Harry Styles - As It Was (Official Video)",
            "Camila Cabello ft. Ed Sheeran - Bam Bam (Official Music Video)",
            "Fireboy DML & Ed Sheeran - Peru (Official Video)",
            "Lizzo - About Damn Time [Official Video]",
            "Tiësto & Ava Max - The Motto (Official Music Video)",
            "Joji - Glimpse of Us"
    };

    String[] link = {
            "https://www.youtube.com/watch?v=61ymOWwOwuk&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=1",
            "https://www.youtube.com/watch?v=I4DjHHVHWAE&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=5",
            "https://www.youtube.com/watch?v=b1kbLwvqugk&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=7",
            "https://www.youtube.com/watch?v=TO-_3tck2tg&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=12",
            "https://www.youtube.com/watch?v=H5v3kku4y6Q&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=14",
            "https://www.youtube.com/watch?v=-8VfKZCOo_I&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=16",
            "https://www.youtube.com/watch?v=pekzpzNCNDQ&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=17",
            "https://www.youtube.com/watch?v=IXXxciRUMzE&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=18",
            "https://www.youtube.com/watch?v=1_4ELAxKrDc&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=19",
            "https://www.youtube.com/watch?v=FvOpPeKSf_4&list=RDCLAK5uy_nqRa4MZhGLlzdFysGGDQyuGA43aqJR8FQ&index=21"
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
        Intent ActivityMusic = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(ActivityMusic);

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