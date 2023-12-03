package org.example;

public class DebitAccount extends Account{
    private int id = 4000;
    {
        id++;
    }

    private DebitAccount(double balance) {
        super(balance);
    }

    public static DebitAccount createDebitAccount(double balance) throws IllegalArgumentException{
        if(balance < 0)
            throw new IllegalArgumentException("Начальный балланс не может быть отрицательным");
        return new DebitAccount(balance);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void printAccountStatus(){
        System.out.printf("Баланс вашего счета %d %.2f:\n", id, getBalance());
    }
}
