/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Sine of a given value.
 * @author kyles
 *
 */
public final class Sin extends Operation {
	private final Expression a;
	
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
