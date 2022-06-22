
import java.util.Scanner;
public abstract class GeometricObject {
private String color;
private boolean filled;
Scanner input = new Scanner(System.in);
public GeometricObject() {}
public GeometricObject(String color, boolean filled) {
 this.color=color;
this.filled=filled;
}
public void setColor(String c) {
 this.color= c;
}
public String getColor() {
 return color;
}
public void setFilled(boolean f) {
 this.filled= f;}

public boolean getFilled() {
 return filled;
}
public boolean CheckFilled() {
System.out.println("Enter wether the field of the triangle is filled(true) or not(false)");
 filled= input.nextBoolean();
 return filled;
}
public String Color() {
System.out.println("Enter the color of the triangle");
color= input.next();
return color;
}
/**abstract method getArea */
public abstract double getArea();
/**abstract method getPerimeter */
public abstract double getPerimeter();
public abstract void getData();
public abstract String printData();
}