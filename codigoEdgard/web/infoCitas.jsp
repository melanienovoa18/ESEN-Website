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
        <title>JSP Page</title>
    </head>
     <%
        List<DatosCita> datos = 
                (List<DatosCita>)request.getSession().getAttribute("datosCitas");
    %>
    <body>
        <h1>Hello World!</h1>
           <table style="width:50%" border="1">
            <tr>
                <th>NombrePaciente</th>
                <th>Apellitos Paciente</th>
                <th>Número de Contacto</th>
                <th>Correo</th>    
                <th>Fecha de Nacimiento</th>
                <th>Cita con Doctor</th>
                <th>Fecha Cita</th>
                <th>Sintomas</th>
                <th>Alergias</th>
                <th>Medicamentos Que consumen</th>
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
            Introduce el IdDelPaciente:  
            <input type="text" name="f_idUser" id="f_idUser">
            <input type="hidden" name="formu" value="50">
            <input type="submit" value="verificar">
            
        </form>
    </body>
</html>
