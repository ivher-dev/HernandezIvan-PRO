package extras.zoo.animales.Tipos;

import extras.zoo.animales.Animal;

public class Jirafa extends Animal {
    public Jirafa() {
        energia = 10;
        comida = 80;
        agua = 90;
        nombre = "Jirafa";
    }

    public void mostrarEstadisticas() {
        System.out.println(nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Comida: " + comida);
        System.out.println("Agua: " + agua);
        System.out.println();
    }

    protected void beber() {
        System.out.println("Está bebiendo 5 unidades, las jirafas tienen la boca enana.");
        this.agua += 5;
        if (this.agua > 100) {
            this.agua = 100;
        }
    }
}
