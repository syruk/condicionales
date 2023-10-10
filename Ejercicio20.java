import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos números enteros.");
        System.out.println("Introduce el primero.");
        int A = in.nextInt();
        System.out.println("Introduce el segundo número, recuerda que debe ser mayor que el primero.");
        int B = in.nextInt();
        int N = A+1;

        if (B>A) {

            while (N<B) {
                if (N % 2 == 0) {
                    N++;
                } else {
                    System.out.println(N);
                    N++;
                }                   
            }
        } else {
            System.out.println("ERROR: El segundo número debe ser mayor que el primero.");
        }
    }
}