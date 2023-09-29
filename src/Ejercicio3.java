import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la base del triángulo en cms.");

        double B = in.nextDouble();

        System.out.println("Introduce la altura del triángulo en cms.");

        double A = in.nextDouble();

        double AR = (B * A) / 2;

        System.out.println("El área del triángulo son " + AR + "cms2");
        
}
}