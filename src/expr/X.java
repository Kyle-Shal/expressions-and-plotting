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
public class X extends Operation {
	double x;
	
	public X() {
		
	}

	@Override
	public double value(double x) {
		this.x = x;
		return x;
	}

	@Override
	public String toString() {
		return "x";
	}

}
