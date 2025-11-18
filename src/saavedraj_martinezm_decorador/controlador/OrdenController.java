package saavedraj_martinezm_decorador.controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import saavedraj_martinezm_decorador.modelo.Cafe;
import saavedraj_martinezm_decorador.modelo.DecAzucar;
import saavedraj_martinezm_decorador.modelo.DecCrema;
import saavedraj_martinezm_decorador.modelo.DecPeperoni;
import saavedraj_martinezm_decorador.modelo.DecPollo;
import saavedraj_martinezm_decorador.modelo.DecQueso;
import saavedraj_martinezm_decorador.modelo.DecSalami;
import saavedraj_martinezm_decorador.modelo.DecTomate;
import saavedraj_martinezm_decorador.modelo.DecVinagreta;
import saavedraj_martinezm_decorador.modelo.Ensalada;
import saavedraj_martinezm_decorador.modelo.Pizza;
import saavedraj_martinezm_decorador.modelo.Producto;
import saavedraj_martinezm_decorador.vista.OrdenVista;

public class OrdenController {
    private final OrdenVista oV;
    private List<Producto> listaProductos;
    private Producto cafe;
    private Producto ensalada;
    private Producto pizza;
    private double subTotal = 0;

    public OrdenController(OrdenVista oV) {
        this.oV = oV;
        this.listaProductos = new ArrayList<>();
        controlarBotonesCafe();
        controlarBotonesEnsalada();
        controlarBotonesPizza();
    }
    
    public void controlarBotonesCafe() {
        oV.getBtnCafe().addActionListener((e) -> {
            crearCafe();
        });
        
        oV.getBtnAzucar().addActionListener((e) -> {
            añadirAzucar();
        });
        
        oV.getBtnCrema().addActionListener((e) -> {
            añadirCrema();
        });
    }
    
    public void controlarBotonesEnsalada() {
        oV.getBtnEnsalada().addActionListener((e) -> {
            crearEnsalada();
        });
        
        oV.getBtnTomate().addActionListener((e) -> {
            añadirTomate();
        });
        
        oV.getBtnVinagreta().addActionListener((e) -> {
            añadirVinagreta();
        });
        
        oV.getBtnPollo().addActionListener((e) -> {
            añadirPollo();
        });
    }
    
    public void controlarBotonesPizza() {
        oV.getBtnPizza().addActionListener((e) -> {
            crearPizza();
        });
        
        oV.getBtnQueso().addActionListener((e) -> {
            añadirQueso();
        });
        
        oV.getBtnPeperoni().addActionListener((e) -> {
            añadirPeperoni();
        });
        
        oV.getBtnSalami().addActionListener((e) -> {
            añadirSalami();
        });
    }
    
    public void crearCafe() {
        cafe = new Cafe();
        listaProductos.add(cafe);
        añadirProductoFactura(cafe);
    }
    
    public void añadirAzucar() {
        
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar un café primero");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        if (ultimo instanceof Cafe || ultimo instanceof DecAzucar || ultimo instanceof DecCrema) {
            cafe = new DecAzucar(cafe);
            listaProductos.add(cafe);
            añadirProductoFactura(cafe);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar un café primero");
        }
    }
    
    public void añadirCrema() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar un café primero");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        
        if (ultimo instanceof Cafe || ultimo instanceof DecAzucar || ultimo instanceof DecCrema) {
            cafe = new DecCrema(cafe);
            listaProductos.add(cafe);
            añadirProductoFactura(cafe);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar un café primero");
        }
    }
    
    public void crearEnsalada() {
        ensalada = new Ensalada();
        listaProductos.add(ensalada);
        añadirProductoFactura(ensalada);
    }
    
    public void añadirTomate() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        
        if (ultimo instanceof Ensalada || ultimo instanceof DecTomate || ultimo instanceof DecVinagreta
            || ultimo instanceof DecPollo) {
            
            ensalada = new DecTomate(ensalada);
            listaProductos.add(ensalada);
            añadirProductoFactura(ensalada);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
        }
    }
    
    public void añadirVinagreta() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        
        if (ultimo instanceof Ensalada || ultimo instanceof DecTomate || ultimo instanceof DecVinagreta
            || ultimo instanceof DecPollo) {
            
            ensalada = new DecVinagreta(ensalada);
            listaProductos.add(ensalada);
            añadirProductoFactura(ensalada);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
        }
    }
    
    public void añadirPollo() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        
        if (ultimo instanceof Ensalada || ultimo instanceof DecTomate || ultimo instanceof DecVinagreta
            || ultimo instanceof DecPollo) {
            
            ensalada = new DecPollo(ensalada);
            listaProductos.add(ensalada);
            añadirProductoFactura(ensalada);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una ensalada primero");
        }
    }
    
    public void crearPizza() {
        pizza = new Pizza();
        listaProductos.add(pizza);
        añadirProductoFactura(pizza);
    }
    
    public void añadirQueso() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        if (ultimo instanceof Pizza || ultimo instanceof DecQueso || ultimo instanceof DecPeperoni
            || ultimo instanceof DecSalami) {
            
            pizza = new DecQueso(pizza);
            listaProductos.add(pizza);
            añadirProductoFactura(pizza);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
        }
    }
    
    public void añadirSalami() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        if (ultimo instanceof Pizza || ultimo instanceof DecQueso || ultimo instanceof DecPeperoni
            || ultimo instanceof DecSalami) {
            
            pizza = new DecSalami(pizza);
            listaProductos.add(pizza);
            añadirProductoFactura(pizza);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
        }
    }
    
    public void añadirPeperoni() {
        if (listaProductos.isEmpty()) {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
            return;
        }
        
        Producto ultimo = listaProductos.getLast();
        if (ultimo instanceof Pizza || ultimo instanceof DecQueso || ultimo instanceof DecPeperoni
            || ultimo instanceof DecSalami) {
            
            pizza = new DecPeperoni(pizza);
            listaProductos.add(pizza);
            añadirProductoFactura(pizza);
        } else {
            JOptionPane.showMessageDialog(oV, "Debe seleccionar una pizza");
        }
    }
    
    public void añadirProductoFactura(Producto p){
        DefaultTableModel modelo = (DefaultTableModel) oV.getTblFactura().getModel();
        String producto = "";
        String acompañado = "";
        subTotal = subTotal + p.getCosto();
        
        switch (p) {
            case Cafe c -> {
                producto = c.getDescripcion();
                acompañado = "";
            }
            case DecAzucar a -> {
                producto = "";
                acompañado = a.getDescripcion();
            }
            case DecCrema d -> {
                producto = "";
                acompañado = d.getDescripcion();
            }
            case Ensalada e -> {
                producto = e.getDescripcion();
                acompañado = "";
            }
            case DecTomate t -> {
                producto = "";
                acompañado = t.getDescripcion();
            }
            case DecVinagreta v -> {
                producto = "";
                acompañado = v.getDescripcion();
            }
            case DecPollo po -> {
                producto = "";
                acompañado = po.getDescripcion();
            }
            case Pizza pi -> {
                producto = pi.getDescripcion();
                acompañado = "";
            }
            case DecPeperoni pe -> {
                producto = "";
                acompañado = pe.getDescripcion();
            }
            case DecQueso q -> {
                producto = "";
                acompañado = q.getDescripcion();
            }
            case DecSalami s -> {
                producto = "";
                acompañado = s.getDescripcion();
            }
            default -> {
                producto = "";
                acompañado = "";
            }
        }

        
        Object[] fila = {
            producto,
            acompañado,
            p.getCosto(),
            String.format("%.2f", subTotal)
        };
        
        modelo.addRow(fila);
    }
}