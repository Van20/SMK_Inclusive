package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Soal1 extends AppCompatActivity {

    Button next_soal;
    RadioButton pilihan_A,pilihan_B,pilihan_C,pilihan_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);

        next_soal = (Button) findViewById(R.id.btn_next);
        pilihan_A = (RadioButton) findViewById(R.id.piliha);
        pilihan_B = (RadioButton) findViewById(R.id.pilihb);
        pilihan_C = (RadioButton) findViewById(R.id.pilihc);
        pilihan_D = (RadioButton) findViewById(R.id.pilihd);

        next_soal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                //DEKLARASI INTEGER
                int q1hasil = 0;
                //PEMBERIAN NILAI DAN PENGECEKAN
                if(pilihan_B.isChecked()){
                    q1hasil = 10;
                }else{
                    q1hasil = 0;
                }
                //String CONVERT
                String q1hasilq = Integer.toString(q1hasil);
                //cross page nilai
                Intent cross = new Intent(getApplicationContext(), Soal2.class);
                cross.putExtra("q1hasilq", q1hasilq);
                Soal1.this.finish();
                startActivity(cross);

            }
        });
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan soal terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}
