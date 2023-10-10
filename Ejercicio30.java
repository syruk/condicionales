
//Haz una calculadora. La calculadora permitirá hacer varias operaciones.
//Pedirá un número real, pedirá una operación (+, -, *, / o %), pedirá otro
//número real y mostrará el resultado por consola. A continuación pedirá
//los datos para una nueva operación. Piensa en un modo para que se
//pueda salir de la calculadora en cualquier momento.



import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        boolean seguir = true;
    while (seguir) {    
        System.out.println("Introduce un número.");
        double numero1=in.nextDouble();
        in.nextLine();
        System.out.println("Introduce la operación: (+ , - , * , / , %)");
        String operacion = in.nextLine();
        System.out.println("Introduce otro número.");
        double numero2=in.nextDouble();
        in.nextLine();
        double resultado = 0;
    switch (operacion) {
        case "+":
        resultado=(numero1+numero2);
            break;
        case "-":
        resultado=(numero1-numero2);
            break;
        case "*":
        resultado=(numero1*numero2);
            break;
        case "/":
        resultado=(numero1/numero2);
            break;
        case "%":
        resultado=(numero1%numero2);
            break;
        default:
        System.out.println("ERROR: Operación no válida.");
            break;
    }
    System.out.println("El resultado es " + resultado);
    System.out.println("Introduce 'n' si quieres dejar de calcular.");
      String decision = in.nextLine();
      if (decision.equals("n")) {
        seguir = false;
      }
       }

    }
}
