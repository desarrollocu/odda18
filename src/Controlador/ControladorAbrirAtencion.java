/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Sistema;
import Vista.atencion.AbrirAtencion;


public class ControladorAbrirAtencion {

    private AbrirAtencion vista;
    private Sistema sistema;

    public ControladorAbrirAtencion(AbrirAtencion vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
    }

    public AbrirAtencion getVista() {
        return vista;
    }

    public Sistema getSistema() {
        return sistema;
    }

}
