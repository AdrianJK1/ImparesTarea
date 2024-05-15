package impares;

import java.util.Scanner;

public class MatrizMascotas {
    public static void main(String[] args) {

        String[] mascotas = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese nombres de mascotas [" + i + "]");
            mascotas[i] = scanner.nextLine();
        }
        System.out.println("\n");

        for (int i = 0; i < 10; i +=2) {

            System.out.println("Las mascotas de las casillas pares son: [" + i + "]" + mascotas[i]);

        }

    }
}
