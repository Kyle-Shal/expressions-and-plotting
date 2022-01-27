/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Cosine of a given value.
 * @author kyles
 *
 */
public final class Cos extends Operation {
	private final Expression a;
	
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