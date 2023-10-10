import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce números enteros positivos, cuando quieras parar, intrduce un número negativo.");
        int Cantidad = 0;
        int Suma = 0;
        while (true) {
            int N = in.nextInt();
            if (N<0) {
                break;
            }else{
                Suma += N;
                Cantidad++;
            }
        }
        if (Cantidad>0) {
            double Media = Suma / Cantidad;
            System.out.println("La media de los números introducidos es: " + Media + ".");
        } else {
            System.out.println("ERROR: No se han introducido número positivos.");
    
        }
    }
}