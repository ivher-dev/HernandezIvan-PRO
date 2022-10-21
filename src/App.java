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
    
    static void createAdminMenus(){
        Menus[] menus = new Menus[6];
        menus[0] = new Menus(1,"1.- Administrar películas",
                                                    "2.- Administrar usuarios",
                                                    "0.- Salir");
        menus[1] = new Menus(2, 1,"1.- Añadir película",
                                                    "2.- Modificar película",
                                                    "3.- Borrar película",
                                                    "0.- Volver");
        menus[2] = new Menus(2, 2, "1.- Añadir usuario",
                                                    "2.- Borrar usuario",
                                                    "0.- Volver");
    }

    static void createUserMenus(){
        Menus[] menus = new Menus[6];
        menus[0] = new Menus(1,"1.- Peliculas",
                                                        "2.- Configuración usuario",
                                                        "0.- Salir");
        menus[1] = new Menus(2,1,"1.- Peliculas",
                                                        "2.- Configuración usuario",
                                                        "0.- Salir");
        menus[2] = new Menus(2,2,"1.- Casablanca",
                                                    "2.- El padrino",
                                                    "0.- Volver");
    }
}