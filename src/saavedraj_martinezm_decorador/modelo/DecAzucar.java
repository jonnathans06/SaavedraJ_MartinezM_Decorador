package saavedraj_martinezm_decorador.modelo;

public class DecAzucar extends DecoradorBebida{

    public DecAzucar(Producto bebida) {
        super(bebida);
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.5; 
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Azucar"; 
    }
}
