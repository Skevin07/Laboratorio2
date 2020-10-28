/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.entidades;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Roberto
 */
@Data
public class cuentasUsuario {
    private int idcuenta;
    private float saldo;
    private int transaccion;
    private int idUsuario;
    private Date fecha;
}
