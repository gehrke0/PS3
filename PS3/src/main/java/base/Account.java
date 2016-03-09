package base;

import java.util.Date;

public class Account{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	private double getAnnualInterestRate() {
		return annualInterestRate;
	}
	private void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	private Date getDateCreated() {
		return dateCreated;
	}
	private void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Account(){}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	public double withdraw(double moneyWithdrawn){
		
		return balance - moneyWithdrawn;
	}
	public double deposit(double moneyDeposited){
		return balance + moneyDeposited;
	}
}