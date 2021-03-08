package com.example.mock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
MediaPlayer Sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button a1toa2 = (Button) findViewById(R.id.btn_1to2);
        final Button a1toa3 = (Button) findViewById(R.id.btn_1to3);
        final ImageView yazid = (ImageView) findViewById(R.id.imageView);

        a1toa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1tos2=new Intent(MainActivity.this,Activity2.class);
                startActivity(s1tos2);
            }
        });
        a1toa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s1tos3=new Intent(MainActivity.this,Activity3.class);
                startActivity(s1tos3);
            }
        });

        yazid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sound=MediaPlayer.create(MainActivity.this,R.raw.track2);
                Sound.start();
            }
        });

    }
}