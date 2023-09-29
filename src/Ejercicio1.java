import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado en cms.");

        double L = in.nextDouble();

        double P = L * 4;

        double A = L * L;

        System.out.println("El perímetro del cuadrado es " + P + " y su área son " + A + "cms2");
    }
}
