/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Area;
import Modelo.Datos.Puesto;
import Modelo.Datos.Sector;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.DatosDerivacion;
import java.util.List;

public interface VistaDerivacion {
    
    public void caragharDatosderivacion(DatosDerivacion datosDerivacion);
    
    public void cargarAreas(List<Area> areas);
    
    public void cargarSectores(List<Sector> sectores);
    
    public void cargarPuestos(List<Puesto> puestos);
    
    public void cancelarDerivacion();
    
    public void mostrarDatosPuesto(Trabajador trabajador, Puesto puesto);

    public void aceptarDerivacion();
}
