package assignment1programming1;
import java.util.*;
public class random {
	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
 System.out.print(" Enter the value of High");
int h =	M.nextInt();
System.out.print("Enter the value of Low ");
	int w = M.nextInt();
	int r =(w+((int)((Math.random())*(h-w)+1)));
System.out.println("R is \t " + r);	

 
	}
}