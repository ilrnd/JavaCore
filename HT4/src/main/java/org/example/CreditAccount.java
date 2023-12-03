package org.example;

public class CreditAccount extends Account{
    private int id = 3000;
    private double creditLimit;

    {
        id++;
    }
    private CreditAccount(double balance, double creditLimit) {
        super(balance + creditLimit);
        this.creditLimit = creditLimit;
    }

    public static CreditAccount createCreditAccount(double balance, double creditLimit) throws IllegalArgumentException{
        if(balance < 0)
            throw new IllegalArgumentException("Начальный балланс не может быть отрицательным");
        if(creditLimit < 0)
            throw  new IllegalArgumentException("Кредитный лимит не может быть меньше нуля");
        return new CreditAccount(balance, creditLimit);
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void printAccountStatus() {
        System.out.printf("Баланс вашего счета %d %.2f: \n", id, getBalance());
    }
}
