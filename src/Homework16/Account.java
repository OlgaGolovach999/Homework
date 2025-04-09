package Homework16;

import java.util.Objects;

public class Account {
    private int id;
    private String accountNumber;
    private String currency;
    private double balance;

    public Account(int id, String accountNumber, String currency, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return id == account.id &&
                accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }

    @Override
    public String toString() {
        return "Счёт{" +
                "ID=" + id +
                ", Номер='" + accountNumber + '\'' +
                ", Валюта='" + currency + '\'' +
                ", Баланс=" + balance +
                '}';
    }
}