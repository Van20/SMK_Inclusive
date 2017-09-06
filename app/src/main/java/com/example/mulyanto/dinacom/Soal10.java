package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Soal10 extends AppCompatActivity {
    Button next_soal;
    RadioButton pilihan_A,pilihan_B,pilihan_C,pilihan_D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal10);

        next_soal = (Button) findViewById(R.id.button8);
        pilihan_A = (RadioButton) findViewById(R.id.piliha);
        pilihan_B = (RadioButton) findViewById(R.id.pilihb);
        pilihan_C = (RadioButton) findViewById(R.id.pilihc);
        pilihan_D = (RadioButton) findViewById(R.id.pilihd);

        next_soal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder exit = new AlertDialog.Builder(Soal10.this);
                exit.setMessage("Apakah Anda sudah yakin menyelesaikan evaluasi?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                Intent cross = getIntent();
                                final String hasilq9 = (cross.getStringExtra("q9hasilq"));


                                int q9 = Integer.parseInt(hasilq9);


                                int q10hasil = 0;

                                if(pilihan_A.isChecked()){
                                    q10hasil = 10;
                                }else{
                                    q10hasil = 0;
                                }

                                int q10 = q9 + q10hasil;


                                String q10hasilq = Integer.toString(q10);



                                Intent cross2 = new Intent(getApplicationContext(), Hasil.class);
                                cross2.putExtra("q10hasilq", q10hasilq);
                                Soal10.this.finish();
                                startActivity(cross2);
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
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan soal terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}