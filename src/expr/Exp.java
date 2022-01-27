/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an exponential function that can calculate the 
 * value of <code>e</code> to the power of an Expression a. <p><code>e</code> is the base of the natural logarithm
 * @author kyles
 *
 */
public final class Exp extends Operation {
	private final Expression a;
	
	public Exp(Expression a) {
		this.a = a;
	}
	@Override
	public double value(double x) {
		return Math.exp(a.value(x));
	}

	@Override
	public String toString() {
		return "exp(" + a.toString() + ")";
	}

}
