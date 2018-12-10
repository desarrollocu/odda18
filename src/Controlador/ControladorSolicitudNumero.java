/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Excepciones.AvisosException;
import Modelo.Datos.Area;
import Modelo.Datos.Atencion;
import Modelo.Datos.Cliente;
import Modelo.Datos.Sector;
import Modelo.Sistema;
import Vista.atencion.SolicitudNumero;

import java.util.List;

public class ControladorSolicitudNumero {
    
    private Sistema sistema;
    private SolicitudNumero vista;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public SolicitudNumero getVista() {
        return vista;
    }

    public void setVista(SolicitudNumero vista) {
        this.vista = vista;
    }

    public ControladorSolicitudNumero(SolicitudNumero vista) {
        this.sistema = Sistema.getInstancia();
        this.vista = vista;
    }
    
    public void obtenerSectores(Area a){
        List<Sector> sectores= getSistema().obtenerSectores(a);
        getVista().cargarSectores(sectores);
    }
    
    public void loginCliente(String ci,Sector sector) {
        try {
            Cliente c = getSistema().loginCliente(ci);
            Atencion a= getSistema().asignarAtencionCliente(c, sector);
            getVista().ingresarCliente(c, a);
        } catch (AvisosException e) {
            getVista().errorLogin(e.getMessage());
        }
    }

}
