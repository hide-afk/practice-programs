import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
            "\nWelcome to the FizzBuzz Program!" +
            "\nThis program prints the numbers from 1 to X, but with a twist:" +
            "\n1. If the number is divisible by 3, it will print 'Fizz' instead of the number." +
            "\n2. If the number is divisible by 5, it will print 'Buzz' instead of the number." +
            "\n3. If the number is divisible by both 3 AND 5, it will print 'FizzBuzz!' instead." +
            "\n"
        );

        System.out.print("Please enter the maximum number (X): ");
        int num = sc.nextInt();

        System.out.println("\nHere is your FizzBuzz sequence:");

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz!");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        sc.close();
    }
}
