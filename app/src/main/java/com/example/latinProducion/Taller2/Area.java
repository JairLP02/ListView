package com.example.latinProducion.Taller2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Area extends AppCompatActivity {
    private ListView ls;
    private Resources res;
    private String[] opc;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);
        ls=(ListView)findViewById(R.id.listArea);
        res=this.getResources();
        opc=res.getStringArray(R.array.opciones_area);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,opc);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        i = new Intent(Area.this, Cuadrado.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(Area.this, Rectangulo.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(Area.this, Triangulo.class);
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(Area.this, Circulo.class);
                        startActivity(i);
                        break;
                }
            }
        });
    }
}
