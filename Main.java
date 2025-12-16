import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SistemaRestaurante sistema = new SistemaRestaurante();
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n--- RESTAURANTE ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Buscar producto por ID");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("1. Plato Principal");
                    System.out.println("2. Bebida");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("¿Es vegetariano? (true/false): ");
                        boolean veg = sc.nextBoolean();
                        sc.nextLine();

                        sistema.agregarProducto(
                                new PlatoPrincipal(id, nombre, precio, cantidad, veg));

                    } else if (tipo == 2) {
                        System.out.print("¿Es alcohólica? (true/false): ");
                        boolean alcohol = sc.nextBoolean();
                        sc.nextLine();

                        sistema.agregarProducto(
                                new Bebida(id, nombre, precio, cantidad, alcohol));
                    }
                    break;

                case 2:
                    sistema.listarProductos();
                    break;

                case 3:
                    System.out.print("ID a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    ProductoBase encontrado = sistema.buscarPorId(idBuscar);
                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("Producto no encontrado.");
                    break;

                case 4:
                    System.out.print("ID a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    if (sistema.eliminarProducto(idEliminar))
                        System.out.println("Producto eliminado.");
                    else
                        System.out.println("No existe ese ID.");
                    break;
            }
        }
    }
}