package com.example.latinProducion.Taller2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rectangulo extends AppCompatActivity {
    private EditText val1,val2;
    private Resources res;
    private Bundle b;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        val1=(EditText)findViewById(R.id.txtValorRectangulo1);
        val2=(EditText)findViewById(R.id.txtValorRectangulo2);
        res=this.getResources();
        i=new Intent(this,Resultados.class);
        b=new Bundle();
    }

    public void calcularRectangulo(View v){
        if (validar()){
            String valor1,valor2,tipo,datos,lado;
            int resultado,a,c;
            valor1=val1.getText().toString().trim();
            valor2=val2.getText().toString().trim();
            a=Integer.parseInt(valor1);
            c=Integer.parseInt(valor2);
            resultado=a*c;
            lado=res.getString(R.string.lado);
            tipo=res.getString(R.string.tipo_rectangulo);
            datos=lado+": "+valor1+" "+lado+": "+valor2;

            Operacion o=new Operacion(tipo,datos,resultado);
            o.guardar();
            b.putString("Resultado",String.valueOf(resultado));
            b.putString("Tipo",res.getString(R.string.area));
            b.putString("Figura",res.getString(R.string.rectangulo));
            i.putExtras(b);
            limpiarRectangulo();
            startActivity(i);
        }
    }

    public boolean validar(){
        if (val1.getText().toString().isEmpty()){
            val1.setError(res.getString(R.string.error));
            return false;
        }
        if (val2.getText().toString().isEmpty()){
            val2.setError(res.getString(R.string.error));
            return false;
        }
        return true;
    }

    public void borrar(View v){
        limpiarRectangulo();
    }

    public void limpiarRectangulo(){
        val1.setText("");
        val2.setText("");
        val1.requestFocus();
    }
}
