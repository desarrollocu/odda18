/////*
//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
////package Modelo.Datos.Mapeo;
////
////import Modelo.Datos.Atencion;
////import Modelo.Datos.Persistencia.Mapeador;
////import java.sql.ResultSet;
////import java.sql.SQLException;
////import java.util.ArrayList;
////
/////**
//// *
//// * @author Denise
//// */
////public class MapeadorAtencion implements Mapeador{
//////    private Atencion a;
//////    
//////    public MapeadorAtencion(Atencion atencion) {
//////        this.a = atencion;
//////    }
//////
//////    public MapeadorAtencion() {
//////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//////    }
//////
//////    
//////    
//////    @Override
//////    public int getOid() {
//////        return a.getOid();
//////    }
//////
//////    @Override
//////    public void setOid(int oid) {
//////        a.setOid(oid);
//////    }
//////
////////    @Override
////////    public String getSqlInsertar() {
////////        return "INSERT INTO ariculo (oid,codigo,nombre,precioUnitario,cantStock,unidadProcesadora) values " +
////////                   "(" + getOid() + ",'" + a.getCodigo()+ ",'"+a.getNombre()+",'"+a.getPrecioUnitario()+ ",'"+a.getCantStock()+",'"+a.getUnidadProcesadora()+")" ;
////////    }
//////    @Override
//////   public ArrayList<String> getSqlInsertar() {
//////       ArrayList<String> s = new ArrayList<>();
//////        s.add("INSERT INTO atenciones (oid,nomArea) values " +
//////                   "(" + getOid() + ",'" + a.getNumero())+")") ;
//////        return s;
//////    
//////   }
//////    
//////   
//////    
////////    @Override
////////    public String getSqlModificar() {
//////////        return "UPDATE atenciones set cantStock ='" + a.getCantStock() + "', " +
////////     return "UPDATE atenciones SET cantStock ='" + a.getCantStock() + "' " +
////////                  
////////                    " where oid=" + getOid();
////////              
////////    }
//////    
//////
////////    @Override
////////    public String getSqlBorrar() {
////////        return "DELETE from atenciones where oid=" + getOid();
////////    }
//////
//////    @Override
//////    public String getSqlRestaurar() {
//////        return "SELECT * from atenciones where oid=" + getOid();
//////    }
//////
//////    @Override
//////    public void crearNuevo() {
//////        a= new Atencion();
//////    }
//////
//////    @Override
//////    public Object getObjeto() {
//////        return a;
//////    }
//////
//////    @Override
//////    public ArrayList<String> getSqlModificar() {
//////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//////    }
//////
//////    @Override
//////    public String getSqlSelect() {
//////          return "SELECT * FROM atenciones";
//////    }
//////
//////    
//////
//////    @Override
//////    public void leerCompuesto(ResultSet rs) throws SQLException {
//////            
//////       setOid(rs.getInt("oid"));
//////       a.setNumero(rs.getInt("numero"));
//////       a.setDescripcion(rs.getString("descripcion"));
//////       
//////    }  
//////    
//////
//////    @Override
//////    public ArrayList<String> getSqlBorrar() {
//////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//////    }
//////
//////    @Override
//////    public void leerComponente(ResultSet rs) throws SQLException {
//////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//////    }
////
//// 
//// }