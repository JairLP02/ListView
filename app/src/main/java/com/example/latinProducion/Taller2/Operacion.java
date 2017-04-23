package com.example.latinProducion.Taller2;

/**
 * Created by david on 20/04/2017.
 */

public class Operacion {
    private String operacion;
    private String datos;
    private int resultado;

    public Operacion(String operacion, String datos, int resultado) {
        this.operacion = operacion;
        this.datos = datos;
        this.resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getDatos() {
        return datos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}
