package dataStractureProgecySemTwo;
import java.util.*;
import java.util.TimerTask;

public class server extends Thread {
	  Scanner sc = new Scanner(System.in);
int server =0;
objectTasks server1 ;
objectTasks server2 ;
double service, interarrival;
LinkedListQueue queTask = new LinkedListQueue();
// Queue<objectTasks> queServer = new LinkedList<objectTasks>();
long time1 = generateTime(25000);
long time2 =generateTime(20000) ;

public long generateTime(double mean) {
	double x ;
	x= -Math.log(1-Math.random())*mean;
	return (long)x;
}
public void plus () {

int dex =1 + ( (int)(Math.random()*10));	
	while(dex!= 0) {
		// System.out.println("Enter first num of new task");
		int first =( (int)(Math.random()*10));	
	//	System.out.println("Enter second num of new task");
		int second = ( (int)(Math.random()*10));	
		queTask.enqueue( new objectTasks( first , second));
		//System.out.println("If you fished  Enter -1 for YES or AnthorNum for NO ");
		 //dex = sc.nextInt();
		dex-- ;
		}
	queTask.printList();
	}
	public void doingcalc () {
		if((this.server%2)==0) {
this.server1= queTask.dequeue();
System.out.println("computer one say " +server1.getNum3()); }
		else if((this.server%2)!=0){
		 if(!queTask.isEmpty()) {	
this.server2= queTask.dequeue();
System.out.println("computer two say  " +server2.getNum3()); }}
		 this.server++;
	
}
	public void doingALL () {
		this.plus ();
doingcalc();
Timer timer = new Timer();
TimerTask task = new TimerTask(){
	
	public void run() {
		if(!queTask.isEmpty()) {
	doingcalc();

	}
		else {
				System.out.println("Done");
				timer.cancel();
		}
		plus ();
		 time1 = generateTime(25000);
		 time2 =generateTime(20000) ;
System.out.println(new Date());
	}
	};

timer.scheduleAtFixedRate(task, time1 ,time2) ;

	}
}