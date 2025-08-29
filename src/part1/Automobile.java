package part1;

public class Automobile {
	private String make;
	private String model;
	private double mileage;
	private double fuelTank;
	private double fuel;
	
	public Automobile(String mk, String mdl, double m, double fT) {
		make = mk;
		model = mdl;
		mileage = m;
		fuelTank = fT;
		fuel = fT;
	}
	
	public void fillUp(double gallons) {
		if ((fuel + gallons) <= fuelTank) {
			fuel = fuel + gallons;
		} else {
			fuel = fuelTank;
		}
	}
	
	public void takeTrip(double miles) {
		if ((miles / mileage) <= fuelTank) {
			fuel = fuel - (miles / mileage);
		} else {
			fuel = 0;
		}
	}
	
	public double reportFuel() {
		return fuel;
	}
}
