import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Archivos {
    public static void main(String[] args) {
        try{
            File file = new File("data/vamos a probar.txt");
            //File file = new File ("C:\Users\ASUS\IP2022_Agila_Jhordy\Trabajos\Clase2\data");
            if(file.createNewFile()){
                System.out.println("Archivo creado:" + file.getName());
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Error");
        }
        try(FileOutputStream fos=new FileOutputStream("C:\\Hola\\prueba2",true)) {
            String data="Esto es un ejmplo de Stream con Bytes";
            byte b[]=data.getBytes();
            fos.write(b);

            fos.flush();
            fos.close();
            System.out.printf("Se a escrito el archivo");
        }catch (IOException e){
            System.out.printf("Error de escritura");
        }
        try {
            FileInputStream fis=new FileInputStream("C:\\Hola\\prueba2");
            int i;
            while ((i=fis.read())!=-1);
            System.out.print((char) i);
        }
        catch (IOException e){
            System.out.printf("ERROR DE LECTURA");
        }
    }
}



