/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Interfaces.VistaMonitorTrabajador;
import Modelo.Datos.Puesto;
import Modelo.Datos.Sector;
import Modelo.Sistema;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.Eventos;

import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class ControladorMonitorTrabajador implements Observer {

    private VistaMonitorTrabajador vista;
    private Trabajador trabajador;
    private Sistema sistema;

    public ControladorMonitorTrabajador(VistaMonitorTrabajador vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
        Sistema.getInstancia().addObserver(this);
    }

    public Sistema getSistema() {
        return sistema;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public VistaMonitorTrabajador getVista() {
        return vista;
    }

    public void setVista(VistaMonitorTrabajador vista) {
        this.vista = vista;
    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento instanceof Eventos) {
            switch ((Eventos) evento) {
                case asignarPuesto:
                    List<Puesto> puestos = getSistema().obtenerPuestosLibres(trabajador);
                    getVista().actualizarPuestos(puestos);
                    break;
            }
        }
    }

    public void asignarTrabajadorAPuesto(Puesto miPuesto, Trabajador trabajador) {
        getSistema().asignarTrabajadorPuesto(miPuesto, trabajador);
        getVista().abrirAtencionTrabajador(trabajador);
    }

    public void obtenerPuestosLibres(Trabajador trabajador) {
        this.setTrabajador(trabajador);
        List<Puesto> puestos = getSistema().obtenerPuestosLibres(trabajador);
        getVista().actualizarPuestos(puestos);
    }

}
