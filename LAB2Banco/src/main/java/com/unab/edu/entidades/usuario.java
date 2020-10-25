/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.entidades;
import lombok.*;
/**
 *
 * @author Roberto
 */


@Data
@EqualsAndHashCode(callSuper=false)
public class usuario {
    private int idUsuario;
    private String Usuario;
    private String Pass;
}
