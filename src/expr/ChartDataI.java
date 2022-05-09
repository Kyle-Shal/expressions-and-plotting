/** This file was prepared by Kyle Shal. It was completed by me alone.
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
	
	/** Sets a new Expression to be used for Chart data
	 * <p>Class Invariants: <code>
	 * Expression != null </code>
	 * 
	 * @param a Value of type Expression that cannot be null
	 */
	public void setExpression( Expression a );
	
	/** Gets an Expression
	 * 
	 * @return The Expression
	 */
	public Expression getExpression( );
	
	/** Sets a new upper and lower boundary for the x range of an Expression 
	 * <p>Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < xMin and 
	 * xMax < Double.POSITIVE_INFINITY and
	 * xMin < xMax </code>
	 * 
	 * @param xMin Value of type double to be used as lower boundary of X range
	 * @param xMax Value of type double to be used as upper boundary of X range
	 */
	public void setXRange( double xMin, double xMax );
	/** Gets the value of the lower bound of the x range
	 * 
	 * @return The xMinvalue
	 */
	public double getXMin( );
	/** Gets the value of the upper bound of the x range
	 * 
	 * @return The xMax value
	 */
	public double getXMax( );
	
	/**  Sets a new upper and lower boundary for the y range of an Expression
	 * <p>Class Invariants: <code>
	 * Double.NEGATIVE_INFINITY < yMin and 
	 * yMax < Double.POSITIVE_INFINITY and
	 * yMin < yMax </code>
	 * 
	 * @param yMin Value of type double to be used as lower boundary of Y range
	 * @param yMax Value  of type double to be used as upper boundary of Y range
	 */
	public void setYRange( double yMin, double yMax );
	/** Gets the value of the lower bound of the y range for the Expression
	 * 
	 * @return The yMin value
	 */
	public double getYMin( );
	/** Gets the value of the lower bound of the y range for the Expression
	 * 
	 * @return The yMax value
	 */
	public double getYMax( );


}
