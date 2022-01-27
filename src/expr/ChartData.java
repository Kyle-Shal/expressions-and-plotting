/**
 * 
 */
package expr;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import util.Assert;

/**
 * TODO: use reasonable initial values in the constructor
 * TODO: call invariant at the end of the constructor
 * 
 * @author kyles
 * 
 */
public class ChartData {
	private Expression a;
	private double xMin;
	private double xMax;
	private double yMin;
	private double yMax;
	
	public ChartData() {

	}
	
	/** Class Invariants: <code>
	 * Expression != null </code>
	 * 
	 * @param a Value of type Expression that cannot be null
	 */
	public void setExpression( Expression a ) {
		Assert.check(a != null, "Cannot pass a null expression");
		this.a = a;
	}
	
	public Expression getExpression( ) {		
		return a;		
	}
	
	/** Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < xMin and 
	 * xMax < Double.POSITIVE_INFINITY and
	 * xMin < xMax </code>
	 * 
	 * @param xMin Value of type double to be used as lower boundary of X range
	 * @param xMax Value of type double to be used as upper boundary of X range
	 */
	public void setXRange( double xMin, double xMax ) {
		
		Assert.check(Double.NEGATIVE_INFINITY < xMin, "xMin cannot be less than negative infinity");
		Assert.check(xMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
		Assert.check(xMin < xMax, "xMin cannot be greater that xMax");

		this.xMin = xMin;
		this.xMax = xMax;
	}
	public double getXMin( ) {
		return xMin;
	}
	public double getXMax( ) {
		return xMax;
	}
	
	/** Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < yMin and 
	 * yMax < Double.POSITIVE_INFINITY and
	 * yMin < yMax </code>
	 * 
	 * @param yMin Value of type double to be used as lower boundary of Y range
	 * @param yMax Value  of type double to be used as upper boundary of Y range
	 */
	public void setYRange( double yMin, double yMax ) {
		Assert.check(Double.NEGATIVE_INFINITY < yMin, "xMin cannot be less than negative infinity");
		Assert.check(yMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
		Assert.check(yMin < yMax, "xMin cannot be greater that xMax");
		
		this.yMin = yMin;
		this.yMax = yMax;		
	}
	public double getYMin( ) {
		return yMin;
	}
	public double getYMax( ) {
		return yMax;
	}
//	private void invariant() {
//		Assert.check(a != null, "Cannot pass a null expression");
//		
//		Assert.check(Double.NEGATIVE_INFINITY < xMin, "xMin cannot be less than negative infinity");
//		Assert.check(xMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
//		Assert.check(xMin < xMax, "xMin cannot be greater that xMax");
//		
//		Assert.check(Double.NEGATIVE_INFINITY < yMin, "xMin cannot be less than negative infinity");
//		Assert.check(yMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
//		Assert.check(yMin < yMax, "xMin cannot be greater that xMax");
//
//		
//	}
	
//	public void checkInvariant( ) {
//		// It's not always the case that a class invariant can be
//		// checked using only the public interface. Better to 
//		// put checks into the mutators and constructors.
//		// That also ensures that the
//		// checking happens during system tests as well as
//		// unit tests.
//		assertNotNull( cd.getExpression() ) ;
//		assertTrue( Double.NEGATIVE_INFINITY < cd.getXMin( ) ) ;
//		assertTrue( cd.getXMin( ) < cd.getXMax( ) ) ;
//		assertTrue( cd.getXMax( ) < Double.POSITIVE_INFINITY ) ;
//		assertTrue( Double.NEGATIVE_INFINITY < cd.getYMin( ) ) ;
//		assertTrue( cd.getYMin( ) < cd.getYMax( ) ) ;
//		assertTrue( cd.getYMax( ) < Double.POSITIVE_INFINITY ) ;
//	}







}
