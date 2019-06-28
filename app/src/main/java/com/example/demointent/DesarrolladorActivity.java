package com.example.demointent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesarrolladorActivity extends AppCompatActivity {


    private Button buttonLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarrollador);
        getSupportActionBar().hide();
        this.cargarComponenes();
    }


    private void cargarComponenes(){
        buttonLlamar= findViewById(R.id.buttonLlamar);

        buttonLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lanzarTelefono();
            }
        });
    }
    public void lanzarTelefono(){
        //String tel=buttonLlamar.getText().toString();
        String tel="+5492954526743";
        //Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel://"+tel));
        //startActivity(i);

        Intent callIntent = new Intent( Intent.ACTION_DIAL );
        callIntent.setData( Uri.parse( "tel:" + tel ) );
        startActivity( callIntent );
    }
}
