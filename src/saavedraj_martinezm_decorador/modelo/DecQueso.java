package saavedraj_martinezm_decorador.modelo;

public class DecQueso extends DecoradorPizza {
    public DecQueso(Producto pizza) {
        super(pizza);
    }

    @Override
    public double getCosto() {
        return 1;
    }

    @Override
    public String getDescripcion() {
        return "Queso";
    }
}