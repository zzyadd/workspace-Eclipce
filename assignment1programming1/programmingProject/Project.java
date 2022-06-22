package programmingProject;

import java.util.Scanner;
public class Project {
	public static boolean signin(int [][] acc) {
    	Scanner sc = new Scanner(System.in);
boolean e = true ;
		System.out.println("SIGN IN \n Enter your account number" );
		int userId1 = sc.nextInt();
		System.out.println("Enter your account password" );
		int userpass1 = sc.nextInt();
		for(int i=0 ; i < 50 ; i++) {
		if( (userId1)==(acc[i][1]) ){
		if(userpass1==acc[i][2]) {
		 operations( i , acc); 
		 e = true ;
			} 
		} else {
			e = false ;
		}
		} 
		 
			return e ; 
		
					} 
	
	public static void operations(int usnum , int[][] acc ) {
		Scanner sc = new Scanner(System.in);
		int op2 = 1 ;
		do {
		    System.out.println("Enter 1 for Check balance, \n Enter 2 for Deposit");
		    System.out.println("Enter 3 for withdraw \n Enter 4 for Change Password \n Entre 5 for Exit ");
		   op2 = sc.nextInt(); 
			switch (op2) {
		    case 1: 
		    	System.out.println("Check the balance");
		        System.out.println("Your balance is : " + acc[usnum][3]+ " $");
		           break ; 
		     case 2 :  
		       System.out.println("DEPOSIT");
		       System.out.println("Your balance is : " + acc[usnum][3] + " $");
		       System.out.println("Enter money to be DEPOSIT ");
		       int deposit = sc.nextInt();
		       acc[usnum][3]  += deposit ;
		       System.out.println("Thank you Your money has been deposited successfully :)");
		       System.out.println(" Your balance now is : " + acc[usnum][3]  + " $");
		       break; 
		     case 3 : 
		    	 System.out.println("WITHDRAW" );

		         System.out.println("Your balance is : " + acc[usnum][3]  + " $");
		         
		         System.out.print("Enter money to be withdrawn: " );
		         int withdraw = sc.nextInt();
		         if ( withdraw <= acc[usnum][3] ) {
		        	 acc[usnum][3]  -= withdraw ;
		             System.out.println("collect your money \n your balance now is  " + acc[usnum][3]  + " $" ); }
		         else {   System.out.println(" try again!  and Enter value less than  " + acc[usnum][3]  );}
		         break; 
		     case 4 :
		         System.out.println("CHANGE PASSWOED \n Enter your old password");
		         int oldpass= sc.nextInt();
		         if(oldpass == acc[usnum][2]) {
		             System.out.println("Enter your NEW PASSword");
		             acc[usnum][2]= sc.nextInt();
		             System.out.println("Enter your NEW PASSword agin to verfiy ");
		              int newpass= sc.nextInt();
		              if(newpass==acc[usnum][2]) {
		            	  System.out.println("your NEW PASSword is "+ acc[usnum][2]);
		              }
		         }
		         else {
		             System.out.println("Check your OLD password again");

		         }
		         break;
		     case 5:
		        System.out.println("Thank you to choose our service");
		        break;

		         }
                        while(!(op2>0 && op2<6)){
                            System.out.println("Please Choose From 1 To 5 !!");
                            op2 = sc.nextInt();
                        }
                     
		} while(op2<5);

	}
	
public static void printTable( int[][] acc) {
	System.out.println("    AccNum   Password  Balance");

	for(int a=0 ; a< 50;a++) {
		System.out.print(acc[a][0]+"\t");
		 System.out.print(acc[a][1]+"\t");	
		 System.out.print(acc[a][2]+"\t");	
		 System.out.println(acc[a][3]+"\t");	

	}
}
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
  System.out.println("Hello World in our BANK ");
 System.out.println("Enter 1 if u want to Create a new account \n Enter 2 if u want to Sign in ");
  int oper = sc.nextInt();
  int usnum ;
int [][]acc = new int[50][4];
//First dim in array for UserID  and second dim in array for UserPassword therd dim in array for AccountBALANCE
for(int a=0 ; a<50;a++) {
		 acc[a][0]= a ;
		acc[a][1]=(1000+((int)((Math.random())*(9999-1000)+1)));
			acc[a][2]=(1000+((int)((Math.random())*(9999-1000)+1))); 
			acc[a][3]=((int)((Math.random())*10000));  		

	  }
printTable(acc);
  switch(oper) {
case 1:
	System.out.println(" Enter UserNumber from 0 to 49 ");
	    usnum= sc.nextInt();
	while( (usnum<0 || usnum>50) ) {
		System.out.println(" TRY AGAIN \n  And Enter UserNumber from 0 to 49 ");
	    usnum= sc.nextInt();
}
	System.out.println(" CREATE NEW ACCOUNT \n Enter UserName ");
	String usname = sc.next();
	System.out.println(" Enter accountNumber from 4 digits ");
	int accnum= sc.nextInt(); 
	while (!(accnum<10000 && accnum>999)) {
	System.out.println(" TRY AGAIN \n  And Enter accountNumber from 4 digits "); 
	accnum= sc.nextInt();	}

	System.out.println(" Enter password ");
	int uspass = sc.nextInt();
	System.out.println(" deposit money up 5000$ to create account ");
	int usbalance = sc.nextInt();
       
	while ((usbalance<5000)) {
		System.out.println(" DEPOSIT money up 5000$ to create account !!!!! ");
                usbalance = sc.nextInt();
        }
	    	System.out.println(" you are in our service ");

        do {
	acc[usnum][1]= accnum ;
	acc[usnum][2]= uspass ;
	acc[usnum][3]= usbalance ;
	break;
	}
	while(usnum>=0 && usnum<50 && accnum>999 && accnum<10000 && usbalance>=5000);
	 operations( usnum , acc);
         

 break ;

case 2 :

if (	signin(acc)) {
	
} else {
	System.out.println("There is a fault , please try Again !!");
	signin(acc);
}

break;
  }		
			} 
    	}