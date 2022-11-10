package extras.zoo.animales;

public abstract class Animal {
    protected int energia, comida, agua;
    protected String nombre;

    protected boolean necesitaCuidado() {
        if (this.energia == 100 && this.comida == 100 && this.agua == 100) {
            return false;
        }
        return true;
    }

    protected void comer() {
        System.out.println("Está comiendo 10 unidades, lo general.");
        this.comida += 10;
        if (this.comida > 100) {
            this.comida = 100;
        }
    }

    protected void dormir() {
        System.out.println("Está ganando 10 unidades de energía, lo general.");
        this.energia += 10;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    protected abstract void beber();

    protected abstract void mostrarEstadisticas();
}