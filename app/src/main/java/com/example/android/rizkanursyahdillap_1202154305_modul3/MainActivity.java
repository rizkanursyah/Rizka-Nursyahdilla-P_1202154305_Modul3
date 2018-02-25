package com.example.android.rizkanursyahdillap_1202154305_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password; //atribut untuk edit text
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        username = (EditText) findViewById(R.id.user); //implementasi input untuk username
        password = (EditText) findViewById(R.id.pass); //implementasi input untuk password

        if (username.getText().toString().equals("EAD") && password.getText().toString().equals("MOBILE")){//equals menyamakan edit text dengan inputan && untuk kondisi apabila keduangya harus benar
            startActivity(new Intent(getApplicationContext(), Main2Activity.class));
        Toast.makeText(getApplicationContext(), "Selamat Login berhasil", Toast.LENGTH_SHORT).show(); //toast jika login berhasil
        }
        else {
            Toast.makeText(getApplicationContext(),"Login gagal!",Toast.LENGTH_SHORT).show();//kondisi jika  login gagal
        }
    }
}
