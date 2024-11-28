import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(
            "\nWelcome to the Prime Program!" +
            "\nThis program will tell you if a number is prime or not!"
        );

        System.out.print("Please, type the number you want to check: ");
        int num = sc.nextInt();
        
        if (isPrime(num)) {
            System.out.println("This number is prime!");
        } else {
            System.out.println("This number is not prime!");
        }


        sc.close();
    }
}
