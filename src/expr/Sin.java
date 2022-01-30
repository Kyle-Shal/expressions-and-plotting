/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Sine of a given Expression.
 * @author kyles
 *
 */
public final class Sin extends Operation {
	/** The Expression to be evaluated involving sine	 */
	private final Expression a;
	
	/** Create an trigonometric sine function using an Expression as the operand
	 * 
	 * @param a The Expression.
	 */
	public Sin(Expression a){
		this.a = a;
	}
	
	@Override
	public double value(double x) {
		return Math.sin(a.value(x));
	}

	@Override
	public String toString() {
		return "sin(" + a.toString() + ")";
	}

}
