import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        if ( A > B ) 
        { double X = A - B;
            System.out.println("La diferencia del mayor por el menor es " + X);
        } else {
            double Y = B - A;
            System.out.println("La diferencia de los dos números introducidos es: "+ Y );
            }
}
}
