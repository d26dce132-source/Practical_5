import java.util.Scanner;

record BankInfo(String name, String branch) {}

enum MenuOption {
    OPEN_ACCOUNT,
    DEPOSIT,
    WITHDRAW,
    TRANSFER,
    EXIT
}

public class MiniBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankInfo bank = new BankInfo("Mini Bank", "Ahmedabad");
        int choice;

        do {

            System.out.println("\n========================");
            System.out.println(bank.name() + " - " + bank.branch());
            System.out.println("========================");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            MenuOption option = switch (choice) {
                case 1 -> MenuOption.OPEN_ACCOUNT;
                case 2 -> MenuOption.DEPOSIT;
                case 3 -> MenuOption.WITHDRAW;
                case 4 -> MenuOption.TRANSFER;
                default -> MenuOption.EXIT;
            };

            switch (option) {

                case OPEN_ACCOUNT ->
                    System.out.println("Open Account - open the account successfully.");

                case DEPOSIT ->
                    System.out.println("Deposit - Deposit successfully ");

                case WITHDRAW ->
                    System.out.println("Withdraw - withdraw successfully");

                case TRANSFER ->
                    System.out.println("Transfer - Tranfer successfully");

                case EXIT ->
                    System.out.println("Thank You! Goodbye.");
            }

        } while (choice != 5);

        sc.close();
    }
}