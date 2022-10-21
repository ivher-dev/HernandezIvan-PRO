import java.util.Scanner;

public class App {
    static Scanner reader = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        User[] users = new User[2];
        users[0] = new User("usuario", "usuario", false);
        users[1] = new User("admin", "admin", true);
        User user = null;
        Menu[] menus = null;
        Menu menu = null;
        int option = 0;

        while (Login.loginAttempts <= Login.loginAttemptsMax){
            user = Login.check(Login.input(), users);
            if (user != null){
                // Define menus
                if (user.isAdmin){
                    menus = new Menu[3];
                    menus[0] = new Menu(0,"1.- Administrar películas",
                                            "2.- Administrar usuarios",
                                            "0.- Salir");
                    menus[1] = new Menu(1, 1,"1.- Añadir película",
                                            "2.- Modificar película",
                                            "3.- Borrar película",
                                            "0.- Volver");
                    menus[2] = new Menu(1, 2, "1.- Añadir usuario",
                                            "2.- Borrar usuario",
                                            "0.- Volver");
                } else {
                    menus = new Menu[3];
                    menus[0] = new Menu(0,"1.- Peliculas",
                                            "2.- Configuración usuario",
                                            "0.- Salir");
                    menus[1] = new Menu(1,1,"1.- Casablanca",
                                            "2.- El padrino",
                                            "0.- Volver");
                    menus[2] = new Menu(1,2,"1.- Cambiar nombre usuario",
                                            "2.- Cambiar password",
                                            "0.- Volver");
                }
                do{
                    menu = Menu.choose(menus, 0);
                    menu.show(menu);
                    option = Menu.readOption();
                    if (option == 0){
                        continue;
                    }
                    do{
                        menu = Menu.choose(menus, 1, option);
                        menu.show(menu);
                        // Read option and ifgnore if not 0
                        option = Menu.readOption() == 0 ? 0 : option;
                    } while (!(option == 0 && menu.level == 1));
                } while (!(option == 0 && menu.level == 0));
                break;
            } else {
                Login.loginAttempts++;
            }
        }
        
    }
}
