/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Figueroa
 */
public class ConsultaDAO extends Conexion {
    
    public boolean calculartotalgeneral(Venta a)
    {
        PreparedStatement ps=null;
        Connection con =getConexion();
        String sql = "INSERT INTO totalgeneral(fecha,idventa,totalfinal) VALUES (?,?,?)";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setString(1, a.getFecha());
            ps.setInt(2, a.getIdventa());
            ps.setFloat(3, a.getTotalfinal());
            ps.execute();
            return true;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return false;
        }
        
    }
    
    public int idincrementableClientes()
    {
        int id=1;
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try{
                ps = con.prepareStatement("select MAX(idcliente) FROM clientes");
                rs = ps.executeQuery();
             while(rs.next())
             {
               id = rs.getInt(1) + 1;
              }
            }   
            catch(SQLException e)
            {
              System.out.println(e);
             }
              finally{
                    try{
                        ps.close();
                         rs.close();
                         con.close();
                          }catch(Exception e){
                              
                         }                             
                         }
           return id;
      }
    public int idincrementableVentas()
    {
        int id=1;
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try{
                ps = con.prepareStatement("select MAX(idventa) FROM ventas");
                rs = ps.executeQuery();
             while(rs.next())
             {
               id = rs.getInt(1) + 1;
              }
            }   
            catch(SQLException e)
            {
              System.out.println(e);
             }
              finally{
                    try{
                        ps.close();
                         rs.close();
                         con.close();
                          }catch(Exception e){
                              
                         }                             
                         }
           return id;
      }
    public int idincrementableProductos()
    {
        int id=0;
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        try{
                ps = con.prepareStatement("select MAX(idproducto) FROM productos");
                rs = ps.executeQuery();
             while(rs.next())
             {
               id = rs.getInt(1) + 1;
              }
            }   
            catch(SQLException e)
            {
              System.out.println(e);
             }
              finally{
                    try{
                        ps.close();
                         rs.close();
                         con.close();
                          }catch(Exception e){
                              
                         }                             
                         }
           return id;
      }
    
    public boolean agregarProducto(Producto a)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO productos(idproducto,codigo,descripcion,stock,tipo,preciocosto,precioventa,descuento) VALUES (?,?,?,?,?,?,?,?)";
        
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1, a.getIdproducto());
            ps.setString(2,a.getCodigo());
            ps.setString(3,a.getDescripcion());
            ps.setInt(4,a.getStock());
            ps.setString(5,a.getTipo());
            ps.setFloat(6, a.getPreciocosto());
            ps.setFloat(7, a.getPrecioventa());
            ps.setInt(8, a.getDescuento());
            
            ps.execute();
            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos del producto");
            return false;
        }
        
    }
    public boolean agregarCliente(Cliente a)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO clientes(idcliente,dni,nombre,apellido,domicilio,telefono,codigopostal,iva) VALUES (?,?,?,?,?,?,?,?)";
        
        try
        {
            ps =con.prepareStatement(sql);
            ps.setInt(1, a.getIdCliente());
            ps.setInt(2, a.getDni());
            ps.setString(3, a.getNombre());
            ps.setString(4, a.getApellido());
            ps.setString(5, a.getDomicilio());
            ps.setString(6, a.getTelefono());
            ps.setString(7, a.getCodigopostal());
            ps.setString(8,a.getIva());
            ps.execute();
            return true;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al guardar los datos del cliente");
            return false;
        }
    }
    public boolean agregarVenta(Venta a)
    {
        PreparedStatement ps=null;
        Connection con = getConexion();
      
        String sql = "INSERT INTO ventas(idventa,idcliente,dni,nombre,apellido,domicilio,telefono,codigopostal,iva,idproducto,codigo,descripcion,stock,tipo,preciocosto,precioventa,descuento,fecha,cantidad,modocompra,total) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,a.getIdventa());
            ps.setInt(2, a.getCliente().getIdCliente());
            ps.setInt(3, a.getCliente().getDni());
            ps.setString(4, a.getCliente().getNombre());
            ps.setString(5,a.getCliente().getApellido());
            ps.setString(6, a.getCliente().getDomicilio());
            ps.setString(7, a.getCliente().getTelefono());
            ps.setString(8, a.getCliente().getCodigopostal());
            ps.setString(9,a.getCliente().getIva());
            ps.setInt(10, a.getProducto().getIdproducto());
            ps.setString(11, a.getProducto().getCodigo());
            ps.setString(12, a.getProducto().getDescripcion());
            ps.setInt(13, (a.getProducto().getStock())-a.getCantidad());
            ps.setString(14, a.getProducto().getTipo());
            ps.setFloat(15, a.getProducto().getPreciocosto());
            ps.setFloat(16, a.getProducto().getPrecioventa());
            ps.setInt(17,a.getProducto().getDescuento());
            ps.setString(18, a.getFecha());
            ps.setInt(19,a.getCantidad());
            ps.setString(20, a.getModocompra());
            ps.setFloat(21,(a.getProducto().getPrecioventa()*a.getCantidad()));
            
            ps.execute();
            return true;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al agregar venta ");
            return false;
        }
    }

    public ArrayList<Venta> getVentas1()
    {
        PreparedStatement ps =null;
        ArrayList<Venta> listaVentas = new ArrayList<Venta>();
        Connection con = getConexion();
        ResultSet rs;
        
        String sql = "SELECT * FROM ventas ";
        
        try
        {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Venta a = new Venta(Integer.parseInt(rs.getString("idventa")),new Cliente(Integer.parseInt(rs.getString("idcliente")),Integer.parseInt(rs.getString("dni")),rs.getString("nombre"),rs.getString("apellido"),rs.getString("domicilio"),rs.getString("telefono"),rs.getString("codigopostal"),rs.getString("iva")),new Producto(Integer.parseInt(rs.getString("idproducto")),rs.getString("codigo"),rs.getString("descripcion"),Integer.parseInt(rs.getString("stock")),rs.getString("tipo"),Float.parseFloat(rs.getString("preciocosto")),Float.parseFloat(rs.getString("precioventa")),Integer.parseInt(rs.getString("descuento"))),rs.getString("fecha"),Integer.parseInt(rs.getString("cantidad")),rs.getString("modocompra"),Float.parseFloat(rs.getString("total")));
                listaVentas.add(a);
            }
            return listaVentas;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
        public ArrayList<Venta> getVentas2(int dni)
    {
        PreparedStatement ps =null;
        ArrayList<Venta> listaVentas = new ArrayList<Venta>();
        Connection con = getConexion();
        ResultSet rs;
        
        String sql = "SELECT * FROM ventas where dni=?";
        
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,dni);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Venta a = new Venta(Integer.parseInt(rs.getString("idventa")),new Cliente(Integer.parseInt(rs.getString("idcliente")),Integer.parseInt(rs.getString("dni")),rs.getString("nombre"),rs.getString("apellido"),rs.getString("domicilio"),rs.getString("telefono"),rs.getString("codigopostal"),rs.getString("iva")),new Producto(Integer.parseInt(rs.getString("idproducto")),rs.getString("codigo"),rs.getString("descripcion"),Integer.parseInt(rs.getString("stock")),rs.getString("tipo"),Float.parseFloat(rs.getString("preciocosto")),Float.parseFloat(rs.getString("precioventa")),Integer.parseInt(rs.getString("descuento"))),rs.getString("fecha"),Integer.parseInt(rs.getString("cantidad")),rs.getString("modocompra"),Float.parseFloat(rs.getString("total")));
                listaVentas.add(a);
            }
            return listaVentas;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
        
        
    }
    
    public ArrayList<Producto> getProductos()
    {
        PreparedStatement ps = null;
        ResultSet rs;
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        Connection con = getConexion();
        String sql = "SELECT * FROM productos";
        
        try
        {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Producto a = new Producto(Integer.parseInt(rs.getString("idproducto")),rs.getString("codigo"),rs.getString("descripcion"),Integer.parseInt(rs.getString("stock")),rs.getString("tipo"),Float.parseFloat(rs.getString("preciocosto")),Float.parseFloat(rs.getString("precioventa")),Integer.parseInt(rs.getString("descuento")));
                listaProductos.add(a);
            }
            return listaProductos;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    public ArrayList<Cliente>getClientes()
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs;
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        
        String sql = "SELECT * FROM clientes";
        
        try
        {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Cliente a = new Cliente(Integer.parseInt(rs.getString("idcliente")),Integer.parseInt(rs.getString("dni")),rs.getString("nombre"),rs.getString("apellido"),rs.getString("telefono"),rs.getString("codigopostal"),rs.getString("domicilio"),rs.getString("iva"));
                listaCliente.add(a);
            }
            return listaCliente;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
 
    public ArrayList<Venta>getTotal()
    {
        PreparedStatement ps=null;
        ArrayList<Venta> listaVentas = new ArrayList<Venta>();
        Connection con = getConexion();
        String sql = "SELECT * FROM totalgeneral";
        ResultSet rs;
        
        try
        {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Venta a = new Venta(rs.getString("fecha"),Integer.parseInt(rs.getString("idventa")),Float.parseFloat(rs.getString("totalfinal")));
                listaVentas.add(a);
            }
            return listaVentas;
        }
        catch(SQLException e)
        {
            System.out.println(e);
            return null;
        }
        
        
        
        
    }
    public boolean buscarProducto(Producto a)
    {
        PreparedStatement ps=null;
        Connection con = getConexion();
        ResultSet rs;
        String sql = "SELECT * FROM productos WHERE idproducto=?";
        
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,a.getIdproducto());
            rs=ps.executeQuery();
            if(rs.next())
            {   
               // a.setIdproducto(Integer.parseInt("idproducto"));
                a.setCodigo(rs.getString("codigo"));
                a.setDescripcion(rs.getString("descripcion"));
                a.setStock(Integer.parseInt(rs.getString("stock")));
                a.setTipo(rs.getString("tipo"));
                a.setPreciocosto(Float.parseFloat(rs.getString("preciocosto")));
                a.setPrecioventa(Float.parseFloat(rs.getString("precioventa")));
                a.setDescuento(Integer.parseInt(rs.getString("descuento")));
               
                return true;
            }
            return false;
        }
            catch(SQLException e)
            {
                 System.out.println(e);
                    return false;
             }
            
            
        
    }

    public boolean buscarCliente (Cliente a)
    {
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs;
        String sql = "SELECT * FROM clientes WHERE idcliente=?";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1,a.getIdCliente());
            rs=ps.executeQuery();
            if(rs.next())
            {
                //a.setIdCliente(Integer.parseInt(rs.getString("idcliente")));
                a.setDni(Integer.parseInt(rs.getString("dni")));
                a.setNombre(rs.getString("nombre"));
                a.setApellido(rs.getString("apellido"));
                a.setDomicilio(rs.getString("domicilio"));
                a.setTelefono(rs.getString("telefono"));
                a.setCodigopostal(rs.getString("codigopostal"));
               a.setDomicilio(rs.getString("domicilio"));
                a.setIva(rs.getString("iva"));
                return true;
            }
            return false;
 
        }
        catch(SQLException e)
        {   
            System.out.println(e);
            return false; 
        }
 
    }
     public boolean actualizar(int idproducto,Venta a)
     {
         PreparedStatement ps=null;
         Connection con =getConexion();
         
         String sql ="UPDATE productos SET stock=? WHERE idproducto=?";
         
         try
         {
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,(a.getProducto().getStock()-a.getCantidad()));
            ps.setInt(2, idproducto);
            
            ps.execute();
            
            return true;   
         }
         catch(SQLException e)
         {
             System.out.println(e);
             return false;
         }
         
     }
  
   public boolean modificar (Producto a){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE productos SET idproducto=?,codigo=?,descripcion=?,stock=?,tipo=?,preciocosto=?,precioventa=?,descuento=? WHERE idproducto=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,a.getIdproducto());
            ps.setString(2,a.getCodigo());
            ps.setString(3,a.getDescripcion());
            ps.setInt(4,a.getStock());
            ps.setString(5,a.getTipo());
            ps.setFloat(6,a.getPreciocosto());
            ps.setFloat(7,a.getPrecioventa());
            ps.setInt(8, a.getDescuento());
            ps.setInt(9,a.getIdproducto());
           
            ps.execute();
            return true;
        }
        catch(SQLException e){
            System.err.println(e);
            return false;
        }
        finally {
            try{
                con.close();
            }
            catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(Producto a)
     {
        PreparedStatement ps= null;
        Connection con = getConexion();
        
        String sql = "DELETE  FROM productos WHERE codigo=?";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setString(1,a.getCodigo());
            ps.execute();
            return true;
        }
        catch(SQLException e )
        {
            System.err.println(e);
            return false;
        }
    }
        
    //public boolean comprobarcliente(Cliente a)
            
    
    }
    

        