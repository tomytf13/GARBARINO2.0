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
public class Producto {
    private int idproducto;
    private String codigo;
    private String descripcion;
    private int stock;
    private String tipo;
    private float preciocosto;
    private float precioventa;
    private int descuento;
    
    public Producto(){}

    public Producto(int idproducto,String codigo, String descripcion, int stock, String tipo, float preciocosto, float precioventa,int descuento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.tipo = tipo;
        this.preciocosto = preciocosto;
        this.precioventa = precioventa;
        this.idproducto=idproducto;
        this.descuento=descuento;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
   

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreciocosto() {
        return preciocosto;
    }

    public void setPreciocosto(float preciocosto) {
        this.preciocosto = preciocosto;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    
    
    
    
}
