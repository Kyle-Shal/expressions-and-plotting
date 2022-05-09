/** This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Creates an instance of an Expression that can hold a constant value.
 * @author kyles
 *
 */
public final class X extends Operation {

	/** Create an function that signifies the variable x
	 * 
	 */
	public X() {
		
	}

	@Override
	public double value(double x) {
		return x;
	}

	@Override
	public String toString() {
		return "x";
	}

}
