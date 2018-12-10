/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Logica;

import Modelo.Datos.Atencion;
import Modelo.Datos.Puesto;
import Modelo.Datos.Sector;
import Modelo.Datos.Trabajador;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Denise
 */
public class SistemaSectores {

    private List<Sector> listaSectores = new ArrayList();

    public SistemaSectores() {}

    public List<Sector> getListaSectores() {
        return listaSectores;
    }

    public void setListaSectores(List<Sector> listaSectores) {
        this.listaSectores = listaSectores;
    }

    public List<Puesto> obtenerPuestosLibres(Trabajador trabajador) {
        Sector s = trabajador.getSectorTrabajador();
        return s.puestosLibres();
    }
    
    public Sector obtenerSector(Sector sector) {
        for (Sector s : getListaSectores()) {
            if (s.getNomSector().equals(sector.getNomSector())) {
                return s;
            }
        }
        return null;
    } 
  
    public Puesto obtenerPuesto(Sector sector) {
        for (Puesto p : sector.getListaPuestos()) {
            if (p.getNumPuesto() == p.getNumPuesto()) {
                return p;
            }
        }
        return null;
    } 

    public Puesto asignarAtencionPuesto(Atencion atencion, Trabajador trabajador) {
        Sector sector = trabajador.getSectorTrabajador();
        Puesto puesto = null;
        if (sector != null) {
            puesto = obtenerPuesto(sector);
            sector.getListaPuestos().remove(puesto);
            sector.getListaPuestos().add(puesto);
            puesto.setAtencionActual(atencion);
            trabajador.setPuestoTrabajador(puesto);
        }
        return puesto;
    }
    
    public String obtenerSectorTrabajador(Trabajador trabajador) {
        Sector sector = trabajador.getSectorTrabajador(); 
        return sector.getNomSector();
    }

}
