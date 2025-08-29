package part1;

public class TestAutomobile {  
    public static void main(String[] args) {  
  
        // Creates a car with 35mpg and a max capacity of 8 gallons of gas. 
        Automobile myCar = new Automobile("Toyota", "Prius", 35, 8);  
  
        // Uses myCar to call takeTrip method. Passes argument of 100 miles driven  
        myCar.takeTrip(100);
        
        // Uses myCar to call fillUp method. Passes argument of 2 gallons  
        myCar.fillUp(2);  
  
        // Uses myCar to call the reportFuel method. It returns a double of the amount of gas remaining in the tank  
        double fuelLeft = myCar.reportFuel();  
  
        // Prints the fuelLeft variable. For this example, it is equal to 7.14285714286
        System.out.println(fuelLeft);  
    }  
}