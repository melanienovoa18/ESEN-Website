<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="com.JavaObj.DatosCita"%>
<%@page import="com.JavaObj.DatosCita"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bulma/bulma.css" rel="stylesheet" type="text/css"/>
        
        <title>Medik´s || Historial</title>
    </head>
     <%
        List<DatosCita> datos = 
                (List<DatosCita>)request.getSession().getAttribute("datosCitas");
    %>
    <body>
        
        <section class="hero is-info is-large">
                
            <div class="hero-head">
            <nav class="navbar">
            <div class="container">
                
            <div class="navbar-brand">
                
            <a class="navbar-item">
            <h1 class="title is-1">Medik's</h1>
            </a>
                
            <span class="navbar-burger burger" data-target="navbarMenuHeroB">
            <span></span>
            <span></span>
            <span></span>
            </span>
                
            </div>
                
            <div id="navbarMenuHeroB" class="navbar-menu">
            <div class="navbar-end">
                
            <a href="index.html" class="navbar-item">
              Inicio
            </a>
                
            <a href="doctores.html" class="navbar-item">
              Doctores
            </a>
                
            <a href="registrarse.html" class="navbar-item">
              Registrarse
            </a>
                
            <a href="perfil.html" class="navbar-item">
              Perfil
            </a>
                
            <a href="CitasDoctor.html" class="navbar-item">
              Citas
            </a>
                
            <a href="infoCitas.jsp" class="navbar-item is-active">
              Historial
            </a>
                
             
                
            <span class="navbar-item">
              <a class="button is-info is-inverted">
                <span>Iniciar Sesión
              </a>
            </span>
                
          </div>
        </div>
      </div>
    </nav>   
  </div>

           <table class="table">
            <thead>
            <tr>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Número</th>
                <th>Correo</th>    
                <th>Fecha de Nacimiento</th>
                <th>Doctor</th>
                <th>Fecha de Cita</th>
                <th>Sintomas</th>
                <th>Alergias</th>
                <th>Medicamentos</th>
                <th>Padecimientos Previos</th>
                <th>Seguro</th>
                <th>Forma de Pago</th>
                
            </tr>
            
            <%
                
                if(datos!=null)
                {
                    Iterator<DatosCita> ite = datos.iterator();
                    DatosCita DTemp;
                    while(ite.hasNext())
                    {
                        DTemp = ite.next();
                                     
            %>
                 
                    
                         <td><%= DTemp.getNombrePaciente()  %></td>
                         <td><%= DTemp.getApellidoPaciente()  %></td>
                         <td><%= DTemp.getContactoNumero()  %></td>
                         <td><%= DTemp.getCorreo()  %></td>
                         <td><%= DTemp.getfechaNacimeinto()  %></td>
                         <td><%= DTemp.getDoctor()  %></td>
                         <td><%= DTemp.getFechaCita()  %></td>
                         <td><%= DTemp.getSintomas()  %></td>
                         <td><%= DTemp.getAlerMedicamentos()  %></td>
                         <td><%= DTemp.getConsumoMedoc()  %></td>
                         <td><%= DTemp.getPadecimientosPrevios()  %></td>
                         <td><%= DTemp.getSeguro()  %></td>
                         <td><%= DTemp.getFormaDePAgo()  %></td>
                         
                     </tr>
                    <%
                        }
                    }
                
            %>
        </table>
        
        <form action="citasServlet" method="get" name="formu">
            Ingrese el ID del paciente:  
            <input class="input" type="text" name="f_idUser" id="f_idUser">
            <input type="hidden" name="formu" value="50">
            <div class="control">
            <button class="button is-link is-light" type="submit" value="verificar">Verificar</button>
            </div>

        </form>
        
    </body>
</html>
