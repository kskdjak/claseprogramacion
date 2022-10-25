public class Git {
    public static void main(String[] args) {
    System.out.println("\ncomandos git utilizados para subir al github\n");
        System.out.println("git config user.email: Este comando es para ver con que correo esta vinculado el git en la plataforma de intellij IDEA.\n");
        System.out.println("git config --global user.email: Este se utiliza para ingresar el correo del github.\n");
        System.out.println("git config user.name: Este se utiliza para ver con cual nombre de usuario esta.\n");
        System.out.println("git config --global user.name: Se utiliza para registrar un nombre de usuario en caso no este.\n");
        System.out.println("git init: Es para iniciar el repositorio.\n");
        System.out.println("git status: Es para ver los archivos que se van a subir.\n");
        System.out.println("git add .: Sirve para guardar todo.\n");
        System.out.println("git commit -m: Es para subir los cambios al repositorio pero aun siguen en el local, entre comiñas se le agrega un comentario en base del proyecto.\n");
        System.out.println("git branch -M main: Es para indicarle que se va a subir a la rama principal.\n");
        System.out.println("git remote add origin -Aqui va el link del github al cual se desea subir- : Es la ruta especifica donde se va a mandar el proyecto.\n");
        System.out.println("git push -u origin main: Indicarle para hacer el push y hacer efectiva la sincronizacion de el local con el remoto.\n");
    }
}
