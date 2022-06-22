package assignment1programming1;
import java.util.*;
import java.util.Scanner;
public class Quiz1 {
public static double average (int a , int b , int c , int d , int e) {
	int f = a+ b+ c+d+e ;
	return f/5 ;
}
public static boolean isPrime (int x) {
	int count=0;
	for (int y=1 ; y<= x/2; y++) {
		if (x % y ==0 ) {
			count ++ ;} }
	if (count==1)
		return true ;
	else
		return false ;
}
	public static void main(String[] args) {
 //EX:2
	
		
System.out.print(isPrime(3));

	}

}
