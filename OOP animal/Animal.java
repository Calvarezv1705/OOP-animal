public class Animal implements IAnimal {

    private String nom;
    protected int edad;
    protected String color;

    public Animal(String nom, int edad, String color) {
        this.nom = nom;
        this.edad = edad;
        this.color = color;
    }

    public void comer() {

    }

    public void dormir() {

    }

    public void imprimir() {

    }

    public void SetColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nom;
    }
}
