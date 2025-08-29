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
				String line = scan.nextLine();
				int i = 0;
                if (line.contains("campsite")) {
                	i = line.indexOf(" ");
                	Campsite camp = new Campsite(i + 1);
                	sump += camp.perimeter();
                	suma += camp.area();
                } else if (line.contains("trail")) {
                	i = line.indexOf(" ");
                	Trail t = new Trail((i + 1), (i + 1));
                	sump += t.perimeter();
                	suma += t.area();
                }
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
