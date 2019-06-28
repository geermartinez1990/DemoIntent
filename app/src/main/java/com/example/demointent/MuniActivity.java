package com.example.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.demointent.R.id.TextUsuario;

public class MuniActivity extends AppCompatActivity {

    private Button buttonregistrar, buttoncancelar;
   // private EditText editTextUsuario, editTextPass;

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
        /*editTextUsuario = findViewById(TextUsuario);
        editTextPass=findViewById(R.id.TextPass);
        buttonregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validarUsuario();
            }
        });*/
    }

    /*private void validarUsuario() {

        String e=editTextUsuario.getText().toString();
        String p=editTextPass.getText().toString();

        if ((!e.isEmpty()) && (!p.isEmpty())){

            Intent intent = new Intent(this, MainActivity.class);

            intent.putExtra("EXTRA_USUARIO", e);
            intent.putExtra("EXTRA_PASS", p);

            startActivity(intent);
            finish();

        }
        else{
            Toast.makeText(this, "Datos incorrectos, Reintente",
                    Toast.LENGTH_SHORT).show();
        }
    }


    }*/

}