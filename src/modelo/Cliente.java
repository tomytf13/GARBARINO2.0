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
public class Cliente extends Persona {
    private int idcliente;
    private String iva;
    
    public Cliente(){}
    
    public Cliente(int idcliente,int dni,String nombre,String apellido,String domicilio,String telefono,String codigopostal,String iva)
    {
        super(dni,nombre,apellido,domicilio,telefono,codigopostal);
        this.idcliente=idcliente;
        this.iva=iva;
    }

    public int getIdCliente() {
        return idcliente;
    }

    public void setIdCliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

   
    
    
}
