/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Area;

import java.util.List;

public interface VistaConfigurarAreas {

    void cargarAreas();

    void abrirSolicitudNumero(Area a);

    void cargarAreas(List<Area> area);

}
