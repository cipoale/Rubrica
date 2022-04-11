/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aesys.rubrica.models;

/**
 *
 * @author Aesys
 */
public class Persona {
    
    private String nome;
    private String cognome;
    private String telefono;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Persona(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Cognome = " + cognome + ", Telefono = " + telefono;
    }

    
    
}
