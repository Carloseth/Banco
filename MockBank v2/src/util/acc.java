package util;

public class acc {
    private int numero;
    private String usuario;
    private double saldo;

    public acc(int numero, String usuario){
        this.numero = numero;
        this.usuario = usuario;
    }

    public acc(int numero, String usuario, double valorDeposito){
        this.numero = numero;
        this.usuario = usuario;
        deposit(valorDeposito); //caso a regra de negócio mude, alterar o método deposito apenas.
    }
    
    public void deposit(double amount){
        saldo += amount;
    }
    public void saque(double amount){
        saldo -= amount;
    }
    
    public int getnumero() {
        return numero;
    }

    public String getusuario() {
        return usuario;
    }
    
    public double getsaldo() {
        return saldo;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    public String toString(){
        return "conta: " + numero + ", "     
            + "usuario: " + usuario +  ", " 
            + "saldo: $" + String.format("%.2f", saldo) ;
    }
}