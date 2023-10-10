import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int Approved = 0;
        int Reproved = 0;
        
        System.out.println("Introduce las notas de los alumnos, cuando quieras terminar introduce un número negativo.");

        while (true){
            double Nota = in.nextDouble();
            if (Nota < 0) {
                break;
            } else {
                if (Nota >=5) {
                    Approved++;
                } else {
                    Reproved++;
                }
            }
        }
        System.out.println("La cantidad de aprovados son " + Approved + ". Y la cantidad de reprobados son " + Reproved + ".");
}
}