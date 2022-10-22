import java.util.Scanner;

public class Option {
    static Scanner reader = new Scanner(System.in);
    int number;
    String text;
    Menu  menu;

    Option (int number, String text, Menu menu){
        this.number = number;
        this.text = text;
        this.menu = menu;
    }

    Option (int number, String text){
        this.number = number;
        this.text = text;
    }

    static void show(Menu menu){
        for(int i = 0; i < menu.options.length; i++){
            System.out.println(menu.options[i].number + ".- " + menu.options[i].text);
        }
        System.out.println();
    }

    static int read(){
        int option;;
        System.out.print("Elige una opción: ");
        option = reader.nextInt();
        System.out.println("----------------------------\n");
        return option;
    }
}
