public class Ejercicio27 {

  public static void main(String[] args) throws Exception {
    int primo = 2;
    int contador = 0;
    boolean isPrime = true;
    final int MAX = 20;
    while (contador < MAX) {
      for (int i = 2; i <= primo / 2; i++) {
        if (primo % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        System.out.println("El número primo en la posición " + ++contador + " es " + primo);
      }
      isPrime = true;
      primo++;
    }
  }
}
