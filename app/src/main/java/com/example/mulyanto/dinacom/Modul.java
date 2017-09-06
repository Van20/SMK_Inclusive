package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Modul extends AppCompatActivity {
    Button btnmotherboard, btnprosesor, btnram, btnvga, btnpower, btnnext, btnback;
    MediaPlayer clickmodul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modul);
        btnmotherboard = (Button) findViewById(R.id.btnmotherboard);
        btnprosesor = (Button) findViewById(R.id.btnprosesor);
        btnram = (Button) findViewById(R.id.btnram);
        btnvga = (Button) findViewById(R.id.btnvga);
        btnpower = (Button) findViewById(R.id.btnpower);
        btnnext = (Button) findViewById(R.id.btnnext);
        btnback = (Button) findViewById(R.id.btn_kembali);
        clickmodul= MediaPlayer.create(this, R.raw.button);

        btnmotherboard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Motherboard.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });

        btnprosesor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Prosesor.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });

        btnram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        RAM.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });

        btnvga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        VGA.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });

        btnpower.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        PowerSupply.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });

        btnnext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Modul2.class);
                clickmodul.start();
                clickmodul.setVolume(1,1);
                startActivity(app);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickmodul.start();
                clickmodul.setVolume(1,1);
                Modul.this.finish();
            }
        });
    }
}
