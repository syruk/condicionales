import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        System.out.println("Introduce otro número mas.");

        Double C = in.nextDouble();

        if (( A > B ) && ( A > C )) {
            System.out.print("El mayor es " + A ); 
        } else { 
            if(( B > A ) && ( B > C )) {
                System.out.print("El mayor es" + B );
        } else {
             System.out.print("El mayor es "+C);
        }
    }
}
}
            

        
        
        