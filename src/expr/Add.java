/**
 * 
 */
package expr;

/**Creates an instance of an operation that can perform addition on two Expressions.
 * @author kyles
 *
 */
public class Add extends Operation {
	Expression a;
	Expression b;
	
	public Add(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public double value(double x) {
		return a.value(x) + b.value(x);
	}

	@Override
	public String toString() {
		return a.toString() + "+" + b.toString();
	}

}
