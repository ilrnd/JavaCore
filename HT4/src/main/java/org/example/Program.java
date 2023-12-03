/**
 * 1. Создать программу управления банковским счетом (Account).
 * Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств.
 * При этом она должна обрабатывать следующие исключительные ситуации:
 * Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
 * Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
 * Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.
 * Продемонстрируйте работу вашего приложения:
 * Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.
 * 2. Создать несколько типов счетов, унаследованных от Account, например: CreditAcciunt, DebitAccount.
 * Создать класс (Transaction), позволяющий проводить транзакции между счетами (переводить сумму с одного счета на другой)
 * Класс Transaction должен возбуждать исключение в случае неудачной попытки перевести деньги с одного счета на другой.
 * Продемонстрируйте работу вашего приложения:
 * Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.
 */
package org.example;

public class Program {
    public static void main(String[] args) {
        DebitAccount debitAccount = null;
        CreditAccount creditAccount = null;
        double startBalance = 10000; // начальный баланс счета
        double depositAmount = 5000; // сумма депозита
        double withdrawalAmount = 5000; // сумма снятия
        double creditLimit = 10000; // кредитный лимит

        try {
            debitAccount = debitAccount.createDebitAccount(startBalance);
            System.out.printf("Дебетовый счет %d успешно открыт, баланс: %.2f рублей\n", debitAccount.getId(), debitAccount.getBalance());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            debitAccount.addDeposit(depositAmount);
            System.out.printf("Депозит успешно пополнен на %.2f рублей\n", depositAmount);
            debitAccount.printAccountStatus();
        } catch (NullPointerException e) {
            System.out.println("Нет активного счета");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            debitAccount.withdrawal(withdrawalAmount);
            System.out.printf("Выдано %.2f рублей\n", withdrawalAmount);
            debitAccount.printAccountStatus();
        }catch (NullPointerException e){
            System.out.println("Нет активного счета");
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

        try {
            creditAccount= CreditAccount.createCreditAccount(startBalance, creditLimit);
            System.out.printf("Кредитный счет %d успешно открыт, баланс: %.2f рублей, кредитный лимит %.2f рублей\n", creditAccount.getId(), creditAccount.getBalance(), creditAccount.getCreditLimit());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        Transaction transaction1 = null;
        try {
            transaction1 = Transaction.createTransaction(debitAccount, creditAccount, 10000);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

       if (transaction1 != null){
           System.out.println(transaction1);
       }
    }
}