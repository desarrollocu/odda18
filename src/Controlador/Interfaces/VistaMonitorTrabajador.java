/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Puesto;
import Modelo.Datos.Trabajador;

import java.util.List;

public interface VistaMonitorTrabajador {

    void abrirAtencionTrabajador(Trabajador t);

    void actualizarPuestos(List<Puesto> puestos);

}
