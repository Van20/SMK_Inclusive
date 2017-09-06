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


public class MainActivity extends AppCompatActivity {
    Button btnabout, btnplay, btnexit, musicon, musicoff;
    MediaPlayer audioBackground, clickmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = (Button) findViewById(R.id.btnplay);
        btnabout = (Button) findViewById(R.id.btnabout);
        btnexit = (Button) findViewById(R.id.btnexit);
        musicoff = (Button) findViewById(R.id.musicoff);
        musicon = (Button) findViewById(R.id.musicon);
        clickmain = MediaPlayer.create(this, R.raw.button);
        audioBackground = MediaPlayer.create(this, R.raw.sound);
        audioBackground.start();
        audioBackground.setLooping(true);
        Toast.makeText(this, "Selamat datang di SMK Inclusive demo version", Toast.LENGTH_SHORT).show();

        btnabout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        About.class);
                clickmain.start();
                clickmain.setVolume(1,1);
                startActivity(app);
            }
        });

        btnplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Play.class);
                clickmain.start();
                clickmain.setVolume(1,1);
                startActivity(app);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickmain.start();
                clickmain.setVolume(1,1);
                AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);
                exit.setMessage("Apakah Anda Benar ingin keluar?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                MainActivity.this.finish();
                                audioBackground.stop();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int arg1) {
                                dialog.cancel();

                            }
                        }).show();
            }
        });

        musicon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                audioBackground.setLooping(true);
                audioBackground.setVolume(1,1);
            }
        });
        musicoff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                audioBackground.setLooping(true);
                audioBackground.setVolume(0,0);
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MainActivity.this.finish();
        audioBackground.stop();
    }

}
