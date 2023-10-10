import java.util.Scanner;

public class Ejercicio26 {

  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    System.out.println(
      "Introduce un número entero y te diré si es primo o no."
    );
    int Numero = in.nextInt();
    int contador = 2;
    boolean isPrime = true;
    if (Numero == 0 || Numero == 1) {
      isPrime = false;
    }
    while (isPrime && (contador < Numero / 2)) {
      if (Numero % contador == 0) {
        isPrime = false;
      } else {
        isPrime = true;
        contador++;
      }
    }
    if (isPrime) {
      System.out.println("El número es primo.");
    } else {
      if (Numero == 0 || Numero == 1) {
        System.out.println("El número no es primo.");
      } else {
        System.out.println(
          "El número no es primo. Porque es divisible entre " + contador + "."
        );
      }
    }
  }
}
