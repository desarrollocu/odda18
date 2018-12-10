///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo.Datos.Mapeo;
//
//import Modelo.Datos.Trabajador;
//import Modelo.Datos.Persistencia.Mapeador;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
///**
// *
// * @author Denise
// */
//public class MapeadorTrabajador implements Mapeador{
//     private Trabajador t;
//
//    public MapeadorTrabajador(Trabajador t) {
//        this.t = t;
//    }
//
//   
//    public Trabajador getT() {
//        return t;
//    }
//
//    public void setT(Trabajador T) {
//        this.t = t;
//    }
//    
//    
//    
//    @Override
//    public int getOid() {
//        return t.getOid();
//    }
//
//    @Override
//    public void setOid(int oid) {
//        t.setOid(oid);
//    }
//
//    @Override
//    public ArrayList<String> getSqlInsertar() {
//        ArrayList<String> sqls = new ArrayList();
//        sqls.add("INSERT INTO trabajadores values (" + getOid() + ",'" +
//                     t.getNombreCompleto()+ "','" + t.getCedulaUsu()+ "','"+t.getPassTrabajador()+ "'+)");
//        return sqls;
//    }
//
//    @Override
//    public ArrayList<String> getSqlModificar() {
//         ArrayList<String> sqls = new ArrayList();
//        sqls.add("UPDATE trabajadores set nomcompleto='" + t.getNombreCompleto() +
//                     "',cedula='" + t.getCedulaUsu() +
//                     "',password='" + t.getPassTrabajador() +
//                     "' where oid=" + getOid());
//        return sqls;
//    }
//
//    @Override
//    public ArrayList<String> getSqlBorrar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String getSqlSelect() {
//         return "SELECT * FROM trabajadores";
//    }
//
//    @Override
//    public void crearNuevo() {
//         t = new Trabajador();
//    }
//
//    @Override
//    public void leerCompuesto(ResultSet rs) throws SQLException {
//        t.setNombreCompleto(rs.getString("nombrecompleto"));
//        t.setCedulaUsu(rs.getString("cedula"));
//        t.setPassTrabajador(rs.getString("password"));
//        
//    }
//
//    @Override
//    public void leerComponente(ResultSet rs) throws SQLException {
//        
//    }
//
//    @Override
//    public Object getObjeto() {
//        return t;
//    }
//    
//}
