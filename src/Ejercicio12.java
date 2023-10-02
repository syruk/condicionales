import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un número.");

        Double A = in.nextDouble();

        System.out.println("Introduce otro número.");

        Double B = in.nextDouble();

        System.out.println("Introduce otro número mas.");

        Double C = in.nextDouble();

        if (( A >= B ) && ( B >= C ) && (A >= C)){
            System.out.println("Los números ordenados de mayor a menor son " + A + ", " + B + ", " + C + ".");
        } else {
            if ((A >= B) && ( C >= B) && (A >= C)) {
                System.out.println("Los números ordenados de mayor a menor son " + A + ", " + C + ", " + B + ".");
            } else {
                if ((B >= A) && (A >= C) && (B >= C)) {
                    System.out.println("Los números ordenados de mayor a menor son " + B + ", " + A + ", " + C + ".");
                } else {
                    if ((B >= A) && (C >= A) && (B >= C)) {
                        System.out.println("Los números ordenados de mayor a menor son " + B + ", " + C + ", " + A + ".");
                    } else {
                        if ((C >= B) && (B >= A) && (C >= A)) {
                            System.out.println("Los números ordenados de mayor a menor son " + C + ", " + B + ", " + A + ".");
                        } else {
                            if ((C >= A) && (A >= B) && (C >= B));
                            System.out.println("Los números ordenados de mayor a menor son " + C + ", " + B + ", " + A + ".");
                        }
                    }
                }
            }
        
        }
}
}
