/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Tomas Figueroa
 */
public class Venta {
    
    private int idventa;
    private String fecha;
    private int cantidad;
    private float totalfinal;
    private float total;
    private String modocompra;
    Producto producto = new Producto();
    Cliente cliente = new Cliente();
    
    public Venta(){}
    
    
    
    public Venta(int idventa,Cliente cliente,Producto producto,String fecha,int cantidad,String modocompra,float total)
    {
        this.idventa=idventa;
        this.cantidad=cantidad;
        this.cliente=cliente;
        
        this.producto=producto;
        this.total=total;
        this.fecha=fecha;
        this.modocompra=modocompra;
        this.cliente=cliente;

    }
    public Venta(String fecha,int idventa,float totalfinal)
    {   
        this.fecha=fecha;
        this.totalfinal=totalfinal;
        this.idventa=idventa;    
    }

    public float getTotalfinal() {
        return totalfinal;
    }

    public void setTotalfinal(float totalfinal) {
        this.totalfinal = totalfinal;
    }

   public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
   
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getModocompra() {
        return modocompra;
    }

    public void setModocompra(String modocompra) {
        this.modocompra = modocompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   
    
    
    
    
}
