import java.util.Scanner;
public class Ejercicio14 {
public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("La cantidad de personas.");

        int P = in.nextInt();

        System.out.println("Introduce la cantidad de días.");

        int D = in.nextInt();
    
        if ((P >= 5) && (D >= 7)) {
            double TD = ((D * 15) * P) * 0.75;
            System.out.println("El total con el 25% de descuento es " + TD + " euros.");
        } else {
            double T = (D * 15) * P;
            System.out.println("El total sin el 25% de descuento es " + T + " euros.");            
        }
}
}