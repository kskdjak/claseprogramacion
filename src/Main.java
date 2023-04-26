import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("Cuantas marcas de vehiculos va a ingresar");
        Scanner teclado=new Scanner(System.in);
        int n= teclado.nextInt();
        teclado.nextLine();//cada que se encuentran para leer dos numero enteros es para que se detenga el enter
        marcas=new String[n];//creamos el arreglo con n elementos
        //OPERACION ESCRITURA DEL ARREGLO
        for (int indice = 0; indice < n; indice++) {
            System.out.println("ingrese el nombre de la marca"+(indice+1)+": ");
            String marca= teclado.nextLine();
            marcas[indice]= marca.toUpperCase();
        }
        System.out.println("Lista de marcas ingresadas: ");
        //OPERACION LECTURA DEL ARREGLO
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice]+"\t");
        }
        //OPERACION DE BUSQUEDA
        System.out.println("¿Que nombre de maraca dessea buscar: ");
        //.toUpperCase()= Es una funcion que siempre nos convierte a mayusculas
        //.toLowerCase()= Es una funcion que siempre nos convierte a minusculas
        String marca_busqueda= teclado.nextLine().toUpperCase();
        System.out.println("marca_busacada: "+ marca_busqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marca_busqueda.equals(marcas[indice])){
                System.out.println("marca encontrada");
                System.out.println("Se encuentra en el indice"+ indice);
                break;
            }
        }
    }
}