package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Praktikum2_Jaringan extends AppCompatActivity {

    Button pilih_cmos, salah1, salah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum2__jaringan);
        pilih_cmos = (Button) this.findViewById(R.id.pilih_cmos);
        salah1 = (Button) this.findViewById(R.id.btnsalahpr21);
        salah2 = (Button) this.findViewById(R.id.btnsalahpr22);

        pilih_cmos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pilih_cmos.setBackgroundResource(R.drawable.pilih_cmos);

                AlertDialog.Builder exit = new AlertDialog.Builder(Praktikum2_Jaringan.this);
                exit.setMessage("Jawaban anda benar, Lanjut ke praktikum selanjutnya?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {

                                    Intent app = new Intent(getApplicationContext(),
                                                Praktikum3_Jaringan.class);
                                    startActivity(app);
                                Praktikum2_Jaringan.this.finish();

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
                Toast.makeText(Praktikum2_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum2_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan pratikum terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}