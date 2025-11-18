package saavedraj_martinezm_decorador.modelo;

public class DecTomate extends DecoradorEnsalada{

    public DecTomate(Producto ensalada) {
        super(ensalada);
    }

    @Override
    public double getCosto() {
        return 1.10;
    }

    @Override
    public String getDescripcion() {
        return "Tomate";
    }
}
