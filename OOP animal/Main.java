import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese el nombre del mamifero");
        String nom = teclado.next();

        System.out.println("ingresa la edad");
        int edad = teclado.nextInt();

        System.out.println("ingrese el color");
        String color = teclado.next();

        System.out.println("ingresa el pelaje");
        String pelaje = teclado.next();

        Mamifero mamifero = new Mamifero(nom, edad, color, pelaje);

        mamifero.imprimir();

        mamifero.comer();

        System.out.println("ingrese el nuevo color");
        color = teclado.next();
        mamifero.SetColor(color);

        mamifero.imprimir();
    }
}