package com.programacion.servlets;


import com.programacion.servicios.Operaciones;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/sumar")
public class SumarServlet  extends HttpServlet {

    @Inject
    private Operaciones servicio;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int ret = servicio.sumar(5,90);

        PrintWriter pw = resp.getWriter();

        resp.setContentType("text/html");

        pw.printf("la suma es: %d", ret);
    }
}
