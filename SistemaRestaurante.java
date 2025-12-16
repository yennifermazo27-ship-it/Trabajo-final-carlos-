import java.util.ArrayList;

public class SistemaRestaurante {

    private ArrayList<ProductoBase> productos = new ArrayList<>();

    public void agregarProducto(ProductoBase p) {
        productos.add(p);
        System.out.println("Producto agregado correctamente.\n");
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.\n");
            return;
        }

        System.out.println("LISTA DE PRODUCTOS:");
        for (ProductoBase p : productos) {
            System.out.println(p);
        }
        System.out.println();
    }

    public ProductoBase buscarPorId(int id) {
        for (ProductoBase p : productos) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public boolean eliminarProducto(int id) {
        ProductoBase p = buscarPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }
}