import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOMobilizer {

	
	public static void writeDataToFile(String filePath, String data) {
		File outFile = new File(filePath);
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFile))) {
			writer.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String readFileAsString(String filepath) {
		StringBuilder output = new StringBuilder();
		
		try (Scanner scanner = new Scanner(new File(filepath))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				output.append(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output.toString();
	}
	
	public static String getInputFromUser() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
	
	
}
