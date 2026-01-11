import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 6789;
        double balance = 5000;

        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if(enteredPin != pin) {
            System.out.println("Wrong PIN!");
            return;
        }

        while(true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    balance += dep;
                    System.out.println("Amount Deposited!");
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    double wd = sc.nextDouble();
                    if(wd > balance)
                        System.out.println("Insufficient balance!");
                    else {
                        balance -= wd;
                        System.out.println("Amount Withdrawn!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
