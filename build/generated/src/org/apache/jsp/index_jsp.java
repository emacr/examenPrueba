package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form action=\"\" method=\"POST\">\n");
      out.write("        <!--muestro la fecha actual-->\n");
      out.write("        <label for=\"date\">Fecha:</label>\n");
      out.write("    <input type=\"text\" id=\"date\" readonly><br/>\n");
      out.write("\n");
      out.write("    <!--muestro el metodo de pago-->\n");
      out.write("    \n");
      out.write("        <label for=\"pago\">Modo de pago:</label>\n");
      out.write("        <select id=\"pago \" >\n");
      out.write("    <option value=\"efectivo\">Efectivo</option>\n");
      out.write("    <option value=\"targeta\">Targeta</option>\n");
      out.write("  </select>\n");
      out.write("  \n");
      out.write("  <div id=\"num-tarjeta\" style=\"display:none;\">\n");
      out.write("    <label for=\"num-tarjeta-input\"> Ingrese el Número de tarjeta:</label>\n");
      out.write("    <input type=\"text\" id=\"num-tarjeta-input\">\n");
      out.write("  </div><br/>\n");
      out.write("\n");
      out.write("<!--muestro si desea xpress-->\n");
      out.write("  \n");
      out.write("<label for=\"opcion\">Desea servicio xpress?:</label>\n");
      out.write("<select id=\"opcion\">\n");
      out.write("  <option value=\"no\">No</option>\n");
      out.write("  <option value=\"si\">Si</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("<div id=\"direccion\" style=\"display:none;\">\n");
      out.write("  <label for=\"entrega\">Direccion:</label>\n");
      out.write("  <textarea id=\"entrega\" ></textarea>\n");
      out.write("</div><br/>\n");
      out.write("     \n");
      out.write("<!--seleccion de comidas-->\n");
      out.write("\n");
      out.write("<!-- Aperitivo -->\n");
      out.write("<label for=\"aperitivos\">Aperitivo:</label><br/>\n");
      out.write("<input type=\"checkbox\" id=\"spring-roll\" name=\"aperitivos\" value=\"Spring Roll\">\n");
      out.write("<label for=\"spring-roll\">Spring Roll</label>\n");
      out.write("<input type=\"checkbox\" id=\"gyosas\" name=\"aperitivos\" value=\"Gyosas\">\n");
      out.write("<label for=\"gyosas\">Gyosas</label>\n");
      out.write("<input type=\"checkbox\" id=\"edamames\" name=\"aperitivos\" value=\"Edamames\">\n");
      out.write("<label for=\"edamames\">Edamames</label>\n");
      out.write("<input type=\"checkbox\" id=\"sopa-miso\" name=\"aperitivos\" value=\"Sopa Miso\">\n");
      out.write("<label for=\"sopa-miso\">Sopa Miso</label><br/>\n");
      out.write("\n");
      out.write("<!-- Plato Favorito -->\n");
      out.write("<label for=\"plato-favorito\">Plato Favorito:</label><br/>\n");
      out.write("<input type=\"checkbox\" id=\"wraps\" name=\"plato-favorito\" value=\"WRAPS\">\n");
      out.write("<label for=\"wraps\">WRAPS</label>\n");
      out.write("<input type=\"checkbox\" id=\"rollo-sushi-tradicional\" name=\"plato-favorito\" value=\"Rollo Sushi Tradicional\">\n");
      out.write("<label for=\"rollo-sushi-tradicional\">Rollo Sushi Tradicional</label>\n");
      out.write("<input type=\"checkbox\" id=\"rollo-sushi-especial\" name=\"plato-favorito\" value=\"Rollo Sushi Especial\">\n");
      out.write("<label for=\"rollo-sushi-especial\">Rollo Sushi Especial</label>\n");
      out.write("<input type=\"checkbox\" id=\"arroz-especial\" name=\"plato-favorito\" value=\"Arroz Especial\">\n");
      out.write("<label for=\"arroz-especial\">Arroz Especial</label>\n");
      out.write("<input type=\"checkbox\" id=\"pokes\" name=\"plato-favorito\" value=\"POKES\">\n");
      out.write("<label for=\"pokes\">POKES</label><br/>\n");
      out.write("\n");
      out.write("<!-- Bebida -->\n");
      out.write("<label for=\"bebida\">Bebida:</label><br/>\n");
      out.write("<input type=\"checkbox\" id=\"gaseosa\" name=\"bebida\" value=\"Gaseosa\">\n");
      out.write("<label for=\"gaseosa\">Gaseosa</label>\n");
      out.write("<input type=\"checkbox\" id=\"natural\" name=\"bebida\" value=\"Natural\">\n");
      out.write("<label for=\"natural\">Natural</label>\n");
      out.write("<input type=\"checkbox\" id=\"te\" name=\"bebida\" value=\"Té\">\n");
      out.write("<label for=\"te\">Té</label><br/>\n");
      out.write("\n");
      out.write("<input type=\"submit\"/><br/>\n");
      out.write("\n");
      out.write(" <h1>Resultado</h1><br/>\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("   </form>\n");
      out.write("       \n");
      out.write("     \n");
      out.write("    <script>\n");
      out.write("        //muestro la fecha actual\n");
      out.write("        var today = new Date();\n");
      out.write("        var dd = String(today.getDate()).padStart(2, '0');\n");
      out.write("        var mm = String(today.getMonth() + 1).padStart(2, '0'); \n");
      out.write("        var yyyy = today.getFullYear();    \n");
      out.write("        today = mm + '/' + dd + '/' + yyyy;\n");
      out.write("        document.getElementById(\"date\").value = today;\n");
      out.write("    \n");
      out.write("        //muestro el metodo de pago\n");
      out.write("        const pagoSelect = document.getElementById('pago');\n");
      out.write("const numTarjetaDiv = document.getElementById('num-tarjeta');\n");
      out.write("\n");
      out.write("pagoSelect.addEventListener('change', (event) => {\n");
      out.write("  const seleccion = event.target.value;\n");
      out.write("  \n");
      out.write("  if (seleccion === 'targeta') {\n");
      out.write("    numTarjetaDiv.style.display = 'block';\n");
      out.write("  } else {\n");
      out.write("    numTarjetaDiv.style.display = 'none';\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("\n");
      out.write("//muestro si desea xpress\n");
      out.write("const xpress = document.getElementById('opcion');\n");
      out.write("const decision = document.getElementById('direccion');\n");
      out.write("\n");
      out.write("xpress.addEventListener('change', (event) => {\n");
      out.write("  const opciones = event.target.value;\n");
      out.write("  \n");
      out.write("  if (opciones === 'si') {\n");
      out.write("    decision.style.display = 'block';\n");
      out.write("  } else {\n");
      out.write("    decision.style.display = 'none';\n");
      out.write("  }\n");
      out.write("});\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    ");
 
          
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
    
    
      out.write("\n");
      out.write("    monto aperitivos: ");
      out.print( costoAperitivos);
      out.write("<br/>\n");
      out.write("    monto platos: ");
      out.print( costoPlatos);
      out.write("<br/>\n");
      out.write("    monto bebidas: ");
      out.print( costoBebidas);
      out.write("<br/>\n");
      out.write("    monto total comidas: ");
      out.print( costoTotalComidas);
      out.write("<br/>\n");
      out.write("    \n");
      out.write("    monto total a pagar: ");
      out.print( montoTotalAPagar);
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
