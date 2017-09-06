package com.example.mulyanto.dinacom;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Praktikum3_Jaringan extends AppCompatActivity {

    Button pilih_vga, salah1, salah2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praktikum3__jaringan);
        pilih_vga = (Button) this.findViewById(R.id.pilih_vga);
        salah1 = (Button) this.findViewById(R.id.btnsalahpr31);
        salah2 = (Button) this.findViewById(R.id.btnsalahpr32);

        pilih_vga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pilih_vga.setBackgroundResource(R.drawable.pilih_vga);

                AlertDialog.Builder exit = new AlertDialog.Builder(Praktikum3_Jaringan.this);
                exit.setMessage("Jawaban anda benar, Lanjut ke praktikum selanjutnya?").setCancelable(false)
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                Intent app = new Intent(getApplicationContext(),
                                        Praktikum4_Jaringan.class);
                                startActivity(app);
                                Praktikum3_Jaringan.this.finish();
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
                Toast.makeText(Praktikum3_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
        salah2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Praktikum3_Jaringan.this, "Letaknya tidak disitu, coba cari lagi!", Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan pratikum terlebih dahulu!!", Toast.LENGTH_SHORT).show();
        return;
    }
}