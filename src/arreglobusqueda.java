import java.util.Scanner;

public class arreglobusqueda {
    /*
    public int secuencial (int [] x,int elemento){
        for (int i = 0; i < x.length; i++) {
            if (x[i]==elemento);
            return -1;
        }
        return -1;
    }
     */
    public static void main(String[] args) {
        int numeros[];
        System.out.println("Cuantas numeros va ingresar");
        Scanner teclado=new Scanner(System.in);
        int n= teclado.nextInt();
        teclado.nextLine();
        numeros=new int[n];
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el numero abuscar"+(indice+1)+": ");
            int num= teclado.nextInt();
            numeros[indice]=num;
        }
        System.out.println("Lista de numeros ingresadas: ");
        //OPERACION LECTURA DEL ARREGLO
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]+"\t");
        }
        System.out.println("Que numeros ingresados desea buscar?");
        int buscar= teclado.nextInt();
        System.out.println("numero a buscar"+" "+buscar);

        for (int indice = 0; indice < n; indice++) {
            if ( (buscar==numeros[indice])){
                System.out.println("numero encontrado");
                System.out.println("Se encuentra el numero en la posicion "+indice);
                break;
            }
        }

    }

}
