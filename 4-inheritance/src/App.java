import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {
        
        Account acc = new Account(1001, "Alex", 0.0); // erro porque classe agora é abstrata
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // Upcasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
        
        // Downcasting

        // acc2.loan(100.0); // é do tipo Account, não tem método loan()
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // @Override

        Account acc6 = new Account(1006, "Pedro", 1000.0); // erro porque classe agora é abstrata
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance()); // output: 795.0

        Account acc7 = new SavingsAccount(1007, "João", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance()); // output: 800.0

        Account acc8 = new BusinessAccount(1008, "Laura", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance()); // output: 793.0

        // Polymorphism

        Account x = new Account(1020, "Alex", 1000.0); // erro porque classe agora é abstrata
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance()); // output: 945.0
        System.out.println(y.getBalance()); // output: 950.0

        // abstract class Account

        List<Account> list = new ArrayList<>();
        
        list.add(new SavingsAccount(1, "Nome A", 500.0, 0.01));
        list.add(new BusinessAccount(2, "Nome B", 1000.0, 400.0));
        list.add(new SavingsAccount(3, "Nome C", 300.0, 0.01));
        list.add(new BusinessAccount(4, "Nome D", 500.0, 500.0));

        double sum = 0.0;
        for (Account accou : list){
            sum += accou.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum); // output: 2300

    }

}
