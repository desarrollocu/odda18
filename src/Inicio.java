/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Datos.Area;
import Modelo.Datos.Cliente;
import Modelo.Datos.Puesto;
import Modelo.Datos.Sector;
import Modelo.Sistema;
import Modelo.Logica.SistemaAreas;
import Modelo.Datos.Trabajador;

public class Inicio {

    public static void main(String[] args) {
        cargarDatos();
        new Principal().setVisible(true);

    }

    private static void cargarDatos() {

        Area a1 = new Area("Cardiología");
        Area a2 = new Area("Hematología");
        Area a3 = new Area("Farmacia");

        Sistema.getInstancia().agregarArea(a1);
        Sistema.getInstancia().agregarArea(a2);
        Sistema.getInstancia().agregarArea(a3);

        Sector s1 = new Sector("Cardiología infantil");
        Sector s2 = new Sector("Cardiología quirúrgica");
        Sector s3 = new Sector("Análisis clínicos");
        Sector s4 = new Sector("Transfusiones");
        Sector s5 = new Sector("Preparación fórmulas");
        Sector s6 = new Sector("Entrega medicamentos");

        s1.agregarPuesto(new Puesto(1,s1));
        s1.agregarPuesto(new Puesto(2,s1));
        s1.agregarPuesto(new Puesto(3,s1));
        s1.agregarPuesto(new Puesto(4,s1));
        s1.agregarPuesto(new Puesto(5,s1));

        s2.agregarPuesto(new Puesto(1,s2));
        s2.agregarPuesto(new Puesto(2,s2));
        s2.agregarPuesto(new Puesto(3,s2));
        s2.agregarPuesto(new Puesto(4,s2));
        s2.agregarPuesto(new Puesto(5,s2));

        s3.agregarPuesto(new Puesto(1,s3));
        s3.agregarPuesto(new Puesto(2,s3));
        s3.agregarPuesto(new Puesto(3,s3));
        s3.agregarPuesto(new Puesto(4,s3));
        s3.agregarPuesto(new Puesto(5,s3));

        s4.agregarPuesto(new Puesto(1,s4));
        s4.agregarPuesto(new Puesto(2,s4));
        s4.agregarPuesto(new Puesto(3,s4));
        s4.agregarPuesto(new Puesto(4,s4));
        s4.agregarPuesto(new Puesto(5,s4));

        s5.agregarPuesto(new Puesto(1,s5));
        s5.agregarPuesto(new Puesto(2,s5));
        s5.agregarPuesto(new Puesto(3,s5));
        s5.agregarPuesto(new Puesto(4,s5));
        s5.agregarPuesto(new Puesto(5,s5));

        s6.agregarPuesto(new Puesto(1,s6));
        s6.agregarPuesto(new Puesto(2,s6));
        s6.agregarPuesto(new Puesto(3,s6));
        s6.agregarPuesto(new Puesto(4,s6));
        s6.agregarPuesto(new Puesto(5,s6));
        
        s1.setArea(a1);
        s2.setArea(a1);
        
        s3.setArea(a2);
        s4.setArea(a2);
        
        s5.setArea(a3);
        s6.setArea(a3);
        
        Trabajador t1 = new Trabajador("111", s1, "Juan Pérez", "111",501);
        Trabajador t2 = new Trabajador("222", s2, "Homero Simpson", "222",502);
        Trabajador t3 = new Trabajador("333", s1, "Mickey Mouse", "333",503);
      
        a1.getListaSectores().add(s1);
        a1.getListaSectores().add(s2);

        a2.getListaSectores().add(s3);
        a2.getListaSectores().add(s4);

        a3.getListaSectores().add(s5);
        a3.getListaSectores().add(s6);

        Sistema.getInstancia().agregarTrabajador(t1);
        Sistema.getInstancia().agregarTrabajador(t2);
        Sistema.getInstancia().agregarTrabajador(t3);

        Cliente c1 = new Cliente("aaa@hotmail.com","Ana" , "444",1001);
        Cliente c2 = new Cliente( "bbb@hotmail.com","Benito", "555",1002);
        Cliente c3 = new Cliente( "ccc@hotmail.com","Carlos", "666",1003);
        Cliente c4 = new Cliente("ddd@hotmail.com","Denise" , "777",1004);

        Sistema.getInstancia().agregarCliente(c1);
        Sistema.getInstancia().agregarCliente(c2);
        Sistema.getInstancia().agregarCliente(c3);
        Sistema.getInstancia().agregarCliente(c4);
    }
}
