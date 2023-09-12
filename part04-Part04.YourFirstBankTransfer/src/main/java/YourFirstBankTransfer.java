
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matt_acc = new Account("Matthews account", 1000);
        Account my_acc = new Account("My account", 0);

        matt_acc.withdrawal(100);
        my_acc.deposit(100);
        
        System.out.println(matt_acc);
        System.out.println(my_acc);
    }
}
