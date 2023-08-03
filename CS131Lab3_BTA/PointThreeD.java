
public class PointThreeD 
{
	public double x, y, z;

	public PointThreeD()
	{
		x = 0.0;
		y = 0.0;
		z = 0.0;
	}//end empty argument constructor
	
	public PointThreeD(double x, double y, double z) 
	{
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}//end preferred argument constructor

	@Override
	public String toString() 
	{
		return "PointThreeD [x=" + x + ", y=" + y + ", z=" + z + "]";
	}//end toString
}//end class