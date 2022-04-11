/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.aesys.rubrica.myservlet;

import com.aesys.rubrica.dao.PersonDao;
import com.aesys.rubrica.models.Persona;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class InsertServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String nome = request.getParameter("nome");
            String cognome = request.getParameter("cognome");
            String telefono = request.getParameter("telefono");
            
            Persona p = new Persona(nome,cognome,telefono);
            
            if(PersonDao.insert(p)){
                System.out.println("inserimento db avvenuto");
                RequestDispatcher dispatcher = request.getRequestDispatcher("login");
                dispatcher.forward(request, response);
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    

}
