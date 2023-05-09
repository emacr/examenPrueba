<%-- 
    Document   : index
    Created on : 01/05/2023, 05:06:06 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        <form action="" method="POST">
        <!--muestro la fecha actual-->
        <label for="date">Fecha:</label>
    <input type="text" id="date" readonly><br/>

    <!--muestro el metodo de pago-->
    
        <label for="pago">Modo de pago:</label>
        <select id="pago " name="metodoPago">
    <option value="efectivo">Efectivo</option>
    <option value="targeta">Targeta</option>
  </select>
  
  <div id="num-tarjeta" style="display:none;">
    <label for="num-tarjeta-input"> Ingrese el Número de tarjeta:</label>
    <input type="text" id="num-tarjeta-input">
  </div><br/>

<!--muestro si desea xpress-->
  
<label for="opcion">Desea servicio xpress?:</label>
<select id="opcion">
  <option value="no">No</option>
  <option value="si">Si</option>
</select>

<div id="direccion" style="display:none;">
  <label for="entrega">Direccion:</label>
  <textarea id="entrega" ></textarea>
</div><br/>
     
<!--seleccion de comidas-->

<!-- Aperitivo -->
<label for="aperitivos">Aperitivo:</label><br/>
<input type="checkbox" id="spring-roll" name="aperitivos" value="Spring Roll">
<label for="spring-roll">Spring Roll</label>
<input type="checkbox" id="gyosas" name="aperitivos" value="Gyosas">
<label for="gyosas">Gyosas</label>
<input type="checkbox" id="edamames" name="aperitivos" value="Edamames">
<label for="edamames">Edamames</label>
<input type="checkbox" id="sopa-miso" name="aperitivos" value="Sopa Miso">
<label for="sopa-miso">Sopa Miso</label><br/>

<!-- Plato Favorito -->
<label for="plato-favorito">Plato Favorito:</label><br/>
<input type="checkbox" id="wraps" name="plato-favorito" value="WRAPS">
<label for="wraps">WRAPS</label>
<input type="checkbox" id="rollo-sushi-tradicional" name="plato-favorito" value="Rollo Sushi Tradicional">
<label for="rollo-sushi-tradicional">Rollo Sushi Tradicional</label>
<input type="checkbox" id="rollo-sushi-especial" name="plato-favorito" value="Rollo Sushi Especial">
<label for="rollo-sushi-especial">Rollo Sushi Especial</label>
<input type="checkbox" id="arroz-especial" name="plato-favorito" value="Arroz Especial">
<label for="arroz-especial">Arroz Especial</label>
<input type="checkbox" id="pokes" name="plato-favorito" value="POKES">
<label for="pokes">POKES</label><br/>

<!-- Bebida -->
<label for="bebida">Bebida:</label><br/>
<input type="checkbox" id="gaseosa" name="bebida" value="Gaseosa">
<label for="gaseosa">Gaseosa</label>
<input type="checkbox" id="natural" name="bebida" value="Natural">
<label for="natural">Natural</label>
<input type="checkbox" id="te" name="bebida" value="Té">
<label for="te">Té</label><br/>

<input type="submit"/><br/>

 <h1>Resultado</h1><br/>

      

   </form>
       
     
    <script>
        //muestro la fecha actual
        var today = new Date();
        var dd = String(today.getDate()).padStart(2, '0');
        var mm = String(today.getMonth() + 1).padStart(2, '0'); 
        var yyyy = today.getFullYear();    
        today = mm + '/' + dd + '/' + yyyy;
        document.getElementById("date").value = today;
    
        //muestro el metodo de pago
        const pagoSelect = document.getElementById('pago');
const numTarjetaDiv = document.getElementById('num-tarjeta');

pagoSelect.addEventListener('change', (event) => {
  const seleccion = event.target.value;
  
  if (seleccion === 'targeta') {
    numTarjetaDiv.style.display = 'block';
  } else {
    numTarjetaDiv.style.display = 'none';
  }
});

//muestro si desea xpress
const xpress = document.getElementById('opcion');
const decision = document.getElementById('direccion');

xpress.addEventListener('change', (event) => {
  const opciones = event.target.value;
  
  if (opciones === 'si') {
    decision.style.display = 'block';
  } else {
    decision.style.display = 'none';
  }
});
    </script>
    
   
    <% 
          
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
    
    %>
    monto aperitivos: <%= costoAperitivos%><br/>
    monto platos: <%= costoPlatos%><br/>
    monto bebidas: <%= costoBebidas%><br/>
    monto total comidas: <%= costoTotalComidas%><br/>
    
    monto total a pagar: <%= montoTotalAPagar%>

    </body>
</html>
