package ir.freeland.Application;

import ir.freeland.Service.AccountOperations;
import ir.freeland.model.Account;

import java.util.ArrayList;
import java.util.List;

public class AccountApplication {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Alice", "t1", 50));
        accounts.add(new Account("Alex", "t2", 20));
        accounts.add(new Account("Anna", "t3", 5));
        accounts.add(new Account("Bob", "t4", 15));
        accounts.add(new Account("Ava", "t5", 100));
        List<Account> upperCaseAccounts = AccountOperations.convertNamesToUpperCase(accounts);
        System.out.println("Accounts with uppercase names:");
        upperCaseAccounts.forEach(System.out::println);
        List<Account> filteredAccounts = AccountOperations.filterAccounts(accounts);
        System.out.println("\nFiltered accounts (balance > 10 and name starts with 'A'):");
        filteredAccounts.forEach(System.out::println);
    }
}
