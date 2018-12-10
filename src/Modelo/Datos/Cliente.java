/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Datos;

public class Cliente extends Usuario implements Categoria {

    private String emailCliente;
    private Categoria categoria;

    public Cliente(String emailCliente, String nombreCompleto, String cedulaUsu, int oid) {
        super(nombreCompleto, cedulaUsu, oid);
        this.emailCliente = emailCliente;
        this.categoria = categoria;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int bonificacion(Cliente cliente) {
        return categoria.bonificacion(this);
    }

}
