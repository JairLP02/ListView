package com.example.latinProducion.Taller2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {
    private TextView titulo,mensaje;
    private Bundle b;
    private Intent i;
    private String tipo,result,titu,aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        titulo=(TextView)findViewById(R.id.txtTitulo);
        mensaje=(TextView)findViewById(R.id.txtMensaje);
        b=getIntent().getExtras();
        tipo=b.getString("Tipo");
        result=b.getString("Resultado");
        titu=b.getString("Figura");
        i=new Intent(this,Principal.class);

        aux=tipo+":"+" "+result;
        titulo.setText(titu);
        mensaje.setText(aux);
    }

    public void Aceptar(View v){
        startActivity(i);
    }
}
