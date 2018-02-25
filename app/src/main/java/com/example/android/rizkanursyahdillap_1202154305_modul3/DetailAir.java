package com.example.android.rizkanursyahdillap_1202154305_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailAir extends AppCompatActivity {

    ImageView imgL, bottle;
    TextView Title, Liter, deskripsi;
    ImageButton btnMinus, btnPlus;


    int liter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_air);

        Intent intent = getIntent();

        imgL = findViewById(R.id.imageView);
        bottle = findViewById(R.id.botol);
        Title = findViewById(R.id.textTitle);
        deskripsi = findViewById(R.id.desc);
        Liter = findViewById(R.id.Liter);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);


        int image = intent.getIntExtra("Gambar", 0);
        imgL.setImageResource(image);
        Title.setText(intent.getStringExtra("judul"));
        deskripsi.setText(intent.getStringExtra("Deskripsi"));

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter--;
                update_gambar(liter);
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liter++;
                update_gambar(liter);
            }
        });
    }

    private void update_gambar(int liter) {
        switch (liter) {
            case 0:
                btnMinus.setEnabled(false);
                btnPlus.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_empty);
                Liter.setText(String.valueOf(liter) + "L");

                Toast.makeText(getApplicationContext(),
                        "Sedikitttt nih",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
            case 1:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_50);
                Liter.setText(String.valueOf(liter) + "L");
                break;
            case 2:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_80);
                Liter.setText(String.valueOf(liter) + "L");
                break;
            case 3:
                btnMinus.setEnabled(true);
                btnPlus.setEnabled(true);

                bottle.setImageResource(R.drawable.ic_full);
                Liter.setText(String.valueOf(liter) + "L");
                Toast.makeText(getApplicationContext(),
                        "Airrrr Full",
                        Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }
}