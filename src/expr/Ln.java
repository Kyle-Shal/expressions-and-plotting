/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the natural logarithm of a given value.
 * @author kyles
 *
 */
public final class Ln extends Operation {
	private final Expression a;
	
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
