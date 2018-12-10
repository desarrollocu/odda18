/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos.eventos;

import Modelo.Datos.Atencion;
import Modelo.Datos.Trabajador;

public class DatosDerivacion {
    
    private Trabajador trabajadorDestino;
    private Trabajador trabajadorDeriva;
    private Atencion atencion;
    private int tiempo;

    public DatosDerivacion(Trabajador trabajadorDestino, Trabajador trabajadorDeriva, Atencion atencion, int tiempo) {
        this.trabajadorDestino = trabajadorDestino;
        this.trabajadorDeriva = trabajadorDeriva;
        this.atencion = atencion;
        this.tiempo = tiempo;
    }

    public Trabajador getTrabajadorDestino() {
        return trabajadorDestino;
    }

    public void setTrabajadorDestino(Trabajador trabajadorDestino) {
        this.trabajadorDestino = trabajadorDestino;
    }

    public Trabajador getTrabajadorDeriva() {
        return trabajadorDeriva;
    }

    public void setTrabajadorDeriva(Trabajador trabajadorDeriva) {
        this.trabajadorDeriva = trabajadorDeriva;
    }

    public Atencion getAtencion() {
        return atencion;
    }

    public void setAtencion(Atencion atencion) {
        this.atencion = atencion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
}
