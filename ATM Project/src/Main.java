import org.atmproject.Account;
import org.atmproject.Authentication;
import org.atmproject.TransactionManager;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("user1", 3547589, 46228, 5300);
        Authentication auth1 = new Authentication();
        auth1.addAccount(account1.getAccountNumber(), 3428);
        TransactionManager tm1 = new TransactionManager(account1, auth1);

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("Choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    amount = scanner.nextDouble();
                    tm1.performTransaction("WithDraw", amount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    amount = scanner.nextDouble();
                    tm1.performTransaction("Deposit", amount);
                    break;
                case 3:
                    tm1.performTransaction("CheckBalance", 0);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
