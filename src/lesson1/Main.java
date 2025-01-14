package lesson1;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(50, "John Doe");
        System.out.println(myAccount);

        myAccount.deposit(10);
        System.out.println(myAccount);

        myAccount.withdraw(30);
        System.out.println(myAccount);

        myAccount.changeOwner("Jane Doe");
        System.out.println(myAccount);

        myAccount.setInterestRate(2.5);
        System.out.println(myAccount);

        myAccount.addInterest();
        System.out.println(myAccount);
    }
}