package extras.zoo.animales.Tipos;

import extras.zoo.animales.Animal;

public class Delfin extends Animal {
    private int oxigeno;

    public Delfin() {
        energia = 50;
        comida = 60;
        agua = 70;
        oxigeno = 50;
        nombre = "Delfin";
    }

    public void mostrarEstadisticas() {
        System.out.println(nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Comida: " + comida);
        System.out.println("Agua: " + agua);
        System.out.println("Oxigeno: " + oxigeno);
        System.out.println();
    }

    protected void beber() {
        System.out.println("Los delfines viven en el agua, no necesitan pararse a beber.");
        this.agua += 10;
        if (this.agua > 100) {
            this.agua = 100;
        }
    }

    private void respirar() {
        System.out.println("Está respirando 50 unidades, los delfines no tienen bránqueas.");
        this.oxigeno += 10;
        if (this.oxigeno > 100) {
            this.oxigeno = 100;
        }
    }
}
