import java.util.Scanner;

public class OddEven {

    public static boolean isOddOrEven(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
            "\nWelcome to the Odd or Even Program!" +
            "\nThis program will tell you if a number is odd or even!"
        );

        System.out.print("Please, type the number you want to check: ");
        int num = sc.nextInt();
        
        if (isOddOrEven(num)) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }


        sc.close();
    }
}
