/**
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
	private final Expression a;
	
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
