/**This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the natural logarithm of a given Expression.
 * @author kyles
 *
 */
public final class Ln extends Operation {

	/** The Expression to be evaluated involving natural logarithm	 */
	private final Expression a;
	
	/** Create an natural logarithm function using an Expression as the operand
	 * 
	 * @param a The Expression.
	 */
	public Ln(Expression a) {
		this.a = a;
	}
	
	@Override
	public double value(double x) {
		return Math.log(a.value(x));
	}

	@Override
	public String toString() {
		return "ln(" + a.toString() + ")";
	}

}
