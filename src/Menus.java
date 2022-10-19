import java.util.Scanner;

public class Menus {
    static Scanner reader = new Scanner(System.in);

    static void showMain(){
        int option;
        if (Login.isAdmin){
            String[] options = {
                "1.- Administrar películas",
                "2.- Administrar usuarios",
                "0.- Salir"
            };
            printArray(options);
            System.out.println("-------------------------");
            System.out.print("Opción: ");
            option = reader.nextInt();
            System.out.println();
            switch(option){
                case 1:
                    showAdminPeliculas();
                    break;
                case 2:
                    showAdminUsuarios();
                    break;
                case 0:
                    break;
                default:
                    showMain();
                    break;
            }
        } else {
            String[] options = {
                "1.- Peliculas",
                "2.- Configuración usuario",
                "0.- Salir"
            };
            printArray(options);
            System.out.println("-------------------------");
            System.out.print("Opción: ");
            option = reader.nextInt();
            System.out.println();
            switch(option){
                case 1:
                    showUsuarioPeliculas();
                    break;
                case 2:
                    showUsuarioConfiguracion();
                    break;
                case 0:
                    break;
                default:
                    showMain();
                    break;
            }
        }
    }

    static void showAdminPeliculas(){
        int option;
        String[] options = {
            "1.- Añadir película",
            "2.- Modificar película",
            "3.- Borrar película",
            "0.- Volver"
        };
        printArray(options);
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        option = reader.nextInt();
        System.out.println();
        switch(option){
            case 1:
                showAdminPeliculas();
                break;
            case 2:
                showAdminPeliculas();
                break;
            case 3:
                showAdminPeliculas();
                break;
            case 0:
                showMain();
                break;
            default:
                showAdminPeliculas();
                break;
        }
    }

    static void showAdminUsuarios(){
        int option;
        String[] options = {
            "1.- Añadir usuario",
            "2.- Borrar usuario",
            "0.- Volver"            
        };
        printArray(options);
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        option = reader.nextInt();
        System.out.println();
        switch(option){
            case 1:
                showAdminUsuarios();
                break;
            case 2:
                showAdminUsuarios();
                break;
            case 0:
                showMain();
                break;
            default:
                showAdminUsuarios();
                break;
        }
    }

    static void showUsuarioPeliculas(){
        int option;
        String[] options = {
            "1.- Casablanca",
            "2.- El padrino",
            "0.- Volver"
        };
        printArray(options);
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        option = reader.nextInt();
        System.out.println();
        switch(option){
            case 1:
                showUsuarioPeliculas();
                break;
            case 2:
                showUsuarioPeliculas();
                break;
            case 0:
                showMain();
                break;
            default:
                showUsuarioPeliculas();
                break;
        }
    }

    static void showUsuarioConfiguracion(){
        int option;
        String[] options = {
            "1.- Cambiar nombre usuario",
            "2.- Cambiar password",
            "0.- Volver"
        };
        printArray(options);
        System.out.println("-------------------------");
        System.out.print("Opción: ");
        option = reader.nextInt();
        System.out.println();
        switch(option){
            case 1:
                showUsuarioConfiguracion();
                break;
            case 2:
                showUsuarioConfiguracion();
                break;
            case 0:
                showMain();
                break;
            default:
                showUsuarioConfiguracion();
                break;
        }
    }

    static void printArray(String[] options){
        for (var i = 0; i < options.length; i++){
            System.out.println(options[i]);
        }
    }
}