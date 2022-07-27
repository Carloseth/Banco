package util;

public class acc {
    private int number;
    private String holder;
    private double balance;

    public acc(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public acc(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); //caso a regra de negócio mude, alterar o método deposito apenas.
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public String toString(){
        return 
    }
}