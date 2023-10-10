import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número entero.");

        int N = in.nextInt();

        int C = 0;

        while (N>0) {
            N /= 10;
            C++;
        }
        System.out.println("El número tiene " + C + " cifras.");

}
}