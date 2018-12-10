/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Datos.base.ModeloBase;

/**
 * @author Denise
 */
public class Usuario extends ModeloBase {

    private String nombreCompleto;
    private String cedulaUsu;
    private boolean logueado;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedulaUsu() {
        return cedulaUsu;
    }

    public void setCedulaUsu(String cedulaUsu) {
        this.cedulaUsu = cedulaUsu;
    }

    public boolean isLogueado() {
        return logueado;
    }

    public void setLogueado(boolean logueado) {
        this.logueado = logueado;
    }

    public Usuario(String nombreCompleto, String cedulaUsu, int oid) {
        this.nombreCompleto = nombreCompleto;
        this.cedulaUsu = cedulaUsu;
        this.logueado = false;
        this.oid = oid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombreCompleto=" + nombreCompleto + '}';
    }

}

