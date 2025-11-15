package saavedraj_martinezm_decorador.modelo;

public abstract class DecoradorPizza implements Producto{
    private Producto pizza;

    public DecoradorPizza(Producto ensalada) {
        this.pizza = ensalada;
    }
    
    @Override
    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    @Override
    public double getCosto() {
        return pizza.getCosto();
    }
}
