import java.util.Scanner;

public class Menu {
    static Scanner reader = new Scanner(System.in);
    String[] options;
    int role, option, level;

    Menu (int level, int option, String... options){
        this.options = options;
        this.level = level;
        this.option = option;
    }

    Menu (int level, String... options){
        this.options = options;
        this.level = level;
    }

    static Menu choose(Menu[] menus, int level){
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].level == level){
                return menus[i];
            }
        }
        return null;
    }

    static Menu choose(Menu[] menus, int level, int option){
        for (int i = 0; i < menus.length; i++) {
            if (menus[i].level == level && menus[i].option == option){
                return menus[i];
            }
        }
        return null;
    }

    void show(Menu menu){
        for(int i = 0; i < menu.options.length; i++){
            System.out.println(menu.options[i]);
        }
        System.out.println();
    }
    
    static int readOption(){
        int option;;
        System.out.print("Elige una opción: ");
        option = reader.nextInt();
        System.out.println("----------------------------\n");
        return option;
    }
}