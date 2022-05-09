/** This file was prepared by Kyle Shal. It was completed by me alone.
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**A factory class for various types of Mathematical Expressions.
 * <p>It can be used by the ChartData class, which will take care of 
 * graphically plotting the Expressions created.
 * @author kyles
 *
 */
public class ExpressionFactory implements ExpressionFactoryI {
	
	/** Creates an instance of a function that performs addition on two Expressions 
	 * 
	 * @param a The name of first Expression.
	 * @param b The name of second Expression.
	 * 
	 * @return An Expression that is the sum of two Expressions
	 */
	@Override
	public Expression add(Expression a, Expression b) {
		Expression sum = new Add(a,b);
		return sum;
	}
	/** Creates an instance of a function that performs subtraction on two Expressions 
	 * 
	 * @param a The name of first Expression.
	 * @param b The name of second Expression.
	 * 
	 * @return An Expression that is the difference of two Expressions
	 */
	@Override
	public Expression subtract(Expression a, Expression b) {
		Expression difference = new Subtract(a,b);
		return difference;
	}
	/** Creates an instance of a function that performs multiplication on two Expressions 
	 * 
	 * @param a The name of first Expression.
	 * @param b The name of second Expression.
	 * 
	 * @return An Expression that is the product of two Expressions
	 */
	@Override
	public Expression multiply(Expression a, Expression b) {
		Expression product = new Multiply(a,b);
		return product;
	}
	/**Creates an instance of a function that performs division on two expressions
	 * 
	 * @param a The name of first Expression.
	 * @param b The name of second Expression.
	 * 
	 * @return An Expression that is the quotient of two Expressions
	 */
	@Override
	public Expression divide(Expression a, Expression b) {
		Expression quotient = new Divide(a,b);
		return quotient;
	}
	/** A constant is an Expression that holds a value of type double 
	 * 
	 * @param value Takes a value of type double
	 * 
	 * @return The constant
	 */
	@Override
	public Expression constant(double value) {
		Expression constant =  new Constant(value);
		return constant;
	}
	/** A variable of x that holds a value that is not yet known
	 * @return x
	 */
	@Override
	public Expression x() {
		Expression x =  new X();
		return x;
	}
	/** Creates an instance of a trigonometric sine function on an Expression
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return An Expression that is the sine of two Expressions
	 */
	@Override
	public Expression sin(Expression a) {
		Expression sin = new Sin(a);
		return sin;
	}
	/**Creates an instance of a trigonometric cosine function on an Expression
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return An Expression that is the cosine of two Expressions
	 */
	@Override
	public Expression cos(Expression a) {
		Expression cos = new Cos(a);
		return cos;
	}
	/** Creates an instance of a trigonometric tangent function on an Expression
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return An Expression that is the tangent of two Expressions
	 */
	@Override
	public Expression tan(Expression a) {
		Expression tan = new Tan(a);
		return tan;
	}
	/** Creates an instance of a function that is the natural logarithm of an expression
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return An Expression that is the natural logarithm of an Expression
	 */
	@Override
	public Expression ln(Expression a) {
		Expression ln = new Ln(a);
		return ln;
	}
	/** Creates an instance of an exponential function performed on an Expression
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return An Expression that is an exponential function
	 */
	@Override
	public Expression exp(Expression a) {
		Expression exp = new Exp(a);
		return exp;
	}
	/** Creates an instance of an Expression that is parenthesized
	 * 
	 * @param a The name of the Expression.
	 * 
	 * @return The Expression in parentheses
	 */
	@Override
	public Expression parenthesized(Expression a) {
		Expression par = new Parenthesize(a);
		return par;
	}

}
