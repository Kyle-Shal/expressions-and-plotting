/** This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Tangent of a given Expression.
 * @author kyles
 *
 */
public final class Tan extends Operation {
	
	/** The Expression to be evaluated involving Tangent	 */
	private final Expression a;
	
	/** Create an trigonometric tangent function using an Expression as the operand
	 * 
	 * @param a The Expression.
	 */
	
	public Tan(Expression a){
		this.a = a;
	}
	
	@Override
	public double value(double x) {
		return Math.tan(a.value(x));
	}

	@Override
	public String toString() {
		return "tan(" + a.toString() + ")";
	}

}