// A 3 Create  class  BankDemo  and  Account(accNum:int,  accType:String,  balance:  double). 
// Implement getter() and setter() method to assign and display data for 3 students.[A]
class Account{
    int accNum;
    String accType;
    double balance;

    public void setter(int accNum, String accType, double balance){
        this.accNum = accNum;
        this.accType = accType;
        this.balance = balance;
    }

    public void getter(){
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class a3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.setter(101123, "Savings", 50156.75);
        a2.setter(102456, "Checking", 15520.50);
        a3.setter(103789, "Business", 255460.00);

        a1.getter();
        a2.getter();
        a3.getter();
    }
}
