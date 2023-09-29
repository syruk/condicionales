import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la cantidad de EUROS");

        Double E = in.nextDouble();

        Double D = E * 1.05;

        System.out.println( D + " dólares." );
            }
}

