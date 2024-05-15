package impares;

import java.util.Scanner;

public class PuntosBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int puntos = 0;

        System.out.println("Ingrese sus puntos:");
        puntos = scanner.nextInt();

        if ( puntos < 1000){
            System.out.println("Sus puntos son: " + puntos +  ", Su nivel es bronce");
        } else if ( puntos >= 1000 &&  puntos < 3000 ){
            System.out.println("Sus puntos son: " + puntos + ", Su nivel es plata");
        } else if ( puntos >=3000) {
            System.out.println("Sus puntos son: " + puntos + ", Su nivel es oro");
        }
    }
}
