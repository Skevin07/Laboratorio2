/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.conexion.Conexion;
import com.unab.edu.entidades.usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class clsUsuario {

    Conexion cn = new Conexion();
    Connection con = cn.retornarConexion();

    public ArrayList<usuario> Usuarios() {
        var listado = new ArrayList<usuario>();
        try {
            CallableStatement statement = con.prepareCall("SELECT * FROM usuario where tipoUsuario=2;");
            ResultSet res = statement.executeQuery();
            while (res.next()) {
                usuario usu = new usuario();
                usu.setIdUsuario(res.getInt("idUsuario"));
                usu.setUsuario(res.getString("Usuario"));
                usu.setPass(res.getString("PassWord"));
                usu.setTipoUsuario(res.getInt("tipoUsuario"));
                listado.add(usu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se cargaron los Usuarios " + e);
        }

        return listado;
    }

    public usuario Login(usuario user) {
        usuario usu = new usuario();
        try {
            CallableStatement statement = con.prepareCall("call sp_s_Login(?,?,?);");
            statement.setString("pUsuario", user.getUsuario());
            statement.setString("pPass", user.getPass());
            statement.setInt("pTipo", user.getTipoUsuario());
            ResultSet res = statement.executeQuery();
            while (res.next()) {
                usu.setIdUsuario(res.getInt("idUsuario"));
                usu.setUsuario(res.getString("Usuario"));
                usu.setPass(res.getString("PassWord"));
                usu.setTipoUsuario(res.getInt("tipoUsuario"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontró el usuario" + e);
        }
        return usu;
    }
}
