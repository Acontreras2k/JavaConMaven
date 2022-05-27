/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.horamaven;

/**
 *
 * @author Diurno
 */
public class testhora {

    public boolean validar_hora(int hora, int min) {
        boolean error = false;
        if (hora < 0 || hora > 23) {
            error = true;
        } else if (min < 0 || min > 23) {
            error = true;
        }
        return error;
    }

}

