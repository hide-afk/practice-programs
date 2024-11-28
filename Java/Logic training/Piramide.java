import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Pyramid Printer!");
        System.out.println("This program will print a pyramid and an inverted pyramid made of stars (*).");
        System.out.print("Please enter a positive number to define the height of the pyramid: ");
        int lineas = sc.nextInt();


        // Pirámide normal
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pirámide invertida
        for (int i = lineas - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
