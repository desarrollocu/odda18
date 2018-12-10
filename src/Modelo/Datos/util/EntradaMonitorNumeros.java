/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos.util;

/**
 *
 * @author Denise
 */
public class EntradaMonitorNumeros {
    
    String sector;
    String nro;
    String cliente; 
    String puesto;

    public EntradaMonitorNumeros(String sector, String nro, String cliente, String puesto) {
        this.sector = sector;
        this.nro = nro;
        this.cliente = cliente;
        this.puesto = puesto;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}
