package safwa;

import java.util.Scanner;

public class bbb {
	public static void calc (int a) {
		Scanner scanner = new Scanner(System.in);
		if(a==(-1)) {
			System.out.println("bye");}
			else
			{
				System.out.println(((a*(0.18))-(a*0.11)));
			calc(scanner.nextInt());
			}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
System.out.println("Enter");
int x= scanner.nextInt();
System.out.println((x*0.18));
calc(scanner.nextInt());
	}

}
