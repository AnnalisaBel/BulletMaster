package com.example.bulletmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
     Button butstartgame = findViewById(R.id.butstartgame);
        butstartgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intgotolev = new Intent(StartActivity.this, LevelsActivity.class);
                startActivity(intgotolev);
            }
        });
}
