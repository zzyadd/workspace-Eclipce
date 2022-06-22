package assignment1programming1;
import java.util.*;
      public class sec3programming {
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cc = new Scanner (System.in);
     int x  ;
	 System.out.println("plz enter no");
	 x=cc.nextInt();
	 if(x%2 ==0) 
     System.out.println(x+" \t is even");
    	else 
		System.out.println(x+"\t is odd");
	 //EX:2
	 System.out.println("plz enter anthor no");
	 int y=cc.nextInt();

	 System.out.println("random value is");
	 int z = (int) ((Math.random())*100);
	 System.out.println(z);
	 if (y>z)
		System.out.println("y is greater  " +z);
	   else
		System.out.println("y is smaller than  "+ z);
     //EX:3
	 System.out.println("aX^X + bX + c");
	 System.out.println("plz enter the value a ");
	 int a=cc.nextInt();
	 System.out.println("plz enter the value b ");
	 int b=cc.nextInt();
	 System.out.println("plz enter the value c ");
	 int c =cc.nextInt();
	 double v =0;
  
  
  }
}