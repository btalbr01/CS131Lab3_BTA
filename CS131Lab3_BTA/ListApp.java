
public class ListApp {

	public static void main(String[] args) 
	{
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(3);
		ArrayList<String> stringList = new ArrayList<String>(2);
		ArrayList<Square> squareList = new ArrayList<Square>(2);
		Square s1 = new Square(5.5);
		Square s2 = new Square(8.4);
		PointThreeD p1 = new PointThreeD(2.2, 1.3, 6.2);
		PointThreeD p2 = new PointThreeD(5.2, 4.4, 1.0);
		PointThreeD p3 = new PointThreeD(9.1, 3.2, 8.1);
		String string1 = "banana";
		String string2 = "tacos";
		
		squareList.addItem(s1);
		squareList.addItem(s2);
		pointList.addItem(p1);
		pointList.addItem(p2);
		pointList.addItem(p3);
	
		stringList.addItem(string1);
		stringList.addItem(string2);
		System.out.println(pointList.toString());
		System.out.println(stringList.toString());
		System.out.println(squareList.toString());		

	}//end main
}//end class