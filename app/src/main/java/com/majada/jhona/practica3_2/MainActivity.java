package com.majada.jhona.practica3_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int resp = 0;
    private EditText et1;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.et1);
        tv1 = (TextView) findViewById(R.id.tv1);
    }
    public void verificar(View v){
        Intent intent = new Intent(this, Verificar.class);
        intent.putExtra("nombre", et1.getText().toString());
        startActivityForResult(intent, resp);
    }

    //Sobreescribo este metodo para ejecutar la actividad verificar y
    // esperar un resultado para luego cambiar el texto en pantalla.
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        //Comparo el codigo del resultado y cambio el texto dependiento la respueta.
        if (requestCode == resp){
            switch (resultCode) {
                case RESULT_OK:
                      tv1.setText("Resultado: Aceptar");
                    break;
                case RESULT_CANCELED:
                      tv1.setText("Resultado: Rechazado");
                    break;
            }
        }
        //Al finalizar dejo el campo en blanco.
        et1.setText("");
    }
}
