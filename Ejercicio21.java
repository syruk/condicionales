public class Ejercicio21 {
    public static void main(String[] args) throws Exception {

        int N = 2;
        int S = 0;

        while (N <= 1000){
            N+=2;
            S+=N;
            
        }

        System.out.println("La suma de todos los números pares entre 1 y 1000 es " + S);
}
}