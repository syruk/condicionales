import java.util.Random;
import java.util.Scanner;

public class Ejercicio28 {

  public static void main(String[] args) throws Exception {
    Random random = new Random();
    boolean seguir = true;
    int ganador = random.nextInt(99999);
    Scanner in = new Scanner(System.in);
    System.out.println("Ingresa un número entre 0 y 99.999.");
    int usuario = in.nextInt();
    in.nextLine();
    while (seguir) {
      while (usuario > 99999 || usuario < 0) {
        System.out.println("Vaya comprensión lectora...");
        System.out.println("Ingresa un número entre 0 y 99.999");
        usuario = in.nextInt();
        in.nextLine();
      }
      if (usuario == ganador) {
        System.out.println("Felicidades, has ganado!!");
      } else {
        System.out.println(
          "Pringado, has sido víctima del impuesto a la estupidez, la lotería. El número era " +
          ganador +
          "."
        );
      }
      System.out.println("Introduce 'n' si quieres dejar de jugar.");
      String decision = in.nextLine();
      if (decision.equals("n")) {
        seguir = false;
      }
    }
  }
}
