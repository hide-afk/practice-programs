import java.util.Scanner;

public class WordReverse {

    static Scanner sc = new Scanner(System.in);
    static String word = "";
    static StringBuilder reversed = new StringBuilder();

    public static void inputWord(){
        System.out.print("Please introduce your word to be reversed: ");
        word = sc.nextLine();
    }


    public static void main(String[] args) {
    
    
    System.out.println(
    "\nWellcome to this program called WordReverse!" + 
    "\nThis program will ask you to input a word and it will output the word but reversed ;)" +
    "\nLet's start!\n"
    );

    inputWord();

    while (word.isEmpty()) {
        System.out.print("Invalid word. ");
        inputWord();
    }

    for (int i = word.length() - 1; i >= 0; i--) {
        reversed.append(word.charAt(i));
    }
    
    System.out.println("\nThe word you introduced looks like this when its reversed: " + reversed);
    sc.close();
    }
}
