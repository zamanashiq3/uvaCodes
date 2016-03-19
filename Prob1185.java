package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob1185 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int t = Integer.parseInt(scanner.nextLine());
		while (t--!=0) {
			int N = scanner.nextInt();
			double numDigits = 0;
			for (int j = N; j > 1; j--) {
		        numDigits += Math.log10(j);
		      }
			numDigits = Math.floor(numDigits)+1;
			
			System.out.println((int)numDigits);
			
		}
		scanner.close();
		System.exit(0);

	}
	
	

}
