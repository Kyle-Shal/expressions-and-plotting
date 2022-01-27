/**
 * Name: Kyle Shal
 * Student Number: 201923810
 * Email: kashal@mun.ca
 */
package expr;

import util.Assert;

/**Holds data pertaining to an mathematical Expression to be plotted on a chart.
 * 
 * @author kyles
 * 
 */
public class ChartData implements ChartDataI {
	protected Expression a;
	protected double xMin;
	protected double xMax;
	protected double yMin;
	protected double yMax;
	
	public ChartData() {
		Expression x = new Constant(1) ;

		this.a = x ;
		this.xMin = -1;
		this.xMax = 1;
		this.yMin = -1;
		this.xMax = 1;
	}
	
	@Override
	public void setExpression( Expression a ) {
        Assert.check(a != null, "Cannot pass a null expression");
		this.a = a;
		
		checkInvariant();
	}
	
	public Expression getExpression( ) {		
		return a;		
	}
	
	@Override
	public void setXRange( double xMin, double xMax ) {
		Assert.check(Double.NEGATIVE_INFINITY < xMin, "xMin cannot be less than negative infinity");
        Assert.check(xMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
        Assert.check(xMin < xMax, "xMin cannot be greater that xMax");
        
		this.xMin = xMin;
		this.xMax = xMax;
		
		checkInvariant();
	}
	@Override
	public double getXMin( ) {
		return xMin;
	}
	@Override
	public double getXMax( ) {
		return xMax;
	}
	
	@Override
	public void setYRange( double yMin, double yMax ) {
        Assert.check(Double.NEGATIVE_INFINITY < yMin, "xMin cannot be less than negative infinity");
        Assert.check(yMax < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
        Assert.check(yMin < yMax, "xMin cannot be greater that xMax");
        
		this.yMin = yMin;
		this.yMax = yMax;
		
		checkInvariant();
	}
	@Override
	public double getYMin( ) {
		return yMin;
	}
	@Override
	public double getYMax( ) {
		return yMax;
	}
	public void checkInvariant( ) {
		
		Assert.check(getExpression() != null, "Cannot pass a null expression");
		
		Assert.check(Double.NEGATIVE_INFINITY < getXMin( ), "xMin cannot be less than negative infinity");
		Assert.check(getXMax( ) < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
		Assert.check(getXMin( ) < getXMax( ), "xMin cannot be greater that xMax");
		
		Assert.check(Double.NEGATIVE_INFINITY < getYMin( ), "xMin cannot be less than negative infinity");
		Assert.check(getYMax( ) < Double.POSITIVE_INFINITY, "xMax cannot be greater than positive infinity");
		Assert.check(getYMin( ) < getYMax( ), "xMin cannot be greater that xMax");
        
	}

}
