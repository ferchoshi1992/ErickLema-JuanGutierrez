package com.example.hp.citasmedicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroMedico extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistroMedico;
    EditText etNombre, etApellido, etIdUsuario, etNombreConsultorio, etContraseniaRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_medico);

        etNombre = (EditText) findViewById(R.id.editTextNombre);
        etApellido = (EditText) findViewById(R.id.editTextApellidos);
        etIdUsuario = (EditText) findViewById(R.id.editTextIdUsuario);
        etNombreConsultorio = (EditText) findViewById(R.id.editTextNombreConsultorio);
        etContraseniaRegistro = (EditText)findViewById(R.id.editTextContraseniaRegistro);
        btnRegistroMedico = (Button) findViewById(R.id.buttonRegistroMedico);

        btnRegistroMedico.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonRegistroMedico:
                break;

        }
    }
}
