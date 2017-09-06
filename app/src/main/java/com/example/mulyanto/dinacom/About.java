package com.example.mulyanto.dinacom;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    Button btncredit;
    MediaPlayer clickabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btncredit = (Button) findViewById(R.id.btncredit);
        clickabout= MediaPlayer.create(this, R.raw.button);

        btncredit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(),
                        Credit.class);
                startActivity(app);
                clickabout.start();
                clickabout.setVolume(1,1);
                About.this.finish();
            }
        });
    }
}
