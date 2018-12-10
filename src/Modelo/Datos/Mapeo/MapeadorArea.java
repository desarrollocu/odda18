///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Modelo.Datos.Mapeo;
//
//import Modelo.Datos.Area;
//import Modelo.Datos.Persistencia.Mapeador;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///**
// *
// * @author Denise
// */
//public class MapeadorArea implements Mapeador {
//    
//     private Area area;
//    
//    public MapeadorArea(Area area) {
//        this.area = area;
//    }
//
//    public MapeadorArea() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    
//    
//    @Override
//    public int getOid() {
//        return area.getOid();
//    }
//
//    @Override
//    public void setOid(int oid) {
//        area.setOid(oid);
//    }
//
//    @Override
//    public String getSqlInsertar() {
//        return "INSERT INTO ariculo (oid,codigo,nombre,precioUnitario,cantStock,unidadProcesadora) values " +
//                   "(" + getOid() + ",'" + a.getCodigo()+ ",'"+a.getNombre()+",'"+a.getPrecioUnitario()+ ",'"+a.getCantStock()+",'"+a.getUnidadProcesadora()+")" ;
//    }
//    @Override
//   public ArrayList<String> getSqlInsertar() {
//       ArrayList<String> s = new ArrayList<>();
//        s.add("INSERT INTO areas (oid,nomArea) values " +
//                   "(" + getOid() + ",'" + area.getNomArea()+")") ;
//        return s;
//    
//   }
//    
//   
//    
//    @Override
//    public String getSqlModificar() {
////        return "UPDATE areas set cantStock ='" + a.getCantStock() + "', " +
//     return "UPDATE area SET cantStock ='" + a.getCantStock() + "' " +
//                  
//                    " where oid=" + getOid();
//              
//    }
//    
//
//    @Override
//    public String getSqlBorrar() {
//        return "DELETE from areas where oid=" + getOid();
//    }
//
//    @Override
//    public String getSqlRestaurar() {
//        return "SELECT * from areas where oid=" + getOid();
//    }
//
//    @Override
//   
//       
//    }
//
//    @Override
//    public String getSqlSeleccionar() {
//      
//    }
//
//    
//    @Override
//    public void crearNuevo() {
//        area= new Area();
//    }
//
//    @Override
//    public Object getObjeto() {
//        return area;
//    }
//
//    @Override
//    public ArrayList<String> getSqlModificar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public String getSqlSelect() {
//          return "SELECT * FROM areas";
//    }
//
//    
//
//    @Override
//    public void leerCompuesto(ResultSet rs) throws SQLException {
//        setOid(rs.getInt("oid"));
//       area.setCodigo(rs.getInt("codigo"));
//       area.setNombre(rs.getString("nombre"));
//       area.setPrecioUnitario(rs.getDouble("precioUnitario"));
//       area.setCantStock(rs.getInt("cantStock"));
//    }
//
//    @Override
//    public ArrayList<String> getSqlBorrar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//   
//
//    
//}
