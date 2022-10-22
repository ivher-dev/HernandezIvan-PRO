import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        User[] users = new User[2];
        users[0] = new User("usuario", "usuario", false);
        users[1] = new User("admin", "admin", true);
        User user = null;
        Menu menu = new Menu();

        while (Login.attempts <= Login.ATTEMPTS_MAX){
            user = Login.check(Login.input(), users);
            if (user != null){
                if (user.isAdmin){
                    menu = Menu.buildAdmin();
                } else {
                    menu.options = new Option[3];
                    menu = Menu.buildUser();
                }
                menu.show(menu);
                System.out.println("Cerrando programa...");
                break;
            }
        }
    }
}
