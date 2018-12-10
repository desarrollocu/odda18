/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Logica;

import Excepciones.AvisosException;
import Modelo.Datos.Cliente;
import java.util.ArrayList;
import java.util.List;


public class SistemaClientes {
    
    //Atributos
    private List <Cliente> listaClientes = new ArrayList ();

    //Accesores y modificadores
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Métodos
     public Cliente loginCliente(String ci) throws AvisosException {
        Cliente c = null;
        for (Cliente cli : listaClientes) {
            if (cli.getCedulaUsu().equals(ci)) {
                c = cli;
                break;
            }
        }
        if (c != null) {
            c.setLogueado(true);
            listaClientes.remove(c);
            listaClientes.add(c);
            return c;
        } else {
            throw new AvisosException("No existe el cliente en el Sistema");
        }
    }

    public void agregarCliente(Cliente c) {
        if (!this.listaClientes.contains(c)){
            listaClientes.add(c);
        }
        
    }
    
    public Cliente buscarCliente(String cedula) {
        Cliente c = null;
        for (Cliente cli : listaClientes) {
            if (cli.getCedulaUsu().equals(cedula)) {
                c = cli;
                break;
            }
        }
        return c;
    }
    
    
 //----------------------------------------------------------------------------   

   

   
}
