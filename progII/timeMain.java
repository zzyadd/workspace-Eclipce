import java.util.Scanner;

public class timeMain {
	public static int por(int x , int y) {
		if(x==0)
			return 0 ;
			else if(y==0)
			return 1 ;
			else if(y==1)
				return x;
			else {
				int m=x;
				for(int i =y ; i>1 ; i--) {
					m *=x ;
				}
			return m ;
			}
	
	}
	public static int power(int x , int y) {
	if(x==0)
		return 0 ;
		else if(y==0)
		return 1 ;
		else if(y==1)
			return x;
			else {
				int m =  (x* power(x, (y-1)));
				return m ;
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/* time t1 = new time();
		System.out.println("set houer");
		t1.sethou(sc.nextInt());
		System.out.println("set min");
		t1.setmin(sc.nextInt());
		System.out.println("set sec");
		t1.setsec(sc.nextInt());

		t1.sayhou();
		t1.saymin();
		t1.saysec();
		t1.saytime(); */
		System.out.println(por(2,50)) ;			
		System.out.println(power(2,5 )) ;	
	}

}
