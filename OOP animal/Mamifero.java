public class Mamifero extends Animal {

    private String pelaje;

    public Mamifero(String nom, int edad, String color, String pelaje) {
        super(nom, edad, color);
        this.pelaje = pelaje;
    }

    public void comer() {

    }

    public void dormir() {

    }

    public void imprimir(Animal animal) {
        System.out.println(animal.getNombre());
        System.out.println(edad);
        System.out.println(color);
        System.out.println(pelaje);
    }
}
