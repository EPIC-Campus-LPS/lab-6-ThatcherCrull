package part2;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Runner {

	public static void main(String[] args) {
		File file = new File("park.txt");
		try {
			double sump = 0;
			double suma = 0;
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				String line = scan.nextLine().trim();
				Scanner lineScanner = new Scanner(line);
                if (line.contains("campsite")) {
                	lineScanner.next();
                	double r = lineScanner.nextDouble();
                	Campsite camp = new Campsite(r);
                	sump += camp.perimeter();
                	suma += camp.area();
                } else if (line.contains("trail")) {
                	lineScanner.next();
                	double l = lineScanner.nextDouble();
                	double w = lineScanner.nextDouble();
                	Trail t = new Trail(l, w);
                	sump += t.perimeter();
                	suma += t.area();
                }
                lineScanner.close();
			}
			System.out.println("Park Perimeter: "+ sump);
			System.out.print("Park Area: "+suma);
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
            e.printStackTrace();
		}

	}

}
