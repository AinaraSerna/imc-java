/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cloud.nivel4.ud2.imc.java.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ainar
 */
@WebServlet(name = "ServletIMC", urlPatterns = {"/ServletIMC"})
public class ServletIMC extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            float peso = Float.parseFloat(request.getParameter("peso"));
            float altura = Float.parseFloat(request.getParameter("altura"));
            
            double imc = Math.round(peso / Math.pow(altura, 2));
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>IMC</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Índice de masa corporal (IMC)</h1>");
            out.println("<dt><dl>Peso: "+ peso + "</dl>");
            out.println("<dl>Altura: " + altura + "</dl>");
            out.println("<dl>IMC: " + imc + "</dl></dt>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
