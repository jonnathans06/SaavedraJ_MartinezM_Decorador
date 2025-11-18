package saavedraj_martinezm_decorador.modelo;

public class DecPeperoni extends DecoradorPizza {
    public DecPeperoni(Producto pizza) {
        super(pizza);
    }

    @Override
    public double getCosto() {
        return 1;
    }

    @Override
    public String getDescripcion() {
        return "Pepperoni";
    }
}
