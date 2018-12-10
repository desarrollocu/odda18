/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

import Modelo.Datos.base.ModeloBase;

import java.util.Date;

public class Atencion extends ModeloBase {

    private int numero;
    private Date fechaSolicitudNumero;
    private Date horaSolicitudAtencion;
    private Date horaFinAtencion;
    private String descripcion;
    private Trabajador trabajadadorInicio;
    private Trabajador trabajadorFinal;
    private Cliente cliente;
    private Sector sector;
    private boolean enEspera;
    private EstadoAtencion estado;

    public Atencion(Date fechaSolicitudNumero, Date horaSolicitudAtencion, Cliente cliente, Sector sector) {
        this.fechaSolicitudNumero = fechaSolicitudNumero;
        this.horaSolicitudAtencion = horaSolicitudAtencion;
        this.cliente = cliente;
        this.sector = sector;
        this.enEspera = true;
        this.estado = EstadoAtencion.PENDIENTE;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaSolicitudNumero() {
        return fechaSolicitudNumero;
    }

    public void setFechaSolicitudNumero(Date fechaSolicitudNumero) {
        this.fechaSolicitudNumero = fechaSolicitudNumero;
    }

    public Date getHoraFinAtencion() {
        return horaFinAtencion;
    }

    public void setHoraFinAtencion(Date horaFinAtencion) {
        this.horaFinAtencion = horaFinAtencion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Trabajador getTrabajadadorInicio() {
        return trabajadadorInicio;
    }

    public void setTrabajadadorInicio(Trabajador trabajadadorInicio) {
        this.trabajadadorInicio = trabajadadorInicio;
    }

    public Trabajador getTrabajadorFinal() {
        return trabajadorFinal;
    }

    public void setTrabajadorFinal(Trabajador trabajadorFinal) {
        this.trabajadorFinal = trabajadorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public boolean isEnEspera() {
        return enEspera;
    }

    public void setEnEspera(boolean enEspera) {
        this.enEspera = enEspera;
    }

    public Date getHoraSolicitudAtencion() {
        return horaSolicitudAtencion;
    }

    public void setHoraSolicitudAtencion(Date horaSolicitudAtencion) {
        this.horaSolicitudAtencion = horaSolicitudAtencion;
    }

    public EstadoAtencion getEstado() {
        return estado;
    }

    public void setEstado(EstadoAtencion estado) {
        this.estado = estado;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String devolverCedulaCliente() {
        return cliente.getCedulaUsu();
    }

    public String getNombreCLiente() {
        return this.getCliente().getNombreCompleto();
    }

}
