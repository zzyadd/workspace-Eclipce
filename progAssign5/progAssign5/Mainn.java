package progAssign5;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Mainn {

	public static void main(String[] args) throws FileNotFoundException, IOException  {
	
		checkingACCount a1 = new checkingACCount("sarah" ,1122 ,1000, 0.015 );
		// saving account  a2
		savingACCount a2 =new savingACCount ("zyad" , 2211 , 500 , 0.11);
		
		
		// trans for saving account a1

	a1.withDraw(5);

	a1.withDraw(4);

	 a1.withDraw(3);

	a1.withDraw(2);

	a1.withDraw(1);

	a1.deposit(10);

	a1.deposit(20);

	a1.deposit(30);

	a1.deposit(40); 

		// trans for checking account a2
	 a2.deposit(50);

	a2.deposit(60);

	a2.deposit(70);

	a2.deposit(80);

	a2.deposit(90);

	a2.withDraw(10);

	a2.withDraw(9);

	a2.withDraw(8);

	a2.withDraw(7);

	a2.withDraw(6);
	
// to string
/*
	try(	FileWriter file = new FileWriter("C:\\Users\\Antr\\Downloads\\trans.txt")) {
	file.write(a1.toString());
	for(int i = 0 ; i < a1.transactions.size() ; i++ ) {
	file.write(a1.display(i));
	}
	file.write(a2.toString());
	for(int i = 0 ; i < a2.transactions.size() ; i++ ) {
	file.write(a2.display(i));
	file.flush();
	file.close();
	}
	}
	catch(IOException e) {
		
	}
	System.out.println("Done");  */
	}

}
