/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.aesys.rubrica.myservlet;

import com.aesys.rubrica.dao.ConnessioneDao;
import com.aesys.rubrica.dao.PersonDao;
import com.aesys.rubrica.models.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aesys
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            /*
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            String e = email.split("@")[0];
            
            PrintWriter writer = response.getWriter();
            writer.print("Ciao " + e);
            */
            
            
            PersonDao personDao =new PersonDao();
            List<Persona> listaPersone = new ArrayList<>();
            
            try{
                listaPersone = personDao.getListaPersone();
            }catch(ClassNotFoundException | SQLException ex){
                //log
            }
            
            request.setAttribute("persone", listaPersone);
      
        
            RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(request, response);
    }

}
