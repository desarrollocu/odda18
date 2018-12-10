/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Atencion;
import Modelo.Datos.Cliente;
import Modelo.Datos.Sector;

import java.util.List;

public interface VistaSolicitudNumero {

    void cargarSectores(List<Sector> sectores);

    void errorLogin(String msg);

    void ingresarCliente(Cliente c, Atencion a);

}
