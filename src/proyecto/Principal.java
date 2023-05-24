package proyecto;

import java.util.Scanner;
/*+
Autores: Lenin Cuenca
Autores: Jose Caraguay
 */
class claseColaArray{
    int[] COLA;
    int FRENTE;
    int FIN;
    Scanner teclado=new Scanner(System.in);
    public claseColaArray(int FIN){
        this.FRENTE=-1;
        this.FIN=FIN;
        this.COLA=new int[this.FIN];
    }

    public int getFRENTE() {
        return FRENTE;
    }
    public void vaciarCola(){
        this.FRENTE=-1;
    }
    public boolean ColaLlena(){
        if (this.FIN-1==this.FRENTE){
            return true;
        }else {
            return false;
        }
    }
    public boolean ColaVacia(){
        if (this.FRENTE==-1){
            return true;
        }else {
            return false;
        }
    }
    public void InsertarCola(){
        if (this.ColaLlena()){
            System.out.printf("Cola llena");
        }else {
            int ITEM;
            System.out.print("Ingrese el ticket a entregar: ");
            ITEM= teclado.nextInt();
            this.FRENTE++;
            this.COLA[this.FRENTE]=ITEM;
            System.out.println("El ticket "+ITEM+" Se ha entrgado");
        }
    }
    public void EliminarCola()
    {
        if(this.ColaVacia())
        {
            System.out.println("Cola Vacía");
        }
        else
        {
            int ITEM = this.COLA[0];
            System.out.println("El ticket " + ITEM + " se ha eliminado");
            if (this.FRENTE==0) {
                vaciarCola();
            }
            else {
                for( int i= 0; i<this.FRENTE; i++){
                    this.COLA[i]= this.COLA[i+1];
                }
            }
            this.FRENTE--;
        }
    }
}
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        claseColaArray ticket = new claseColaArray(10);
        do {
            System.out.println("");
            System.out.println("Bienvenido al sistema de atención de estudiantes");
            System.out.println("1. Entregar ticket");
            System.out.println("2. Atender estudiante");
            System.out.println("3. Ver cantidad de tickets en espera");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:

                    if (!ticket.ColaLlena()) {
                        ticket.InsertarCola();
                    } else {
                        System.out.println("La sala de atención está llena. No se pueden entregar más tickets");
                        System.out.println("");
                    }
                    break;
                case 2:
                    if (!ticket.ColaVacia()) {
                        ticket.EliminarCola();
                    } else {
                        System.out.println("No hay estudiantes en espera");
                        System.out.println("");
                    }
                    break;
                case 3:

                    System.out.println("Cantidad de tickets en espera: " + (ticket.getFRENTE() + 1));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Gracias por preferirnos :D");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número de opcion válido.");
                    System.out.println(" ");
                    break;
            }
        }while (opcion != 4);
    }
}

