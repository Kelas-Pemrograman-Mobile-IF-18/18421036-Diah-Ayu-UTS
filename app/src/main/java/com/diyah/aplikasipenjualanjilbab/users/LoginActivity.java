package com.diyah.aplikasipenjualanjilbab.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.diyah.aplikasipenjualanjilbab.Admin.HomeAdmin;
import com.diyah.aplikasipenjualanjilbab.R;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {
    Button btnRegistrasi;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);
        btnLogin = (NoboButton) findViewById(R.id.btnLogin);

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, Registrasi.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdmin.class);
                startActivity(i);
                finish();
            }
        });
    }
}