import java.util.Scanner;

public class Palindrome {

    static Scanner sc = new Scanner(System.in);
    static String word = "";

    public static void inputWord() {
        word = "";
        System.out.print("\nPlease, introduce a word or a phrase: ");
        word = sc.nextLine();
    }

    public static void isPalindrome() {
        String reversedWord = "";
        for (int i = (word.length() - 1); i >= 0; i--) {
            reversedWord += word.charAt(i);
        }

        if (reversedWord.equalsIgnoreCase(word)) {
            System.out.println(word + " is a palindrome :D");
        } else {
            System.out.println(word + " is not a palindrome :(");
        }
        word = "";
        reversedWord = "";
        repeat();
    }

    public static void execute(){
        inputWord();
        isPalindrome();
    }

    public static void repeat(){

        System.out.println(
        "\nWant to check another word/phrase/sequence?" +
        "\n1) Yes" +
        "\n2) No\n" +
        "Choose an option (1 or 2): "
        );
        int option = sc.nextInt();
        sc.nextLine();
        if (option == 1) {
            execute();
        } else if (option == 2){
            System.out.println("Program closed succesfully ;)");
            System.exit(0);
        } else{
            System.out.println("\nPlease, introduce a valid option (1 or 2).");
            repeat();
        }
    }


    public static void main(String[] args) {

        System.out.println(
                "\nWellcome to this program called Palindrome!" +
                        "\nThis program will ask you to input a sentence or a word, and it will answer if its a palindrome or not"
                        +
                        "\nA palindrome is a word, phrase, or sequence that reads the same backwards as forwards, e.g. madam or 'nurses run'"
                        +
                        "\nLet's start!\n");

        
        execute();

        sc.close();
    }
}
