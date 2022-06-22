package progAssign5;
import java.util.*;
import java.util.*;
import java.io.*;
import java.io.File;
public class account {
	Scanner scanner = new Scanner(System.in);
	 // type TRUE for deposit and type FALSE for withDraw;
	ArrayList<account> transactions;
	protected String name;
	protected double newBalance;
	protected int accNum;
	protected double  balance;
	protected double annualRate;
	protected Date dateCreat;
	protected char type ;
	protected double amount;
public account(){
	name=null;
	accNum = (int)(Math.random()*1000);
	balance = 0.0 ;
	annualRate= 0;
	dateCreat= new Date();
}

public account(String name , int accNum, double balance, double annualRate) {
	this.name = name;
	this.accNum = accNum;
	this.balance = balance;
	this.annualRate = annualRate;
	this.dateCreat = new Date();
	transactions = new ArrayList<account>();


}
public account(account acc, double amount ,char type , double newBalanc) {
	// TODO Auto-generated constructor stub
	this.name = acc.name;
	this.accNum = acc.accNum;
	this.balance = acc.balance;
	this.annualRate = acc.annualRate;
	this.dateCreat = new Date();
	this.amount = amount;
	this.type=type;
	this.newBalance= newBalanc ;

}

public double  deposit(double amount) {
	this.setBalance(balance+= amount);
	this.setAmount(amount);
	this.type = 'D';
	this.dateCreat = new Date();
	this.setNewBalance(this.getBalance());
	this.transactions.add(new account(this, amount , type , newBalance));
	return (this.balance);
}
public double withDraw(double amount) {
	this.setBalance(this.balance-amount) ;
	this.setAmount(amount); ;
	this.type = 'W';
	this.dateCreat = new Date();
	this.setNewBalance(this.getBalance());
	this.transactions.add(new account(this, amount , type , newBalance));
			return this.balance;	
	}


public double getNewBalance() {
	return newBalance;	}
public void setNewBalance(double newBalance) {
	this.newBalance = newBalance;}
public char getType() {
	return type;	}
public void setType(char type) {
	this.type = type;	}
public String getName() {
	return name;	}
public void setName(String name) {
	this.name = name;	}
public int getAccNum() {
	return accNum;	}
public void setAccNum(int accNum) {
	this.accNum = accNum;	}
public double getBalance() {
	return balance;	}
public void setBalance(double balance) {
	this.balance = balance;	}
public double getAnnualRate() {
	return annualRate;	}
public void setAnnualRate(double annualRate) {
	this.annualRate = annualRate;	}
public void setDateCreat(Date dateCreat) {
	this.dateCreat = dateCreat;	}
public String toString() {
	return ("Account Name is "+ this.name + " \n Accoumt Number is "+ this.accNum + "\n Account Balance is :"+ this.balance+ "\n Account AnnualRate is "+ annualRate +"% \n Account Date is "+dateCreat);
}

public double getAmount() {
	return amount;	}

public void setAmount(double amount) {
	this.amount = amount;	}
public Date getDateCreat() {
	return dateCreat;	}
public String isType() {
	// type TRUE for deposit and type FALSE for withDraw;
	if(type=='D') {
	return "deposit";
	} else {
	return "withDraw";
	}	}

public String display(int i) {
return ("\n Account name is : " +this.transactions.get(i).getName()+"\n the new transaction  type is : "+ this.transactions.get(i).isType()+"\n transaction amount is : " +this.transactions.get(i).getAmount()+"\n"+this.transactions.get(i).getName()+" Account new balance now is : " + this.transactions.get(i).getBalance()+"\n");
}
	
// on "+this.transactions.get(i).getName() +" account
}

