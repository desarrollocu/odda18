/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 * @author Denise
 */

import Controlador.Interfaces.VistaMonitorNumeros;
import Modelo.Datos.util.EntradaMonitorNumeros;
import Modelo.Sistema;

import java.util.Observable;
import java.util.Observer;

public class ControladorMonitorNumeros implements Observer {

    private VistaMonitorNumeros vista;
    private Sistema sistema;

    public VistaMonitorNumeros getVista() {
        return vista;
    }

    public void setVista(VistaMonitorNumeros vista) {
        this.vista = vista;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public ControladorMonitorNumeros(VistaMonitorNumeros vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
        Sistema.getInstancia().addObserver(this);
    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento instanceof EntradaMonitorNumeros) {
            EntradaMonitorNumeros entradaMonitorNumeros = (EntradaMonitorNumeros) evento;
            vista.actualizar(entradaMonitorNumeros.getSector(), entradaMonitorNumeros.getNro(),
                    entradaMonitorNumeros.getCliente(), entradaMonitorNumeros.getPuesto());
        }

    }
}
  

