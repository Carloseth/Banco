package app;

import java.util.Locale;
import java.util.Scanner;
import util.acc;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        acc acc; // instance

        System.out.println("Insira o numero da conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite o nome do usuario: ");
        sc.nextLine();
        String usuario = sc.nextLine();

        System.out.println("Depósito inicial (s/n) ?");
        char response = sc.next().charAt(0);

        if(response == 's'){
            System.out.println("Insira o valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            acc = new acc(numero, usuario, depositoInicial);
        }
        else{
            acc = new acc(numero, usuario);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(acc);

        System.out.println("Insira um valor para deposito: " );
        double valorDeposito = sc.nextDouble();
        
        acc.deposit(valorDeposito);
        System.out.println();
        System.out.println("Dados atualizados: ");
        System.out.println(acc);

        System.out.println();
        System.out.println("Insira o valor desejado para saque: " );
        double valorSaque = sc.nextDouble();
        acc.saque(valorSaque);

        System.out.println();
        System.out.println("Dados atualizados: ");
        System.out.println(acc);
        sc.close();
    }
}
