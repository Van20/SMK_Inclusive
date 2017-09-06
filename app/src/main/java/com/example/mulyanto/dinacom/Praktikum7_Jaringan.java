package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Praktikum7_Jaringan extends AppCompatActivity {

    Button btnback;
    MediaPlayer clickpra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum7__jaringan);
        btnback= (Button) this.findViewById(R.id.btnkembali);
        clickpra = MediaPlayer.create(this, R.raw.button);
        Toast.makeText(Praktikum7_Jaringan.this, "Selamat anda telah menyelesaikan praktikum!!!", Toast.LENGTH_SHORT).show();

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickpra.start();
                clickpra.setVolume(1,1);
                Praktikum7_Jaringan.this.finish();
            }
        });

    }
}