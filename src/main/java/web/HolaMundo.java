package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

//Extendemos de la clase HttpServlet
//La notacion es para poder acceder desde el navegador
//Con esta direccion mandas a llamar al Servlet
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    //Peticion de tipo do-get:
    //Es el servidor glassfish quien se encarga de hacer la llamada a este metodo
      @Override
      protected void doGet(HttpServletRequest resquest, HttpServletResponse response) throws IOException{
          //Aqui respondemos al navegador que se esta ejecutando correctamente este servlet
          response.setContentType("text/html;charset=UTF-8");//el tipo con el que podemos responder
          
          
          //Este objeto response es para empezar a contestar a nuestro navegador
          //Es necesario usar un metodo de excepcion por si falla al momento de estar respondiendo
          //al navegador
          PrintWriter out = response.getWriter(); 
          
          //Esto es lo que imprimimos en nuestro sitio HTML
          out.print("Hola mundo desde Servlets");
                                                 
      }  
}