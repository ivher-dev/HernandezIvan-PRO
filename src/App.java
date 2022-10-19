import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        while (Login.loginAttempts <= 3){
            if (Login.check(Login.input())){
                Menus.showMain();
                break;
            } else {
                Login.loginAttempts++;
            }
        }
        
    }
}