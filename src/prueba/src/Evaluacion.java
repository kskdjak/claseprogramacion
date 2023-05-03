import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Evaluacion {

    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\UTPL\\Desktop\\Encuesta\\Estudiantes.txt");
            if(file.createNewFile()){
                System.out.println("Archivo creado:" + file.getName());
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        try(FileWriter myWriter = new FileWriter("C:\\Users\\UTPL\\Desktop\\Encuesta\\Estudiantes.txt",true)){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingrese la cantidad de encuestas que dessea realizar");
            int encuestas= teclado.nextInt();
            for (int i = 1; i <=encuestas; i++) {
                System.out.println("Encuesta "+i);
                myWriter.write("Encuesta "+i+"\n");
                System.out.println("Ingrese su numero de cedula");
                String cedula=teclado.nextLine();
                myWriter.write("Ingrese su numero de cedula\n");
                myWriter.write(cedula+"\n");
                teclado.nextLine();
                System.out.println("Ingrese sus nombres y apellidos");
                String  nombres=teclado.nextLine();
                myWriter.write("Ingrese sus nombres y apellidos\n");
                myWriter.write(nombres+"\n");
                System.out.println("Cual es su edad");
                String edad= teclado.nextLine();
                myWriter.write("Cual es su edad\n");
                myWriter.write(edad+"\n");
                System.out.println("ingrese la cantidad de materias que esta cursando este cilo");
                String materias= teclado.nextLine();
                myWriter.write("ingrese la cantidad de materias que esta cursando este cilo\n");
                myWriter.write(materias+"\n");
                System.out.println("Estas satisfecho con la carrera");
                String carrera=teclado.nextLine();
                myWriter.write("Estas satisfecho con la carrera\n");
                myWriter.write(carrera+"\n");

            }
            myWriter.close();
        }catch(IOException e){
            System.out.println("Error de escritura");
        }
    }
}
