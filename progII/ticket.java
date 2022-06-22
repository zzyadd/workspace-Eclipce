import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class ticket {
	Scanner sc = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private int number;
	private int age;
	private int ticketNum;
	public ticket(){
	firstName = null ;
	lastName = null ;
	number = 0 ;
	age= 0 ;
	ticketNum = ((int)((Math.random())*(500)));
	}
	public void setter() {
		System.out.println("Enter Your First Name");
		setFirsNam(sc.nextLine());
		System.out.println("Enter Your Last Name");
		setlasNam(sc.nextLine());
		System.out.println("Enter Your Number");
		setNum(sc.nextInt());
	}
	public void setFirsNam(String fs ){
		firstName = fs ;
	}public void setlasNam(String ls){
		lastName = ls ;
	}public void setNum(int x){
		number = x ;
	}
	public void setAge(int z){
	age = z ;
	}
	public void getfirsNum(){
		System.out.println("First Name is "+firstName);
	}public void getLasName(){
		System.out.println("Last Name is "+ lastName);
	}public void getNum(){
		System.out.println("number is "+ number);
	}public void getage(){
		System.out.println("age is "+ age);
	}public void getTicNum(){
		System.out.println(" Ticket Number is "+ ticketNum);
	}
	public void is() {
		getfirsNum();
		getLasName();
		getNum();
		getage();
		getTicNum();
		System.out.println("if data correct press 1 \n if First Name is wrong press 2 \n if Last Name is wrong press 3 \n if Number is wrong press 4 \n if Age is wrong press 5");
		int i = sc.nextInt() ;
		while((i>=0)&&(i<6)) {
		switch(i) {
		case 1 :
			System.out.println("Good \n your Ticket Number is "+ticketNum);	
			break;
		case 2:
			System.out.println("Enter Your First Name");
			setFirsNam(sc.nextLine());
			break;
		  case 3:
			System.out.println("Enter Your Last Name");
			setlasNam(sc.nextLine());
			break;
			case 4:
				System.out.println("Enter Your Number");
				setNum(sc.nextInt());
				break;
			case 5:
					System.out.println("Enter Your Age");
					setAge(sc.nextInt());
					break;
		}
		}
	}
	
	
}
