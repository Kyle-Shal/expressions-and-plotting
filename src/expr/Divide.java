/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an operation that can perform division on two Expressions.
 * @author kyles
 *
 */
public class Divide extends Operation {
	Expression a;
	Expression b;
	
	public Divide(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double value(double x) {
		return a.value(x) / b.value(x);
	}

	@Override
	public String toString() {
		return a.toString() + "/" + b.toString();
	}

}
