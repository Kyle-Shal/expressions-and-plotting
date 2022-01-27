/**
 * 
 */
package expr;

/**Creates an instance of an operation that can calculate the sin of a given value.
 * @author kyles
 *
 */
public class Sin extends Operation {
	Expression a;
	
	Sin(Expression a){
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
