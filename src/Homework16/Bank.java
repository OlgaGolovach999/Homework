package Homework16;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private Set<Account> accounts;

    public Bank() {
        this.accounts = new HashSet<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccountByNumber(String accountNumber) {
        return accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("Счёт с номером " + accountNumber + " не найден", "not.found.account"));
    }

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма перевода должна быть больше 0");
        }

        Account fromAccount = findAccountByNumber(accountNumberFrom);
        Account toAccount = findAccountByNumber(accountNumberTo);

        if (!fromAccount.getCurrency().equals("BYN") || !toAccount.getCurrency().equals("BYN")) {
            throw new IllegalArgumentException("Перевод возможен только в белорусских рублях (BYN)");
        }

        if (fromAccount.getBalance() < amount) {
            throw new NotEnoughMoneyException("Недостаточно средств на счёте " + accountNumberFrom, "not.enough.money");
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        System.out.println("Перевод " + amount + " BYN со счёта " + accountNumberFrom + " на счёт " + accountNumberTo + " выполнен успешно.");
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}