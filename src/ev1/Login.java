package ev1;
import java.util.Scanner;

public class Login {
    static Scanner reader = new Scanner(System.in);
    static int attempts = 1;
    static final int ATTEMPTS_MAX = 3;
    static boolean isAdmin;
    static String[] input(){
        String[] inputUser = new String[2];
    
        System.out.print("Introduce un usuario: ");    
        inputUser[0] = reader.next();
        System.out.print("Introduce su contraseña: ");
        inputUser[1] = reader.next();
        System.out.println();
        return inputUser;
    }
    
    static User check(String[] inputUser, User[] users){
        for (var i = 0; i < users.length; i++){
            if(inputUser[0].equals(users[i].user) && inputUser[1].equals(users[i].password)){
                System.out.println("Has iniciado sesión como " + inputUser[0]);
                System.out.println();
                return users[i];
            }
        }
        System.out.println("Usuario y/o contraseña incorecto/s");
        System.out.println("Intentos restantes: [" + (ATTEMPTS_MAX - attempts) + "/" + ATTEMPTS_MAX + "]");
        System.out.println();
        attempts++;
        return null;
    }
}