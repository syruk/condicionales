import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        System.out.println("Introduce otro número mas.");

        Double C = in.nextDouble();

        if (( A < B ) && (B < C)) 
        {   System.out.println("Los números están ordenados de menor a mayor.");
        } else {
            System.out.println("Los números no están ordenados de menor a mayor");
            }
    }
}
