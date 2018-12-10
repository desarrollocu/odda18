/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Interfaces.VistaConfigurarAreas;
import Modelo.Datos.Area;
import Modelo.Sistema;
import Vista.config.ConfigurarAreas;

import java.util.List;

/**
 * @author Fabi
 */
public class ControladorConfigurarAreas {

    private Sistema sistema;
    private VistaConfigurarAreas vista;
    private Area area;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public VistaConfigurarAreas getVista() {
        return vista;
    }

    public void setVista(ConfigurarAreas vista) {
        this.vista = vista;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public ControladorConfigurarAreas(ConfigurarAreas vista) {
        this.sistema = Sistema.getInstancia();
        this.vista = vista;
    }

    public void obtenerAreas(Area a) {
        List<Area> area = sistema.obtenerAreas(a);
        vista.cargarAreas(area);
    }

}
