package expr;

public interface ExpressionFactoryI {

	Expression add(Expression a, Expression b);

	Expression subtract(Expression a, Expression b);

	Expression multiply(Expression a, Expression b);

	Expression divide(Expression a, Expression b);

	Expression constant(double value);

	Expression x();

	Expression sin(Expression a);

	Expression cos(Expression a);

	Expression tan(Expression a);

	Expression ln(Expression a);

	Expression exp(Expression a);

	Expression parenthesized(Expression a);

}
