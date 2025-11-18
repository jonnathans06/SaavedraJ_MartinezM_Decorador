package saavedraj_martinezm_decorador.modelo;

public abstract class DecoradorBebida implements Producto{
    private Producto bebida;

    public DecoradorBebida(Producto bebida) {
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
}
