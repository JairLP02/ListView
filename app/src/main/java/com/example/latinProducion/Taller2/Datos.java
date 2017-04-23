package com.example.latinProducion.Taller2;

import java.util.ArrayList;

/**
 * Created by david on 20/04/2017.
 */

public class Datos {
    public static ArrayList<Operacion> operaciones= new ArrayList();

    public static void guardar(Operacion o){
        operaciones.add(o);
    }

    public static ArrayList<Operacion> getOperaciones() {
        return operaciones;
    }
}
