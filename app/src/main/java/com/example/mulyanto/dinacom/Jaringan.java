package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jaringan extends AppCompatActivity {
    Button btnmateri, btnpraktikum, btnevaluasi, img, back;
    MediaPlayer clickjaringan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaringan);
        btnmateri = (Button) findViewById(R.id.btnmateri);
        btnpraktikum= (Button) findViewById(R.id.btnpraktikum);
        btnevaluasi = (Button) findViewById(R.id.btnevaluasi);
        img = (Button) findViewById(R.id.button);
        back = (Button) findViewById(R.id.kembali);
        clickjaringan = MediaPlayer.create(this, R.raw.button);

        btnmateri.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Modul.class);
                startActivity(app);
                clickjaringan.start();
                clickjaringan.setVolume(1,1);
            }
        });

        btnpraktikum.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Praktikum1_Jaringan.class);
                startActivity(app);
                clickjaringan.start();
                clickjaringan.setVolume(1,1);
            }
        });

        btnevaluasi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Soal1.class);
                startActivity(app);
                clickjaringan.start();
                clickjaringan.setVolume(1,1);

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickjaringan.start();
                clickjaringan.setVolume(1,1);
                Jaringan.this.finish();
            }
        });
    }
}
