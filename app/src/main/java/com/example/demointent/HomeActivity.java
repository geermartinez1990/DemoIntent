package com.example.demointent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText editTextUrl, editTextNum;
    private Button buttonNavegar, buttonSms, buttonLlamar, buttonDesorrollador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String email = bundle.getString("EXTRA_EMAIL");

        setTitle("Bienvenido "+ email);

        cargarComponentes();

    }
//crear un menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu_tp3,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.acercade_menu:
                levantarAcercade();
            case R.id.salir_menu:
                finish();
            return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private void cargarComponentes(){
        editTextUrl= findViewById(R.id.editTextUrl);
       // editTextNum=findViewById(R.id.editTextNum);

        buttonNavegar=findViewById(R.id.buttonNavegar);
        buttonSms=findViewById(R.id.buttonSms);
        buttonLlamar=findViewById(R.id.buttonLlamar);
        buttonDesorrollador=findViewById(R.id.buttonDesarrollador);

        buttonLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarTelefono();
            }
        });
        buttonDesorrollador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datosDesarrollador();
            }
        });
    }

    public void lanzarTelefono(){
        //String tel=editTextNum.getText().toString();
        //Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel://"+tel));
        //startActivity(i);
        String tel= "381991";
        Intent callIntent = new Intent( Intent.ACTION_DIAL);
        callIntent.setData( Uri.parse( "tel:" + tel ) );
        startActivity( callIntent );
    }
    public void lanzarWeb(View v){
        Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse("https://toay.gob.ar/"));
        startActivity(i);
    }
    public void lanzarSms(View v){
        //String tel= editTextNum.getText().toString();
        String tel="2954526743";
        Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("2954526743"));
        //i.putExtra("SMS_BODY", editTextUrl.getText().toString());
        i.putExtra("SMS_BODY", "tel"+tel);
        startActivity(i);
    }

    private void levantarAcercade(){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cdtoay.com.ar/"));
        startActivity(i);

    }

    private void datosDesarrollador(){
        Intent intent = new Intent (HomeActivity.this, DesarrolladorActivity.class);

        startActivity(intent);
        //finish();
    }
}
