package saavedraj_martinezm_decorador.modelo;

public class DecSalami extends DecoradorPizza {
    public DecSalami(Producto pizza) {
        super(pizza);
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 3;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Salami";
    }
}
