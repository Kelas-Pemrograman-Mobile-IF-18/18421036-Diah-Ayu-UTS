package com.diyah.aplikasipenjualanjilbab.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.diyah.aplikasipenjualanjilbab.R;
import com.ornach.nobobutton.NoboButton;

public class Registrasi extends AppCompatActivity {
    Button btnLogin;
    NoboButton btnkeLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();

        btnkeLogin = (NoboButton) findViewById(R.id.btnkeLogin);
        btnkeLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}