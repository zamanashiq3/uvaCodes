package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob494 {

	private static Scanner scanner;

	public static void main(String[] args) throws IOException{
		scanner = new Scanner(System.in);
		String line = "";
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			String[] words = line.replaceAll("[^a-zA-Z ]", "").split("\\s+");
			System.out.println(words.length);
		}

	}

}
