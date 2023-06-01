/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomas Figueroa
 */
public class VistaVenta extends javax.swing.JFrame {
    public static final String BOTON_AGREGAR2 = "BOTON_AGREGAR2";
    public static final String BOTON_ELIMINAR = "BOTON_ELIMINAR2";
    public static final String BOTON_BUSCARCLIENTE ="BOTON BUSCAR CLIENTES";
    
    public static final String BOTON_BUSCAR3="BOTON.BUSCAR";
    public static final String BOTON_FINALIZAR="BOTON_FINALIZAR";

    /**
     * Creates new form VistaVenta
     */
    public VistaVenta() {
        initComponents();
    }
    public void ejecutar()
    {
        this.setTitle("Vista Venta");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        this.setVisible(true);
    }
    public void setControlador(Controlador controlador)
    {
        btnAgregar.setActionCommand(BOTON_AGREGAR2);
        btnAgregar.addActionListener(controlador);
        btnSalir.setActionCommand(BOTON_ELIMINAR);
        btnSalir.addActionListener(controlador);
        btnBuscar.setActionCommand(BOTON_BUSCAR3);
        btnBuscar.addActionListener(controlador);
        btnFinalizar.setActionCommand(BOTON_FINALIZAR);
        btnFinalizar.addActionListener(controlador);
        btnBuscarCliente.setActionCommand(BOTON_BUSCARCLIENTE);
        btnBuscarCliente.addActionListener(controlador);
        
    }
    
    public int getDescuento()
    {
        int numero=0;
        try
        {
            numero=Integer.parseInt(txtDescuento.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return numero;
        
    }
    public String getCodigoProducto()
    {
        return txtCodigoProducto.getText();
    }
    public int getStock()
    {
        int numero=0;
        try
        {
            numero=Integer.parseInt(txtStock.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            
        }
        return numero;
    }
    public String getDescripcion()
    {
         return txtDescripcion.getText();
       
    }
    
    public float getPrecioCosto()
    {
        float numero=0;
        try
        {
            numero=Float.parseFloat(txtPrecioCosto.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return numero;
    }
    public float getPrecioVenta()
    {
        float numero =0;
        try
        {
            numero=Float.parseFloat(txtPrecioVenta.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return numero;
        
    }
    public String getCodigoPostal()
    {
        return txtCodigoPostal.getText();
    }
    
    public String getIva()
    {
        
      return txtIva.getText();
        
    }
    public int getIdcliente()
    {
        int numero=0;
        try
        {
            numero=Integer.parseInt(txtIdCliente.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"FALTA LLENAR LOS CAMPOS");
        }
        return numero;
    }
    public int getDni()
    {   int numero=0;
    try
    {
        numero=Integer.parseInt(txtDni.getText());
    }
    catch(NumberFormatException e)
    {
        System.out.println(e);
        JOptionPane.showMessageDialog(null,"FALTA LLENAR LOS CAMPOS");
    }
       return numero;
    }
    public String getDomicilio()
    {
        return txtDomicilio.getText();
    }
    public String getTelefono()
    {
        return txtTelefono.getText();
    }
    public String getNombre()
    {
        return txtNombre.getText();
    }
    public String getApellido()
    {
       return txtApellido.getText();
    }
    public String getFecha()
    {
       return txtFecha.getText();
       
        
    }
    public String getModoCompra()
    {
        
            return txtModoCompra.getText();
        
    }
    
    public int getCantidad()
    {
        int numero=0;
        try
        {
            numero=Integer.parseInt(txtCantidad.getText());
        }
        
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return numero;
    }
   
   
    /*public int getIdVenta()
    {
        int numero=0;
        try
        {
            numero=Integer.parseInt(txtIdventa.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        return numero;
    }*/
    public String getTipo()
    {
        return txtTipo.getText();
    }
    
    
    public int getIdProducto()
    {
        int numero=0;
        try{
            numero=Integer.parseInt(txtIdProducto.getText());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,"FALTA LLENAR LOS CAMPOS");
        }
        return numero;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        txtIva = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtModoCompra = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtIdventa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Agregar Ventas");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("ID Cliente a buscar :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Telefono:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Codigo Postal:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Domicilio:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("IVA:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("DNI:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel13.setText("Fecha:");

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        txtStock.setOpaque(false);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel14.setText("Modo compra(ONLINE O LOCAL:");

        btnAgregar.setBackground(new java.awt.Color(204, 0, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Producto");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(204, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel15.setText("Apellido:");

        txtIdCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel18.setText("Cantidad:");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(204, 0, 0));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar Venta");

        btnBuscar.setBackground(new java.awt.Color(204, 0, 0));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("ID Venta:");

        txtPrecioCosto.setOpaque(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel11.setText("Codigo del producto:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel12.setText("Descripcion:");

        txtDescripcion.setOpaque(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel16.setText("Stock:");

        txtIdventa.setBorder(null);
        txtIdventa.setOpaque(false);
        txtIdventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdventaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel17.setText("Tipo:");

        txtTipo.setOpaque(false);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel21.setText("Precio-Costo:");

        txtCodigoProducto.setOpaque(false);

        txtPrecioVenta.setOpaque(false);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel22.setText("Precio-Venta:");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel23.setText("ID Producto a buscar:");

        txtIdProducto.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("DATOS DEL CLIENTE");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("DATOS DEL PRODUCTO");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 0, 0));
        jLabel25.setText("DATOS DE LA VENTA");

        txtTotal.setText("           --");
        txtTotal.setBorder(null);
        txtTotal.setOpaque(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 0));
        jLabel19.setText("TOTAL");

        btnBuscarCliente.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar");

        jLabel20.setText("Descuento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(228, 228, 228)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnBuscarCliente)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(348, 348, 348)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtModoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(91, 91, 91))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(txtIdventa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(91, 91, 91))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(30, 30, 30)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel13))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnSalir)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(txtCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(96, 96, 96)
                                                    .addComponent(jLabel19))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(20, 20, 20)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnBuscar)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel22)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel21)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(52, 52, 52)
                                                    .addComponent(jLabel12))))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(235, 235, 235)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(62, 62, 62)
                                            .addComponent(jLabel15)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel5)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(41, 41, 41)
                                            .addComponent(jLabel17))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))))))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnAgregar)
                .addGap(96, 96, 96)
                .addComponent(btnFinalizar)
                .addGap(0, 714, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarCliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioCosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtIdventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtModoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnFinalizar)
                    .addComponent(btnSalir))
                .addGap(150, 150, 150))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtIdventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdventaActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    public javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodigoPostal;
    public javax.swing.JTextField txtCodigoProducto;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtDescuento;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdProducto;
    public javax.swing.JTextField txtIdventa;
    public javax.swing.JTextField txtIva;
    private javax.swing.JTextField txtModoCompra;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtPrecioCosto;
    public javax.swing.JTextField txtPrecioVenta;
    public javax.swing.JTextField txtStock;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtTipo;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
