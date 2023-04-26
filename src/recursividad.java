import java.util.Scanner;

public class recursividad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduce un numero entero >0 ");
        n = teclado.nextInt();
        System.out.println("Suma desde 1 hasta " + n + " es"+" = " + suma(n));
    }
    public static int suma(int n){
        if(n == 1) { //caso base
            return 1;
        } else {
            return n + suma(n-1);
        }
    }
}