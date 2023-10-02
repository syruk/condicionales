import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa 0 para calcular perímetro y área de un cuadrado, 1 para calcular perímetro y área de un rectángulo o 2 para calcular la superficie de un triángulo:");

        int orden = in.nextInt();

        if (orden == 0) {

            System.out.println("Ingresa el lado del cuadrado");

            double LC = in.nextDouble();

            double AC = LC * LC;

            double PC = LC * 4;

            System.out.println("El perímetro del cuadrado es " + PC + " y su área es " + AC + ".");
        } else {
            if (orden == 1) {
                
                System.out.println("Ingresa la altura del rectángulo");

                double AR = in.nextDouble();

                System.out.println("Ingresa la base del rectángulo");

                double BR = in.nextDouble();

                double PR = ((BR * 2) + (AR * 2));

                double ARR = PR * AR;

                System.out.println("El perímetro del rectángulo es " + PR + " y su área es " + ARR + ".");
            } else {
                if (orden == 2) {
                    
                    System.out.println("Ingresa la altura del triángulo");

                    double AT = in.nextDouble();

                    System.out.println("Ingresa la base del triángulo");

                    double BT = in.nextDouble();

                    double ART = (BT * AT) / 2;

                    System.out.println("El área del triángulo es " + ART + ".");

                } else {
                    if ((orden < 0) && (orden > 2));

                    System.out.println("La orden introducida no es válida.");
                }
            }
            
        }
}
}