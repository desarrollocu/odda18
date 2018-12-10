///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo.Datos.Mapeo;
//
//import Modelo.Datos.Sector;
//import Modelo.Datos.Persistencia.Mapeador;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///**
// *
// * @author Denise
// */
//public class MapeadorSector implements Mapeador {
//     private Sector s;
//
//    public MapeadorSector(Sector s) {
//        this.s = s;
//    }
//
//   
//    public Sector getS() {
//        return s;
//    }
//
//    public void setS(Sector s) {
//        this.s = s;
//    }
//    
//    
//    
//    @Override
//    public int getOid() {
//        return s.getOid();
//    }
//
//    @Override
//    public void setOid(int oid) {
//        s.setOid(oid);
//    }
//
//    @Override
//    public ArrayList<String> getSqlInsertar() {
//        ArrayList<String> sqls = new ArrayList();
//        sqls.add("INSERT INTO sectores values (" + getOid() + ",'" +
//                     s.getNomSector()+ "','" + s.getArea()+ "'+)");//arreglar
//        return sqls;
//    }
//
//    @Override
//    public ArrayList<String> getSqlModificar() {
//         ArrayList<String> sqls = new ArrayList();
//        sqls.add("UPDATE sectores set nomSector='" + s.getNomSector() +
//                     "',IdArea='" + s.getArea());
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
//         return "SELECT * FROM sectores";
//    }
//
//    @Override
//    public void crearNuevo() {
//         s = new Sector();
//    }
//
//    @Override
//    public void leerCompuesto(ResultSet rs) throws SQLException {
//        s.setNomSector(rs.getString("nomSector"));
//      //  s.setEmailCliente(rs.getString("email")); va el IDAREA??
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
//        return s;
//    }
//    
//}
