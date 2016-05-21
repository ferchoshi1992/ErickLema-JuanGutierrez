package com.example.hp.citasmedicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CitasActivity extends AppCompatActivity {

    Button btnMedicoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citas);


        btnMedicoLogin = (Button)findViewById(R.id.buttonMedicoLogin);

        btnMedicoLogin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //Codigo para lanzar un nuevo Activity
                Intent btnMedicoLogin = new Intent(CitasActivity.this,LoginMedico.class);
                startActivity(btnMedicoLogin);
            }
        });
    }


    }

