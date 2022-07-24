package app;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Account_main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account myAccount = new Account();
        //valor inicial (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");
        String theName = sc.nextLine(); // lendo a linha digitada
        myAccount.setName(theName); // inserindo theName em myAccount
        System.out.println();

        System.out.printf("Name updated in object is: %s%n", myAccount.getName());
        
        sc.close();

    }
}