/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Cliente;

public interface VistaLoginCliente {

    void errorLogin(String msg);

    void ingresarCliente(Cliente c);

}
