/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Datos.*;
import Modelo.Datos.util.EntradaMonitorNumeros;
import Excepciones.AvisosException;
import Modelo.Datos.eventos.DatosDerivacion;
import Modelo.Datos.eventos.Eventos;
import Modelo.Logica.*;

import java.util.List;
import java.util.Observable;

public class Sistema extends Observable {

    private SistemaTrabajador st = new SistemaTrabajador();
    private SistemaAreas sa = new SistemaAreas();
    private SistemaClientes sc = new SistemaClientes();
    private SistemaAtenciones sat = new SistemaAtenciones();
    private SistemaSectores ssec = new SistemaSectores();
    private Thread thread;
    private int tiempo = 5000;

    private static Sistema instancia = new Sistema();

    public static Sistema getInstancia() {
        return instancia;
    }

    public Trabajador asignarAtencionPuesto(Trabajador trabajador, Atencion atencion) {
        Puesto puesto = ssec.asignarAtencionPuesto(atencion, trabajador);
        String sector = ssec.obtenerSectorTrabajador(trabajador);
        int nro = sat.obtenerNumeroAtencion(atencion);
        String cliente = sat.ObtenerNombreCliente(atencion);
        int nroPuesto = st.ObtenerNroPuestoTrabajador(trabajador);
        EntradaMonitorNumeros entradaMonitorNumeros = new EntradaMonitorNumeros(sector, String.valueOf(nro),
                cliente, String.valueOf(nroPuesto));
        this.avisar(entradaMonitorNumeros);
        return st.setearDatosTrabajador(trabajador, puesto);
    }

    public void avisar(Object evento) {
        setChanged();
        notifyObservers(evento);
    }

    public Trabajador loginTrabajador(String ci, String pass) throws AvisosException {
        return st.loginTrabajador(ci, pass);
    }

    public Cliente loginCliente(String ci) throws AvisosException {
        return sc.loginCliente(ci);
    }

    public Cliente buscarCliente(String cedula) {
        return sc.buscarCliente(cedula);

    }

    public void agregarTrabajador(Trabajador t) {
        st.agregarTrabajador(t);
    }

    public void agregarCliente(Cliente c) {
        sc.agregarCliente(c);
    }

    public List<Puesto> obtenerPuestosLibres(Trabajador trabajador) {
        return ssec.obtenerPuestosLibres(trabajador);
    }

    public List<Area> obtenerAreas() {
        return sa.getListaAreas();
    }

    public void agregarArea(Area a) {
        sa.agregarArea(a);
    }

    public List<Sector> obtenerSectores(Area a) {
        return sa.obtenerSectores(a);
    }

    public Atencion asignarAtencionCliente(Cliente cliente, Sector sector) {
        Atencion atencion = sat.asignarAtencionCliente(cliente, sector);
        this.avisar(Eventos.ingresoAtencion);
        return atencion;
    }

    public void eliminarAtencion(Atencion atencion) {
        this.sat.eliminarAtencion(atencion);
    }

    public Atencion cargarAtencion() {
        return this.sat.cargarAtencion();
    }

    public String cargarClienteAtencion(Atencion atencion) {
        return this.sat.cargarClienteAtencion(atencion);
    }

    public List<Area> obtenerAreas(Area a) {
        return sa.getListaAreas();
    }

    public void asignarTrabajadorPuesto(Puesto miPuesto, Trabajador trabajador) {
        ssec.ocuparPuesto(trabajador.getSectorTrabajador(),miPuesto);
        st.asignarTrabajadorPuesto(miPuesto, trabajador);
    }

    public List<Sector> cargarSectores(Area area) {
        return ssec.obtenerSectores(area);
    }

    public List<Puesto> cargarPuestos(Sector sector, Trabajador trabajador) {
        List<Puesto> puestos = ssec.obtenerPuestos(sector);
        return st.filtrarPuestos(puestos, trabajador);
    }

    public Trabajador obtenerTrabajadorPuesto(Puesto puesto) {
        return st.obtenerPuestoTrabajador(puesto);
    }

    public void derivarAtencion(Atencion atencion, Trabajador trabajadorDeriva, Puesto puesto) {
        Trabajador trabajadorDestino = st.obtenerTrabajadorPuesto(puesto);
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (tiempo != 0) {
                    DatosDerivacion datosDerivacion = new DatosDerivacion(trabajadorDestino, trabajadorDeriva, atencion, tiempo/1000);
                    avisar(datosDerivacion);
                    tiempo = tiempo - 1000;
                }
                avisar(Eventos.cancelarDerivacion);
            }
        });
        thread.start();
    }

    public void aceptarDerivacion(Trabajador trabajador, Atencion atencion) {
        thread.stop();
        avisar(Eventos.aceptarDerivacion);
        Puesto puesto = st.derivarAtrabajador(trabajador);
        ssec.derivarAtencion(puesto, atencion, trabajador.getSectorTrabajador());
        st.asignarTrabajadorPuesto(puesto, trabajador);
    }
}
