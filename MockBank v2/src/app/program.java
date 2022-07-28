package app;

import java.util.Locale;
import java.util.Scanner;
import util.acc;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        acc acc; // instance

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there a deposit initial? (y/n) ?");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            acc = new acc(number, holder, initialDeposit);
        }
        else{
            acc = new acc(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acc);

        System.out.println("Enter a deposit value: " );
        double depositValue = sc.nextDouble();
        acc.deposit(depositValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(acc);

        System.out.println();
        System.out.println("Enter a withdraw value: " );
        double withdrawValue = sc.nextDouble();
        acc.withdraw(withdrawValue);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(acc);
    }
}
