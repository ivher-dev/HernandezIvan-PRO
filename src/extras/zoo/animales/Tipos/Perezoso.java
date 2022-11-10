package extras.zoo.animales.Tipos;

import extras.zoo.animales.Animal;

public class Perezoso extends Animal {
    private int felicidad, higiene;

    private Perezoso() {
        energia = 60;
        comida = 90;
        agua = 100;
        felicidad = 50;
        higiene = 40;
        nombre = "Perezoso";
    }

    public void mostrarEstadisticas() {
        System.out.println(nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Comida: " + comida);
        System.out.println("Agua: " + agua);
        System.out.println("Felicidad: " + felicidad);
        System.out.println("Higiene: " + higiene);
        System.out.println();
    }

    protected void comer() {
        System.out.println("Está comiendo 5 unidades, los perezosos no tienen la boca muy grande.");
        this.comida += 10;
        if (this.comida > 100) {
            this.comida = 100;
        }
    }

    protected void dormir() {
        System.out.println("Está ganando 20 unidades de energía, los perezosos duermen mucho.");
        this.energia += 20;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    protected void beber() {
        System.out.println("Está bebiendo 10 unidades, los perezosos no tienen la boca muy grande.");
        this.agua += 10;
        if (this.agua > 100) {
            this.agua = 100;
        }
    }

    protected void jugar() {
        System.out.println("Está jugando 15 unidades, a los perezosos les encanta jugar.");
        this.felicidad += 10;
        if (this.felicidad > 100) {
            this.felicidad = 100;
        }
    }

    protected void labar() {
        System.out.println("Está lavando 5 unidades, los perezosos no son muy afines a los baños.");
        this.higiene += 5;
        if (this.higiene > 100) {
            this.higiene = 100;
        }
    }
}
