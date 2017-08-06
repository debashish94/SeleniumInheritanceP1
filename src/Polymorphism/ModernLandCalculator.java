package Polymorphism;

public class ModernLandCalculator extends LandCalculator {
	
	public int areaOfLand(int a, int b) {
		int total = a + b + 9;
		return total;

	}

	public int areaOfLand(int a, int b, int c, int d) { // Override

		int total = a + b + c + d - 2;
		return total;

	}

	public int areaOfLand(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		return total;

	}
}
