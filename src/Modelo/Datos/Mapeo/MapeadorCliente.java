///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo.Datos.Mapeo;
//
//import Modelo.Datos.Cliente;
//import Modelo.Datos.Persistencia.Mapeador;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///**
// *
// * @author Denise
// */
//public class MapeadorCliente implements Mapeador {
//     private Cliente c;
//
//    public MapeadorCliente(Cliente c) {
//        this.c = c;
//    }
//
//   
//    public Cliente getC() {
//        return c;
//    }
//
//    public void setC(Cliente c) {
//        this.c = c;
//    }
//    
//    
//    
//    @Override
//    public int getOid() {
//        return c.getOid();
//    }
//
//    @Override
//    public void setOid(int oid) {
//        c.setOid(oid);
//    }
//
//    @Override
//    public ArrayList<String> getSqlInsertar() {
//        ArrayList<String> sqls = new ArrayList();
//        sqls.add("INSERT INTO clientes values (" + getOid() + ",'" +
//                     c.getNombreCompleto()+ "','" 
//                    + c.getCedulaUsu()+ "','"
//                    +c.getEmailCliente()+ "'+)");
//                    //poner categoria
//        return sqls;
//    }
//
//    @Override
//    public ArrayList<String> getSqlModificar() {
//         ArrayList<String> sqls = new ArrayList();
//        sqls.add("UPDATE clientes set nombrecompleto='" + c.getNombreCompleto() +
//                     "',cedula='" + c.getCedulaUsu() +
//                     "',email='" + c.getEmailCliente() +
//                     "',categoria='" + c.getCedulaUsu()+//cambiar por categoria
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
//         return "SELECT * FROM clientes";
//    }
//
//    @Override
//    public void crearNuevo() {
//         c = new Cliente();
//    }
//
//    @Override
//    public void leerCompuesto(ResultSet rs) throws SQLException {
//        c.setNombreCompleto(rs.getString("nombrecompleto"));
//        c.setCedulaUsu(rs.getString("cedula"));
//        c.setEmailCliente(rs.getString("email"));/*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo.Datos.Mapeo;
//
//import Modelo.Datos.Cliente;
//import Modelo.Datos.Persistencia.Mapeador;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///**
// *
// * @author Denise
// */
//public class MapeadorCliente implements Mapeador {
//     private Cliente c;
//
//    public MapeadorCliente(Cliente c) {
//        this.c = c;
//    }
//
//   
//    public Cliente getC() {
//        return c;
//    }
//
//    public void setC(Cliente c) {
//        this.c = c;
//    }
//    
//    
//    
//    @Override
//    public int getOid() {
//        return c.getOid();
//    }
//
//    @Override
//    public void setOid(int oid) {
//        c.setOid(oid);
//    }
//
//    @Override
//    public ArrayList<String> getSqlInsertar() {
//        ArrayList<String> sqls = new ArrayList();
//        sqls.add("INSERT INTO clientes values (" + getOid() + ",'" +
//                     c.getNombreCompleto()+ "','" 
//                    + c.getCedulaUsu()+ "','"
//                    +c.getEmailCliente()+ "'+)");
//                    //poner categoria
//        return sqls;
//    }
//
//    @Override
//    public ArrayList<String> getSqlModificar() {
//         ArrayList<String> sqls = new ArrayList();
//        sqls.add("UPDATE clientes set nombrecompleto='" + c.getNombreCompleto() +
//                     "',cedula='" + c.getCedulaUsu() +
//                     "',email='" + c.getEmailCliente() +
//                     "',categoria='" + c.getCedulaUsu()+//cambiar por categoria
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
//         return "SELECT * FROM clientes";
//    }
//
//    @Override
//    public void crearNuevo() {
//         c = new Cliente();
//    }
//
//    @Override
//    public void leerCompuesto(ResultSet rs) throws SQLException {
//        c.setNombreCompleto(rs.getString("nombrecompleto"));
//        c.setCedulaUsu(rs.getString("cedula"));
//        c.setEmailCliente(rs.getString("email"));
//        c.setCategoria(rs.getObject("categoria"));//falta ponercategoria
//    }
//
//    @Override
//    public void leerComponente(ResultSet rs) throws SQLException {
//        
//    }
//
//    @Override
//    public Object getObjeto() {
//        return c;
//    }
//    
//}
//
//        c.setCategoria(rs.getObject("categoria"));//falta ponercategoria
//    }
//
//    @Override
//    public void leerComponente(ResultSet rs) throws SQLException {
//        
//    }
//
//    @Override
//    public Object getObjeto() {
//        return c;
//    }
//    
//}
