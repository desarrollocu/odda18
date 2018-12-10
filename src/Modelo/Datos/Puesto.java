/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Datos.eventos.Eventos;

import java.util.Observable;

/**
 * @author Denise
 */
public class Puesto extends Observable {

    private int numPuesto;
    private boolean asignado;
    private Sector sector;
    private Atencion atencionActual;

    public Puesto(int numPuesto, Sector sector) {
        this.numPuesto = numPuesto;
        this.sector = sector;
        this.asignado = false;
    }

    public Puesto(int numPuesto, Trabajador trabajadorAsignado) {
        this.numPuesto = numPuesto;
        this.asignado = false;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    public boolean isAsignado() {
        return asignado;
    }

    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
        this.avisar(Eventos.asignarPuesto);
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Atencion getAtencionActual() {
        return atencionActual;
    }

    public void setAtencionActual(Atencion atencionActual) {
        this.atencionActual = atencionActual;
    }

    public void avisar(Eventos evento) {
        setChanged();
        notifyObservers(evento);
    }

    @Override
    public String toString() {
        return "Puesto " + numPuesto;
    }
}
