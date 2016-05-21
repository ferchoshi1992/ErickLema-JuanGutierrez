package com.example.hp.citasmedicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginMedico extends AppCompatActivity implements View.OnClickListener{

    Button btnIngresoMedico;
    EditText etUsuarioname, etContrania;
    TextView registerLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_medico);

        etUsuarioname = (EditText) findViewById(R.id.editTextUsuario);
        etContrania = (EditText) findViewById(R.id.editTextContrasenia);
        btnIngresoMedico = (Button) findViewById(R.id.buttonIngresoMedico);
        registerLink = (TextView) findViewById(R.id.textViewNuevoRegistro);

        btnIngresoMedico.setOnClickListener(this);
        registerLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonIngresoMedico:

                break;
            case R.id.textViewNuevoRegistro:

                startActivity(new Intent(this, RegistroMedico.class));

                break;


        }
    }
}
