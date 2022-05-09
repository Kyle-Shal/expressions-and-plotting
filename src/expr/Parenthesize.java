/** This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;


/**Places an Expression in Parentheses
 * @author kyles
 *
 */
public final class Parenthesize extends Operation {
	
	/** The Expression to be placed in parentheses*/
	private final Expression a;
	
	/** Create an function that parenthesizes an Expression
	 * 
	 * @param a The Expression.
	 */
	public Parenthesize(Expression a) {
		this.a = a;
	}
	
	@Override
	public double value(double x) {
		return a.value(x);
	}

	@Override
	public String toString() {

		return "(" + a + ")";
	}

}
