package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Play extends AppCompatActivity {
    Button btnjaringan, btnprogram, btntab, btnotomotif, btntele, btntb, balik;
    MediaPlayer clickplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        btnjaringan = (Button) findViewById(R.id.btnjaringan);
        btnprogram = (Button) findViewById(R.id.btnprogram);
        btntab = (Button) findViewById(R.id.btntab);
        btnotomotif = (Button) findViewById(R.id.btnotomotif);
        btntele = (Button) findViewById(R.id.btntele);
        btntb = (Button) findViewById(R.id.btnbangunan);
        clickplay = MediaPlayer.create(this, R.raw.button);
        balik = (Button) findViewById(R.id.balek);

        btnjaringan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Jaringan.class);
                clickplay.start();
                clickplay.setVolume(1,1);
                startActivity(app);
            }
        });

        btnprogram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Play.this, "Dapatkan fitur pada versi selanjutnya!!", Toast.LENGTH_SHORT).show();
                clickplay.start();
                clickplay.setVolume(1,1);

            }
        });

        btntab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Play.this, "Dapatkan fitur pada versi selanjutnya!!", Toast.LENGTH_SHORT).show();
                clickplay.start();
                clickplay.setVolume(1,1);

            }
        });

        btnotomotif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Play.this, "Dapatkan fitur pada versi selanjutnya!!", Toast.LENGTH_SHORT).show();
                clickplay.start();
                clickplay.setVolume(1,1);

            }
        });

        btntele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Play.this, "Dapatkan fitur pada versi selanjutnya!!", Toast.LENGTH_SHORT).show();
                clickplay.start();
                clickplay.setVolume(1,1);

            }
        });

        btntb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Play.this, "Dapatkan fitur pada versi selanjutnya!!", Toast.LENGTH_SHORT).show();
                clickplay.start();
                clickplay.setVolume(1,1);

            }
        });
        balik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickplay.start();
                clickplay.setVolume(1,1);
                Play.this.finish();

            }
        });
    }
}
