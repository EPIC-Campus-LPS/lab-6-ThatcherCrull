package part2;

public class Campsite {
	private double radius;
	
	public Campsite(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return ((Math.pow(radius, 2)) * Math.PI);
	}
	
	public double perimeter() {
		return ((2 * radius) * Math.PI);
	}
}
