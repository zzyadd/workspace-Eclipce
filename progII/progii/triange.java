package progii;
import java.util.*;

public class triange extends geometric {
private int length , wedith , height;
	public triange(String color, boolean filled, int length , int wedith , int height) throws Throwable {
		super(color, filled);
		// TODO Auto-generated constructor stub
		set(length ,wedith , height); }
	public void set(int l , int w , int h) throws Throwable {
		if(l+w>h && l+h>w && h+w>l) {
			this.length = l;
			this.wedith = w;
			this.height = h;
		} else {
			throw new Throwable("bad");
		}
	}
	public int getLength() {
		return length;	}
	public void setLength(int length) {
		this.length = length;	}
	public int getWedith() {
		return wedith;	}
	public void setWedith(int wedith) {
		this.wedith = wedith;	}
	public int getHeight() {
		return height;	}
	public void setHeight(int height) {
		this.height = height;	}
	@Override
	public double area(double l, double w) {
		// TODO Auto-generated method stub
		return 0.5*l*w;	}
	@Override
	public double perimeter(double l, double w, double h) {
		// TODO Auto-generated method stub
		return l+w+h;	}
	public String getcolor() {
		return super.color;	}
	public boolean getfilled() {
			return super.filled;	}
}
