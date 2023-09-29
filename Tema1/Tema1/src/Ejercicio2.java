import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la base del rectángulo en cms.");

        double B = in.nextDouble();

        System.out.println("Introduce la altura del rectángulo en cms.");

        double A = in.nextDouble();

        double P = (2 * B) + (2 * A);

        double AR = B * A;

        System.out.println("El perímetro del rectángulo es " + P + " y su área son " + AR + "cms2");
        
}
}