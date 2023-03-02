import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 1000; // initial balance
        
        while (true) {
            System.out.println("Welcome to the ATM. Select an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Your balance is " + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    int amount = input.nextInt();
                    if (amount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        balance -= amount;
                        System.out.println("Withdrawal successful");
                        System.out.println("Your new balance is " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to deposit:");
                    int deposit = input.nextInt();
                    balance += deposit;
                    System.out.println("Deposit successful");
                    System.out.println("Your new balance is " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            }
        }
    }
}
