package projectPROG;
import java.io.*;
import java.util.*;
public class acc {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
int num  ;
try(FileWriter obile = new FileWriter("assignment_8.dat")) {
if(obile.exists()) {
	for (int i=0 ;i<100 ; i++ ) {
	num = 1+((int)(Math.random()*100));
	obile.write(num);
	obile.write("\n");}

	obile.close();}
	else{
		//ObjectOutputStream obile = ObjectOutputStream(new FileOutputStream("assignment_8.dat"));
		for (int i=0 ;i<1000 ; i++ ) {
			num = 1+((int)(Math.random()*1000));
			obile.write(num);
			obile.write("\n");}

			obile.close();
	}
} catch(IOException e){
System.out.println("Error "+ e);
	}
	

System.out.println("done");
}

	}

