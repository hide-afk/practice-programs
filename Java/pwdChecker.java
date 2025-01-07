import java.util.Scanner; // Import Scanner library

public class pwdChecker {

    public static Scanner sc = new Scanner(System.in); // Initializing the Scanner

    // Creating 4 booleans to determine the 4 requirements for a strong password
    public static boolean eightChar = false;
    public static boolean hasUpper = false;
    public static boolean hasLower = false;
    public static boolean hasSpecialChar = false;

    public static String password = "";

    public static void main(String[] args) {

        // Program explanation
        System.out.println(
        "\nHey there! This is a strong password checker, this program will check if the password meets the following security requirements:\n" +
        "- At least 8 characters\n" +
        "- At least 1 uppercase letter\n" +
        "- At least 1 lowercase letter\n" +
        "- At least 1 special character");

        checkPasswordStrength();
    }

    // This function asks the user to input a password to check if it's a strong
    // password, checking the 4 conditions. If one condition is not true, the
    // function will print a message with the reason
    public static void checkPasswordStrength() {

        // Resetting the four conditions to false
        eightChar = false;
        hasUpper = false;
        hasLower = false;
        hasSpecialChar = false;

        // Asks the user to input a password
        System.out.print("\nPlease, enter a password to see if it's strong: ");
        password = sc.nextLine();

        // If the password is at least 8 characters long, turn the condition into true
        if (password.length() >= 8) {
            eightChar = true;
        }

        // Loop to check the other 3 conditions
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (Character.isUpperCase(character)) {
                hasUpper = true;
            }

            if (Character.isLowerCase(character)) {
                hasLower = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialChar = true;
            }
        }

        // Checks if the 4 conditions are true
        if (eightChar && hasUpper && hasLower && hasSpecialChar) {
            System.out.println("\nYour password is strong!"); // Inform the user that the password meets all the
                                                              // requirements
            askToRetry();

        } else { // If one or more conditions are false, store the reasons in a string
            String reason = "";

            if (!eightChar) {
                reason += "- Less than 8 characters\n";
            }
            if (!hasUpper) {
                reason += "- Missing uppercase letter\n";
            }
            if (!hasLower) {
                reason += "- Missing lowercase letter\n";
            }
            if (!hasSpecialChar) {
                reason += "- Missing special character\n";
            }

            // Display the unmet conditions
            System.out.println("Your password is weak:\n" + reason);

            askToRetry();
        }
    }

    // Check the user's decision. If they want to try another password, call the
    // checkNum function. Otherwise, close the scanner and exit the program.
    private static void askToRetry() {

        System.out.println("Would you like to try again? (y/n)");
        String userDecision = sc.nextLine();

        if (userDecision.equals("y")) {
            checkPasswordStrength();
        } else if (userDecision.equals("n")) {
            sc.close();
            System.out.println("Closing the program...");
            System.exit(0);
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'.");
            askToRetry();
        }
    }

}
