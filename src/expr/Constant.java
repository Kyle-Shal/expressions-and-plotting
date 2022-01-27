/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/** Holds a value of type double
 * @author kyles
 *
 */
public class Constant implements Expression{
	double d;
	
	public Constant(double d) {
		this.d = d;
		
	}

	@Override
	public double value(double x) {
		return d;
	}
	
	@Override
	public String toString() {
		return "" + d;
	}

}
