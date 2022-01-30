/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can perform multiplication on two Expressions.
 * @author kyles
 *
 */
public final class Multiply extends Operation {
	/** The Expressions to be multiplied	 */
	private final Expression a;
	private final Expression b;
	
	/** Create an multiplication function using two Expressions as operands 
	 * 
	 * @param a The first Expression.
	 * @param b The second Expression.
	 */
	public Multiply(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double value(double x) {
		return a.value(x) * b.value(x);
	}

	@Override
	public String toString() {
		return a.toString() + "*" + b.toString();
	}

}
