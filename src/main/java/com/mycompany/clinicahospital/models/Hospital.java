/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.models;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<Consulta> consultas;

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad, ArrayList<Consulta> consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", consultas=" + consultas + '}';
    }
    
}
