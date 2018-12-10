/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Datos.Atencion;
import Modelo.Datos.Cliente;
import Modelo.Sistema;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.Eventos;
import Vista.atencion.AtencionTrabajador;

import java.util.Observable;
import java.util.Observer;

public class ControladorAtencionTrabajador implements Observer {

    private Sistema sistema;
    private AtencionTrabajador vista;

    public ControladorAtencionTrabajador(AtencionTrabajador vista) {
        this.vista = vista;
        sistema = Sistema.getInstancia();
        Sistema.getInstancia().addObserver(this);
    }

    public AtencionTrabajador getVista() {
        return vista;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void cargarAtencion() {
        Atencion atencion = getSistema().cargarAtencion();
        if (atencion != null) {
            String cedula = getSistema().cargarClienteAtencion(atencion);
            Cliente cliente = Sistema.getInstancia().buscarCliente(cedula);
            vista.cargarAtencion(atencion, cliente);
        }
    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento instanceof Eventos) {
            switch ((Eventos) evento) {
                case ingresoAtencion://muestra en el campo de texto
                    cargarAtencion();
                    break;
            }
        }
    }

    public void abrirAtencion(Trabajador trabajador, Atencion atencion) {
        if (atencion != null && trabajador != null) {
            Trabajador t = Sistema.getInstancia().asignarAtencionPuesto(trabajador, atencion);
            Sistema.getInstancia().eliminarAtencion(atencion);
            getVista().cargarEtiquetas(t);
        }
    }
}