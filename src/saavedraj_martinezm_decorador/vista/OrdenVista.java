package saavedraj_martinezm_decorador.vista;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;


public class OrdenVista extends javax.swing.JFrame {
    
    String adiCafe = "";
    String adiPizza = "";
    String adiEnsalada = "";
    
    public OrdenVista() {
        initComponents();
        iniciarVentana();
        mostrarPrecioProductos();
        cargarImagenes();
        tblFactura.setEnabled(false);
    }
    
    public void iniciarVentana(){
        setVisible(true);
        setSize(1541, 815);
        setResizable(false);
        setLocationRelativeTo(null);
    }
     
    public void cargarImagenes(){      
        // Ensalada
        URL ensaladaUrl = OrdenVista.class.getResource("/resources/imagenes/ens.jpeg");
        ImageIcon iconoBtnEns = new ImageIcon(ensaladaUrl); 
        btnEnsalada.setIcon(iconoBtnEns);
        
        // Papas
        URL papasUrl = OrdenVista.class.getResource("/resources/imagenes/papas.jpg");
        ImageIcon iconoBtnPapas = new ImageIcon(papasUrl); 
        btnQueso.setIcon(iconoBtnPapas);
        
        // Café
        URL cafeUrl = OrdenVista.class.getResource("/resources/imagenes/cafe.jpeg");
        ImageIcon iconoBtnCafe = new ImageIcon(cafeUrl); 
        btnCafe.setIcon(iconoBtnCafe);
        
        // Azucar
        URL azucarUrl = OrdenVista.class.getResource("/resources/imagenes/azucar.jpg");
        ImageIcon iconoBtnAzucar = new ImageIcon(azucarUrl); 
        btnAzucar.setIcon(iconoBtnAzucar);
        
        // Crema
        URL cremaUrl = OrdenVista.class.getResource("/resources/imagenes/crema.jpeg");
        ImageIcon iconoBtnCrema = new ImageIcon(cremaUrl); 
        btnCrema.setIcon(iconoBtnCrema);
        
        // Tomate
        URL tomateUrl = OrdenVista.class.getResource("/resources/imagenes/tomate.jpg");
        ImageIcon iconoBtnTomate = new ImageIcon(tomateUrl); 
        btnTomate.setIcon(iconoBtnTomate);
        
        // Vinagreta
        URL vinagretaUrl = OrdenVista.class.getResource("/resources/imagenes/vinagreta.jpg");
        ImageIcon iconoBtnVinagreta = new ImageIcon(vinagretaUrl); 
        btnVinagreta.setIcon(iconoBtnVinagreta);
        
        // Pollo
        URL polloUrl = OrdenVista.class.getResource("/resources/imagenes/pollo.png");
        ImageIcon iconoBtnPollo = new ImageIcon(polloUrl); 
        btnPollo.setIcon(iconoBtnPollo);
        
        // Pizza
        URL pizzaUrl = OrdenVista.class.getResource("/resources/imagenes/pizza.jpg");
        ImageIcon iconoBtnPizza = new ImageIcon(pizzaUrl); 
        btnPizza.setIcon(iconoBtnPizza);
        
        // Queso
        URL quesoUrl = OrdenVista.class.getResource("/resources/imagenes/queso.jpg");
        ImageIcon iconoBtnQueso = new ImageIcon(quesoUrl); 
        btnQueso.setIcon(iconoBtnQueso);
        
        // Salami
        URL salamiUrl = OrdenVista.class.getResource("/resources/imagenes/salami.jpg");
        ImageIcon iconoBtnSalami = new ImageIcon(salamiUrl); 
        btnSalami.setIcon(iconoBtnSalami);
        
        // Peperoni
        URL peperoniUrl = OrdenVista.class.getResource("/resources/imagenes/peperoni.jpg");
        ImageIcon iconoBtnPeperoni = new ImageIcon(peperoniUrl); 
        btnPeperoni.setIcon(iconoBtnPeperoni);
    }
    
    public void mostrarPrecioProductos(){
        lblEnsalada.setText("Ensalada | 3$");
        lblQueso.setText("Queso | 1$");
        lblAzucar.setText("Azucar | 0.5$");
        lblCafe.setText("Café | 2.20$");
        lblCrema.setText("Crema | 1.20$");
        lblTomate.setText("Tomate | 1.10$");
        lblVinagreta.setText("Vinagreta | 0.5$");
        lblPollo.setText("Pollo | 1.50$");
        lblPizza.setText("Pizza | 5$");
        lblQueso.setText("Queso | 1$");
        lblSalami.setText("Salami | 3$");
        lblPeperoni.setText("Pepperoni | 1$");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelProductos = new javax.swing.JPanel();
        lblProductos = new javax.swing.JLabel();
        btnEnsalada = new javax.swing.JButton();
        lblEnsalada = new javax.swing.JLabel();
        btnPizza = new javax.swing.JButton();
        lblPizza = new javax.swing.JLabel();
        btnQueso = new javax.swing.JButton();
        lblQueso = new javax.swing.JLabel();
        btnCafe = new javax.swing.JButton();
        lblCafe = new javax.swing.JLabel();
        btnAzucar = new javax.swing.JButton();
        lblAzucar = new javax.swing.JLabel();
        btnTomate = new javax.swing.JButton();
        lblTomate = new javax.swing.JLabel();
        btnVinagreta = new javax.swing.JButton();
        lblVinagreta = new javax.swing.JLabel();
        btnPollo = new javax.swing.JButton();
        lblPollo = new javax.swing.JLabel();
        btnCrema = new javax.swing.JButton();
        lblCrema = new javax.swing.JLabel();
        btnSalami = new javax.swing.JButton();
        lblSalami = new javax.swing.JLabel();
        btnPeperoni = new javax.swing.JButton();
        lblPeperoni = new javax.swing.JLabel();
        lblDescripcionPlatos = new javax.swing.JLabel();
        panelAñadirAFactura = new javax.swing.JPanel();
        btnAñadirCafe = new javax.swing.JButton();
        btnAñadirEnsalada = new javax.swing.JButton();
        btnAñadirPizza = new javax.swing.JButton();
        panelAcciones = new javax.swing.JPanel();
        panelFactura = new javax.swing.JPanel();
        lblDetalle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFactura = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setPreferredSize(new java.awt.Dimension(1541, 815));

        lblTitulo.setBackground(new java.awt.Color(255, 102, 102));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("SISTEMA DE ORDENES");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProductos.setBackground(new java.awt.Color(222, 204, 255));
        panelProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProductos.setBackground(new java.awt.Color(153, 153, 255));
        lblProductos.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 255, 255));
        lblProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProductos.setText("Lista de Productos");
        lblProductos.setOpaque(true);

        btnEnsalada.setBackground(new java.awt.Color(255, 250, 243));
        btnEnsalada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsaladaActionPerformed(evt);
            }
        });

        lblEnsalada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnsalada.setText("jLabel1");
        lblEnsalada.setToolTipText("");

        btnPizza.setBackground(new java.awt.Color(255, 250, 243));
        btnPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizzaActionPerformed(evt);
            }
        });

        lblPizza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPizza.setText("jLabel1");

        btnQueso.setBackground(new java.awt.Color(255, 250, 243));
        btnQueso.setEnabled(false);
        btnQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuesoActionPerformed(evt);
            }
        });

        lblQueso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQueso.setText("jLabel1");

        btnCafe.setBackground(new java.awt.Color(255, 250, 243));
        btnCafe.setOpaque(true);
        btnCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeActionPerformed(evt);
            }
        });

        lblCafe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCafe.setText("jLabel1");

        btnAzucar.setBackground(new java.awt.Color(255, 250, 243));
        btnAzucar.setEnabled(false);
        btnAzucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzucarActionPerformed(evt);
            }
        });

        lblAzucar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAzucar.setText("jLabel1");

        btnTomate.setBackground(new java.awt.Color(255, 250, 243));
        btnTomate.setEnabled(false);
        btnTomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomateActionPerformed(evt);
            }
        });

        lblTomate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTomate.setText("jLabel1");

        btnVinagreta.setBackground(new java.awt.Color(255, 250, 243));
        btnVinagreta.setEnabled(false);
        btnVinagreta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVinagretaActionPerformed(evt);
            }
        });

        lblVinagreta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVinagreta.setText("jLabel1");

        btnPollo.setBackground(new java.awt.Color(255, 250, 243));
        btnPollo.setEnabled(false);
        btnPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolloActionPerformed(evt);
            }
        });

        lblPollo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPollo.setText("jLabel1");

        btnCrema.setBackground(new java.awt.Color(255, 250, 243));
        btnCrema.setEnabled(false);
        btnCrema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCremaActionPerformed(evt);
            }
        });

        lblCrema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrema.setText("jLabel1");

        btnSalami.setBackground(new java.awt.Color(255, 250, 243));
        btnSalami.setEnabled(false);
        btnSalami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalamiActionPerformed(evt);
            }
        });

        lblSalami.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSalami.setText("jLabel1");

        btnPeperoni.setBackground(new java.awt.Color(255, 250, 243));
        btnPeperoni.setEnabled(false);
        btnPeperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeperoniActionPerformed(evt);
            }
        });

        lblPeperoni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeperoni.setText("jLabel1");

        lblDescripcionPlatos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescripcionPlatos.setText("PLATO PRINCIPAL                     ADICIONALES");

        btnAñadirCafe.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirCafe.setText("Añadir");
        btnAñadirCafe.setEnabled(false);
        btnAñadirCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCafeActionPerformed(evt);
            }
        });

        btnAñadirEnsalada.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirEnsalada.setText("Añadir");
        btnAñadirEnsalada.setEnabled(false);

        btnAñadirPizza.setBackground(new java.awt.Color(204, 204, 204));
        btnAñadirPizza.setText("Añadir");
        btnAñadirPizza.setEnabled(false);

        javax.swing.GroupLayout panelAñadirAFacturaLayout = new javax.swing.GroupLayout(panelAñadirAFactura);
        panelAñadirAFactura.setLayout(panelAñadirAFacturaLayout);
        panelAñadirAFacturaLayout.setHorizontalGroup(
            panelAñadirAFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAFacturaLayout.createSequentialGroup()
                .addGroup(panelAñadirAFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelAñadirAFacturaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAñadirCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirAFacturaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAñadirAFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAñadirEnsalada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAñadirPizza, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelAñadirAFacturaLayout.setVerticalGroup(
            panelAñadirAFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirAFacturaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnAñadirCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btnAñadirEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnAñadirPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(lblDescripcionPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(348, 348, 348))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnCafe, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(lblCafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnPizza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblEnsalada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEnsalada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(122, 122, 122)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTomate, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(lblTomate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVinagreta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(lblVinagreta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPollo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(lblPollo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51))
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnQueso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSalami, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblSalami, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnPeperoni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPeperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAzucar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(lblAzucar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnCrema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCrema, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(panelAñadirAFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(lblDescripcionPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductosLayout.createSequentialGroup()
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(btnCrema, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(lblCrema))
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAzucar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCafe)
                                            .addComponent(lblAzucar))))
                                .addGap(60, 60, 60)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelProductosLayout.createSequentialGroup()
                                            .addComponent(btnEnsalada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7)
                                            .addComponent(lblEnsalada))
                                        .addGroup(panelProductosLayout.createSequentialGroup()
                                            .addComponent(btnTomate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7)
                                            .addComponent(lblTomate)))
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnVinagreta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnPollo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblVinagreta)
                                            .addComponent(lblPollo))))
                                .addGap(60, 60, 60)
                                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnQueso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7)
                                        .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblPizza)
                                            .addComponent(lblQueso)))
                                    .addGroup(panelProductosLayout.createSequentialGroup()
                                        .addComponent(btnSalami, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(lblSalami))))
                            .addComponent(panelAñadirAFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelProductosLayout.createSequentialGroup()
                        .addComponent(btnPeperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblPeperoni)))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        btnQueso.getAccessibleContext().setAccessibleName("jButton");

        panelFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblDetalle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDetalle.setForeground(new java.awt.Color(0, 102, 204));
        lblDetalle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalle.setText("DETALLE DE LA ORDEN");

        tblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Adicional", "Precio", "Subtotal"
            }
        ));
        jScrollPane1.setViewportView(tblFactura);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFacturaLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addComponent(lblDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addComponent(panelFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1546, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnsaladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsaladaActionPerformed
        System.out.println("Ensalada");
    }//GEN-LAST:event_btnEnsaladaActionPerformed

    private void btnPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizzaActionPerformed
        System.out.println("Pizza");
    }//GEN-LAST:event_btnPizzaActionPerformed

    private void btnQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuesoActionPerformed
        System.out.println("Queso");
    }//GEN-LAST:event_btnQuesoActionPerformed

    private void btnCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCafeActionPerformed

    private void btnAzucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzucarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAzucarActionPerformed

    private void btnTomateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomateActionPerformed

    private void btnVinagretaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVinagretaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVinagretaActionPerformed

    private void btnPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPolloActionPerformed

    private void btnCremaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCremaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCremaActionPerformed

    private void btnSalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalamiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalamiActionPerformed

    private void btnPeperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeperoniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPeperoniActionPerformed

    private void btnAñadirCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCafeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAñadirCafeActionPerformed

    public JButton getBtnAzucar() {
        return btnAzucar;
    }

    public JButton getBtnAñadirCafe() {
        return btnAñadirCafe;
    }

    public JButton getBtnAñadirEnsalada() {
        return btnAñadirEnsalada;
    }

    public JButton getBtnAñadirPizza() {
        return btnAñadirPizza;
    }

    public JButton getBtnTomate() {
        return btnTomate;
    }

    public void setBtnAzucar(JButton btnAzucar) {
        this.btnAzucar = btnAzucar;
    }

    public JButton getBtnCafe() {
        return btnCafe;
    }

    public void setBtnCafe(JButton btnCafe) {
        this.btnCafe = btnCafe;
    }

    public JButton getBtnCrema() {
        return btnCrema;
    }

    public void setBtnCrema(JButton btnCrema) {
        this.btnCrema = btnCrema;
    }

    public JButton getBtnEnsalada() {
        return btnEnsalada;
    }

    public void setBtnEnsalada(JButton btnEnsalada) {
        this.btnEnsalada = btnEnsalada;
    }

    public JButton getBtnPeperoni() {
        return btnPeperoni;
    }

    public void setBtnPeperoni(JButton btnPeperoni) {
        this.btnPeperoni = btnPeperoni;
    }

    public JButton getBtnPizza() {
        return btnPizza;
    }

    public void setBtnPizza(JButton btnPizza) {
        this.btnPizza = btnPizza;
    }

    public JButton getBtnPollo() {
        return btnPollo;
    }

    public void setBtnPollo(JButton btnPollo) {
        this.btnPollo = btnPollo;
    }

    public JButton getBtnQueso() {
        return btnQueso;
    }

    public void setBtnQueso(JButton btnQueso) {
        this.btnQueso = btnQueso;
    }

    public JButton getBtnSalami() {
        return btnSalami;
    }

    public void setBtnSalami(JButton btnSalami) {
        this.btnSalami = btnSalami;
    }

    public JButton getBtnVinagreta() {
        return btnVinagreta;
    }

    public void setBtnVinagreta(JButton btnVinagreta) {
        this.btnVinagreta = btnVinagreta;
    }

    public JTable getTblFactura() {
        return tblFactura;
    }

    public void setTblFactura(JTable tblFactura) {
        this.tblFactura = tblFactura;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzucar;
    private javax.swing.JButton btnAñadirCafe;
    private javax.swing.JButton btnAñadirEnsalada;
    private javax.swing.JButton btnAñadirPizza;
    private javax.swing.JButton btnCafe;
    private javax.swing.JButton btnCrema;
    private javax.swing.JButton btnEnsalada;
    private javax.swing.JButton btnPeperoni;
    private javax.swing.JButton btnPizza;
    private javax.swing.JButton btnPollo;
    private javax.swing.JButton btnQueso;
    private javax.swing.JButton btnSalami;
    private javax.swing.JButton btnTomate;
    private javax.swing.JButton btnVinagreta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAzucar;
    private javax.swing.JLabel lblCafe;
    private javax.swing.JLabel lblCrema;
    private javax.swing.JLabel lblDescripcionPlatos;
    private javax.swing.JLabel lblDetalle;
    private javax.swing.JLabel lblEnsalada;
    private javax.swing.JLabel lblPeperoni;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JLabel lblPollo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblQueso;
    private javax.swing.JLabel lblSalami;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTomate;
    private javax.swing.JLabel lblVinagreta;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelAñadirAFactura;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tblFactura;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
