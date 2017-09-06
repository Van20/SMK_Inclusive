package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Praktikum4_Jaringan extends AppCompatActivity {

    Button pilih_ram, salah1, salah2, salah3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum4__jaringan);
        pilih_ram = (Button) this.findViewById(R.id.pilih_ram);
        salah1 = (Button) this.findViewById(R.id.btnsalahpr41);
        salah2 = (Button) this.findViewById(R.id.btnsalahpr42);
        salah3 = (Button) this.findViewById(R.id.btnsalahpr43);



        pilih_ram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pilih_ram.setBackgroundResource(R.drawable.pilih_ram);

                AlertDialog.Builder exit = new AlertDialog.Builder(Praktikum4_Jaringan.this);
                exit.setMessage("Jawaban anda benar, Lanjut ke praktikum selanjutnya?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                Intent app = new Intent(getApplicationContext(),
                                        Praktikum5_Jaringan.class);
                                startActivity(app);
                                Praktikum4_Jaringan.this.finish();
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
                Toast.makeText(Praktikum4_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum4_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum4_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });

    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan pratikum terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}