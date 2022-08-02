package com.programacion.servicios;

//@ApplicationScoped
public class ServicioLogImpl implements ServicioLog {

    @Override
    public void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}
