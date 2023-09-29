import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        System.out.println("Introduce otro número mas.");

        Double C = in.nextDouble();
        
        int S = (int) ((A + B + C) / 3);

        Double D = (A + B + C) / 3;

        System.out.println("La media sin decimales es " + S + " y la media con decimales es " + D + ".");
}
}

