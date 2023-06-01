/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ConsultaDAO;
import modelo.Producto;
import modelo.Venta;
//import vista.VistaClientes;

import vista.VistaModificar;
import vista.VistaPrincipal;
import vista.VistaProducto;
import vista.VistaTablaClientes;
import vista.VistaTablaProducto;
import vista.VistaTablaVentas;
import vista.VistaVenta;

/**
 *
 * @author Tomas Figueroa
 */
public class Controlador implements ActionListener{
    private VistaPrincipal vistaPrincipal;
    //private VistaClientes vistaClientes;
    private VistaProducto vistaProducto;
    private VistaTablaClientes vistaTablaClientes;
    private VistaTablaProducto vistaTablaProductos;
    private VistaTablaVentas vistaTablaVentas;
    private VistaVenta vistaVenta;
    private ConsultaDAO con; 
    ConsultaDAO s = new ConsultaDAO();
    int idventa=s.idincrementableVentas();
    int idproducto=s.idincrementableProductos();
    //int idcliente=s.idincrementableClientes();
    private float sumatoria=0;
    private int idbuscar=0;
    
    
    private VistaModificar vistaModificar;
    
    public Controlador()
    {
        
        con = new ConsultaDAO();
        
        
        
     
      
        
        vistaPrincipal = new VistaPrincipal();
        vistaPrincipal.ejecutar();
        vistaPrincipal.setControlador(this);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
           
    {
        
        
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_PRODUCTO))
        {   ConsultaDAO s = new ConsultaDAO();
            vistaProducto = new VistaProducto();
           
            vistaProducto.ejectuar();
            vistaProducto.setControlador(this);
            vistaProducto.txtIdProducto.setText(String.valueOf(s.idincrementableProductos()));
            
        }
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_VENTA))
        {   ConsultaDAO s = new ConsultaDAO();
            vistaVenta = new VistaVenta();
            vistaVenta.setControlador(this);
            vistaVenta.ejecutar();
            vistaVenta.txtIdventa.setText(String.valueOf(s.idincrementableVentas()));
            vistaVenta.txtIdCliente.setText(String.valueOf(s.idincrementableClientes()));
           
            
        }
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_MODIFICAR))
        {
            vistaModificar = new VistaModificar();
            vistaModificar.setControlador(this);
            vistaModificar.ejecutar();
            
            
        }
        
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_TABLAC))
        {   vistaTablaClientes = new VistaTablaClientes();
            ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
            listaCliente = con.getClientes();
            cargarTabla3(listaCliente);
            vistaTablaClientes.ejecutar();
            
        }
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_TABLAV))
        {   
            vistaTablaVentas = new VistaTablaVentas();
            ArrayList<Venta> listaVentas = new ArrayList<Venta>();
            listaVentas = con.getVentas1();
            cargarTabla2(listaVentas);
            ArrayList<Venta>listaVentasTotales = new ArrayList<Venta>();
            listaVentasTotales = con.getTotal();
            cargarTablaTOTAL(listaVentasTotales);
            vistaTablaVentas.ejecutar();
        }
        if(e.getActionCommand().equals(vistaPrincipal.VISTA_TABLAP))
        {   vistaTablaProductos = new VistaTablaProducto();
                ArrayList<Producto> listaProductos = new ArrayList<Producto>();
                listaProductos = con.getProductos();
            
                cargarTabla1(listaProductos);
            
            vistaTablaProductos.ejecutar();
        }
        if(e.getActionCommand().equals(vistaProducto.BOTON_AGREGAR1))
        {
            
            Producto a = new Producto();
            
            a.setIdproducto(idproducto++);
            a.setCodigo(vistaProducto.getCodigo());
            a.setDescripcion(vistaProducto.getDescripcion());
            a.setStock(vistaProducto.getStock());
            a.setTipo(vistaProducto.getTipo());
            a.setPreciocosto(vistaProducto.getCosto());
            a.setPrecioventa(vistaProducto.getPrecioVenta());
            a.setDescuento(vistaProducto.getDescuento());
           
            if(con.agregarProducto(a))
            {   
                vistaProducto.txtIdProducto.setText(String.valueOf(s.idincrementableProductos()));
                JOptionPane.showMessageDialog(null,"Se ha agregado el producto correctamente");
                limpiarProductos();
                
              
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Error al agregar producto");
            }
            
        }
        
        if(e.getActionCommand().equals(vistaModificar.BOTON_BUSCAR))
        {
            Producto a = new Producto();
            a.setIdproducto(vistaModificar.getIdProducto());
            if(con.buscarProducto(a))
            {   
                
                vistaModificar.txtCodigo.setText(String.valueOf(a.getCodigo()));
                vistaModificar.txtStock.setText(String.valueOf(a.getStock()));
                vistaModificar.txtTipo.setText(String.valueOf(a.getTipo()));
                vistaModificar.txtDescripcion.setText(a.getDescripcion());
                vistaModificar.txtPrecioCosto.setText(String.valueOf(a.getPreciocosto()));
                vistaModificar.txtPrecioVenta.setText(String.valueOf(a.getPrecioventa()));
                vistaModificar.txtDescuento.setText(String.valueOf(a.getDescuento()));
                JOptionPane.showMessageDialog(null,"Se ha encontrado producto con exito");
                
            }
           
            else
            {
                JOptionPane.showMessageDialog(null,"Error al encontrar producto");
            }
        }
        if(e.getActionCommand().equals(vistaModificar.BOTON_MODIFICAR))
        {
            Producto p = new Producto();
            p.setIdproducto(vistaModificar.getIdProducto());
            p.setCodigo(vistaModificar.getCodigo());
            p.setDescripcion(vistaModificar.getDescripcion());
            p.setStock(vistaModificar.getStock());
            p.setTipo(vistaModificar.getTipo());
            p.setPreciocosto(vistaModificar.getPrecioCosto());
            p.setPrecioventa(vistaModificar.getPrecioVenta());
            p.setDescuento(vistaModificar.getDescuento());
            if(con.modificar(p))
            {
                limpiarModificar();
                JOptionPane.showMessageDialog(null,"Los datos del producto han sido modificados con exito!");
               
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
            }
            
            
        }
        if(e.getActionCommand().equals(vistaVenta.BOTON_BUSCARCLIENTE))
        {
            Cliente a = new Cliente();
           a.setIdCliente(vistaVenta.getIdcliente());
           if(con.buscarCliente(a))
           {
               
               vistaVenta.txtIdCliente.setText(String.valueOf(a.getIdCliente()));
               vistaVenta.txtDni.setText(String.valueOf(a.getDni()));
               vistaVenta.txtNombre.setText(String.valueOf(a.getNombre()));
               vistaVenta.txtApellido.setText(String.valueOf(a.getApellido()));
               vistaVenta.txtDomicilio.setText(a.getDomicilio());
               vistaVenta.txtIva.setText(String.valueOf(a.getIva()));
               vistaVenta.txtTelefono.setText(String.valueOf(a.getTelefono()));
               vistaVenta.txtCodigoPostal.setText(String.valueOf(a.getCodigopostal()));
               
               JOptionPane.showMessageDialog(null, "SE HA ENCONTRADO EL CLIENTE CON EXITO");
                idbuscar =a.getIdCliente();
               
          
           }
           else
           {
               
               
               JOptionPane.showMessageDialog(null,"EL CLIENTE NO EXISTE");
           }
            
            
            
            
        }
      
      
        if(e.getActionCommand().equals(vistaVenta.BOTON_BUSCAR3))
       {
           Producto a = new Producto();
           a.setIdproducto(vistaVenta.getIdProducto());
           if(con.buscarProducto(a))
           {   
               
                vistaVenta.txtIdProducto.setText(String.valueOf(a.getIdproducto()));
                vistaVenta.txtCodigoProducto.setText(String.valueOf(a.getCodigo()));
                vistaVenta.txtStock.setText(String.valueOf(a.getStock()));
                vistaVenta.txtTipo.setText(String.valueOf(a.getTipo()));
                vistaVenta.txtDescripcion.setText(a.getDescripcion());
                vistaVenta.txtPrecioCosto.setText(String.valueOf(a.getPreciocosto()));
                vistaVenta.txtPrecioVenta.setText(String.valueOf(a.getPrecioventa()));
                vistaVenta.txtDescuento.setText(String.valueOf(a.getDescuento()));
                JOptionPane.showMessageDialog(null,"Se ha encontrado producto con exito");
                
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Error al buscar el producto");
           }
           
           
           
           
       }
           
       
        if(e.getActionCommand().equals(vistaVenta.BOTON_FINALIZAR))
        {
           Cliente b = new Cliente();
           Venta c = new Venta();
            c.setFecha(vistaVenta.getFecha());
            c.setIdventa(idventa++);
            c.setTotalfinal(sumatoria);
           // b.setIdCliente(idcliente++);
            b.setIdCliente(vistaVenta.getIdcliente());
            b.setDni(vistaVenta.getDni());
            b.setApellido(vistaVenta.getApellido());
            b.setNombre(vistaVenta.getNombre()); 
            b.setDomicilio(vistaVenta.getDomicilio());
            b.setTelefono(vistaVenta.getTelefono());
            b.setCodigopostal(vistaVenta.getCodigoPostal());
            b.setIva(vistaVenta.getIva());
            sumatoria=0;
            
            //if(con.calculartotalgeneral(c) &&con.agregarCliente(b))
                if(con.calculartotalgeneral(c)&& idbuscar!=b.getIdCliente())
            {   
                con.agregarCliente(b);
                JOptionPane.showMessageDialog(null,"Se agrego el cliente correctamente");
                JOptionPane.showMessageDialog(null,"La venta ha finalizado con exito, GRACIAS POR SU COMPRA VUELVA PRONTO !");
                
            }
            //vistaVenta.txtIdCliente.setText(String.valueOf(s.idincrementableClientes()));
            //vistaVenta.txtIdventa.setText(String.valueOf(s.idincrementableVentas()));
            
            
            vistaVenta.dispose();
        }
        if(e.getActionCommand().equals(vistaVenta.BOTON_AGREGAR2))
        {   
            Venta a = new Venta();
            
            //a.getCliente().setIdCliente(idcliente);
            a.getCliente().setIdCliente(vistaVenta.getIdcliente());
            a.getCliente().setNombre(vistaVenta.getNombre());
            a.getCliente().setApellido(vistaVenta.getApellido());
            a.getCliente().setDni(vistaVenta.getDni());
            a.getCliente().setTelefono(vistaVenta.getTelefono());
            a.getCliente().setCodigopostal(vistaVenta.getCodigoPostal());
            a.getCliente().setDomicilio(vistaVenta.getDomicilio());
            a.getCliente().setIva(vistaVenta.getIva());
            a.getProducto().setCodigo(vistaVenta.getCodigoProducto());
            a.getProducto().setDescripcion(vistaVenta.getDescripcion());
            a.getProducto().setStock(vistaVenta.getStock());
            a.getProducto().setTipo(vistaVenta.getTipo());
            a.getProducto().setPreciocosto(vistaVenta.getPrecioCosto());
            a.getProducto().setPrecioventa(vistaVenta.getPrecioVenta());
            a.getProducto().setDescuento(vistaVenta.getDescuento());
            a.setIdventa(idventa);
            a.setFecha(vistaVenta.getFecha());
            a.setCantidad(vistaVenta.getCantidad());
            a.setModocompra(vistaVenta.getModoCompra());
            a.setTotal(vistaVenta.getPrecioVenta()*vistaVenta.getCantidad());
            String d = a.getModocompra();
            String c=String.valueOf(a.getCliente().getDni());
            String o = String.valueOf(a.getProducto().getCodigo());
           
           
      if(c!=null && o!=null)     
      {   
           
            if(d.equals("ONLINE") || d.equals("online"))
            {
              float numero =0;
              numero =(a.getProducto().getPrecioventa())-(((a.getProducto().getPrecioventa())*a.getProducto().getDescuento())/100);
              a.getProducto().setPrecioventa(numero);
              a.setTotal(numero*vistaVenta.getCantidad());  
            }
            
            
           if (a.getProducto().getStock()>a.getCantidad())
           {
                
                if(con.agregarVenta(a))
                  {   
                                
                             //  con.agregarCliente(b);
                                con.actualizar(vistaVenta.getIdProducto(),a);                                
                                 sumatoria+=a.getTotal();
                                 vistaVenta.txtTotal.setText(String.valueOf(sumatoria));
                                 vistaVenta.txtCantidad.setText(null);
                                 limpiarVentas();   
                                 
                            
                         JOptionPane.showMessageDialog(null, "Se agrego el producto al carrito");
                        }  
              }else
                    {
                    
                        JOptionPane.showMessageDialog(null,"NO HAY STOCK,ERROR AL AGREGAR LA VENTA");
                    
                    }
                    JOptionPane.showMessageDialog(null,"FALTARON LLENAR LOS CAMPOS");
                    
             }
           
        }
        
        
    }
    
    
        public void cargarTabla1(ArrayList<Producto> datos)
        {
           
            DefaultTableModel tabla = (DefaultTableModel)vistaTablaProductos.jTable1.getModel();
            tabla.setRowCount(0);
            
            for(Producto a : datos)
            {
                Object[] fila = {a.getIdproducto(),a.getCodigo(),a.getDescripcion(),a.getStock(),a.getTipo(),a.getPreciocosto(),a.getPrecioventa(),a.getDescuento()};
                tabla.addRow(fila);
            }
            
             
            
        }
        
        public void limpiarModificar()
        {
            vistaModificar.txtIdProducto.setText(null);
            vistaModificar.txtCodigo.setText(null);
            vistaModificar.txtDescripcion.setText(null);
            vistaModificar.txtPrecioCosto.setText(null);
            vistaModificar.txtPrecioVenta.setText(null);
            vistaModificar.txtStock.setText(null);
            vistaModificar.txtTipo.setText(null);
            vistaModificar.txtDescuento.setText(null);
            
        }
         public void limpiarVentas()
        {
            vistaVenta.txtIdProducto.setText(null);
            vistaVenta.txtCodigoProducto.setText(null);
            vistaVenta.txtDescripcion.setText(null);
            vistaVenta.txtPrecioCosto.setText(null);
            vistaVenta.txtPrecioVenta.setText(null);
            vistaVenta.txtStock.setText(null);
            vistaVenta.txtTipo.setText(null);
            vistaVenta.txtDescuento.setText(null);
        }
        
        
        public void limpiarProductos()
        {
            
            vistaProducto.txtCodigo.setText(null);
            vistaProducto.txtDescripcion.setText(null);
            vistaProducto.txtCosto.setText(null);
            vistaProducto.txtVentas.setText(null);
            vistaProducto.txtStock.setText(null);
            vistaProducto.txtTipo.setText(null);
            vistaProducto.txtDescuento.setText(null);
        }
        public void cargarTabla3(ArrayList<Cliente> datos)
        {
            DefaultTableModel tabla =  (DefaultTableModel)vistaTablaClientes.jTable1.getModel();
            tabla.setRowCount(0);
            for(Cliente a : datos)
            {
                Object[] fila = {a.getIdCliente(),a.getDni(),a.getNombre(),a.getApellido(),a.getTelefono(),a.getCodigopostal(),a.getDomicilio(),a.getIva()};
                tabla.addRow(fila);
            }
        }
        public void cargarTabla2(ArrayList<Venta> datos)
        {
            DefaultTableModel tabla = (DefaultTableModel)vistaTablaVentas.jTable1.getModel();
            tabla.setRowCount(0);
            for(Venta a : datos)
            {
                Object[] fila = {a.getFecha(),a.getIdventa(),a.getProducto().getCodigo(),a.getCliente().getApellido(),a.getCliente().getNombre(),a.getProducto().getDescripcion(),a.getCantidad(),a.getModocompra(),a.getProducto().getPrecioventa(),a.getProducto().getDescuento(),a.getTotal()};
                tabla.addRow(fila);
            }
        }
         public void cargarTablaTOTAL(ArrayList<Venta> datos)
        {
            DefaultTableModel tabla = (DefaultTableModel)vistaTablaVentas.jTable2.getModel();
            tabla.setRowCount(0);
            for(Venta a : datos)
            {
                Object[] fila = {a.getFecha(),a.getIdventa(),a.getTotalfinal()};
                tabla.addRow(fila);
            }
        }
      
     public boolean compruebaCliente(Venta a,Cliente b)
     {
         
         int dniVenta=a.getCliente().getDni();
         int dniCliente=b.getDni();
         if(dniVenta==dniCliente)
         {
             return true;
         }
         else
         {
             return false;
         }
            
     }
    
    
    
    
    
    
    
}
