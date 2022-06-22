package progii;
import java.util.*;
public class Assignment7I {

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
try {
		System.out.println("Enter numbers");
int num1 = scanner.nextInt();
int num2 = scanner.nextInt();
System.out.println(num1 + num2);
} catch (InputMismatchException ex) {
	System.out.println("Enter int numbers");
}
	
try {
	int[] arr = new int[100];
	for(int i=0 ; i< arr.length ; i++) {
		arr[i]= ((int)( Math.random()*100));
	}
	System.out.println("Enter index");
	int num3 = scanner.nextInt();
System.out.println(arr[num3]);

}catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("Enter num between zero to 100");
}catch (InputMismatchException e) {
	System.out.println("Enter int numbers");
}
	
}
}

