/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Datos.eventos.Eventos;
import java.util.ArrayList;
import java.util.List;

import java.util.Observable;

/**
 * @author Denise
 */
public class Puesto extends Observable {

    private int numPuesto;
    private boolean asignado;
    private Sector sector;
    private Atencion atencionActual;
    private List<Atencion> derivadas = new ArrayList<>();

    public Puesto(int numPuesto, Sector sector) {
        this.numPuesto = numPuesto;
        this.sector = sector;
        this.asignado = false;
    }

    public Puesto(int numPuesto, Trabajador trabajadorAsignado) {
        this.numPuesto = numPuesto;
        this.asignado = false;
        this.derivadas = new ArrayList<>();
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

    public List<Atencion> getDerivadas() {
        return derivadas;
    }

    public void setDerivadas(List<Atencion> derivadas) {
        this.derivadas = derivadas;
    }

    @Override
    public String toString() {
        return "Puesto " + numPuesto;
    }
}
