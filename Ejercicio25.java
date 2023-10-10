import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Introcude un número entero positivo para calcular su factorial:");
        int Numero = in.nextInt();
        int factorial = 1;
        if (Numero == 0) {
            System.out.println("El facotrial de 0 siempre es 0...");
        } else {
            if (Numero<0) {
                System.out.println("ERROR: Introduce un número entero positivo.");
            } else {
                for (int i = 1; i <= Numero; i++) {
                    factorial = factorial * i;                
                }
                System.out.println("El factorial del número es " + factorial + ".");
            }
        }
    }
}