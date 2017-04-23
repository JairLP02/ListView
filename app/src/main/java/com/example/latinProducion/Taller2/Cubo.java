package com.example.latinProducion.Taller2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cubo extends AppCompatActivity {
    private EditText val;
    private Resources res;
    private Bundle b;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        res=this.getResources();
        i=new Intent(this,Resultados.class);
        b=new Bundle();
        val=(EditText)findViewById(R.id.txtAristaCubo);
    }

    public void Calcular_cubo(View v){
        if (validar()){
            int resultado,a;
            String tipo,dato,valor;
            valor=val.getText().toString().trim();
            a=Integer.parseInt(valor);
            tipo=res.getString(R.string.tipo_circulo);
            resultado= (int)Math.PI*a*a;
            dato=res.getString(R.string.lado)+": "+valor;


            Operacion o=new Operacion(tipo,dato,resultado);
            o.guardar();
            b.putString("Resultado",String.valueOf(resultado));
            b.putString("Tipo",res.getString(R.string.area));
            b.putString("Figura",res.getString(R.string.circulo));
            Limpiar_circulo();
            i.putExtras(b);
            startActivity(i);
        }
    }

    public void borrar(View v){
        Limpiar_circulo();
    }

    public void Limpiar_circulo(){
        val.setText("");
        val.requestFocus();
    }

    public boolean validar(){
        if (val.getText().toString().isEmpty()){
            val.setError(res.getString(R.string.error));
            return false;
        }
        return true;
    }
}