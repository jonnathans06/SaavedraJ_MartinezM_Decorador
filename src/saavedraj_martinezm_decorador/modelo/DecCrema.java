package saavedraj_martinezm_decorador.modelo;

public class DecCrema extends DecoradorBebida{

    public DecCrema(Producto bebida) {
        super(bebida);
    }

    @Override
    public double getCosto() {
        return 1.2;
    }

    @Override
    public String getDescripcion() {
        return "Crema"; 
    }
}
