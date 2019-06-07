package com.example.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmail, editTextPass;
    private Button buttonIngresar, buttonRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ocultamos barra de titulo (action bar)
        getSupportActionBar().hide();
        this.cargarComponenes();


    }

    private void cargarComponenes() {
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPass = findViewById(R.id.editTextPass);
        buttonIngresar= findViewById(R.id.buttonIngresar);
        buttonRegistrar= findViewById(R.id.buttonRegistrar);

        buttonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarUsuario();
            }
        });
        buttonRegistrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                registrarUsuario();
            }
        });
    }
    private void validarUsuario(){

        String e = editTextEmail.getText().toString();
        String p = editTextPass.getText().toString();
        //verificamos credenciales del usuaruoi
        if(e.equals("ites")&& p.equals("1234")){

            Intent intent = new Intent (MainActivity.this, HomeActivity.class);

            intent.putExtra("EXTRA_EMAIL", e);

            startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Datos Incorrectos, Reintente", Toast.LENGTH_SHORT).show();

        }
    }


    private void registrarUsuario(){

        Intent intent = new Intent(MainActivity.this, MuniActivity.class);
        startActivity(intent);
        finish();

    }
}
