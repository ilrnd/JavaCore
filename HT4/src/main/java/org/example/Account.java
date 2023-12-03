package org.example;

public abstract class Account {
    private int id = 1000;
    private double balance;
    {
        id++;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void addDeposit(double amount) throws IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Невозможно внести депозит меньше 0, либо равный 0");
        }
        this.balance += amount;
    }

    public void withdrawal(double amount) throws InsufficientFundsException{
        if(amount > this.balance)
            throw new InsufficientFundsException("Недостаточно средств");
        else
        this.balance -= amount;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract public void printAccountStatus();
}
