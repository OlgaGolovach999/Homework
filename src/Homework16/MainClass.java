package Homework16;

public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new Account(1, "100001", "BYN", 1500.0));
        bank.addAccount(new Account(2, "100002", "BYN", 2300.0));
        bank.addAccount(new Account(3, "100003", "BYN", 5000.0));
        bank.addAccount(new Account(4, "100004", "BYN", 750.0));
        bank.addAccount(new Account(5, "100005", "BYN", 1200.0));

        System.out.println("Счета в банке:");
        for (Account account : bank.getAccounts()) {
            System.out.println(account);
        }

        System.out.println("\nПопытка перевода средств...");

        try {
            bank.transferMoney("100001", "100002", 500.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        try {
            bank.transferMoney("999999", "100002", 500.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }

        try {
            bank.transferMoney("100004", "100003", 2000.0);
        } catch (AccountNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Откройте счёт в нашем банке для выполнения переводов.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Ошибка: " + e.getMessage() + " Код ошибки: " + e.getErrorCode());
            System.out.println("Недостаточно средств для перевода.");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка.");
        }
    }
}