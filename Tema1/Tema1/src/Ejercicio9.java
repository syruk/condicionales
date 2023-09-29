import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
    
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la cantidad de DÓLARES");

        Double D = in.nextDouble();

        Double E = D * 0.95;

        System.out.println( E + " euros." );
            }
}
