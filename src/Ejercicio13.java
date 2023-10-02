import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce la hora");

        int H = in.nextInt();

        System.out.println("Introduce los minutos.");

        int M = in.nextInt();

        System.out.println("Introduce los segundos.");

        int S = in.nextInt();

        if ((H >= 0) && (H < 25) && (M >= 0) && (M < 61) && (S >=0) && (S < 61)){
            int SE = S + 1;
            System.out.println("La Hora más 1 segundo es " + H + ":" + M + ":" + SE);
        } else {
            System.out.println("El formato introducido no es correcto");
        }
}
}
