/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Logica;

import Modelo.Datos.Puesto;
import Modelo.Datos.Trabajador;
import Excepciones.AvisosException;
import java.util.ArrayList;
import java.util.List;


public class SistemaTrabajador {

    private List <Trabajador> listaTrabajadores = new ArrayList ();

    public List<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public void setListaTrabajadores(List<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }
    
    public Trabajador loginTrabajador(String ci, String pass) throws AvisosException {
        Trabajador t = null;
        for (Trabajador tra : listaTrabajadores) {
            if (tra.getCedulaUsu().equals(ci) && tra.getPassTrabajador().equals(pass)) {
                t = tra;
                break;
            }
        }
        if (t != null) {
            t.setLogueado(true);
            listaTrabajadores.remove(t);
            listaTrabajadores.add(t);
            return t;
        } else {
            throw new AvisosException("No existe el trabajador en el Sistema");
        }
    }

    public Trabajador setearDatosTrabajador(Trabajador trabajador, Puesto puesto) {
        Trabajador t = trabajador;
        this.getListaTrabajadores().remove(trabajador);
        t.setCantidadAtenciones(t.getCantidadAtenciones() + 1);
        trabajador.setPuestoTrabajador(puesto);
        this.getListaTrabajadores().add(t);
        return t;
    }

    public void agregarTrabajador(Trabajador t) {
        if (!this.listaTrabajadores.contains(t)){
            listaTrabajadores.add(t);
        }
    }

    public int ObtenerNroPuestoTrabajador(Trabajador trabajador) {
        return trabajador.obtenerNroPuesto();
    }

    public void asignarTrabajadorPuesto(Puesto miPuesto, Trabajador trabajador) {
        trabajador.setPuestoTrabajador(miPuesto);
        this.listaTrabajadores.remove(trabajador);
        this.listaTrabajadores.add(trabajador);
    }
}
