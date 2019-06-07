package com.example.demointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MuniActivity extends AppCompatActivity {

    private Button buttonregistrar, buttoncancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muni);
        getSupportActionBar().hide();
        this.cargarComponenes();

    }

    private void cargarComponenes() {
        buttonregistrar = findViewById(R.id.buttonRegistrar);
        buttoncancelar = findViewById(R.id.buttoncancelar);
    }



}