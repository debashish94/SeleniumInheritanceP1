package Polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		
		LandCalculator calculate = new LandCalculator();
		
		int sizeOfStraightline = calculate.areaOfLand(5, 10);
		System.out.println(sizeOfStraightline);
		
		int sizeOfTriangle = calculate.areaOfLand(5, 10, 15);
		System.out.println(sizeOfTriangle);
		
		int sizeOfRectangle = calculate.areaOfLand(8, 10, 12, 11);
		System.out.println(sizeOfRectangle);

		ModernLandCalculator mlc = new ModernLandCalculator();
		
		int modernRectangleSize = mlc.areaOfLand(8, 10, 12, 11);
		System.out.println(modernRectangleSize);
		
		int anotherRectangleSize = mlc.areaOfLand(8, 10, 12, 11, 7);


		// TODO Auto-generated method stub

	}

}
