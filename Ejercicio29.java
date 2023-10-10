//“El número secreto”. Programa un juego en el que se calcula aleatoriamente un número de 1 a 100.
//El usuario debe adivinarlo. Cada vez que el usuario pone un número el programa
//le indicará si lo ha acertado, si el número secreto
//es mayor o si es menor. Termina cuando el usuario acierta el número.

import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {

  public static void main(String[] args) throws Exception {
    Random random = new Random();
    int secreto = random.nextInt(1, 100);
    Scanner in = new Scanner(System.in);
    System.out.println(
      "Trata de adivinar el número, ingresa un número de 1 a 100"
    );
    int usuario = in.nextInt();
    while (secreto != usuario) {
      if ((usuario > secreto)) {
        System.out.println("Tu numero es demasiado alto");
      } else {
        System.out.println("Tu numero es demasiado bajo");
      }
      System.out.println("Inténtalo denuevo:");
      usuario=in.nextInt();
    }
    System.out.println("¡Adivinaste! El número era " + usuario + ".");
  }
}
