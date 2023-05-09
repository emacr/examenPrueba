/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulatina.servlet.examen;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Usuario", urlPatterns = {"/Usuario"})
public class Usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
             out.println("");
           
        }
        }
           
            public class CalcularMontoServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       //Obtener los parámetros enviados por el usuario
        String[] aperitivos = request.getParameterValues("aperitivos");
        String[] platos = request.getParameterValues("plato-favorito");
        String[] bebidas = request.getParameterValues("bebida");
        String modoPago = request.getParameter("metodoPago");
        boolean express = request.getParameter("express") != null;
        
        //Calcular el costo de las comidas
        int costoAperitivos = aperitivos != null ? aperitivos.length * 3500 : 0;
        int costoPlatos = platos != null ? platos.length * 6800 : 0;
        int costoBebidas = bebidas != null ? bebidas.length * 2000 : 0;
        
        //Calcular el costo adicional por servicio express
        int costoExpress = express ? 2000 : 0;
        
        //Calcular el costo total de las comidas
        int costoTotalComidas = costoAperitivos + costoPlatos + costoBebidas + costoExpress;
        
        //Calcular el monto a cobrar con el modo de pago seleccionado
        int montoAPagar = 0;
        if (modoPago != null && modoPago.equals("targeta")) {
            montoAPagar = (int) Math.round(costoTotalComidas * 1.03);
        } else if (modoPago != null && modoPago.equals("efectivo")) {
            montoAPagar = (int) Math.round(costoTotalComidas * 0.9);
        };
        
        //Calcular el monto total a cobrar con el IVA incluido
        int montoTotalAPagar = (int) Math.round(montoAPagar * 1.13);
      

    
   
    }
}
   
           
 
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
