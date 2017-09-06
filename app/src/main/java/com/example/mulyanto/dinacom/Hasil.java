package com.example.mulyanto.dinacom;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Hasil extends AppCompatActivity {
    TextView textHasil;
    Button btnmenu;
    MediaPlayer clickhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        textHasil = (TextView) findViewById(R.id.txthasil);
        btnmenu = (Button) findViewById(R.id.btnmenu);
        clickhasil= MediaPlayer.create(this, R.raw.button);
        Toast.makeText(Hasil.this, "Selamat anda telah menyelesaikan evaluasi!!!", Toast.LENGTH_SHORT).show();

        //MENERIMA CROSSPAGE NILAI
        Intent cross5 = getIntent();
        final String hasilq10 = (cross5.getStringExtra("q10hasilq"));
        int q10 = Integer.parseInt(hasilq10);


        //Menampilkan nilai
        textHasil.setText(hasilq10);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickhasil.start();
                clickhasil.setVolume(1,1);
                Hasil.this.finish();

            }
        });

    }
    @Override
    public void onBackPressed(){
        Hasil.this.finish();
    }
}