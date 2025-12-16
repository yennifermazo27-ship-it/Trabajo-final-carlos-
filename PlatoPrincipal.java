public class PlatoPrincipal extends ProductoBase {

    private boolean esVegetariano;

    public PlatoPrincipal(int id, String nombre, double precio, int cantidad, boolean esVegetariano) {
        super(id, nombre, precio, cantidad);
        this.esVegetariano = esVegetariano;
    }

    public boolean isVegetariano() {
        return esVegetariano;
    }

    @Override
    public String tipoProducto() {
        return esVegetariano ? "Plato Principal (Vegetariano)" : "Plato Principal";
    }
}
