package impares;

import java.util.Scanner;

public class ExamenSuma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese repuestas correctas");
        int  suma = scanner.nextInt();

        System.out.println("Ingrese repuestas incorrecta");
        int resta = scanner.nextInt();

        System.out.println("Ingrese repuestas vacias");
        int vacio = scanner.nextInt();

        int resutalado = (suma * 5) + (resta *-2);

        System.out.println("El puntaje obtenido es : " + resutalado);

    }
}
