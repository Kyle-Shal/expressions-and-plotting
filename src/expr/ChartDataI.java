/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

/**Standardizing the data set pertaining to an mathematical Expression to be plotted on a chart.
 * @author kyles
 * 
 */
public interface ChartDataI {
	
	/** Class Invariants: <code>
	 * Expression != null </code>
	 * 
	 * @param a Value of type Expression that cannot be null
	 */
	public void setExpression( Expression a );
	
	public Expression getExpression( );
	
	/** Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < xMin and 
	 * xMax < Double.POSITIVE_INFINITY and
	 * xMin < xMax </code>
	 * 
	 * @param xMin Value of type double to be used as lower boundary of X range
	 * @param xMax Value of type double to be used as upper boundary of X range
	 */
	public void setXRange( double xMin, double xMax );
	public double getXMin( );
	public double getXMax( );
	
	/** Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < yMin and 
	 * yMax < Double.POSITIVE_INFINITY and
	 * yMin < yMax </code>
	 * 
	 * @param yMin Value of type double to be used as lower boundary of Y range
	 * @param yMax Value  of type double to be used as upper boundary of Y range
	 */
	public void setYRange( double yMin, double yMax );
	public double getYMin( );
	public double getYMax( );


}
