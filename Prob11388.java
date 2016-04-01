package uvaProblems;

import java.io.IOException;
import java.util.Scanner;

public class Prob11388 {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		while (T--!=0) {
			
	            int G = scanner.nextInt();
	            int L = scanner.nextInt();

	            if (G > L || L % G != 0)
	                System.out.println(-1);
	            else
	                System.out.println(G + " " + L);
		}
		scanner.close();
		System.exit(0);
	}

}
