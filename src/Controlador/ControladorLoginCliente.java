/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.Interfaces.VistaLoginCliente;
import Excepciones.AvisosException;
import Modelo.Datos.Cliente;
import Modelo.Sistema;

/**
 * @author Fabi
 */
public class ControladorLoginCliente {

    private VistaLoginCliente vista;
    private Sistema sistema;

    public ControladorLoginCliente(VistaLoginCliente vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
    }

    public void loginCliente(String ci) {
        try {
            Cliente c = sistema.loginCliente(ci);
            vista.ingresarCliente(c);
        } catch (AvisosException e) {
            vista.errorLogin(e.getMessage());
        }
    }
}
