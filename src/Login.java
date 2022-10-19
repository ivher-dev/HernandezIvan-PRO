import java.util.Scanner;

public class Login {
    static Scanner reader = new Scanner(System.in);
    static int loginAttempts = 1;
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
    
    static boolean check(String[] inputUser){
        final String[][] VALID_USERS = {{"usuario","usuario","0"},{"admin","admin","1"}};
        for (var i = 0; i < VALID_USERS.length; i++){
            if(inputUser[0].equals(VALID_USERS[i][0]) && inputUser[1].equals(VALID_USERS[i][1])){
                System.out.println("Has iniciado sesión como " + inputUser[0]);
                System.out.println();
                if (VALID_USERS[i][2].equals("1")){
                    isAdmin = true;
                }
                return true;
            }
        }
        System.out.println("Usuario y/o contraseña incorecto/s");
        System.out.println();
        return false;
    }
}