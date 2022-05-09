/** This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Cosine of a given Expression.
 * @author kyles
 *
 */
public final class Cos extends Operation {
	
	/** The Expression to be evaluated involving cosine	 */
	private final Expression a;
	
	/** Create an trigonometric cosine function using an Expression as the operand
	 * 
	 * @param a The Expression.
	 */
	public Cos(Expression a){
		this.a = a;
	}
	
	@Override
	public double value(double x) {
		return Math.cos(a.value(x));
	}

	@Override
	public String toString() {
		return "cos(" + a.toString() + ")";
	}

}