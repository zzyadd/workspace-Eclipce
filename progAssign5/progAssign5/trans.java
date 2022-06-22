package progAssign5;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class trans extends account {
	protected double amount;
	protected double newBalance;
	protected boolean type;
	protected double date;
	// type TRUE for deposit and type FALSE for withDraw;
	// checking TRUE for checking account and checking FALSE for saving account;
	/* public trans(  String name , int accNum ,double balance ,double annualRate ,double amount,  boolean type, double date) {
		super(name , accNum ,balance , annualRate );
		this.amount = amount;
		this.date = date;
		this.type=type;
		if(type) {
		acc.setBalance( balance+ amount); 	}
		else
		{ 
			if(acc.checking) {
			if(amount<= acc.balance){
		acc.setBalance(acc.balance - amount); }	}
		else {
			acc.setBalance(acc.balance - amount); 	}
		}
		this.newBalance=acc.getBalance();	}
	public void setAmount(double amount) {
		this.amount = amount;	}
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;	}
	public void setType(boolean type) {
		this.type = type;	}
	public void setDate(double date) {
		this.date = date;	}
	public double getAmount() {
		return amount;	}
	public double getNewBalance() {
		return newBalance;	}
	public String isType() {
		// type TRUE for deposit and type FALSE for withDraw;
		if(type) {
		return "deposit";
		} else {
		return "withDraw";
		}	}	
	public double getDate() {
		return date;	}
		public boolean tp() {
			return type ;	}

public static void display( ArrayList <trans> tra ,  int size) {
		for(int i = 0 ; i< size; i++ ) {
			System.out.println(tra.get(i).getName()+" Account balance now is : " + tra.get(i).balance );

	System.out.println("Account name is : " +tra.get(i).getName());
	System.out.println(tra.get(i).getName()+" Account Annual inerest rate is : " +tra.get(i).getAnnualRate());
	// System.out.println("Account balance now is : " +acc.getBalance() );

		System.out.println("\n the new transaction on "+tra.get(i).getName()+" account type is : "+ tra.get(i).isType());
		System.out.println("transaction amount on "+tra.get(i).getName()+" account is : " +tra.get(i).getAmount());
		
		System.out.println(tra.get(i).getName()+" new balance is : " +tra.get(i).getNewBalance());
		System.out.println("trans date on "+tra.get(i).getName()+" account is : " +tra.get(i).getDate()+ "\n");
		System.out.println(tra.get(i).getName()+" Account balance now is : " + tra.get(i).getNewBalance());
} */
		}

