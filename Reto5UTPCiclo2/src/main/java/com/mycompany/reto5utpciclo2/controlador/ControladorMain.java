/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5utpciclo2.controlador;

import com.mycompany.reto5utpciclo2.modelo.DAO.Conexion;
import com.mycompany.reto5utpciclo2.vista.frmPrincipal;
import java.sql.Connection;

/**
 *
 * @author renzo
 */
public class ControladorMain {
    public static void main(String[] args) {
        
        //Prueba unitaria
        //Conexion cc = new Conexion();
        //Connection cn = cc.conectar();
        
        new frmPrincipal().setVisible(true);
    }
}
