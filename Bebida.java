public class Bebida extends ProductoBase {

    private boolean esAlcoholica;

    public Bebida(int id, String nombre, double precio, int cantidad, boolean esAlcoholica) {
        super(id, nombre, precio, cantidad);
        this.esAlcoholica = esAlcoholica;
    }

    public boolean isAlcoholica() {
        return esAlcoholica;
    }

    @Override
    public String tipoProducto() {
        return esAlcoholica ? "Bebida Alcohólica" : "Bebida";
    }
}