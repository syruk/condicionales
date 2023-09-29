import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        if ( A > 0 ) 
        { System.out.print("El número es positivo.");
        } else {
            if (A < 0){
                System.out.print("El numero es negativo");
                }else{
                    System.out.print("El números es cero.");
        }
}
    }
}