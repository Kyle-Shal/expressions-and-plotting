/** This file was prepared by Kyle Shal. It was completed by me alone.
 * 
 */
package expr;

/**Creates an instance of an operation that can perform subtraction on two Expressions.
 * @author kyles
 *
 */
public final class Subtract extends Operation {
	/** The Expressions to be subtracted */
	private final Expression a;
	private final Expression b;
	
	/** Create an subtraction function using two Expressions as operands 
	 * 
	 * @param a The first Expression.
	 * @param b The second Expression.
	 */
	public Subtract (Expression a, Expression b){
		this.a = a;
		this.b = b;
	}
	@Override
	public double value(double x) {
		return a.value(x) - b.value(x);
	}

	@Override
	public String toString() {
		return a.toString() + "-" + b.toString();
	}

}
