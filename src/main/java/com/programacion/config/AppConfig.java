package com.programacion.config;

import com.programacion.servicios.ServicioLog;
import com.programacion.servicios.ServicioLogImpl;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

public class AppConfig {

    @Produces
    @ApplicationScoped
    public ServicioLog createLog(){
        System.out.println("************PRODUCTOR");
        return new ServicioLogImpl();
    }


}
