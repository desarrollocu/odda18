/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Interfaces.VistaDerivacion;
import Modelo.Datos.Area;
import Modelo.Datos.Atencion;
import Modelo.Datos.Puesto;
import Modelo.Datos.Sector;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.Eventos;
import Modelo.Sistema;
import Vista.atencion.AbrirAtencion;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class ControladorDerivacion implements Observer{

    private VistaDerivacion vista;
    private Sistema sistema;

    public ControladorDerivacion(VistaDerivacion vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
    }

    public VistaDerivacion getVista() {
        return vista;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void cargarAreas() {
        List<Area> areas = getSistema().obtenerAreas();
        getVista().cargarAreas(areas);
    }

    public void cargarSectores(Area area) {
        List<Sector> sectores = getSistema().cargarSectores(area);
        getVista().cargarSectores(sectores);
    }

    public void cargarPuestos(Sector sector, Trabajador trabajador) {
        List<Puesto> puestos = getSistema().cargarPuestos(sector, trabajador);
        getVista().cargarPuestos(puestos);
    }

    public void cargarDatosDerivacion(Puesto puesto) {
        Trabajador trabajador = getSistema().obtenerTrabajadorPuesto(puesto);
        getVista().mostrarDatosPuesto(trabajador, puesto);
    }

    public void derivar(Atencion atencion, Trabajador trabajadorDeriva, Trabajador trabajadorDestino) {
        getSistema().derivarAtencion(atencion, trabajadorDeriva, trabajadorDestino);
    }

    @Override
    public void update(Observable o, Object evento) {
        if (evento instanceof Eventos) {
            switch ((Eventos) evento) {
                case aceptarDerivacion:
                    getVista().aceptarDerivacion();
                    break;
            }
        }
    }

}
