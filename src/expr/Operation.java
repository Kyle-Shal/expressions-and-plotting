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
	/** Calculates the value of function of x represented as an Expression. 
	 * Each type of operation implements its own calculation.
	 * 
	 * @param x is of type double and its value is substituted everywhere is is located
	 * in an Expression
	 * 
	 * @return The calculated value of the function, dependent on the operation used
	 */
	@Override
	public abstract double value(double x);
	/** Overrides the Java toString method to prints an Expression object
	 * 
	 * @return The Expression represented as a concatenation of strings
	 */
	@Override
	public abstract String toString();
 
 
}
