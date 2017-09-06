package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Praktikum1_Jaringan extends AppCompatActivity {

    Button pilih_cpu, salah1, salah2, salah3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum1_jaringan);
        pilih_cpu = (Button) this.findViewById(R.id.pilih_cpu);
        salah1 = (Button) this.findViewById(R.id.btnsalahpr11);
        salah2 = (Button) this.findViewById(R.id.btnsalahpr12);
        salah3 = (Button) this.findViewById(R.id.btnsalahpr13);


        pilih_cpu.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {

                                         pilih_cpu.setBackgroundResource(R.drawable.pilih_cpu);

                                                 AlertDialog.Builder exit = new AlertDialog.Builder(Praktikum1_Jaringan.this);
                                                 exit.setMessage("Jawaban anda benar, Lanjut ke praktikum selanjutnya?").setCancelable(false)
                                                         .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                                             @Override
                                                             public void onClick(DialogInterface dialog, int id) {
                                                                 Intent app = new Intent(getApplicationContext(),
                                                                         Praktikum2_Jaringan.class);
                                                                 startActivity(app);
                                                                 Praktikum1_Jaringan.this.finish();
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
        salah1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum1_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum1_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum1_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });


                                     }
    @Override
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan pratikum terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
                                 }
