/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Datos.base.ModeloBase;

import java.util.ArrayList;
import java.util.List;

public class Sector extends ModeloBase {

    private String nomSector;
    private List<Puesto> listaPuestos;
    private Area area;

    public Sector(String nomSector) {
        this.listaPuestos = new ArrayList<>();
        this.nomSector = nomSector;
    }

    public String getNomSector() {
        return nomSector;
    }

    public List<Puesto> getListaPuestos() {
        return listaPuestos;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void agregarPuesto(Puesto puesto) {
        if (puesto.getNumPuesto() == 0) {
            int numero = 0;
            for (Puesto p : listaPuestos) {
                if (p.getNumPuesto() > numero) {
                    numero = p.getNumPuesto();
                }
            }
            numero++;
            puesto.setNumPuesto(numero);
        }
        listaPuestos.add(puesto);
    }

    public List<Puesto> puestosLibres() {
        List<Puesto> listaPuestosLibres = new ArrayList<>();
        for (Puesto p : this.listaPuestos) {
            if (p.isAsignado() == false) {
                listaPuestosLibres.add(p);
            }
        }
        return listaPuestosLibres;
    }

    public void asignarTrabajadorAPuesto(Puesto puesto, Trabajador trabajador) {
        puesto.setAsignado(true);
        trabajador.setPuestoTrabajador(puesto);
    }

    @Override
    public String toString() {
        return nomSector;
    }
}
