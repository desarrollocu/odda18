
package Controlador;

import Controlador.Interfaces.VistaLoginTrabajador;
import Excepciones.AvisosException;
import Modelo.Datos.Trabajador;
import Modelo.Sistema;


public class ControladorLoginTrabajador {

    private VistaLoginTrabajador vista;
    private Sistema sistema;

    public ControladorLoginTrabajador(VistaLoginTrabajador vista) {
        this.vista = vista;
        this.sistema = Sistema.getInstancia();
    }

    public VistaLoginTrabajador getVista() {
        return vista;
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void loginTrabajador(String ci, String pass) {
        try {
            Trabajador t = getSistema().loginTrabajador(ci, pass);
            getVista().ingresarTrabajador(t);

        } catch (AvisosException e) {
            getVista().errorLogin(e.getMessage());
        }
    }
}
