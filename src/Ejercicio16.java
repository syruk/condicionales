import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingresa 'D' para convertir de euros a dólares o 'E' para convertir de dólares a euros:");
            
        String DIV = in.nextLine();
        
            if ((DIV.equals("D"))) {
                
                System.out.println("Ingresa la cantidad de euros a convertir a dólares:");
                
                double E = in.nextDouble();

                double D = (E * 1.18);
            
                System.out.println(E + " euros equivalen a " + D + " dólares.");
            } else {
                
                if ((DIV.equals("E")));
                
                System.out.println("Ingresa la cantidad de dólares a convertir a euros:");
                
                double D = in.nextDouble();

                double E = (D / 1.18);
            
                System.out.println(D + " dólares equivalen a " + E + " euros.");

            }
            
        }
            
    }



