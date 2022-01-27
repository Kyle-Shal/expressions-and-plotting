/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/** An operation is a function which takes zero or more input values (called operands) to a well-defined output value.
 * These are the current subclass operations:
 * <p> add, subtract, multiply, divide, constant, x, sin, cos, tan, ln, exp, parenthesize
 * @author kyles
 *
 */
public abstract class Operation implements Expression{
	
	@Override
	public abstract double value(double x);
	
	@Override
	public abstract String toString();
 
 
}
