package assignment1programming1;
import java.util.*;
public class AstrologicalSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner cc = new Scanner (System.in);
System.out.println("enter ur birthday month");
int x =cc.nextInt();
System.out.println("enter ur birthday day");
int y =cc.nextInt();
switch (x)
{ 
 case 1 :
	 if( y>0 && y<=19)
			System.out.println("Capricorn");
	 else if(y>19 && y<=31)
	System.out.println("Aquarius");
	 
break;
 case 2 :
	 if(y>0 && y<=18)
	System.out.println("Aquarius");
	 else if(y>18 && y<=29)
			System.out.println("Pisces");
break;
 case 3 :
	 if(y>0 && y<=20)
	System.out.println("Pisces");
	 else if(y>20 && y<=31)
			System.out.println("Aries");
break;
 case 4 :
	 if(y>0 && y<=20)
	System.out.println("Aries");
	 else if(y>20 && y<=31)
			System.out.println("Taurus");
break;
 case 5:
	 if(y>0 && y<=20)
	System.out.println("Taurus");
	 else if(y>20 && y<=31)
			System.out.println("Gemini");
break;
 case 6 :
	 if(y>0 && y<=21)
	System.out.println("Gemini");
	 else if(y>21 && y<=31)
			System.out.println("Cancer");
break;
 case 7 :
	 if(y>0 && y<=22)
	System.out.println("Caner");
	 else if(y>22 && y<=31)
			System.out.println("Leo");
break;
 case 8 :
	 if(y>0 && y<=22)
	System.out.println("Leo");
	 else if(y>22 && y<=31)
			System.out.println("Virgo");
break;
 case 9 :
	 if(y>0 && y<=22)
	System.out.println("Virgo");
	 else if(y>22 && y<=31)
			System.out.println("Libra");
break;
 case 10 :
	 if(y>0 && y<=23)
	System.out.println("Libra");
	 else if(y>23 && y<=31)
			System.out.println("Scorpio");
break;
 case 11 :
	 if(y>0 && y<=21)
	System.out.println("Scorpio");
	 else if(y>21 && y<=31)
			System.out.println("Sagittaius");
break;
 case 12 :
	 if(y>0 && y<=21)
	System.out.println("Sagittaius");
	 else if(y>21 && y<=31)
			System.out.println("Carprion");
break;
default :
System.out.println("Enter true no");
}


	

	}
	}


