package progii; 
import java.util.*;
public class pubMain {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try{	
			triange t = new triange("blue", false, 5, 10, 5);
			System.out.println("it's prbably correct ");
		}catch(Throwable exc) {
			System.out.println("it must sum of every two sides is greater than thered side");
			throw exc  ;
		} finally {
					System.out.println("it's correct ");

		}

	}
}
