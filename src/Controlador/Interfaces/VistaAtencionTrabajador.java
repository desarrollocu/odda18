/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Interfaces;

import Modelo.Datos.Atencion;
import Modelo.Datos.Cliente;
import Modelo.Datos.Trabajador;
import Modelo.Datos.eventos.DatosDerivacion;

public interface VistaAtencionTrabajador {

    void cargarAtencion(Atencion atencion, Cliente cliente);

    void cargarEtiquetas(Trabajador trabajador);

    public void cancelarDerivacion();

    public void cargarDatosDerivacion(DatosDerivacion datosDerivacion);

}
