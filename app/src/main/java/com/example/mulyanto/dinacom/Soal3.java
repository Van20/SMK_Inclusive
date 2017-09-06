package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Soal3 extends AppCompatActivity {
    Button next_soal;
    RadioButton pilihan_A,pilihan_B,pilihan_C,pilihan_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        next_soal = (Button) findViewById(R.id.button1);
        pilihan_A = (RadioButton) findViewById(R.id.piliha);
        pilihan_B = (RadioButton) findViewById(R.id.pilihb);
        pilihan_C = (RadioButton) findViewById(R.id.pilihc);
        pilihan_D = (RadioButton) findViewById(R.id.pilihd);

        next_soal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                //MENERIMA CROSSPAGE NILAI
                Intent cross = getIntent();
                final String hasilq2 = (cross.getStringExtra("q2hasilq"));

                //Mengubah hasil crosspage nilai dari string ke integer
                int q2 = Integer.parseInt(hasilq2);

                //DEKLARASI INTEGER
                int q3hasil = 0;
                //PEMBERIAN NILAI DAN PENGECEKAN
                if(pilihan_D.isChecked()){
                    q3hasil = 10;
                }else{
                    q3hasil = 0;
                }
                //MENAMBAHKAN NILAI q1 DAN q2hasil
                int q3 = q2 + q3hasil;

                //String CONVERT
                String q3hasilq = Integer.toString(q3);

                //cross page nilai
                Intent cross2 = new Intent(getApplicationContext(), Soal4.class);
                cross2.putExtra("q3hasilq", q3hasilq);
                Soal3.this.finish();
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