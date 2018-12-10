/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Datos.Area;
import Modelo.Sistema;
import Vista.monitor.MonitorAreas;
import java.util.List;

/**
 *
 * @author Denise
 */
public class ControladorMonitorAreas {
    
    private Sistema sistema;

    public Sistema getSistema() {
        return sistema;
    }

    public MonitorAreas getVista() {
        return vista;
    }

    private MonitorAreas vista;
    
    public void setVista(MonitorAreas vista) {
        this.vista = vista;
    }

    public ControladorMonitorAreas(MonitorAreas vista) {
        this.sistema = Sistema.getInstancia();
        this.vista = vista;
    }
    
    public void obtenerAreas(){
        List<Area> areas = getSistema().obtenerAreas();
        getVista().cargarAreas(areas);
    }
}
