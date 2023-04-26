import java.util.Scanner;

public class ATMTransactionSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean transaction = true;
        
        // Welcome message
        System.out.print("ATM TRANSACTION SYSTEM!|\n");
        
        // Prompt user to press enter to start transaction
        System.out.print("Press enter to start transaction : ");
        String pressEnter = input.nextLine();
        
        // Display options
        System.out.print("1.) Withdraw\n");
        System.out.print("2.) Deposit\n");
        System.out.print("3.) About\n");
        System.out.print("4.) Exit\n");
        
        // Prompt user for their choice
        System.out.print("Enter your choice here : ");
        int choice = input.nextInt();
        
        // Handle user's choice using a switch statement
        switch(choice){
            case 1: // Withdraw
                // Prompt user for their PIN
                System.out.print("Enter your pin here : ");
                int pin = input.nextInt();
                
                // Set initial balance to 20000
                int balance = 20000;
                
                // Prompt user for the amount they want to withdraw
                System.out.print("Enter how much money you want to withdraw : P ");
                int withdraw = input.nextInt();
                
                // Calculate the new total balance after the withdrawal
                int totalBalance = balance - withdraw;
                
                // Display withdrawal success message and new balance
                System.out.print("P " + withdraw + " has successfully been withdrawn!\n");
                System.out.print("Total Balance : P " + totalBalance + "\n");
                break;
                
            case 2: // Deposit
                // Prompt user for their PIN
                System.out.print("Enter your pin here : ");
                int depositPin = input.nextInt();
                
                // Prompt user for the amount they want to deposit
                System.out.print("Enter how much money you want to deposit : P ");
                int deposit = input.nextInt();
                
                // Set initial balance to 20000
                int depositBalance = 20000;
                
                // Calculate the new total balance after the deposit
                int total = deposit + depositBalance;
                
                // Display deposit success message and new balance
                System.out.print("P " + deposit + " has successfully been deposited!\n");
                System.out.print("Total Balance : P " + total + "\n");
                break;
                
            case 3: // About
                // Display information about the ATM transaction system
                System.out.print("Welcome to our ATM transaction system! Our system is designed to make your banking\nexperience as smooth and hassle-free as possible. With our user-friendly interface, you can\neasily withdraw cash, deposit money, transfer funds, and check your account balance.\n");
                break;
                
            case 4: // Exit
                // Display exit message
                System.out.print("\n\n---EXITING---");
                break;
                
            default: // Invalid choice
                // Display error message for invalid choice
                System.out.print("\n\nINVALID CHOICE!\n");
        }
      
    }
}
              
