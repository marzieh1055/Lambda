package ir.freeland.model;

public class Account {
	private String name;
	private String branch;
	private int balance;
	
	public Account(String name, String branch, int balance) {
		super();
		this.name = name;
		this.branch = branch;
		this.balance = balance;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
    public String toString() {
        return "This is a " + name + " account in branch code " + branch + " with a balance of " + balance + "$" + System.lineSeparator();
    }
	

}
