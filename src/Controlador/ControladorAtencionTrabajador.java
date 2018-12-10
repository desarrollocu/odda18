/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Interfaces.VistaAtencionTrabajador;
import Modelo.Datos.Atencion;
import Modelo.Datos.Cliente;
import Modelo.Sistema;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.DatosDerivacion;
import Modelo.Datos.eventos.Eventos;
import Vista.atencion.AtencionTrabajador;

import java.util.Observable;
import java.util.Observer;

public class ControladorAtencionTrabajador implements Observer {

    private Sistema sistema;
    private VistaAtencionTrabajador vista;

    public ControladorAtencionTrabajador(AtencionTrabajador vista) {
        this.vista = vista;
        sistema = Sistema.getInstancia();
        sistema.addObserver(this);
    }

    public VistaAtencionTrabajador getVista() {
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
                case cancelarDerivacion://muestra en el campo de texto
                    cancelarDerivacion();
                    break;
            }
        }
        if (evento instanceof DatosDerivacion) {
            getVista().cargarDatosDerivacion((DatosDerivacion)evento);
        }
    }

    public void abrirAtencion(Trabajador trabajador, Atencion atencion) {
        if (atencion != null && trabajador != null) {
            Trabajador t = Sistema.getInstancia().asignarAtencionPuesto(trabajador, atencion);
            Sistema.getInstancia().eliminarAtencion(atencion);
            getVista().cargarEtiquetas(t);
        }
    }

    private void cancelarDerivacion() {
        getVista().cancelarDerivacion();
    }

    public void aceptarDerivacion(Trabajador trabajador, Atencion atencion) {
        getSistema().aceptarDerivacion(trabajador, atencion);
        getVista().cancelarDerivacion();
    }
}