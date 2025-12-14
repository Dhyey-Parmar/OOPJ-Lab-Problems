// A 3 Write  a  Java  program  to  create  a  class  called  BankAccount  with  instance  variables 
// 'accountNo' and balance, and static variables bankName and interestRate. Implement 
// static methods to get and set the static variables. Create three BankAccount objects and 
// print their details along with the static variables. [A]

class BankAccount {
    int accountNo;
    double balance;
    static String bankName = "ABC Bank";
    static double interestRate = 4.5;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + getBankName());
        System.out.println("Interest Rate: " + getInterestRate());
        System.out.println();
    }
}

public class a3 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, 5000.0);
        BankAccount acc2 = new BankAccount(1002, 10000.0);
        BankAccount acc3 = new BankAccount(1003, 7500.0);

        acc1.printDetails();
        acc2.printDetails();
        acc3.printDetails();
    }
}