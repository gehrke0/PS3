package base;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private double funds;

	public Account() {
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void withdraw(double moneyWithdrawn) throws InsufficentFundsException {

		if (balance>= moneyWithdrawn){
			balance = balance - moneyWithdrawn;
		}
		else{
			double funds = balance;
			throw new InsufficentFundsException(funds);
		}
	}

	public void deposit(double moneyDeposited) {
		balance = balance + moneyDeposited;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

}