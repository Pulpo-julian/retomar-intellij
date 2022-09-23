package com.julian.soporte.webapp.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/imprimir-hola-mundo")
public class servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("	<head>");
        out.println("		<meta charset=\"UTF-8\">");
        out.println("		<title>hola mundo desde servlet</title>");
        out.println("	</head>");
        out.println("	<body>");
        out.println("		<h1>Este servlet te dice Hola!!</h1>");
        out.println("	</body>");
        out.println("</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}
