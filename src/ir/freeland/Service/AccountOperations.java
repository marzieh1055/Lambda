package ir.freeland.Service;

import ir.freeland.model.Account;

import java.util.List;
import java.util.stream.Collectors;

public class AccountOperations {

	public static List<Account> convertNamesToUpperCase(List<Account> accounts) {
		return accounts.stream().peek(account -> account.setName(account.getName().toUpperCase()))
				.collect(Collectors.toList());
	}

	public static List<Account> filterAccounts(List<Account> accounts) {
		return accounts.stream().filter(account -> account.getBalance() > 10 && account.getName().startsWith("A"))
				.collect(Collectors.toList());
	}
}
