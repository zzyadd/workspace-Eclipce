package progAssign5;
import java.util.*;
import java.io.*;
import java.io.File;
public class savingACCount extends account{
public savingACCount() {
	super();
}
public savingACCount(String name , int accNum, double balance, double annualRate) {
	super( name ,  accNum,  balance,  annualRate);
}
public double withDraw(double money) {
	if(money > this.balance) {
		System.out.println("U can't WITHDRAW this money please check ur blance ");
	} else {
		super.withDraw(money);
	}		return this.balance;

}
}
