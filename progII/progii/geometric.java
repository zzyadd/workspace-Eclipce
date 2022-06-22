package progii;
import java.util.*;

public abstract class geometric {
	protected String color ;
	protected boolean filled;
	protected java.util.Date dateCreat ;

	public geometric(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public abstract double area (double l , double w);
	public abstract double perimeter(double l , double w , double h);
}
