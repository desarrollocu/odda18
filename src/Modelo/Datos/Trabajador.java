/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

public class Trabajador extends Usuario {

    private String passTrabajador;
    private Sector sectorTrabajador;
    private Puesto puestoTrabajador;
    private int cantidadAtenciones;
    private double tiempoPromedioAtencion;
    private int cantidadNumerosDerivados;

    public Trabajador(String passTrabajador, Sector sectorTrabajador, String nombreCompleto, String cedulaUsu, int oid) {
        super(nombreCompleto, cedulaUsu, oid);
        this.passTrabajador = passTrabajador;
        this.sectorTrabajador = sectorTrabajador;
        this.cantidadAtenciones = 0;
        this.tiempoPromedioAtencion = 0;
        this.cantidadNumerosDerivados = 0;
    }

    public String getPassTrabajador() {
        return passTrabajador;
    }

    public void setPassTrabajador(String passTrabajador) {
        this.passTrabajador = passTrabajador;
    }

    public Sector getSectorTrabajador() {
        return sectorTrabajador;
    }

    public void setSectorTrabajador(Sector sectorTrabajador) {
        this.sectorTrabajador = sectorTrabajador;
    }

    public Puesto getPuestoTrabajador() {
        return puestoTrabajador;
    }

    public void setPuestoTrabajador(Puesto puestoTrabajador) {
        this.puestoTrabajador = puestoTrabajador;
    }

    public int getCantidadAtenciones() {
        return cantidadAtenciones;
    }

    public void setCantidadAtenciones(int cantidadAtenciones) {
        this.cantidadAtenciones = cantidadAtenciones;
    }

    public double getTiempoPromedioAtencion() {
        return tiempoPromedioAtencion;
    }

    public void setTiempoPromedioAtencion(double tiempoPromedioAtencion) {
        this.tiempoPromedioAtencion = tiempoPromedioAtencion;
    }

    public int getCantidadNumerosDerivados() {
        return cantidadNumerosDerivados;
    }

    public void setCantidadNumerosDerivados(int cantidadNumerosDerivados) {
        this.cantidadNumerosDerivados = cantidadNumerosDerivados;
    }

    public Puesto devolverPuestoTrabajador() {
        return this.getPuestoTrabajador();

    }

    public Sector devolverSectorTrabajador() {
        return this.getSectorTrabajador();
    }

    public String devolverNombreSectorTrabajador() {
        return this.devolverSectorTrabajador().getNomSector();
    }

    public Area devolverAreaSectorTRabajador() {
        return this.devolverSectorTrabajador().getArea();
    }

    public String devolverNombreAreaSectorTrabajador() {
        return this.devolverSectorTrabajador().getArea().getNomArea();
    }

    public int obtenerNroPuesto() {
        return this.getPuestoTrabajador().getNumPuesto();
    }
}
