package saavedraj_martinezm_decorador.modelo;

public class DecPollo extends DecoradorEnsalada{

    public DecPollo(Producto ensalada) {
        super(ensalada);
    }

    @Override
    public double getCosto() {
        return 1.5;
    }

    @Override
    public String getDescripcion() {
        return "Pollo";
    }
}
