/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/** Creates an instance of an Expression that can hold a constant value of type double.
 * @author kyles
 *
 */
public final class Constant implements Expression{
	private final double d;
	
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
