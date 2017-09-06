package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Soal5 extends AppCompatActivity {
    Button next_soal;
    RadioButton pilihan_A,pilihan_B,pilihan_C,pilihan_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        next_soal = (Button) findViewById(R.id.button3);
        pilihan_A = (RadioButton) findViewById(R.id.piliha);
        pilihan_B = (RadioButton) findViewById(R.id.pilihb);
        pilihan_C = (RadioButton) findViewById(R.id.pilihc);
        pilihan_D = (RadioButton) findViewById(R.id.pilihd);

        next_soal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //MENERIMA CROSSPAGE NILAI
                Intent cross = getIntent();
                final String hasilq4 = (cross.getStringExtra("q4hasilq"));

                //Mengubah hasil crosspage nilai dari string ke integer
                int q4 = Integer.parseInt(hasilq4);

                //DEKLARASI INTEGER
                int q5hasil = 0;
                //PEMBERIAN NILAI DAN PENGECEKAN
                if(pilihan_C.isChecked()){
                    q5hasil = 10;
                }else{
                    q5hasil = 0;
                }
                //MENAMBAHKAN NILAI q1 DAN q2hasil
                int q5 = q4 + q5hasil;

                //String CONVERT
                String q5hasilq = Integer.toString(q5);

                //cross page nilai
                Intent cross2 = new Intent(getApplicationContext(), Soal6.class);
                cross2.putExtra("q5hasilq", q5hasilq);
                Soal5.this.finish();
                startActivity(cross2);

            }
        });
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan soal terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}