import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        System.out.println("Introduce otro número mas.");

        Double C = in.nextDouble();

        if (( B == A + 1 ) && ( C == B + 1 )){
            System.out.println("Los números son consecutivos.");
        } else {
            System.out.println("Los números no son consecutivos");
        }
}
}
