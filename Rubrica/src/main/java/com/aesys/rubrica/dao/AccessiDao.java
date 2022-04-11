/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aesys.rubrica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aesys
 */
public class AccessiDao {
    public boolean verificaAccesso(String email, String password) throws ClassNotFoundException, SQLException{
        Connection conn = ConnessioneDao.getConnection();
        String query = "select * from accessi where email=? and password=? and attivo=true";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        
        ResultSet rs = ps.executeQuery();
        return rs.next();
        
    }
}
