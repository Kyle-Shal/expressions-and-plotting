/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can calculate the Tangent of a given value.
 * @author kyles
 *
 */
public final class Tan extends Operation {
	private final Expression a;
	
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