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
public class ExpressionFactory implements ExpressionFactoryI {

	@Override
	public Expression add(Expression a, Expression b) {
		Expression sum = new Add(a,b);
		return sum;
	}

	@Override
	public Expression subtract(Expression a, Expression b) {
		Expression difference = new Subtract(a,b);
		return difference;
	}

	@Override
	public Expression multiply(Expression a, Expression b) {
		Expression product = new Multiply(a,b);
		return product;
	}

	@Override
	public Expression divide(Expression a, Expression b) {
		Expression quotient = new Divide(a,b);
		return quotient;
	}

	@Override
	public Expression constant(double value) {
		Expression constant =  new Constant(value);
		return constant;
	}

	@Override
	public Expression x() {
		Expression x =  new X();
		return x;
	}

	@Override
	public Expression sin(Expression a) {
		Expression sin = new Sin(a);
		return sin;
	}

	@Override
	public Expression cos(Expression a) {
		Expression cos = new Cos(a);
		return cos;
	}

	@Override
	public Expression tan(Expression a) {
		Expression tan = new Tan(a);
		return tan;
	}

	@Override
	public Expression ln(Expression a) {
		Expression ln = new Ln(a);
		return ln;
	}

	@Override
	public Expression exp(Expression a) {
		Expression exp = new Exp(a);
		return exp;
	}

	@Override
	public Expression parenthesized(Expression a) {
		Expression par = new Parenthesize(a);
		return par;
	}

}
