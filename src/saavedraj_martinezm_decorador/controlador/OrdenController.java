package saavedraj_martinezm_decorador.controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import saavedraj_martinezm_decorador.modelo.Cafe;
import saavedraj_martinezm_decorador.modelo.DecAzucar;
import saavedraj_martinezm_decorador.modelo.DecCrema;
import saavedraj_martinezm_decorador.modelo.Producto;
import saavedraj_martinezm_decorador.vista.OrdenVista;

public class OrdenController {
    private final OrdenVista oV;
    private List<Producto> listaProductos;
    private Producto cafe;
    private boolean tieneAzucar = false;
    private boolean tieneCrema = false;
    private List adCafe;
    private double subTotal = 0;

    public OrdenController(OrdenVista oV) {
        this.oV = oV;
        this.listaProductos = new ArrayList<>();
        this.adCafe = new ArrayList();
        controlarBotonesCafe();
        controlarBotonesFactura();
    }
    
    public void controlarBotonesCafe() {
        // Crear café
        oV.getBtnCafe().addActionListener((e) -> {
            crearCafe();
            adicionalesCafe();
        });
        
        // Poner Azucar
        oV.getBtnAzucar().addActionListener((e) -> {
            añadirAzucar();
        });
        
        // Poner Crema
        oV.getBtnCrema().addActionListener((e) -> {
            añadirCrema();
        });
        
    }
    
    public void controlarBotonesFactura(){
        oV.getBtnAggFactura().addActionListener((e) -> {
            añadirCafeFactura();
        });
    }
    
    public void crearCafe(){
        int opcion = JOptionPane.showConfirmDialog(oV, "¿Desea añadir a la su orden un café?", 
                                                        "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if (opcion == JOptionPane.YES_OPTION) {
            cafe = new Cafe();
            System.out.println("Bebida: " + cafe.getDescripcion() + " | Costo: " + cafe.getCosto());
        }
    }
    
    public void añadirAzucar() {
        
        if (tieneAzucar) {
            JOptionPane.showMessageDialog(oV, "Ya se añadió azúcar a este café");
        } else {
            int opcion = JOptionPane.showConfirmDialog(oV, "¿Desea añadir azúcar a este café?", 
                                                            "Confirmación", JOptionPane.YES_NO_OPTION);

            if (opcion == JOptionPane.YES_OPTION) {
                cafe = new DecAzucar(cafe);
                adCafe.add("Azucar");
                tieneAzucar = true;
                System.out.println("Bebida: " + cafe.getDescripcion() + " | Costo: " + cafe.getCosto());
            }
        }
    }
    
    public void añadirCrema() {
        if (tieneCrema) {
            JOptionPane.showMessageDialog(oV, "Ya se añadió crema a este café");
        } else {
            int opcion = JOptionPane.showConfirmDialog(oV, "¿Desea añadir crema a este café?", 
                                                            "Confirmación", JOptionPane.YES_NO_OPTION
            );

            if (opcion == JOptionPane.YES_OPTION) {
                cafe = new DecCrema(cafe);
                adCafe.add("Crema");
                tieneCrema = true;
                System.out.println("Bebida: " + cafe.getDescripcion() + " | Costo: " + cafe.getCosto());
            }
        }
    }
    
    public void añadirCafeFactura(){
        try {
            listaProductos.add(cafe);
            subTotal = subTotal + cafe.getCosto();
            DefaultTableModel modelo = (DefaultTableModel) oV.getTblFactura().getModel();
            String adicionales;
        
            if (adCafe.isEmpty()) {
                adicionales = "No";
            } else {
                adicionales = adCafe.toString();
            }
            
            Object[] fila = {
                "Cafe",
                adicionales,
                String.format("%.2f", cafe.getCosto()),
                String.format("%.2f", subTotal)
            };
            modelo.addRow(fila);
        
            cafe = null;
            tieneAzucar = false;
            tieneCrema = false;
            adCafe.clear();
            adicionales = adCafe.toString();
            bloquearTodosAdicionales();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(oV, "No ha seleccionado nada aún");
        } 
    }
    
    public void adicionalesCafe() {
        oV.getBtnAzucar().setEnabled(true);
        oV.getBtnCrema().setEnabled(true);
        oV.getBtnEnsalada().setEnabled(false);
        oV.getBtnPeperoni().setEnabled(false);
        oV.getBtnPizza().setEnabled(false);
        oV.getBtnPollo().setEnabled(false);
        oV.getBtnQueso().setEnabled(false);
        oV.getBtnSalami().setEnabled(false);
        oV.getBtnVinagreta().setEnabled(false);
    }

    public void bloquearTodosAdicionales() {
        oV.getBtnAzucar().setEnabled(false);
        oV.getBtnCrema().setEnabled(false);
        oV.getBtnEnsalada().setEnabled(true);
        oV.getBtnPeperoni().setEnabled(false);
        oV.getBtnPizza().setEnabled(true);
        oV.getBtnPollo().setEnabled(false);
        oV.getBtnQueso().setEnabled(false);
        oV.getBtnSalami().setEnabled(false);
        oV.getBtnVinagreta().setEnabled(false);
    }

}
