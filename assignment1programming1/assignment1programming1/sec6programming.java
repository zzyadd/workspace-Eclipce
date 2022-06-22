package assignment1programming1;
import java.util.*;
public class sec6programming {
	public static void minNum (int x , int y , int z) {
		int a;
		{if (x>y) {
			a = y ;}
		else {
			 a = x ;}
		if ( a > z)
			a= z ;}
		System.out.println(a);	
	}
	
	public static boolean isPrime () {
		 Scanner console = new Scanner (System.in);
System.out.println("Enter number");
int x = console.nextInt();
	
		int count =0 ;	
		for	(int n =2; n<= x/2 ; n++) {
			if (x % n ==0 ) {
				count ++ ;}
		}
		if(count ==0) {
			return true ;
		}
		else 
		return false ;
		}
			public static void com (int n , int r) {
			int b =1 ; int t =1 ; int q =1 ;
			for(int i =1 ; i<= n ; i++) {
				b*=i ;
			}
			for(int y =1 ; y<=r ; y++) {
				t*=y;
			}
			int m = (n-r);
			
			for( int d =1 ; d<=m ; d++) {
				q*=d ;
			}
			int c = (b/(t*q)) ;
			System.out.println (n+"C"+ r+ "= "+ c);
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner console =new Scanner (System.in);
boolean b = isPrime();
 System.out.println(b);

}
}
