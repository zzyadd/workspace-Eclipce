import java.util.Scanner;
public class Trianglr extends GeometricObject implements Comparable<Trianglr> {
private double length;
private double width;
private double height;
Scanner input = new Scanner(System.in);
public Trianglr() {}
public Trianglr(String color, boolean filled, double l,double w,double h) {
super(color,filled);
this.height= h;
this.length=l;
this.width=w;
}
public void getData() {

System.out.println("Enter the length of your triangle");
length= input.nextDouble();
System.out.println("Enter the width of your triangle");
 width= input.nextDouble();
System.out.println("Enter the height of your triangle");
height= input.nextDouble();
}
public double getArea() {
return (width*height)/2;
}
public double getPerimeter(){
return (height+length+width);
}

public String printData() {
return "the area = " + this.getArea() + "\nthe perimeter = "+ this.getPerimeter() + "\nThe color = "+ this.Color()+ "\nisFilled "+ this.CheckFilled();}
public int compareTo(Trianglr t)   {
if(getArea()>t.getArea()) {
return 1;}
else if(getArea()<t.getArea()) {
return -1; }
else return 0;
}

}