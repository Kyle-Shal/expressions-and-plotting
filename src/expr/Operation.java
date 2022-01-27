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
public abstract class Operation implements Expression{
	
	@Override
	public abstract double value(double x);
	
	@Override
	public abstract String toString();
 
 
}
