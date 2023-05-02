import java.util.Scanner;


public class metodos {
   public  static void insertar(int[]x){
       Scanner entrada=new Scanner(System.in);
       for (int i = 0; i < x.length; i++) {
           System.out.println("Ingrese elemento de posicion "+i+":");
           x[i]=entrada.nextInt();
       }
   }
   public static void presentar1(int[]x){
       String coma=" ";
             for (int i = 0; i < x.length; i++) {
                      System.out.print(coma+x[i]);
                      coma=",";
       }
       System.out.println("");
   }
   public static int busquedaSeleccion(int[]x, int num){
       for (int i = 0; i < x.length; i++) {
           if(x[i]==num)
               return  i;
       }
       return -1;
   }
   public static void eliminar1(int []x,int num){

       int pos =busquedaSeleccion(x,num);
       if (pos!=-1){
           for (int i = pos; i < x.length-1; i++) {
               x[i]=x[i+1];
           }
           x[x.length-1]=0;
       }else
           System.out.println("Elemento no existe....");
   }



}