/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Logica;

import Modelo.Datos.Atencion;
import Modelo.Datos.Sector;
import Modelo.Datos.Cliente;
import Modelo.Datos.Area;
import Modelo.Datos.EstadoAtencion;
import Modelo.Datos.Puesto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaAtenciones {

    //private Atencion atencion;
    private List<Atencion> listaAtenciones = new ArrayList();
    private List<Atencion> listaAtencionesFinalizadas = new ArrayList();
    private int cantAtenciones = 0;

//    public SistemaAtenciones(Atencion atencion) {
//        this.atencion = atencion;
//    }
    public SistemaAtenciones() {
    }

    //Accesores--------------------------
    public List<Atencion> getListaAtenciones() {
        return listaAtenciones;
    }

    public void setListaAtenciones(List<Atencion> listaAtenciones) {
        this.listaAtenciones = listaAtenciones;
    }

    public List<Atencion> getListaAtencionesFinalizadas() {
        return listaAtencionesFinalizadas;
    }

    public void setListaAtencionesFinalizadas(List<Atencion> listaAtencionesFinalizadas) {
        this.listaAtencionesFinalizadas = listaAtencionesFinalizadas;
    }

//---------------------------------------------------
    //Métodos
    public Atencion asignarAtencionCliente(Cliente cliente, Sector sector) {
        Atencion a = new Atencion(new Date(), new Date(), cliente, sector);
        setCantAtenciones();
        a.setNumero(getCantAtenciones());
        listaAtenciones.add(a);
        return a;
    }

    public Atencion cargarAtencion() {
        if (this.getListaAtenciones().size() > 0) {
            return this.getListaAtenciones().get(0);
        } else {
            return null;
        }
    }

    public String cargarClienteAtencion(Atencion atencion) {
        return atencion.devolverCedulaCliente();
    }

//----------------------------------------------------
    public void eliminarAtencion(Atencion a) {
        if (listaAtenciones.size() > 0) {
            listaAtenciones.remove(a);
        }
    }

    public int getCantAtenciones() {
        return cantAtenciones;
    }

    public void setCantAtenciones() {
        this.cantAtenciones = cantAtenciones++;
    }

    public Atencion buscarSigAtencion() {
        Atencion a = null;
        if (listaAtenciones.size() > 0) {
            a = listaAtenciones.get(0);
            listaAtenciones.remove(0);
        }
        return a;
    }

//-----------------------------------------------------------------------------  

    public int obtenerNumeroAtencion(Atencion atencion) {
        return atencion.getNumero();
    }

     public String ObtenerNombreCliente(Atencion atencion) {
        return atencion.getNombreCLiente();
    }
}
