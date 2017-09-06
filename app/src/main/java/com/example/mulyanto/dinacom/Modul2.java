package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Modul2 extends AppCompatActivity {
    Button btnhdd, btncmos, btnbios, btnheatsink, btnletak, btnback;
    MediaPlayer clickmodul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul2);
        btnhdd = (Button) findViewById(R.id.btnhdd);
        btncmos = (Button) findViewById(R.id.btncmos);
        btnbios = (Button) findViewById(R.id.btnbios);
        btnheatsink = (Button) findViewById(R.id.btnheatsink);
        btnletak = (Button) findViewById(R.id.btnletak);
        btnback = (Button) findViewById(R.id.btnback);
        clickmodul2= MediaPlayer.create(this, R.raw.button);

        btnhdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Harddisk.class);
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                startActivity(app);
            }
        });

        btncmos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Cmos.class);
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                startActivity(app);
            }
        });

        btnbios.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Bios.class);
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                startActivity(app);
            }
        });

        btnheatsink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Heatsink.class);
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                startActivity(app);
            }
        });

        btnletak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Letak.class);
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                startActivity(app);
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickmodul2.start();
                clickmodul2.setVolume(1,1);
                Modul2.this.finish();
            }
        });
    }
}