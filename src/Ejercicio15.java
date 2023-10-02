import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el número del mes.");

        int M = in.nextInt();

        System.out.println("Introduce el año.");

        int A = in.nextInt();

        if ((M == 2) && ((A % 4 == 0) && (A % 100 != 0) || (A % 400 == 0))) {
            System.out.println("El mes tiene 29 días.");
        } else {
            if ((M == 2) &&! ((A % 4 == 0) && (A % 100 != 0) || (A % 400 == 0))) {
                System.out.println("El mes tiene 28 días.");
            } else {
                if ((M == 1) || (M == 3) || (M == 5) || (M == 7) || (M == 8) || (M == 10) || (M == 12)){
                    System.out.println("El mes tiene 31 días.");
                } else {
                    System.out.println("El mes tiene 30 días.");
                }
            }
        }
    
}
}
