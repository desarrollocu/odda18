/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Logica;


import Modelo.Datos.Sector;
import Modelo.Datos.Puesto;
import Modelo.Datos.Area;
import Modelo.Datos.Atencion;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;


public class SistemaAreas {
    
    private List <Area> listaAreas = new ArrayList ();
    
    public List<Area> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(List<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }
    
    public void agregarArea(Area a) {
        if (!this.listaAreas.contains(a)){
            listaAreas.add(a);
        }
        
    }
   
    public List<Sector> obtenerSectores(Area a) {
       return a.getListaSectores();
    }

}
