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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression subtract(Expression a, Expression b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression multiply(Expression a, Expression b) {
		Expression multiply = new Multiply(a,b);
		return multiply;
	}

	@Override
	public Expression divide(Expression a, Expression b) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression cos(Expression a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression tan(Expression a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression ln(Expression a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression exp(Expression a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Expression parenthesized(Expression a) {
		// TODO Auto-generated method stub
		return null;
	}

}
