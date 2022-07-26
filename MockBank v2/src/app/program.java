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
        System.out.println("Account data: ");

    }
}
