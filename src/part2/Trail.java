package part2;

public class Trail {
	private double length;
	private double width;
	
	public Trail(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return (length * width);
	}
	
	public double perimeter() {
		return ((2 * length) + (2 * width));
	}

}
