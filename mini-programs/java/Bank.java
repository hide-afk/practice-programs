/*
This program emulates a simple bank account system. You can choose your balance and deposit or withdraw money from it.
I used this program to test my basic knowledge about Java OOP.
*/

public class Bank {

    int balance;
    
    public Bank(int accountBalance){
        balance = accountBalance;
    }

    public void deposit(int depositAmount){
        balance = balance + depositAmount;
        System.out.println("You deposited " + depositAmount + " euros to your account. Actual Balance: " + balance);
        
    }

    public void withdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
        System.out.println("You withdrawn " + withdrawAmount + " euros from your account. Actual Balance: " + balance);
    }
    
    public void checkBalance(){
        System.out.println("Your current balance: " + balance + ".");
    }

    public static void main(String[] args) {
        Bank myAccountBank = new Bank(1000);
        System.out.println("");
        myAccountBank.checkBalance();
        myAccountBank.withdraw(100);
        myAccountBank.deposit(400);
    }
}