package saavedraj_martinezm_decorador.modelo;

public class Pizza implements Producto{
    String descripcion;
    double costo;

    public Pizza() {
        this.descripcion = "Pizza";
        this.costo = 5;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public double getCosto() {
        return costo;
    }
}
