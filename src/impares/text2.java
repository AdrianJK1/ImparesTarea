import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int idCounter = 1;

        while (true) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(scanner.nextLine());

            productos.add(new Producto(idCounter++, nombre, marca, precio));

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Productos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}