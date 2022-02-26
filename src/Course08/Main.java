package Course08;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.displayBankAccount();

        BankAccount bankAccount2 = new BankAccount("Andrei Bumbi");
        bankAccount2.displayBankAccount();

        BankAccount bankAccount3 = new BankAccount("Andrei", "Bumbaru", 2000);
        bankAccount3.displayBankAccount();

        BankAccount bankAccount4 = new BankAccount(200000);
        bankAccount4.displayBankAccount();
    }
}
