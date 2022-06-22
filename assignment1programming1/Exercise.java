import java.util.Scanner;
public class Exercise {
	static String xo[][]= new String[3][3];
	static Scanner input = new Scanner(System.in);
	static String name1 , name2,last_player,winner ;
	static int i,j,k,count;
    public static void main(String[] args) {
    	count = 0 ;
    	for (int n=0 ; n<=2 ; n++) {
    		for (int m=0 ; m<=2 ; m++) {
    			xo[n][m]= " ";
    		}
    	}
    	//xo[1][1]="x";
    	show_matrix();
    	System.out.println("Hello, you are the 1st player , pls enter your name:");
    	name1 = input.next();
    	System.out.println("Hello "+ name1 + " you will be 'X' player");
    	System.out.println("Hello, you are the 2nd player , pls enter your name:");
    	name2 = input.next();
    	System.out.println("Hello "+ name2 + " you will be 'O' player");
    	while (true) {
    		ask_player(name1,"X");
    		if (check_winner() ) {
    			break;
    		}
    		ask_player(name2, "O");
    		if (check_winner() ) {
    		break;
    	}
    		if(tie()) {
    			System.out.println("tie");
    			break;
    		}
    	}
    	
    	}


    public static void show_matrix() {
    	System.out.println("___");
    	System.out.println("|"+ xo[0][0]+ "|"+ xo[0][1]+ "|"+ xo[0][2]);
    	System.out.println("___");
    	System.out.println("|"+ xo[1][0]+ "|"+ xo[1][1]+ "|"+ xo[1][2]);
    	System.out.println("___");
    	System.out.println("|"+ xo[2][0]+ "|"+ xo[2][1]+ "|"+ xo[2][2]);
    	System.out.println("___");
    }
    public static void ask_player(String name,String player) {
    	last_player = name ;
    	while (true) {
    		
    	System.out.println("\n\nplease "+ name + " enter row number (1 or 2 or 3):");
    	k= input.nextInt();
    	i= (k-1)%4;
    	if (k>3) {
    		System.out.println("warning ! pls enter a number between 1 & 3 only");
    	}
    	System.out.println("please "+ name + " enter column number (1 or 2 or 3):");
    	k= input.nextInt();
    	j= (k-1)%4;
    	if (i>3) {
    		System.out.println("warning ! pls enter a number between 1 & 3 only");
    	}
    	if (xo[i][j]==" " ) {
    		xo[i][j]= player;
    		count++;
    		break;
    	}
    	else 
    		System.out.println("pls choose another position");
    	}
    	show_matrix();
    }
    public static boolean check_winner() {
    	for(int i=0; i<3; i++) {
    		if (((xo[i][0])!=" ") && (xo[i][0]== xo[i][1])&& (xo[i][1]==xo[i][2])) {
    			winner= last_player ;
    			System.out.println( winner + " Congratulations you won!");
    			return true;
    		}
    	}
    	for (int j=0; j<3; j++) {
    		if (((xo[0][j])!=" " )&&( xo[0][j]== xo[1][j])&& (xo[1][j]==xo[2][j])) {
    			winner= last_player ;
    			System.out.println( winner + " Congratulations you won!");
    			return true;
    		}
    	}
    	if (xo[0][0]!=" " && xo[0][0]== xo[1][1]&& xo[1][1]==xo[2][2]) {
    		winner= last_player ;
    		System.out.println( winner + " Congratulations you won!");
    		return true;
    	}
    	if (xo[0][2]!=" " && xo[0][2]== xo[1][1]&& xo[1][1]==xo[2][0]) {
    		winner= last_player ;
    		System.out.println( winner + " Congratulations you won!");
    		return true;
    	}
    	return false;
    	}
    public static boolean tie() {
    	if((check_winner() == false) && (count==9)) {
    				return true;
    			}
    	else {return false;}
    	
    	}
    }