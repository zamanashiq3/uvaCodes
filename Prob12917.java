package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob12917 {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		String line = "";
		
		while (scanner.hasNext()) {
			int P = scanner.nextInt();
			int H = scanner.nextInt();;
			int O = scanner.nextInt();
			
			System.out.println((( O >= H + P ) ? "Props" : "Hunters")+" win!");
		}
		
		scanner.close();
		System.exit(0);
	}
}
