package dataStractureProgecySemTwo;
import java.util.*;
public class objectTasks {
	  Scanner sc = new Scanner(System.in);
	  public boolean busy = true ;
	  public int index , num1 , num2;
	  public int num3 = num1 + num2 ;
	  public objectTasks() {
			this.index = 0;
			this.num1 = 0;
			this.num2 = 0;
			this.num3 = 0;	}
	public objectTasks(  int num1, int num2) {
		//this.index = ind;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 =  num1 + num2;	}
public int getIndex() {
	return index;	}
public void setIndex(int index) {
	this.index = index;	}
public int getNum1() {
	return num1;	}
public void setNum1(int num1) {
	this.num1 = num1;	}
public int getNum2() {
	return num2;	}
public void setNum2(int num2) {
	this.num2 = num2;	}

public int getNum3() {
	return num3;	}
public void setNum3(int num3) {
	this.num3 = num3;	}


}