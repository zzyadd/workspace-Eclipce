package progAssign5;
import java.util.*;
import java.io.*;
import java.io.File;
public class checkingACCount extends account {
	
	public checkingACCount() {
		super();
	}
	public checkingACCount(String name , int accNum, double balance, double annualRate) {
		super( name ,  accNum,  balance,  annualRate);
	}
	public double deposit(double money) {
		if(money + this.balance > 100000) {
			System.out.println("U can't deposit more money please check ur blance ");
		} else {
			super.deposit(money);
		}		
		return this.balance;

	}
}
