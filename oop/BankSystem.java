class Customer {

    private String name;
    private String email;
    private String mobile;
    private final String customerId;

    private static int customerCounter = 101;

    private static String generateCustomerId() {
        return "CUST" + customerCounter++;
    }

    Customer(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.customerId = generateCustomerId();
    }

    public String getCustomerId() {
        return customerId;
    }
}

class Account {

    private final String accountNumber;
    private String ownerName;
    private long balance;
    private boolean active;

    private static int counter = 1;

    private static String generateAccountNumber() {
        return "AC000" + counter++;
    }

    Account(String ownerName, long balance) {
        this.accountNumber = generateAccountNumber();
        this.ownerName = ownerName;
        this.balance = balance;
        active = true;
    }

    Account(String ownerName) {
        this(ownerName, 0);
    }

    public void deposit(long amount) {
        balance = balance + amount;
    }

    public boolean withdraw(long amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public long getBalance() {
        return balance;
    }
}

public class BankSystem {

    public static void main(String[] args) {

        Customer c1 = new Customer("Rahul", "rahul@gmail.com", "9876543210");

        Account[] a = new Account[3];

        a[0] = new Account("Rahul", 1000);
        a[1] = new Account("Priya");
        a[2] = new Account("Amit", 500);

        a[0].deposit(500);
        a[1].deposit(1000);
        a[2].withdraw(200);

        for (int i = 0; i < 3; i++) {
            System.out.println("Account No : " + a[i].getAccountNumber());
            System.out.println("Owner      : " + a[i].getOwnerName());
            System.out.println("Balance    : " + a[i].getBalance());
            System.out.println();
        }
    }
}