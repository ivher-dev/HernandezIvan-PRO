package ev1.practices.Prac1_2;
import java.util.Scanner;

class Menu{
    static Scanner reader = new Scanner(System.in);
    Option[] options;

    Menu(Option... options){
        this.options = options;
    }

    void show(Menu menu){
        int option = 0;
        do{
            for(int i = 0; i < menu.options.length; i++){
                System.out.println(menu.options[i].number + ".- " + menu.options[i].text);
            }
            System.out.println();
            option = Option.read();
            for(int i = 0; i < menu.options.length; i++){
                if (option == menu.options[i].number && menu.options[i].menu != null){
                    show(menu.options[i].menu);
                }
            }
        } while (option != 0);
    }
    static Menu buildAdmin(){
        Menu menu = new Menu();
        menu.options = new Option[3];
        menu.options[0] = new Option(1,"Administrar peliculas", new Menu(
            new Option(1,"Agregar pelicula", new Menu(
                new Option(1,"Agregar pelicula terror"),
                new Option(2,"Agregar pelicula comedia"),
                new Option(3,"Agregar pelicula drama"),
                new Option(4,"Agregar pelicula XXX", new Menu(
                    new Option(1,"Agregar pelicula XXX 1"),
                    new Option(2,"Agregar pelicula XXX 2"),
                    new Option(3,"Agregar pelicula XXX 3"),
                    new Option(4,"Volver")
                )),
                new Option(0,"Volver")
            )),
            new Option(2,"Eliminar pelicula"),
            new Option(3,"Modificar pelicula"),
            new Option(0,"Volver")));
        menu.options[1] = new Option(2,"Administrar usuarios", new Menu(
            new Option(1,"Añadir usuario"),
            new Option(2,"Borrar usuario"),
            new Option(0,"Volver")));
        menu.options[2] = new Option(0,"Salir");
        return menu;
    }
    static Menu buildUser(){
        Menu menu = new Menu();
        menu.options = new Option[3];
        menu.options[0] = new Option(1,"Películas", new Menu(
            new Option(1,"Casablanca"),
            new Option(2,"El señor de los anillos",new Menu(
                new Option(1,"La comunidad del anillo"),
                new Option(2,"El retorno del rey"),
                new Option(3,"Las dos torres"),
                new Option(0,"Volver")
            )),
            new Option(0,"Volver")));
        menu.options[1] = new Option(2,"Configuracion usuario", new Menu(
            new Option(1,"Cambiar nombre de usuario"),
            new Option(2,"Cambiar password"),
            new Option(0,"Volver")));
        menu.options[2] = new Option(0,"Salir");
        return menu;
    }
}