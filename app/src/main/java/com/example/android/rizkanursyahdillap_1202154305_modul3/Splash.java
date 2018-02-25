package com.example.android.rizkanursyahdillap_1202154305_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler(); //deklarasi objek handler
        handler.postDelayed(new Runnable() { //postdelayed menangani splash screen untuk berjalan berapa lam
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));//intent
                finish();
            }
        },5000L); //5detik L = length
    }
}
