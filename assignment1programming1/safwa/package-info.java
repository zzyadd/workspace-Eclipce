package safwa;

import java.util.Scanner;

class bank {
	public void calc (int a) {
		Scanner scanner = new Scanner(System.in);
		
		if(a==(-1)) {
			System.out.println("bye");}
			else
			{
				System.out.println(((a*(0.18))-(a*0.11)));
			calc(scanner.nextInt());
			}
	}
	}