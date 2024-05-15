package impares;

import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int par =0;

        System.out.println("Ingrese un numero par: ");
        par = scanner.nextInt();

        int ingresado = 1;
        System.out.println("Numeros impares entre [" + par + "]");
        while (ingresado <= par){

            System.out.println(ingresado + "");
            ingresado+=2;

        }
    }
}
