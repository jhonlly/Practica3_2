package com.majada.jhona.practica3_2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Verificar extends AppCompatActivity {
    private TextView tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar);
        tv2 =(TextView) findViewById(R.id.tv2);
        Bundle nombre =  getIntent().getExtras();
        String n =nombre.getString("nombre");
        tv2.setText("Hola, "+ n + ", ¿Aceptas las condiciones?");
    }
//Al pulsar el botón aceptar se ejectura este método que configura el resultado como RESULT_OK.
    public void aceptar(View v){
        setResult(RESULT_OK);
        finish();
    }
    //Al pulsar el botón aceptar se ejectura este método que configura el resultado como  RESULT_CANCELED.
    public void rechazar(View v){
        setResult(RESULT_CANCELED);
        finish();
    }

}
