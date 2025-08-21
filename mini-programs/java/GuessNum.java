import java.util.Scanner;

public class GuessNum {
    public static Scanner sc = new Scanner(System.in);
    public static int numToGuess = 0;
    public static int numberSelected = 0;
    public static int tries = 5;

    public static int generateNum(){
        System.out.println("Random number generated! Try to guess it :P (if you can, hehe)");
        numToGuess = (int) (Math.random() * 100);
        return numToGuess;
    }

    public static int chooseNum(){
        System.out.print("Choose a number: ");
        numberSelected = sc.nextInt();
        return numberSelected;
    }

    public static void checkNum(){
        if (tries > 0){
            chooseNum();
            if (numberSelected == numToGuess) {
                System.out.println("Correct!");
                System.exit(0);
            } else if (numberSelected > numToGuess){
                tries -= 1;
                System.out.println("Incorrect! Try a lower number ;), " + tries + " remaining attempts");
                checkNum();
            } else if (numberSelected < numToGuess){
                tries -= 1;
                System.out.println("Incorrect! Try a higher number ;), " + tries + " remaining attempts");
                checkNum();
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println(
            "Wellcome to the GuessNum program!" +
            "\nThis program will generate a random number between 1 and 100, you have to guess it in 5 or less tries.\n"
        );

        generateNum();
        checkNum();

        sc.close();
    }
}
