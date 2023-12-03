package org.example;

public class Transaction {
    private Account credit;
    private  Account debit;
    private double amount;
    private int id = 100;
    {
        id++;
    }
    private Transaction(Account credit, Account debit, double amount){
        this.credit = credit;
        this.debit = debit;
        this.amount = amount;
    }

    public  static Transaction createTransaction(Account credit, Account debit, double amount) throws  IllegalArgumentException{
        if (credit.getBalance() < amount){
            throw new IllegalArgumentException(String.format("Недостаточно средств на счете для выполнения операции"));
        }
        if (amount < 0){
            throw new IllegalArgumentException("Сумма транзакции не может быть отрицательной");
        }
        credit.setBalance(credit.getBalance() - amount);
        debit.setBalance(debit.getBalance() + amount);
        return new Transaction(credit, debit, amount);
    }
    @Override
    public String toString(){
        return String.format("Транзакция %d на сумму %.2f перевод со счета %d на счет %d", id, amount, credit.getId(), debit.getId());
    }
}
