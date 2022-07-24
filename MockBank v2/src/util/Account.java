package util;

public class Account {
    private double balance;
    private String name; // variavel de instancia

    public double getBalance(double balance)
    {
        this.balance = balance;
        return balance;
    }
    //metodo para definir o nome no obj
    public void setName(String name)
    {
        this.name = name; //armazena o nome
    }
    //metodo para recuperar o nome do obj
    public String getName()
    {
        return name; //retorna o valor do nome
    }

}
