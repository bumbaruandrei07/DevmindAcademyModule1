package Course08;

/*
 ! Foloseste urmatoarele valori default in constructori, astfel incat sa initializezi fiecare camp in cazul in care nu se da o valoare de initializare ca parametru:
Camp	Valoare default
firstName	UNKNOWN_FIRST_NAME
lastName	UNKNOWN_LAST_NAME
accountBalance	0


 ! Sa se evite duplicarea implementarii constructorilor utilizand keyword-ul this !


 */


public class BankAccount {

    private String firstName;
    private String lastName;
    private int accountBalance;

    private static String bankSWIFT;

    public void initializeBankAccount(String personFirstName, String personLastName,
                                      int initialAccountBalance) {
        firstName = personFirstName;
        lastName = personLastName;
        accountBalance = initialAccountBalance;
    }

    public BankAccount(String firstName, String lastName, int accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountBalance = accountBalance;
    }

    public BankAccount() {
        this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", 0);
    }

    public BankAccount(String fullname) {
        this(fullname, fullname, 0);
    }

    public BankAccount(int accountBalance) {
        this("UNKNOWN_FIRST_NAME", "UNKNOWN_LAST_NAME", accountBalance);
    }

    public void displayBankAccount() {
        System.out.println("First name is : " + firstName + "\n" + "Last name is: " + lastName + "\n" + "The account balance is: " + accountBalance);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setFullName(String personFirstName, String personLastName) {
        firstName = personFirstName;
        lastName = personLastName;
    }

    public boolean debitAccount(int amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return true;
        }
        return false;
    }

    public void creditAccount(int amount) {
        accountBalance += amount;
    }

    protected void adminBlockAccount() {
        accountBalance = -1;
    }

    public static String getBankSWIFT() {
        return bankSWIFT;
    }

    public static void setBankSWIFT(String newBankSWIFT) {
        bankSWIFT = newBankSWIFT;
    }
}

