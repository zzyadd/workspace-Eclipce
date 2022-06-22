package assignment1programming1;

import java.util.Scanner;

public class assignment2ZyadAshrafHafezEX2 {

	public static void main(String[] args) {
				  Scanner sc = new Scanner(System.in);
				  // EX 2
	    System.out.println("write String");
	    String stri = sc.nextLine();
	    int no1 = stri.length();
	    int no2 = (stri.lastIndexOf(" "))+1 ;
	    String print = stri.substring(no2);
	    int no3 = no1-no2 ;
	    System.out.println("The last word is [" + print + "] with length " + no3);

	    
	}

}
