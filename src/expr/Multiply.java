/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**
 * @author kyles
 *
 */
public class Multiply extends Operation {
	double product;
	
	Expression a;
	Expression b;
	
	public Multiply(Expression a, Expression b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double value(double x) {
//		if(a != null && b != null) {
//			
//		}
		return a.value(x) * b.value(x) ;
	}

	@Override
	public String toString() {
		return ""+ a.toString() + b.toString();
	}

}
