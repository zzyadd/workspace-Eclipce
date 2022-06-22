package assignment1programming1;
import java.util.*;
public class app2 {
    public static void main(String[] args) {
        Scanner stScanner = new Scanner(System.in);
      System.out.println("Enter line");
      String x = stScanner.nextLine();
      
      String lastWord = x.substring(x.lastIndexOf(" ")+1);
      int no2 = x.lastIndexOf(" ");
     String print = x.substring(no2);

      System.out.println(" The last word is  \" " + print + "\"  with length " +lastWord.length());
	}
}
