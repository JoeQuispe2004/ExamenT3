package t3_cuadernodeprecios;
import java.util.Scanner;
public class T3_CuadernodePrecios {
    public static void main(String[] args) {
        T3_Producto[] catalogo = {
            new T3_Camisa("Camisa Roja", 29.99),
            new T3_Pantalon("Pantalon Azul", 39.99)
        };
        T3_Tienda miTienda = new T3_Tienda(catalogo);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Mostrar Catalogo");
            System.out.println("2. Actualizar Precio");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == 1) {
                miTienda.mostrarCatalogo();
            } else if (opcion == 2) {
                System.out.print("Nombre del producto a actualizar: ");
                String nombre = scanner.nextLine();
                System.out.print("Nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                miTienda.actualizarPrecio(nombre, nuevoPrecio);
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opcion no valida.");
            }
        }
        scanner.close();
    }
    
}
