import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa un número para calcular su raíz cuadrada.");

        double N = in.nextDouble();

        if (N < 0) {
            System.out.println("ERROR: Introduce un valor que no sea negativo.");
        } else {
            
            double R = Math.sqrt(N);

            System.out.println("La raíz cuadrada de " + N + " es " + R + ".");
        }
    
}
}