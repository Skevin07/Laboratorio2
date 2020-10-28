/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.dao;

import com.unab.edu.conexion.Conexion;
import com.unab.edu.entidades.cuentasUsuario;
import com.unab.edu.entidades.usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class clscuentausuario {
    
    Conexion cn = new Conexion();
    
    Connection con = cn.retornarConexion();
    
    

    public void agregarTransaccion(cuentasUsuario transaccion) {
        try {
            CallableStatement statement = con.prepareCall("call sp_i_transaccion(?,?,?,?);");
            statement.setDouble("pSaldo", transaccion.getSaldo());
            statement.setInt("pIdUsuario", transaccion.getIdUsuario());
            statement.setInt("pTransaccion", transaccion.getTransaccion());
            statement.setDate("pFecha", new java.sql.Date(transaccion.getFecha().getTime()));
            statement.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Transacción realizada con exito!" );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
    }

    
    public ArrayList<cuentasUsuario> Transacciones(usuario user) {
        var listado = new ArrayList<cuentasUsuario>();
        try {
            CallableStatement statement = con.prepareCall("SELECT * FROM appbanco.cuentasusuario where idUsuario="+user.getIdUsuario()+";");
            ResultSet res = statement.executeQuery();
            while (res.next()) {
                cuentasUsuario transaccion = new cuentasUsuario();
                transaccion.setIdUsuario(res.getInt("idcuenta"));
                transaccion.setSaldo(res.getFloat("saldo"));
                transaccion.setIdUsuario(res.getInt("idUsuario"));
                transaccion.setTransaccion(res.getInt("transaccion"));
                transaccion.setFecha(res.getDate("fecha"));              
                listado.add(transaccion);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se cargaron las Transacciones " + e);
        }

        return listado;
    }
    
    
    
  public void insertaAbono(cuentasUsuario cuentas){
      try {
          
          CallableStatement st = con.prepareCall("SP_I_InsertarAbono(?,?,?); ");
        
   
      } catch (Exception e) {
      }
  }
    
    
    
    
}
