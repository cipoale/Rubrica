/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aesys.rubrica.dao;

import com.aesys.rubrica.models.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Aesys
 */
public class PersonDao {
    
    public List<Persona> getListaPersone() throws ClassNotFoundException, SQLException{
        
        List<Persona> listaPersone = new ArrayList<>();
        
        
        Connection conn = ConnessioneDao.getConnection();
        String query = "select * from persona";
        PreparedStatement ps = conn.prepareStatement(query);
            
        ResultSet rs = ps.executeQuery();
            
        while (rs.next()){
            
            listaPersone.add(new Persona(rs.getString("nome"),
                                        rs.getString("cognome"),
                                        rs.getString("telefono"))) ;
        }
        
        return listaPersone;
    }
    
    public static boolean insert(Persona persona) throws ClassNotFoundException, SQLException{
        
        Connection conn = ConnessioneDao.getConnection();
        Statement statement = conn.createStatement();
        String query = "INSERT INTO persona VALUES ( '" + 
                persona.getNome() + "','" + 
                persona.getCognome() + "','" +
                persona.getTelefono() + "')";
        statement.executeUpdate(query);
        System.out.print("ciao");

        return true;
    }
    
public static boolean delete(Persona persona) throws ClassNotFoundException, SQLException{
        
        Connection conn = ConnessioneDao.getConnection();
        Statement statement = conn.createStatement();
        String query = "DELETE FROM persona WHERE ( nome='" + 
                persona.getNome() + "'AND cognome='" + 
                persona.getCognome() + "'AND telefono='" +
                persona.getTelefono() + "')";
        statement.executeUpdate(query);

        return true;
    }
    
    public static boolean update(Persona persona) throws ClassNotFoundException, SQLException{
        
        String Nome = "Modifica Update";
        return true;
        
    }
    
}
